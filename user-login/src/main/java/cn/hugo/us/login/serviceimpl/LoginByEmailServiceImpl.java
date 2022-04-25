package cn.hugo.us.login.serviceimpl;

import cn.hugo.us.login.service.ILoginService;
import cn.hugo.us.servicebus.req.LoginReq;
import cn.hugo.us.servicebus.resp.LoginOutput;
import org.springframework.stereotype.Service;

/**
 * @author HugoChen
 * @description  邮箱登录
 * @date 2022-01-24
 * */
@Service("LOGIN_BY_EMAIL")
public class LoginByEmailServiceImpl implements ILoginService {
    @Override
    public LoginOutput login(LoginReq req) {
        return null;
    }
}
