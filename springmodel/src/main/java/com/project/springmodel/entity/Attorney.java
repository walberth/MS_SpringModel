package com.project.springmodel.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = "person", name = "attorney")
public class Attorney {
    private static final long serialVersionUID = -3009157732242241606L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Column(name = "person_id")
    private String idPerson;

    @Column(name = "workcenter")
    private String workCenter;;

    @Column(name = "ocupation")
    private String ocupation;

    @Column(name = "user_register")
    private String userRegister;

    @Column(name = "time_stamp")
    private LocalDateTime timeStamp;

    @OneToMany()
    private List<Student> students = new ArrayList<>();

    @OneToOne
    @JoinColumn(name="person_id", insertable=false, updatable=false, nullable=false)
    private Person person;
}
