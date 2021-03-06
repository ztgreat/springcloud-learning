package com.cloud.gateway.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 实体
 */
@Data
@TableName("gateway_route")
public class GatewayMysqlRoute {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String serviceId;

    private String uri;

    private Integer sort;

    private String createdBy;

    private Date createdAt;

    private String updatedBy;

    private Date updatedAt;

    private String remarks;

    private Integer dr;


}