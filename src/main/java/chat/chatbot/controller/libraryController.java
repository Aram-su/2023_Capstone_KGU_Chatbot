package chat.chatbot.controller;

import chat.chatbot.data.LibrarySeat;
import chat.chatbot.service.LibraryService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class libraryController {

    @PostMapping("/libraries")
    public LibrarySeat[] librariesData() throws IOException {
        return LibraryService.getLibrarySeats();
    }
}
