package com.luo.wiley.springbootdemo.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * sys_user
 * @author 
 */
@Data
public class SysUser implements Serializable {
    private String id;

    private BigDecimal bonusptBalance;

    private BigDecimal bonusptCumulative;

    private Boolean isActive;

    private String loginName;

    private String loginMobile;

    private String membershipNo;

    private String password;

    private String qqId;

    private String qqPwd;

    private String smsPwd;

    private Date smsVerifyCodeTime;

    private String wechatId;

    private String wechatPwd;

    private String weiboId;

    private String weiboPwd;

    private String userProfileId;

    private String createBy;

    private Date createDate;

    private Boolean delFlag;

    private String remarks;

    private String updateBy;

    private Date updateDate;

    private Integer version;

    private static final long serialVersionUID = 1L;
}