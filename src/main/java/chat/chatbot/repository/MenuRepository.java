package chat.chatbot.repository;

import chat.chatbot.menu.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface MenuRepository extends JpaRepository<Menu, Long> {

    @Query("SELECT m.cafeteria, m.menu01, m.menu02, m.menu03, m.menu04, m.menu05, m.menu06, m.date FROM Menu m")
    List<Object[]> findAllCafeteriaAndMenu();

    @Query("SELECT m.cafeteria, m.menu01, m.menu02, m.menu03, m.menu04, m.menu05, m.menu06 " +
            "FROM Menu m " +
            "WHERE m.date = :date")
    List<Object[]> findAllCafeteriaAndMenuByDate(@Param("date") LocalDate date);
}
