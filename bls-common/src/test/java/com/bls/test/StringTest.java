package com.bls.test;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.JsonObject;
import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @program: bailesi
 * @description:
 * @author: Mr.Yuan
 * @create: 2022-01-25 07:32
 **/
public class StringTest {

    @Test
    public void testJson(){

        String str = "{";//"\"{";//""{\"name\":\""+name+"\",\"code\":\""+code+"\",\"address\":\""+address+"\",\"phone\":\""+phone+"\"}";
        HashMap<String,String> args = new HashMap<>();
        args.put("name","admin");
        args.put("pwd","123456");
        String templateParam = "{";
        if(args != null){
            Iterator<Map.Entry<String,String>> iterator = args.entrySet().iterator();
            while(iterator.hasNext()){
                Map.Entry<String, String> entry = iterator.next();
                templateParam += "\""+entry.getKey()+"\":\""+entry.getValue()+"\",";

            }
            templateParam = templateParam.substring(0,templateParam.length()-1)+"}";
            System.out.println(templateParam);
            Object parse = JSONObject.parse(templateParam);
            System.out.println(JSONObject.toJSONString(parse));
        }
    }
}
