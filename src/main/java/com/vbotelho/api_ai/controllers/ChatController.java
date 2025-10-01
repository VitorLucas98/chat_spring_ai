package com.vbotelho.api_ai.controllers;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.vertexai.gemini.VertexAiGeminiChatModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ai")
public class ChatController {

    //private final ChatClient chatClient;

    private final VertexAiGeminiChatModel chatModel;



//    public ChatController(ChatClient.Builder chatClientBuilder) {
//        this.chatClient = chatClientBuilder.build();
//    }

    public ChatController(VertexAiGeminiChatModel chatModel) {
        this.chatModel = chatModel;
    }

//    @GetMapping("/generation")
//    String generation(String userInput) {
//        return this.chatClient.prompt()
//                .user(userInput)
//                .call()
//                .content();
//    }

        @GetMapping("/generation")
        String generation(String userInput) {
        return this.chatModel.call(userInput);
    }
}
