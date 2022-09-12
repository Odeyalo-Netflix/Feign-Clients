package com.odeyalo.support.clients.notification.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TemplatedEmailMessageDTO {
    private String to;
    private String subject;
    private String templateType;
}
