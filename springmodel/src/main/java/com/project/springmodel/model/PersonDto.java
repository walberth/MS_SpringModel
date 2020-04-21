package com.project.springmodel.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonDto {
    private int id;
    private String firstName;
    private String fatherLastName;
    private String motherLastName;
    private Boolean sex;
    private LocalDate birthDate;
    private String document;
    private String email;
    private String mobile;
    private String telephone;
}
