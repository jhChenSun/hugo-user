package cn.hugo.us.repository.dao;

import cn.cskj.hugo.base.dao.com.CrudCommDao;
import cn.cskj.hugo.base.dao.com.CrudCommService;
import cn.hugo.us.repository.entity.UserInfo;
import cn.hugo.us.repository.mapper.UserInfoMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserInfoDao extends CrudCommService<UserInfoMapper,UserInfo> {
}
