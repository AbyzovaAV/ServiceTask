package ru.itpark.serice.models;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Dialog {
    private String name;
    private String created;
    private List<Message> messages;
    private List<User> participants;
}

