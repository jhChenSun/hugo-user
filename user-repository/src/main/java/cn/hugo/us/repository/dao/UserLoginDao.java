package cn.hugo.us.repository.dao;

import cn.cskj.hugo.base.dao.com.CrudCommDao;
import cn.cskj.hugo.base.dao.com.CrudCommService;
import cn.hugo.us.repository.entity.UserLogin;
import cn.hugo.us.repository.enums.E_LOGIN_TYPE;
import cn.hugo.us.repository.mapper.UserLoginMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserLoginDao extends CrudCommService<UserLoginMapper,UserLogin> {

    public UserLogin selectOne(String loginKey,E_LOGIN_TYPE logType){
        UserLogin param = new UserLogin();
        param.setLoginKey(loginKey);
        param.setLoginType(logType);
        return this.selectOne(param);
    }
}
