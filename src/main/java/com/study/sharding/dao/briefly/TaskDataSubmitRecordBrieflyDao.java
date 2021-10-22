/**
 * @filename:TaskDataSubmitRecordDao 2020-04-20
 * @project moku_planet  V1.0
 * Copyright(c) 2019 kai.cai Co. Ltd.
 * All right reserved.
 */
package com.study.sharding.dao.briefly;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.study.sharding.entity.briefly.TaskDataSubmitRecordBriefly;
import com.study.sharding.entity.briefly.TaskDataSubmitRecordBrieflyPO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description: 任务提交记录——DAO
 * @Author: kai.cai
 * @CreateDate: 2020-04-20
 * @Version: V1.0
 */
@Mapper
public interface TaskDataSubmitRecordBrieflyDao extends BaseMapper<TaskDataSubmitRecordBriefly> {

    TaskDataSubmitRecordBrieflyPO  getPo(Integer id);
    TaskDataSubmitRecordBrieflyPO  getTask(Integer id);
    TaskDataSubmitRecordBrieflyPO  get(Integer id);
}
