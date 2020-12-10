package com.qf.pojo;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "shoes")
public class Shoes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String pic;
}
