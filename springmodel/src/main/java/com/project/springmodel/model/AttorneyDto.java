package com.project.springmodel.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AttorneyDto {
    private int id;;
    private String workCenter;;
    private String ocupation;

    private PersonDto person;
    private List<StudentDto> students = new ArrayList<>();
}
