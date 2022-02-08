package com.bls.test;

import org.junit.Test;

import java.util.Random;

/**
 * @program: bailesi
 * @description:
 * @author: Mr.Yuan
 * @create: 2022-01-25 07:02
 **/
public class NumberTest {

    @Test
    public void testNumber(){
        int number;//定义两变量
        Random ne = new Random();//实例化一个random的对象ne
        number = ne.nextInt(999999 - 100000 + 1) + 1000;//为变量赋随机值100000-999999
        System.out.println("产生的随机数是:" + number);//输出
    }
}
