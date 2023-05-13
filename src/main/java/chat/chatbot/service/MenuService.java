package chat.chatbot.service;

import chat.chatbot.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {
    private static MenuRepository menuRepository;

    @Autowired
    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    public static List<Object[]> getAllCafeteriaAndMenu() {
        return menuRepository.findAllCafeteriaAndMenu();
    }
}