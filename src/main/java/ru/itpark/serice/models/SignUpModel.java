package ru.itpark.serice.models;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class SignUpModel {
    private String login;
    private String password;
    private String passwordRepeat;
    private String firstName;
    private String lastName;
    private String fatherName;
}