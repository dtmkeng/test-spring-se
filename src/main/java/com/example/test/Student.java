package com.example.test.entity;
import lombok.*;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.SequenceGenerator;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "student")
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    @NotNull(message="firstName must not be null to be valid")
    private  String firstName;

    @NotNull(message="lastName must not be null to be valid")
    private  String lastName;

    @NotNull(message="studentId must not be null to be valid")
    @Pattern(regexp = "[BMD]\\d{7}")
    @Column(unique = true)
    private String studentId;

}