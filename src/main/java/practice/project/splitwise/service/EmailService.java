package practice.project.splitwise.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

@Service
public class EmailService {

    @Value("${resend.api.key}")
    private String resendApiKey;

    @Value("${resend.from.email}")
    private String fromEmail;

    // ✅ timeout added
    private final HttpClient httpClient = HttpClient.newBuilder()
            .connectTimeout(Duration.ofSeconds(10))
            .build();

    @Async("emailTaskExecutor")
    public void sendSimpleEmail(String to, String subject, String text) {
        try {
            String htmlBody = text.replace("\n", "<br>");
            sendEmailViaResend(to, subject, htmlBody);
        } catch (Exception e) {
            // ✅ NEVER throw inside @Async
            System.err.println("Email sending FAILED to " + to);
            e.printStackTrace();
        }
    }

    private void sendEmailViaResend(String to, String subject, String htmlBody) throws Exception {

        String jsonBody = String.format(
            "{\"from\":\"%s\",\"to\":[\"%s\"],\"subject\":\"%s\",\"html\":\"%s\"}",
            fromEmail,
            to,
            escapeJson(subject),
            escapeJson(htmlBody)
        );

        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://api.resend.com/emails"))
            .timeout(Duration.ofSeconds(15)) // ✅ request timeout
            .header("Authorization", "Bearer " + resendApiKey)
            .header("Content-Type", "application/json")
            .POST(HttpRequest.BodyPublishers.ofString(jsonBody))
            .build();

        HttpResponse<String> response =
            httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Resend response: " + response.body());

        if (response.statusCode() < 200 || response.statusCode() >= 300) {
            throw new RuntimeException(
                "Resend API error " + response.statusCode() + ": " + response.body()
            );
        }

        System.out.println("Email sent successfully to: " + to);
    }

    private String escapeJson(String text) {
        if (text == null) return "";
        return text
            .replace("\\", "\\\\")
            .replace("\"", "\\\"")
            .replace("\n", "\\n")
            .replace("\r", "\\r")
            .replace("\t", "\\t");
    }
}
