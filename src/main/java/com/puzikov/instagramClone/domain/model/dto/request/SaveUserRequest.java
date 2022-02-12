package com.puzikov.instagramClone.domain.model.dto.request;

import com.puzikov.instagramClone.domain.model.dto.UserDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class SaveUserRequest {

    private UserDto userDto;
}
