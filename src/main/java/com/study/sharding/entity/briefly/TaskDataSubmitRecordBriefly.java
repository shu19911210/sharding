/**
 * @filename:TaskDataSubmitRecord 2020-04-20
 * @project moku_planet  V1.0
 * Copyright(c) 2019 kai.cai Co. Ltd.
 * All right reserved.
 */
package com.study.sharding.entity.briefly;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Description: 任务提交记录
 * @Author: kai.cai
 * @CreateDate: 2020-04-20
 * @Version: V1.0
 */
@NoArgsConstructor
public class TaskDataSubmitRecordBriefly implements Serializable {

    /**
     * @Description: 主键
     */
    @TableId
    private Integer taskDataSubmitRecordId;


    /**
     * @Description: 子任务id
     */
    private Integer taskDataId;

    /**
     * @Description: 提交时间
     */
    @TableField("task_data_submit_record_time")
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime time;


    /**
     * @Description: （0待导出/1导出待审核/2审核成功/-1审核失败）
     */
    private Integer taskDataReviewStatus;


    /**
     * @Description: 可获得的虚拟货币数
     */
    private String taskDataCybemoney;


    /**
     * @Description: 平台用户id
     */
    private String sdkAppUserId;


    /**
     * @Description: 设备id
     */
    private String deviceId;


    /**
     * @Description: 移动设备识别码
     */
    private String imei;


    /**
     * @Description: 移动用户识别码
     */
    private String imsi;

    private Integer sdkAppId;

    public Integer getTaskDataSubmitRecordId() {
        return taskDataSubmitRecordId;
    }

    public void setTaskDataSubmitRecordId(Integer taskDataSubmitRecordId) {
        this.taskDataSubmitRecordId = taskDataSubmitRecordId;
    }

    public Integer getTaskDataId() {
        return taskDataId;
    }

    public void setTaskDataId(Integer taskDataId) {
        this.taskDataId = taskDataId;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Integer getTaskDataReviewStatus() {
        return taskDataReviewStatus;
    }

    public void setTaskDataReviewStatus(Integer taskDataReviewStatus) {
        this.taskDataReviewStatus = taskDataReviewStatus;
    }

    public String getTaskDataCybemoney() {
        return taskDataCybemoney;
    }

    public void setTaskDataCybemoney(String taskDataCybemoney) {
        this.taskDataCybemoney = taskDataCybemoney;
    }

    public String getSdkAppUserId() {
        return sdkAppUserId;
    }

    public void setSdkAppUserId(String sdkAppUserId) {
        this.sdkAppUserId = sdkAppUserId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public Integer getSdkAppId() {
        return sdkAppId;
    }

    public void setSdkAppId(Integer sdkAppId) {
        this.sdkAppId = sdkAppId;
    }
}
