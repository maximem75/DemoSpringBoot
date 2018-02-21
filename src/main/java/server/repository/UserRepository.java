package server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import server.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    @Query("select u from User u where mail = :Mail and password = :Password")
    User login(@Param("Mail") String Mail, @Param("Password") String password);
}
