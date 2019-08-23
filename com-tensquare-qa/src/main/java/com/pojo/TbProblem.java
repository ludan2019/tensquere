package com.pojo;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "tb_problem")
public class TbProblem {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String content;
    private Date createTime;
    private Date updateTime;
    private Long userid;
    private String nickname;
    private Integer visits;
    private Integer thumbup;
    private Integer reply;
    private String solve;
    private String replyName;
    private Date replyTime;

    @OneToMany(mappedBy="problemId",fetch = FetchType.LAZY)
    private List<TbReply> replys;

}


