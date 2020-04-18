package com.project.springmodel.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(schema = "person", name = "person")
public class Person implements Serializable {
    private static final long serialVersionUID = -3009157732242241606L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int Id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "father_name")
    private String fatherLastName;

    @Column(name = "mother_name")
    private String motherLastName;

    @Column(name = "sex")
    private Boolean sex;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(name = "person_type_id")
    private int idPersonType;

    @Column(name = "document_type_id")
    private int idDocumentType;

    @Column(name = "document")
    private String document;

    @Column(name = "email")
    private String email;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "user_register")
    private String userRegister;

    @Column(name = "time_stamp")
    private LocalDateTime timeStamp;

    @Override
    public String toString() {
        return "Person{" +
                "Id=" + Id +
                ", FirstName='" + firstName + '\'' +
                ", FatherLastName='" + fatherLastName + '\'' +
                ", MotherLastName='" + motherLastName + '\'' +
                ", Sex=" + sex +
                ", BirthDate=" + birthDate +
                ", Document='" + document + '\'' +
                ", Email='" + email + '\'' +
                ", Mobile='" + mobile + '\'' +
                ", Telephone='" + telephone + '\'' +
                ", UserRegister='" + userRegister + '\'' +
                ", TimeStamp=" + timeStamp +
                '}';
    }
}
