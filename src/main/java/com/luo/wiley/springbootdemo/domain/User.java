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

    public User setId(String id) {
        this.id = id;
        return this;
    }

    public BigDecimal getBonusptBalance() {
        return bonusptBalance;
    }

    public User setBonusptBalance(BigDecimal bonusptBalance) {
        this.bonusptBalance = bonusptBalance;
        return this;
    }

    public BigDecimal getBonusptCumulative() {
        return bonusptCumulative;
    }

    public User setBonusptCumulative(BigDecimal bonusptCumulative) {
        this.bonusptCumulative = bonusptCumulative;
        return this;
    }

    public Boolean getActive() {
        return isActive;
    }

    public User setActive(Boolean active) {
        isActive = active;
        return this;
    }

    public String getLoginName() {
        return loginName;
    }

    public User setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }

    public String getLoginMobile() {
        return loginMobile;
    }

    public User setLoginMobile(String loginMobile) {
        this.loginMobile = loginMobile;
        return this;
    }

    public String getMembershipNo() {
        return membershipNo;
    }

    public User setMembershipNo(String membershipNo) {
        this.membershipNo = membershipNo;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getQqId() {
        return qqId;
    }

    public User setQqId(String qqId) {
        this.qqId = qqId;
        return this;
    }

    public String getQqPwd() {
        return qqPwd;
    }

    public User setQqPwd(String qqPwd) {
        this.qqPwd = qqPwd;
        return this;
    }

    public String getSmsPwd() {
        return smsPwd;
    }

    public User setSmsPwd(String smsPwd) {
        this.smsPwd = smsPwd;
        return this;
    }

    public Date getSmsVerifyCodeTime() {
        return smsVerifyCodeTime;
    }

    public User setSmsVerifyCodeTime(Date smsVerifyCodeTime) {
        this.smsVerifyCodeTime = smsVerifyCodeTime;
        return this;
    }

    public String getWechatId() {
        return wechatId;
    }

    public User setWechatId(String wechatId) {
        this.wechatId = wechatId;
        return this;
    }

    public String getWechatPwd() {
        return wechatPwd;
    }

    public User setWechatPwd(String wechatPwd) {
        this.wechatPwd = wechatPwd;
        return this;
    }

    public String getWeiboId() {
        return weiboId;
    }

    public User setWeiboId(String weiboId) {
        this.weiboId = weiboId;
        return this;
    }

    public String getWeiboPwd() {
        return weiboPwd;
    }

    public User setWeiboPwd(String weiboPwd) {
        this.weiboPwd = weiboPwd;
        return this;
    }

    public String getUserProfileId() {
        return userProfileId;
    }

    public User setUserProfileId(String userProfileId) {
        this.userProfileId = userProfileId;
        return this;
    }

    public String getCreateBy() {
        return createBy;
    }

    public User setCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public User setCreateDate(Date createDate) {
        this.createDate = createDate;
        return this;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public User setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public User setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
        return this;
    }

    public Boolean getDelFlag() {
        return delFlag;
    }

    public User setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
        return this;
    }

    public int getVersion() {
        return version;
    }

    public User setVersion(int version) {
        this.version = version;
        return this;
    }
}
