package cn.hugo.us.middle.controller;

import cn.hugo.us.common.enums.login.E_LOGIN_TYPE;
import cn.hugo.us.common.web.RespOutput;
import cn.hugo.us.middle.resp.RespLoginUserInfo;
import cn.hugo.us.servicebus.clients.login.UserLoginClientService;
import cn.hugo.us.servicebus.req.LoginReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/us/loginIn")
public class UserLoginController {

    @Autowired
    private UserLoginClientService userLoginClient;

    @RequestMapping(value = "/byPhoneNo",method = RequestMethod.GET)
    public RespOutput loginUserByPhoneNo(@RequestParam String req){
        RespLoginUserInfo resp = new RespLoginUserInfo();
        LoginReq reqInput = new LoginReq();
        reqInput.setPhoneNo("17671719876");
        reqInput.setLoginType(E_LOGIN_TYPE.LOGIN_BY_PHONE);
        userLoginClient.login(reqInput);
        return RespOutput.success();
    }
}
