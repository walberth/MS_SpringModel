package com.project.springmodel.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(schema = "person", name = "student")
public class Student {
    private static final long serialVersionUID = -3009157732242241606L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Column(name = "person_id")
    private String idPerson;

    @Column(name = "attorney_id")
    private String idAttorney;

    @Column(name = "study_certificate")
    private boolean studyCertificate;

    @Column(name = "brother_number")
    private int brotherNumber;

    @Column(name = "user_register")
    private String userRegister;

    @Column(name = "time_stamp")
    private LocalDateTime timeStamp;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="attorney_id", insertable=false, updatable=false, nullable=false)
    private Attorney attorney;

    @OneToOne
    @JoinColumn(name="person_id", insertable=false, updatable=false, nullable=false)
    private Person person;
}
