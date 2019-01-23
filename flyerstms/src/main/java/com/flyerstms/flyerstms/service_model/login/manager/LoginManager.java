package com.flyerstms.flyerstms.service_model.login.manager;

import com.flyerstms.flyerstms.dao.UserMapper;
import com.flyerstms.flyerstms.model.User;
import com.flyerstms.flyerstms.model.UserExample;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * Title:
 * Description:
 *
 * @author liujinlei
 * @version 1.0
 */
@Component
public class LoginManager {
    @Resource
    private UserMapper userMapper;

    public List<User> doLigin(String userCode, String passWord) {
        UserExample example = new UserExample();
        example.createCriteria().andUserCodeEqualTo(userCode).andPassWordEqualTo(passWord);
        List<User> userList= userMapper.selectByExample(example);
        return userList;
    }
}
