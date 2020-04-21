package com.project.springmodel.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
    private int id;
    private boolean studyCertificate;
    private int brotherNumber;

    private PersonDto person;
}
