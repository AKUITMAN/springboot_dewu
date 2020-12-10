package com.qf.pojo;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "watch")
public class Watch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String pic;
}
