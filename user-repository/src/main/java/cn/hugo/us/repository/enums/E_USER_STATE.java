package cn.hugo.us.repository.enums;

import cn.cskj.hugo.com.base.BaseEnum;

public enum E_USER_STATE implements BaseEnum<Integer> {
    NORMAL(1,"正常"),LOCK(1,"锁定"),FREEZE(2,"冻结"),CANCEL(0,"注销");
    private Integer value;
    private String name;
    private E_USER_STATE(Integer value,String name){
        this.value = value;
        this.name = name;
    }
    @Override
    public Integer getEnumValue() {
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
