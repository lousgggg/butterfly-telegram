package com.luo.wiley.springbootdemo.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * (SysUser)实体类
 *
 * @author makejava
 * @since 2020-11-21 20:55:36
 */
public class SysUser implements Serializable {
    private static final long serialVersionUID = 153562996773888376L;

    private String id;

    private Double bonusptBalance;

    private Double bonusptCumulative;

    private Object isActive;

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

    private Object delFlag;

    private String remarks;

    private String updateBy;

    private Date updateDate;

    private Integer version;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getBonusptBalance() {
        return bonusptBalance;
    }

    public void setBonusptBalance(Double bonusptBalance) {
        this.bonusptBalance = bonusptBalance;
    }

    public Double getBonusptCumulative() {
        return bonusptCumulative;
    }

    public void setBonusptCumulative(Double bonusptCumulative) {
        this.bonusptCumulative = bonusptCumulative;
    }

    public Object getIsActive() {
        return isActive;
    }

    public void setIsActive(Object isActive) {
        this.isActive = isActive;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginMobile() {
        return loginMobile;
    }

    public void setLoginMobile(String loginMobile) {
        this.loginMobile = loginMobile;
    }

    public String getMembershipNo() {
        return membershipNo;
    }

    public void setMembershipNo(String membershipNo) {
        this.membershipNo = membershipNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getQqId() {
        return qqId;
    }

    public void setQqId(String qqId) {
        this.qqId = qqId;
    }

    public String getQqPwd() {
        return qqPwd;
    }

    public void setQqPwd(String qqPwd) {
        this.qqPwd = qqPwd;
    }

    public String getSmsPwd() {
        return smsPwd;
    }

    public void setSmsPwd(String smsPwd) {
        this.smsPwd = smsPwd;
    }

    public Date getSmsVerifyCodeTime() {
        return smsVerifyCodeTime;
    }

    public void setSmsVerifyCodeTime(Date smsVerifyCodeTime) {
        this.smsVerifyCodeTime = smsVerifyCodeTime;
    }

    public String getWechatId() {
        return wechatId;
    }

    public void setWechatId(String wechatId) {
        this.wechatId = wechatId;
    }

    public String getWechatPwd() {
        return wechatPwd;
    }

    public void setWechatPwd(String wechatPwd) {
        this.wechatPwd = wechatPwd;
    }

    public String getWeiboId() {
        return weiboId;
    }

    public void setWeiboId(String weiboId) {
        this.weiboId = weiboId;
    }

    public String getWeiboPwd() {
        return weiboPwd;
    }

    public void setWeiboPwd(String weiboPwd) {
        this.weiboPwd = weiboPwd;
    }

    public String getUserProfileId() {
        return userProfileId;
    }

    public void setUserProfileId(String userProfileId) {
        this.userProfileId = userProfileId;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Object getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Object delFlag) {
        this.delFlag = delFlag;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

}