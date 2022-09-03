package com.odeyalo.support.clients.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserInformationDTO {
    private Integer id;
    private String email;
    private String nickname;
    private boolean isUserBanned;
    private boolean isAccountActivated;
    private String phoneNumber;
    private Set<Role> roles;
    private String image;
}
