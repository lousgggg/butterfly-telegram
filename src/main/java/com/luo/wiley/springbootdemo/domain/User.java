package com.luo.wiley.springbootdemo.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by wiley.luo on 2019/3/5
 */
public class User {

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

    private String updateBy;

    private Date updateDate;

    private Boolean delFlag;

    private int version;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getBonusptBalance() {
        return bonusptBalance;
    }

    public void setBonusptBalance(BigDecimal bonusptBalance) {
        this.bonusptBalance = bonusptBalance;
    }

    public BigDecimal getBonusptCumulative() {
        return bonusptCumulative;
    }

    public void setBonusptCumulative(BigDecimal bonusptCumulative) {
        this.bonusptCumulative = bonusptCumulative;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean active) {
        isActive = active;
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

    public Boolean getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
