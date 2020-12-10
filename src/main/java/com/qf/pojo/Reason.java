package com.qf.pojo;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "reason")
public class Reason {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String pic;

    private String name;


}
