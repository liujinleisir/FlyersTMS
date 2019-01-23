package com.flyerstms.flyerstms.service_model.controller;

import com.flyerstms.flyerstms.common.ConfigMappingPATH;
import com.flyerstms.flyerstms.service_model.login.LoginService;
import io.swagger.annotations.*;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Title:用户登录
 * Description:
 *
 * @author liujinlei
 * @version 1.0
 */
@RestController
@RequestMapping(value = ConfigMappingPATH.ROOT_PATH)
public class LoginControler {
    @Resource
    private LoginService loginService;
    @ApiOperation(value="用户登录", notes="根据用户名密码来登录")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userCode", value = "userCode", required = true, dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "passWord", value = "passWord", required = true, dataType = "String",paramType = "query")
    })
    //MediaType
    @RequestMapping(value = ConfigMappingPATH.LOGIN_PATH,method = RequestMethod.POST)
    public String doLogin(String userCode, String passWord) {
        System.out.println("ZZZZZZZZZZZZZZZZZZZZZZZ"+userCode+"!!!!!!"+passWord);
        System.out.println("ZZZZZZZZZZZZZZZZZZZZZZZ"+userCode+"!!!!!!"+passWord);

        System.out.println("ZZZZZZZZZZZZZZZZZZZZZZZ"+userCode+"!!!!!!"+passWord);
        System.out.println("ZZZZZZZZZZZZZZZZZZZZZZZ"+userCode+"!!!!!!"+passWord);
        System.out.println("ZZZZZZZZZZZZZZZZZZZZZZZ"+userCode+"!!!!!!"+passWord);
        System.out.println("ZZZZZZZZZZZZZZZZZZZZZZZ"+userCode+"!!!!!!"+passWord);
        System.out.println("ZZZZZZZZZZZZZZZZZZZZZZZ"+userCode+"!!!!!!"+passWord);
        System.out.println("ZZZZZZZZZZZZZZZZZZZZZZZ"+userCode+"!!!!!!"+passWord);
        String aaa = loginService.doLogin(userCode, passWord);
        System.out.println("ZZZZZZZZZZZZZZZZZZZZZZZ"+aaa);
        String b ="aaa";

        return aaa;
    }
}
