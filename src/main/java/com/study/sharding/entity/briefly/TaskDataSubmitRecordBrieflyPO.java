package com.study.sharding.entity.briefly;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @Auther: rui.shu
 * @Date: 2021/10/21 16:54
 * @Description:
 */
@Data
@NoArgsConstructor
public class TaskDataSubmitRecordBrieflyPO extends TaskDataSubmitRecordBriefly{


    private Integer taskId;
}
