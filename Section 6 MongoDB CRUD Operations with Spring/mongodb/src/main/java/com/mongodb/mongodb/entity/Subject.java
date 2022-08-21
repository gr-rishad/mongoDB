package com.mongodb.mongodb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Subject {

    @Field(name = "subject_name")
    private String subjectName;
    @Field(name = "marks_obtained")
    private Integer marksObtained;
}
