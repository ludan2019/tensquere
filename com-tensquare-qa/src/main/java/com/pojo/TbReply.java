package com.pojo;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "tb_reply")
public class TbReply {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name="problem_id",referencedColumnName = "id",nullable = false)
    private TbProblem tbProblem;
    private String content;
    private Date createTime;
    private Date updateTime;
    private String userId;
    private String nickname;


}
