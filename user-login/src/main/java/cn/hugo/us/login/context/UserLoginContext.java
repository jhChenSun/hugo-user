package cn.hugo.us.login.context;

import cn.hugo.us.common.enums.login.E_LOGIN_TYPE;
import cn.hugo.us.login.commom.LoginUnionService;
import cn.hugo.us.servicebus.req.LoginReq;
import cn.hugo.us.servicebus.resp.LoginOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author HugoChen
 * @description  登录策略环境类
 * @date 2022-01-22
 * */
@Service
public class UserLoginContext {

    @Autowired
    private LoginUnionService loginUnionService;

    public LoginOutput login(LoginReq req){
        E_LOGIN_TYPE type = req.getLoginType();
        if(type == null){
            System.out.println("type is null");
        }
        return loginUnionService.getServiceInstance(type.getServiceId()).login(req);
    }
}
