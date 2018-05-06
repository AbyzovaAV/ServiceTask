package ru.itpark.serice.models;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class User {
    private String login;
    private String fio;
    private boolean isOnline;
}
