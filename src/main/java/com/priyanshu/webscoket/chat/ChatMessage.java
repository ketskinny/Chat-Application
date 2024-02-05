package com.priyanshu.webscoket.chat;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document
public class ChatMessage {
    private String id;
    private String chatId;
    private String senderId;
    private String recipientId;
    private String content;
    private Date timestamp;
}
