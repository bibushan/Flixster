package com.bibushan.api.flixster.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@Data
@AllArgsConstructor
public class User {
    @Id
    private ObjectId id;
    private String email;
    private String username;
    private String password;
}
