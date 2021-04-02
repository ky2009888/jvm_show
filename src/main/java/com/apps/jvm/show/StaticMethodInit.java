package com.apps.jvm.show;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author ky2009666
 * @Description 静态变量初始化
 * @Date 2021/3/25
 **/
@Slf4j
public class StaticMethodInit {
    /**
     * 定义变量num1.
     */
    private static int num1 = 5;

    static {
        num1 = 10;
        //可以赋值，但是不能调用
        num2 = 15;
    }

    /**
     * 定义变量num2.
     */
    private static int num2 = 2;

    public static void main(String[] args) throws InterruptedException {
        //最终打印结果是2
        log.info(String.valueOf(StaticMethodInit.num2));
        Object obj1 = new Object();
        Object obj2 = new Object();
        obj1.wait();
        //手动进行垃圾回收
        System.gc();
    }
}
