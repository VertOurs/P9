package fr.vertours.patientms.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@Entity
@Data
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "FirstName is mandatory")
    private String firstName;

    @NotBlank(message = "LastName is mandatory")
    private String lastName;

    @NotEmpty(message = "Date of birth is mandatory")
    private LocalDate dateOfBirth;

    @NotEmpty(message = "Gender is mandatory")
    private char gender;

    @NotBlank(message = "address is mandatory")
    private String address;

    @NotBlank(message = "phone is mandatory")
    private String phone;

}