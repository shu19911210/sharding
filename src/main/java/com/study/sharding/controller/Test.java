package com.study.sharding.controller;

import com.study.sharding.dao.briefly.TaskDataSubmitRecordBrieflyDao;
import com.study.sharding.entity.briefly.TaskDataSubmitRecordBriefly;
import com.study.sharding.entity.briefly.TaskDataSubmitRecordBrieflyPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: rui.shu
 * @Date: 2021/10/21 16:03
 * @Description:
 */
@RestController
@RequestMapping("/test")
public class Test {

    @Autowired
   private TaskDataSubmitRecordBrieflyDao taskDataSubmitRecordBrieflyDao;

   @GetMapping("/")
    public void test(){
//       TaskDataSubmitRecordBriefly taskDataSubmitRecordBriefly = taskDataSubmitRecordBrieflyDao.selectById(21690);
       TaskDataSubmitRecordBrieflyPO po1 = taskDataSubmitRecordBrieflyDao.getTask(2);
       TaskDataSubmitRecordBrieflyPO po2 = taskDataSubmitRecordBrieflyDao.getPo(21689);
       System.out.println("dad");
   }
}
