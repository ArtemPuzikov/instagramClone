package com.puzikov.instagramClone.contollers;

import com.puzikov.instagramClone.domain.model.User;
import com.puzikov.instagramClone.domain.model.dto.UserDto;
import com.puzikov.instagramClone.domain.model.dto.response.GetAllUsersResponse;
import com.puzikov.instagramClone.domain.model.dto.response.GetUserByIdResponse;
import com.puzikov.instagramClone.domain.model.dto.response.SaveUserResponse;
import com.puzikov.instagramClone.services.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserServiceImpl userService;

    @GetMapping("")
    public ResponseEntity<GetAllUsersResponse> getAllUsers() {
        GetAllUsersResponse response = new GetAllUsersResponse();
        response.setUsers(userService.getAllUsers());
        return ResponseEntity.ok(response);
    }

    @PostMapping("")
    public ResponseEntity<SaveUserResponse> saveUser(@RequestBody @Valid User user) {
        SaveUserResponse response = new SaveUserResponse();
        response.setUser(userService.saveUser(user));
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GetUserByIdResponse> getUserById(@PathVariable("id") UUID userId) {
        GetUserByIdResponse response = new GetUserByIdResponse();
        response.setUser(userService.findUserById(userId));
        return ResponseEntity.ok(response);
    }
}
