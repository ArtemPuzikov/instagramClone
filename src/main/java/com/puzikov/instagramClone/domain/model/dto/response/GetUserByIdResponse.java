package com.puzikov.instagramClone.domain.model.dto.response;

import com.puzikov.instagramClone.domain.model.dto.UserDto;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GetUserByIdResponse {

    private UserDto user;
}
