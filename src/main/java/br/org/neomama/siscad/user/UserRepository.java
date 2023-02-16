package br.org.neomama.siscad.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = """
            select count(registrationDate) from User where registrationDate = :now
            """, nativeQuery = true)
    long getSizeUserCreated(@Param("now") LocalDate now);
}
