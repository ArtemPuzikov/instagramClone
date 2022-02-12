package com.puzikov.instagramClone.domain.model.dto.response;

import com.puzikov.instagramClone.domain.model.dto.UserDto;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class GetAllUsersResponse {

    private List<UserDto> users;
}
