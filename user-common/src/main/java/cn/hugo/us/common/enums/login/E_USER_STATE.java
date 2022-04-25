package cn.hugo.us.common.enums.login;

import cn.hugo.us.common.base.BaseEnums;

public enum E_USER_STATE implements BaseEnums<Integer> {
    NORMAL(1,"正常"),LOCK(1,"锁定"),FREEZE(2,"冻结"),CANCEL(0,"注销");
    private Integer value;
    private String name;
    private E_USER_STATE(Integer value,String name){
        this.value = value;
        this.name = name;
    }
    @Override
    public Integer getValue() {
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
