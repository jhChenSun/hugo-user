package cn.hugo.us.repository.entity;

import cn.cskj.hugo.base.dao.base.BaseBusiEntity;

public class UserLoginRelate extends BaseBusiEntity {

    private long relateId;
    private long userId;

    public long getRelateId() {
        return relateId;
    }

    public void setRelateId(long relateId) {
        this.relateId = relateId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
