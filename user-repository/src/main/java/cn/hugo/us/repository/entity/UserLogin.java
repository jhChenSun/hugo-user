package cn.hugo.us.repository.entity;

import cn.cskj.hugo.base.dao.base.BaseBusiEntity;
import cn.hugo.us.repository.enums.E_LOGIN_TYPE;

public class UserLogin extends BaseBusiEntity {

    /** 登录凭证ID **/
    private String loginKey;
    /** 登录凭证类型 **/
    private E_LOGIN_TYPE loginType;
    /** 注册日期 **/
    private String registerDate;
    /** 用户ID **/
    private long userId;
    /** 数据加签 **/
    private String dataSign;

    public String getLoginKey() {
        return loginKey;
    }

    public void setLoginKey(String loginKey) {
        this.loginKey = loginKey;
    }

    public E_LOGIN_TYPE getLoginType() {
        return loginType;
    }

    public void setLoginType(E_LOGIN_TYPE loginType) {
        this.loginType = loginType;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getDataSign() {
        return dataSign;
    }

    public void setDataSign(String dataSign) {
        this.dataSign = dataSign;
    }
}
