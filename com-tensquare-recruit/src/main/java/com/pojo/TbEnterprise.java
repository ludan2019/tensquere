package com.pojo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tb_enterprise")
@Data
public class TbEnterprise {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String summary;
    private String address;
    private String labers;
    private String coordinate;
    private String ishot;
    private String logo;
    private Integer jobCount;
    private String url;
}
