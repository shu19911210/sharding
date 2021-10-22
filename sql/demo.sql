CREATE TABLE `task_data_submit_record_briefly1` (
                                                    `task_data_submit_record_id` int NOT NULL AUTO_INCREMENT,
                                                    `task_data_id` int DEFAULT NULL COMMENT '子任务id',
                                                    `sdk_app_id` int DEFAULT NULL COMMENT 'app id',
                                                    `sdk_app_user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT 'app用户id',
                                                    `device_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '设备id',
                                                    `imei` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '移动设备识别码',
                                                    `imsi` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '移动用户识别码',
                                                    `task_data_submit_record_time` datetime DEFAULT NULL COMMENT '提交时间',
                                                    `task_data_review_status` int DEFAULT '0' COMMENT '状态  0待导出/1导出待审核/2审核成功/-1审核失败',
                                                    `task_data_cybemoney` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '可获得的虚拟货币数',
                                                    PRIMARY KEY (`task_data_submit_record_id`),
                                                    KEY `sdk_app_id` (`sdk_app_id`),
                                                    KEY `sdk_app_user_id` (`sdk_app_user_id`),
                                                    KEY `device_id` (`device_id`),
                                                    KEY `task_data_id` (`task_data_id`),
                                                    KEY `imei` (`imei`),
                                                    KEY `imsi` (`imsi`)
) ENGINE=InnoDB AUTO_INCREMENT=1000000143 DEFAULT CHARSET=utf8;



CREATE TABLE `task_data_submit_record_briefly_2` (
                                                     `task_data_submit_record_id` int NOT NULL AUTO_INCREMENT,
                                                     `task_data_id` int DEFAULT NULL COMMENT '子任务id',
                                                     `sdk_app_id` int DEFAULT NULL COMMENT 'app id',
                                                     `sdk_app_user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT 'app用户id',
                                                     `device_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '设备id',
                                                     `imei` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '移动设备识别码',
                                                     `imsi` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '移动用户识别码',
                                                     `task_data_submit_record_time` datetime DEFAULT NULL COMMENT '提交时间',
                                                     `task_data_review_status` int DEFAULT '0' COMMENT '状态  0待导出/1导出待审核/2审核成功/-1审核失败',
                                                     `task_data_cybemoney` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '可获得的虚拟货币数',
                                                     PRIMARY KEY (`task_data_submit_record_id`),
                                                     KEY `sdk_app_id` (`sdk_app_id`),
                                                     KEY `sdk_app_user_id` (`sdk_app_user_id`),
                                                     KEY `device_id` (`device_id`),
                                                     KEY `task_data_id` (`task_data_id`),
                                                     KEY `imei` (`imei`),
                                                     KEY `imsi` (`imsi`)
) ENGINE=InnoDB AUTO_INCREMENT=1000000146 DEFAULT CHARSET=utf8;