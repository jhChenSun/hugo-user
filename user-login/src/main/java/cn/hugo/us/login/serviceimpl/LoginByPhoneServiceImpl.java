package cn.hugo.us.login.serviceimpl;

import cn.cskj.hugo.base.utils.SeqUtils;
import cn.cskj.hugo.com.utils.ComTools;
import cn.cskj.hugo.com.utils.DateUtils;
import cn.cskj.hugo.com.utils.EnumUtils;
import cn.hugo.us.common.constant.ConstUserNickname;
import cn.hugo.us.login.service.ILoginService;
import cn.hugo.us.repository.dao.UserInfoDao;
import cn.hugo.us.repository.dao.UserLoginDao;
import cn.hugo.us.repository.entity.UserInfo;
import cn.hugo.us.repository.entity.UserLogin;
import cn.hugo.us.repository.enums.E_LOGIN_TYPE;
import cn.hugo.us.repository.enums.E_USER_STATE;
import cn.hugo.us.servicebus.req.LoginReq;
import cn.hugo.us.servicebus.resp.LoginOutput;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author HugoChen
 * @description  手机验证码登录
 * @date 2022-01-22
 * */
@Service("LOGIN_BY_PHONE")
public class LoginByPhoneServiceImpl implements ILoginService {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private UserLoginDao userLoginDao;

    @Autowired
    public UserInfoDao userInfoDao;
    /**
     * @author HugoChen
     * @description  注册新用户/手机号码登录
     * @return LoginOutput
     * */
    @Override
    @Transactional
    public LoginOutput login(LoginReq req) {

        System.out.println(req.getLoginType().getValue());
        String loginKey = req.getPhoneNo();
        E_LOGIN_TYPE loginType = EnumUtils.toEnum(E_LOGIN_TYPE.class,req.getLoginType().getValue());
        UserLogin userLogin = userLoginDao.selectOne(loginKey,loginType);
        LoginOutput output = new LoginOutput();
        if(ComTools.isNotNull(userLogin)){
            output.setUserId(userLogin.getUserId());
            return output;
        }
        logger.info(">>>>>>>>>>>>>>注册用户信息开始，手机号：{}",loginKey);
        //注册用户认证登录信息
        long userId = SeqUtils.getBaseSeqLong("userId");
        String registDate = DateUtils.getCorrentDate("yyyMMdd");
        UserLogin param = new UserLogin();
        param.setLoginKey(loginKey);
        param.setLoginType(loginType);
        param.setUserId(userId);
        param.setRegisterDate(registDate);
        userLoginDao.insert(param);

        //注册用户信息
        UserInfo user = new UserInfo();
        user.setUserId(userId);
        user.setNickName(ConstUserNickname.getUserNickName());
        user.setGmsCode("+86");
        user.setPhoneNo(req.getPhoneNo());
        user.setRegisterDate(registDate);
        user.setUserState(E_USER_STATE.NORMAL);
        userInfoDao.insert(user);
        logger.info(">>>>>>>>>>>>>>注册用户信息成功，用户号：{}",userId);
        //返回
        output.setUserId(userId);
        return output;
    }
}
