package cn.hugo.us.servicebus.clients.login;

import cn.hugo.us.servicebus.req.LoginReq;
import cn.hugo.us.servicebus.resp.LoginOutput;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "user-login")
public interface UserLoginClientService {

    @PostMapping(value = "/user/app/login")
    LoginOutput login(LoginReq req);

}
