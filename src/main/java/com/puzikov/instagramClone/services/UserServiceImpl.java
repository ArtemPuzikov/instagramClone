package com.puzikov.instagramClone.services;

import com.puzikov.instagramClone.domain.model.User;
import com.puzikov.instagramClone.domain.model.dto.UserDto;
import com.puzikov.instagramClone.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Override
    public UserDto saveUser(User user) {
        return userRepository.save(user).toDto();
    }

    @Override
    public UserDto updateUser(User user) {
        return userRepository.save(user).toDto();
    }

    @Override
    public void deleteUser(UserDto userDto) {
        User user = new User();
        userRepository.delete(user.fromDto(userDto));
    }

    @Override
    public UserDto findUserById(UUID userId) {
        return userRepository.findById(userId).map(User::toDto).orElse(null);
    }

    @Override
    public List<UserDto> getAllUsers() {
        return userRepository.findAll().stream()
                .map(User::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public UserDto findUserByNickname(String nickname) {
        return userRepository.findUserByNickname(nickname).toDto();
    }
}
