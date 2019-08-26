package com.pojo;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name="tb_article")
public class TbArticle {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String columnId;
    private String userId;
    private String title;
    private String content;
    private String image;
    private Date createTime;
    private Date updateTime;
    private String isPublic;
    private String isTop;
    private Integer visits;
    private Integer thumbup;
    private Integer comment;
    private String state;
    private String url;
    private Integer channelId;
    private String type;
}
