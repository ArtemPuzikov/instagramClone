package com.puzikov.instagramClone.model;

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
}
