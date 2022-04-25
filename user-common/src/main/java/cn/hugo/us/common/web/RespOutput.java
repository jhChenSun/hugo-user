package cn.hugo.us.common.web;
/**
 * 返回对象需的属性字段需提供GETTER和SETTER方法-否则在序列化的时候会报错
 * @description  返回对象包装类
 * @date 2022-01-21
 * */
public class RespOutput {

    private static final String SUCCESS_CODE = "0000";
    private static final String SUCCESS_DESC = "success";

    private String code;
    private String mesg;
    private Object data;
    private RespOutput(){

    }
    public RespOutput(Object data){
        this.code = SUCCESS_CODE;
        this.mesg = SUCCESS_DESC;
        this.data = data;
    }
    public RespOutput(String code,String mesg){
        this.code = code;
        this.mesg = mesg;
        this.data = null;
    }
    /**
     * @author HugoC
     * @description 交易成功封装返回方法
     * @param void
     * @return RespOutput
     * **/
    public static RespOutput success(){
        return success(null);
    }
    /**
     * @author HugoC
     * @description 交易成功封装返回方法
     * @param Object data
     * @return RespOutput
     * **/
    public static RespOutput success(Object data){
        return new RespOutput(data);
    }
    /**
     * @author HugoC
     * @description 交易失败封装返回方法
     * @param String code,String mesg
     * @return RespOutput
     * **/
    public static RespOutput failed(String code,String mesg){
        return new RespOutput(code,mesg);
    }

    public static String getSuccessCode() {
        return SUCCESS_CODE;
    }

    public static String getSuccessDesc() {
        return SUCCESS_DESC;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMesg() {
        return mesg;
    }

    public void setMesg(String mesg) {
        this.mesg = mesg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
