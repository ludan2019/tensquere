package com.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
public class Spit {
    @Id
    private String _id;
    private String content;
    private Date publishtime;
    private String userid;
    private String nickname;
    private Integer visits;
    private Integer thumbup;
    private Integer share;
    private Integer comment;
    private String state;
    private String parentid;
}
