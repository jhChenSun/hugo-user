package cn.hugo.us.login.commom;

import cn.hugo.us.login.service.ILoginService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;
/**
 * @author HugoChen
 * @description  获取登录接口下所有实现类
 * @date 2022-01-24
 * */
@Component
public class LoginUnionService implements ApplicationContextAware {

    private Map<String,ILoginService> serviceInstanceMap;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        serviceInstanceMap = applicationContext.getBeansOfType(ILoginService.class);
    }
    public Map<String,ILoginService> getServiceInstanceMap(){
        return serviceInstanceMap;
    }
    public ILoginService getServiceInstance(String serviceKey){
        return serviceInstanceMap.get(serviceKey);
    }
}
