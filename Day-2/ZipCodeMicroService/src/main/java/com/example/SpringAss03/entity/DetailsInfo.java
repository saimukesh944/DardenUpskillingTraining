package com.example.SpringAss03.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CountryDetails")
public class DetailsInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String city;
    private String state;
    private String Country;
    private int zipcode;
}
