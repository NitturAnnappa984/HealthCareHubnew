package nimblix.in.HealthCareHub.controller;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Nurse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String department;
    private String phone;
}