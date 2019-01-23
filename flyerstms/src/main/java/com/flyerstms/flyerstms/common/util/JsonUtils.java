package com.flyerstms.flyerstms.common.util;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class JsonUtils {
    public static Map<String, Object> getParamFromJsonStr(String jsonStr) {
        HashMap<String, Object> map = null;
        map = JSONObject.parseObject(jsonStr, HashMap.class);
        return map;
    }
}
