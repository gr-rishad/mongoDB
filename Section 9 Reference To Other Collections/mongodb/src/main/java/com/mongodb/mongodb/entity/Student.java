package com.mongodb.mongodb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "student")
public class Student {

    @Id
    private String id;
    @Field(name = "name")
    private String name;
    @Field(name = "mail")
    private String email;

    @DBRef
    private Department department;
    @DBRef
    private List<Subject> subjects;

    @Transient
    private double percentage;
}
