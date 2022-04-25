package cn.hugo.us.login.service;

import cn.hugo.us.servicebus.req.LoginReq;
import cn.hugo.us.servicebus.resp.LoginOutput;

/**
 * @author HugoChen
 * @description  登录接口
 * @date 2022-01-22
 * */
public interface ILoginService {
    LoginOutput login(LoginReq req);
}
