package com.repository;

import com.pojo.TbReply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TbReplyRepository extends JpaRepository<TbReply,Long>,JpaSpecificationExecutor<TbReply> {
}
