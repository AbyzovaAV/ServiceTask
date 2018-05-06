package ru.itpark.serice.models;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class LoginModel {
    private String login;
    private String password;
}
