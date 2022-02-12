package com.puzikov.instagramClone.domain.model.dto;

import com.puzikov.instagramClone.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private UUID id;

    private String firstName;

    private String surname;

    private String nickname;

    private String email;

    private Boolean activate;

    private Role role;

}
