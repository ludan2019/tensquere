package com.pojo;

import com.common.annotation.AutoIncKey;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="sequence")
@Data
public class SeqInfo {

    @AutoIncKey
    @Id
    private String _id;

    @Field
    private String collName;

    @Field
    private Long seqId;
}
