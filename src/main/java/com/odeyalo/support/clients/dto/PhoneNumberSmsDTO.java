package com.odeyalo.support.clients.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhoneNumberSmsDTO {
    private String phoneNumber;
    private String body;
}
