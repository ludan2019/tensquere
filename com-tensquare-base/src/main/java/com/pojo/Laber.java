package com.pojo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="laber")
public class Laber {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String labername;
    private String state;
    private Long count;
    private Long fans;
    private String recommend;


}
