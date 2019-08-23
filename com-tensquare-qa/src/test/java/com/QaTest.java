package com;

import com.pojo.TbProblem;
import com.pojo.TbReply;
import com.repository.TbProblemRepository;
import com.repository.TbReplyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootTest
@RunWith(SpringRunner.class)
public class QaTest {

    @Autowired
    private TbProblemRepository tbProblemRepository;

    @Autowired
    private TbReplyRepository tbReplyRepository;

}
