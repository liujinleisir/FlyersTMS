package com.flyerstms.flyerstms.service_model.login.impl;

import com.flyerstms.flyerstms.model.User;
import com.flyerstms.flyerstms.service_model.login.LoginService;
import com.flyerstms.flyerstms.service_model.login.manager.LoginManager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Title:
 * Description:
 *
 * @author liujinlei
 * @version 1.0
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    private LoginManager loginManager;
    @Override
    public String doLogin(String userCode, String passWord) {
        String re = "loginfailed";
        List<User> userList = null;
        try {
            userList =  loginManager.doLigin(userCode, passWord);
        }catch (Exception e){
            e.printStackTrace();
        }
        if(userList!=null && userList.size() == 1){
            re = "loginsuccess";
        }
        return re;
    }
}
