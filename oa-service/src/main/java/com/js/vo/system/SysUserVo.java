package com.js.vo.system;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @Author: jiangshuang
 * @Description: 系统用户
 **/
@Data
@ToString
public class SysUserVo {
    @ApiModelProperty("学号")
    private String studentNumber;

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("学院")
    private String college;

    @ApiModelProperty("邮箱")
    private String email;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("联系方式")
    private String phoneNumber;

    @ApiModelProperty("所属组别")
    private String groupId;

    @ApiModelProperty("0：正常1：停用")
    private String isAlive;

    @ApiModelProperty("0：不是小组组长 1：是小组组长")
    private String isSuper;

    @ApiModelProperty("对应师傅id")
    private String master;
}