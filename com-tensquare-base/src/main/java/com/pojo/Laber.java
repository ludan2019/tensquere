package com.pojo;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

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
