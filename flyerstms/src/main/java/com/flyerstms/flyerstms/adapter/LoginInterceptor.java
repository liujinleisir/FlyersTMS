package com.flyerstms.flyerstms.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {

    private static final Logger log = LoggerFactory.getLogger(LoginInterceptor.class);

    /**
     * 进入controller层之前拦截请求
     *
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        log.info("--------------处理请求前视图渲染之前的处理操作---------------");

//                String result = "";
//        String inputLine = null;
//        StringBuffer recieveData = new StringBuffer();
//        BufferedReader in = null;
//        try {
//            in = new BufferedReader(new InputStreamReader(httpServletRequest.getInputStream(), "UTF-8"));
//            while ((inputLine = in.readLine()) != null) {
//                recieveData.append(inputLine);
//            }
//            result = recieveData.toString();
//            try {
//                result = new String(new BASE64Decoder().decodeBuffer(recieveData.toString()), "UTF-8").replaceAll("\"",
//                        "'");
//            } catch (Exception e) {
//                result = recieveData.toString();
//            }
//        } catch (IOException e) {
//        } finally {
//            try {
//                if (null != in) {
//                    in.close();
//                }
//            } catch (IOException e) {
//            }
//        }
        return true;

    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        log.info("--------------处理请求完成后视图渲染之前的处理操作---------------");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        log.info("---------------视图渲染之后的操作-------------------------0");
    }

}