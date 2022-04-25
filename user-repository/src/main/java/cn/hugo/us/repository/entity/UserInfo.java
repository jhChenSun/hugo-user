package cn.hugo.us.repository.entity;

import cn.cskj.hugo.base.dao.base.BaseBusiEntity;
import cn.hugo.us.repository.enums.E_USER_STATE;

public class UserInfo extends BaseBusiEntity {
    /** 用户ID **/
    private long userId;
    /** 用户名称 **/
    private String userName;
    /** 用户昵称 **/
    private String nickName;
    /** 用户注册登记日期 **/
    private String registerDate;
    /** 用户性别 **/
    private String userSex;
    /** 手机区号 **/
    private String gmsCode;
    /** 手机号码 **/
    private String phoneNo;
    /** 邮件地址 **/
    private String emailAddress;
    /** 用户密码 **/
    private String userPasswd;
    /** 登录错误次数 **/
    private int wrongTimes;
    /** 用户状态 **/
    private E_USER_STATE userState;
    /** 用户手机操作语言 **/
    private String sysLang;
    /** 数据加签 **/
    private String dataSign;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getGmsCode() {
        return gmsCode;
    }

    public void setGmsCode(String gmsCode) {
        this.gmsCode = gmsCode;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getUserPasswd() {
        return userPasswd;
    }

    public void setUserPasswd(String userPasswd) {
        this.userPasswd = userPasswd;
    }

    public int getWrongTimes() {
        return wrongTimes;
    }

    public void setWrongTimes(int wrongTimes) {
        this.wrongTimes = wrongTimes;
    }

    public E_USER_STATE getUserState() {
        return userState;
    }

    public void setUserState(E_USER_STATE userState) {
        this.userState = userState;
    }

    public String getSysLang() {
        return sysLang;
    }

    public void setSysLang(String sysLang) {
        this.sysLang = sysLang;
    }

    public String getDataSign() {
        return dataSign;
    }

    public void setDataSign(String dataSign) {
        this.dataSign = dataSign;
    }
}
