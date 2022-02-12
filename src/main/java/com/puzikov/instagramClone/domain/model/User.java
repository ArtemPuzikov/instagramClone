package com.puzikov.instagramClone.domain.model;

import com.puzikov.instagramClone.domain.model.dto.UserDto;
import com.puzikov.instagramClone.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String firstName;

    private String surname;

    private String nickname;

    private String email;

    private String password;

    private Boolean activate;

    private Role role;

    public UserDto toDto() {
        UserDto userDto = new UserDto();

        userDto.setId(this.id);
        userDto.setFirstName(this.firstName);
        userDto.setSurname(this.surname);
        userDto.setEmail(this.email);
        userDto.setNickname(this.nickname);
        userDto.setActivate(this.activate);
        userDto.setRole(this.role);

        return userDto;
    }

    public User fromDto(UserDto userDto) {
        User user = new User();

        this.setId(userDto.getId());
        this.setFirstName(userDto.getFirstName());
        this.setSurname(userDto.getSurname());
        this.setNickname(userDto.getNickname());
        this.setEmail(userDto.getEmail());
        this.setActivate(userDto.getActivate());
        this.setRole(userDto.getRole());

        return user;
    }
}
