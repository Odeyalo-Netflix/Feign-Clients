package com.odeyalo.support.clients.notification.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailMessageDTO {
    private String to;
    private String body;
    private String subject;
}
