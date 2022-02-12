package com.puzikov.instagramClone.domain.model.dto.response;

import com.puzikov.instagramClone.domain.model.dto.UserDto;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SaveUserResponse {

    private UserDto user;
}
