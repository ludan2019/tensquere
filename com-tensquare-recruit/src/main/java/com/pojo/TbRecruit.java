package com.pojo;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="tb_recruit")
@Data
public class TbRecruit {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String jobName;
    private String salary;
    private String experience;
    private String education;
    private String type;
    private String address;
    private String eid;
    private Date createTime;
    private String state;
    private String url;
    private String laber;
    private String content1;
    private String content2;
}
