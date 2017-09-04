package com.db.gameofthrones.services;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Evegeny on 04/09/2017.
 */
@Data
@NoArgsConstructor
public class Client {
    private int id;
    private String name;
    private int balance;

    public Client(String name) {
        this.name = name;
    }
}
