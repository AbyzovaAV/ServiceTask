package ru.itpark.serice.models;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Message {
    private User sender;
    private String message;
    private Date sended;
    private boolean isReaded;
}
