package com.odeyalo.support.clients.notification.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class DynamicTemplatedEmailMessageDTO extends TemplatedEmailMessageDTO {
    private Map<String, Object> model;

    public DynamicTemplatedEmailMessageDTO(String to, String subject, String templateType, Map<String, Object> model) {
        super(to, subject, templateType);
        this.model = model;
    }
}


