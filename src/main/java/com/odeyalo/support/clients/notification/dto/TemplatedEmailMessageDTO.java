package com.odeyalo.support.clients.notification.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TemplatedEmailMessageDTO {
    private String to;
    private String subject;
    private String templateType;

    public static class TemplateTypeNameConstants {
        public static final String PREMIUM_MEMBER_EMAIL_LETTER = "PREMIUM_MEMBER_EMAIL_LETTER";
    }
}
