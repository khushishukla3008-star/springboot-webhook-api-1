
package com.example.demo;

import java.util.Map;  // ✅ IMPORTANT

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webhook")
public class ChatController {

    @PostMapping
    public String receiveMessage(@RequestBody Map<String, String> body) {

        String message = body.getOrDefault("message", "").toLowerCase();

        System.out.println("[WEBHOOK] Received message" + message);

        if (message.equals("hi")) {
            return "Hello";
        }

       else if (message.equals("bye")){
            return "GoodBye";
       } else {
            return "I don't understand";
    }
}
}