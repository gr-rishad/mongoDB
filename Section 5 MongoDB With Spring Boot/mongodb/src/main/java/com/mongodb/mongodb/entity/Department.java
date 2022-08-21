package com.mongodb.mongodb.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    @Field(name = "department_name")
    private String departmentName;
    private String location;
}
