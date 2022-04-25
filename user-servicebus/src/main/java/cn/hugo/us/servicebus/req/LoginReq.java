package cn.hugo.us.servicebus.req;

import cn.hugo.us.common.enums.login.E_LOGIN_TYPE;
import cn.hugo.us.common.web.ReqInput;

public class LoginReq extends ReqInput {
    /** 登录方式 **/
    private E_LOGIN_TYPE loginType;
    /** 手机区号 **/
    private String areaCode;
    /** 手机号码 **/
    private String phoneNo;
    /** 验证码 **/
    private String verifCode;
    /** 邮箱 **/
    private String email;

    public E_LOGIN_TYPE getLoginType() {
        return loginType;
    }

    public void setLoginType(E_LOGIN_TYPE loginType) {
        this.loginType = loginType;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getVerifCode() {
        return verifCode;
    }

    public void setVerifCode(String verifCode) {
        this.verifCode = verifCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
