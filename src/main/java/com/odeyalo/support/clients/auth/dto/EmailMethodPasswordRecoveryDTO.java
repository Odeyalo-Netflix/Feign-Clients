package com.odeyalo.support.clients.auth.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailMethodPasswordRecoveryDTO {
    private String email;
}
