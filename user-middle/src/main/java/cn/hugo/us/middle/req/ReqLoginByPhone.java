package cn.hugo.us.middle.req;

import cn.hugo.us.common.web.ReqInput;

public class ReqLoginByPhone extends ReqInput {

    private String phoneNo;
    private String mesgCode;

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getMesgCode() {
        return mesgCode;
    }
}
