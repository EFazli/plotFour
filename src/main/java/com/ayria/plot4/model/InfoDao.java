package com.ayria.plot4.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import javax.validation.constraints.Size;

@Table(name = "plot4_info")
@Entity
@Getter
@Setter
public class InfoDao implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "secondeName")
    private String secondeName;
    @Column(name = "dimention")
    @Size(min = 3)
    private String dimention;
}
