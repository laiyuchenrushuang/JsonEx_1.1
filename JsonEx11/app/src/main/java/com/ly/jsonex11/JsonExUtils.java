package com.ly.jsonex11;

import com.google.gson.Gson;
import com.google.gson.JsonParser;

/**
 * Created by ly on 2019/7/26 9:58
 * <p>
 * Copyright is owned by chengdu haicheng technology
 * co., LTD. The code is only for learning and sharing.
 * It is forbidden to make profits by spreading the code.
 */
public class JsonExUtils {
    private static JsonExUtils instance;

    public static JsonExUtils getInstanse() {
        if (instance == null) {
            synchronized (JsonExUtils.class) {
                instance = new JsonExUtils();
            }
        }
        return instance;
    }

    public Gson getGsonObject(){
        return new Gson();
    }

    public JsonParser getJsonParser(){
        return  new JsonParser();
    }
}
