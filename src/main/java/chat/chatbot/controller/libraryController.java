package chat.chatbot.controller;

import chat.chatbot.menu.LibrarySeat;
import chat.chatbot.service.libraryService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class libraryController {

    @PostMapping("/libraries")
    public LibrarySeat[] librariesData() throws IOException {
        return libraryService.getLibrarySeats();
    }
}
