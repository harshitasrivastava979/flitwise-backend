package practice.project.splitwise.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import practice.project.splitwise.model.UsersGroup;

import java.util.Optional;

public interface GroupRepo extends JpaRepository<UsersGroup, Integer> {

//    Optional<UsersGroup> findById(Long groupId);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM user_group_mapping WHERE group_id = :groupId", nativeQuery = true)
    void deleteMemberships(@Param("groupId") int groupId);

}
