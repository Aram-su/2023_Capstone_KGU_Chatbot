package chat.chatbot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.net.Socket;

@Service
public class ChatbotClientService {

    private Socket clientSocket;
    @Autowired
    public ChatbotClientService() throws IOException {
        clientSocket = new Socket("127.0.0.1", 5557);
    }

    public String Client(String input) {
        String output = "access failed";
        try {
            System.out.println("연결 확인 되었습니다.");

            String string = input;

            OutputStream os = clientSocket.getOutputStream();

            os.write(string.getBytes("UTF-8"));
            os.flush();

            InputStream is = clientSocket.getInputStream();
            byte[] data = new byte[1024];
            is.read(data);
            output = new String(data, "UTF-8");
            System.out.println("받은 데이터 : " + output);

            System.out.println("종료");
        } catch (IOException e) {
            e.printStackTrace();
        }

        output = output.substring(1, output.indexOf("]"));

        String[] tmp = output.split(",");

        int a = Integer.parseInt(tmp[0].trim());
        int b = Integer.parseInt(tmp[1].trim());
        int c = Integer.parseInt(tmp[2].trim());
        output = String.format("%02d", a) + String.format("%02d", b) + String.format("%02d", c);
        System.out.println(output);

        return output;
    }
}
