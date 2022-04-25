package cn.hugo.us.repository.enums;

import cn.cskj.hugo.com.base.BaseEnum;

/**
 * @author HugoChen
 * @description  登录类型
 * @date 2022-01-24
 * */
public enum E_LOGIN_TYPE implements BaseEnum<String> {

    LOGIN_BY_PHONE("1","手机号登录"),
    LOGIN_BY_EMAIL("2","邮箱登录");
    private String value;
    private String name;
    private E_LOGIN_TYPE(String value,String name){
        this.value = value;
        this.name = name;
    }

    @Override
    public String getEnumValue() {
        return value;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
