package com.flyerstms.flyerstms.facade;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.misc.BASE64Decoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author xuzheng
 */
public abstract class FacadeAction {
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, produces = {"application/json; charset=UTF-8"})
    @ResponseBody
    public String postService(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String postData = receiveData(request, response);
        JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd";
        JSONObject param = JSONObject.parseObject(postData);
        String method = param.getString("method");
        long facadeStart = System.currentTimeMillis();
        String requestTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date());
        String responseJson = "";// 返回报文
        Object result = "";
        try {
            Method call = this.getClass().getDeclaredMethod(method, JSONObject.class);
            result = call.invoke(this, param);
        } catch (Exception e) {

        } finally {

        }
        return result.toString();
    }

    private String receiveData(HttpServletRequest request, HttpServletResponse response) {
        String result = "";
        String inputLine = null;
        StringBuffer recieveData = new StringBuffer();
        BufferedReader in = null;
        try {
            in = new BufferedReader(new InputStreamReader(request.getInputStream(), "UTF-8"));
            while ((inputLine = in.readLine()) != null) {
                recieveData.append(inputLine);
            }
            result = recieveData.toString();
            try {
                result = new String(new BASE64Decoder().decodeBuffer(recieveData.toString()), "UTF-8").replaceAll("\"",
                        "'");
            } catch (Exception e) {
                result = recieveData.toString();
            }
        } catch (IOException e) {
            //todo
        } finally {
            try {
                if (null != in) {
                    in.close();
                }
            } catch (IOException e) {
                //todo
            }
        }
        return result;
    }
}