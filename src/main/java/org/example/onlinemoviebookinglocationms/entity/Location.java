package org.example.onlinemoviebookinglocationms.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column (name ="name")
    private String name;
}
