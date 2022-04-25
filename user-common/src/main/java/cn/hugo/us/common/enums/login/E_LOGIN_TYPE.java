package cn.hugo.us.common.enums.login;

import cn.hugo.us.common.base.BaseEnums;

/**
 * @author HugoChen
 * @description  登录类型
 * @date 2022-01-24
 * */
public enum E_LOGIN_TYPE implements BaseEnums<String> {

    LOGIN_BY_PHONE("1","LOGIN_BY_PHONE","手机号登录"),
    LOGIN_BY_EMAIL("2","LOGIN_BY_EMAIL","邮箱登录");
    private final String value;
    private final String serviceId;
    private final String name;
    private E_LOGIN_TYPE(String value,String serviceID,String name){
        this.value = value;
        this.serviceId = serviceID;
        this.name = name;
    }

    @Override
    public String getValue() {
        return value;
    }


    @Override
    public String getName() {
        return name;
    }

    public String getServiceId() {
        return serviceId;
    }

    @Override
    public String toString() {
        return name;
    }
}
