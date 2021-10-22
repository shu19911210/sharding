package com.study.sharding;

import com.study.sharding.dao.briefly.TaskDataSubmitRecordBrieflyDao;
import com.study.sharding.entity.briefly.TaskDataSubmitRecordBriefly;
import com.study.sharding.entity.briefly.TaskDataSubmitRecordBrieflyPO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShardingApplicationTests {
    @Autowired
    TaskDataSubmitRecordBrieflyDao taskDataSubmitRecordBrieflyDao;

    @Test
    void contextLoads() {
        TaskDataSubmitRecordBriefly taskDataSubmitRecordBriefly = taskDataSubmitRecordBrieflyDao.selectById(21689);
        System.out.println("dad");
    }

}
