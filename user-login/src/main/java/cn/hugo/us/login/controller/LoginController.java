package cn.hugo.us.login.controller;

import cn.cskj.hugo.com.base.BaseRunEvn;
import cn.cskj.hugo.com.evns.RunCommonEvns;
import cn.hugo.us.common.enums.login.E_LOGIN_TYPE;
import cn.hugo.us.login.context.UserLoginContext;
import cn.hugo.us.servicebus.req.LoginReq;
import cn.hugo.us.servicebus.resp.LoginOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author HugoChen
 * @description  登录
 * @date 2022-01-22
 * */
@RestController
@RequestMapping(value  =  "/user/app/")
public class LoginController {

    @Autowired
    private UserLoginContext userLoginContextService;

    /**
     * @author HugoChen
     * @description 用户登录
     * @return RespOutput
     * */
    @PostMapping(value = "/login")
    public LoginOutput login(@RequestBody LoginReq req){
        req.setLoginType(E_LOGIN_TYPE.LOGIN_BY_PHONE);
        BaseRunEvn a = new BaseRunEvn();
        a.setSystemId("101");
        RunCommonEvns.setRunEvns(a);
        return userLoginContextService.login(req);
    }
}
