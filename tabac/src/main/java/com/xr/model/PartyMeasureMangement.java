package com.xr.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value = "com-xr-model-PartyMeasureMangement")
@Data
public class PartyMeasureMangement {
    /**
     * 标识列
     */
    @ApiModelProperty(value = "标识列")
    private Integer id;

    /**
     * 处置标题
     */
    @ApiModelProperty(value = "处置标题")
    private String tilte;

    /**
     * 处置内容
     */
    @ApiModelProperty(value = "处置内容")
    private String content;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private Date createtime;

    /**
     * 部门id
     */
    @ApiModelProperty(value = "部门id")
    private Long deptid;

    /**
     * 岗位id
     */
    @ApiModelProperty(value = "岗位id")
    private Long postid;

    /**
     * 风险级别id
     */
    @ApiModelProperty(value = "风险级别id")
    private Long riskid;

    /**
     * 处理结果
     */
    @ApiModelProperty(value = "处理结果")
    private String result;

    /**
     * 登陆id
     */
    @ApiModelProperty(value = "登陆id")
    private Long loginid;

    /**
     * 创建者姓名
     */
    @ApiModelProperty(value = "创建者姓名")
    private String createname;

    /**
     * 状态
     */
    @ApiModelProperty(value = "状态")
    private Integer status;
}