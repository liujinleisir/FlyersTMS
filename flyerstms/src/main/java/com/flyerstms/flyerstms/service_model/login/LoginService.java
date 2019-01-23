package com.flyerstms.flyerstms.service_model.login;

import com.flyerstms.flyerstms.model.User;

import java.util.List;

/**
 * Title:
 * Description:
 *
 * @author liujinlei
 * @version 1.0
 */
public interface LoginService {
    String doLogin(String userCode, String passWord);
}
