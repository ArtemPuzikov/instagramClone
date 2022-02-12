package com.puzikov.instagramClone.services;

import com.puzikov.instagramClone.domain.model.User;
import com.puzikov.instagramClone.domain.model.dto.UserDto;

import java.util.List;
import java.util.UUID;

public interface UserService {
    UserDto saveUser(User user);
    UserDto updateUser(User user);
    void deleteUser(UserDto userDto);
    UserDto findUserById(UUID userId);
    List<UserDto> getAllUsers();
    UserDto findUserByNickname(String nickname);
}
