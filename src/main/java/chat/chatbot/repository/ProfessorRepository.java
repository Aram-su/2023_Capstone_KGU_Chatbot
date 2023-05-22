package chat.chatbot.repository;

import chat.chatbot.data.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {

    @Query("SELECT p FROM Professor p WHERE p.name = :name")
    Professor findByName(@Param("name") String name);

    @Query("SELECT p FROM Professor p WHERE p.code = :code")
    Professor findByCode(@Param("code") String code);

}
