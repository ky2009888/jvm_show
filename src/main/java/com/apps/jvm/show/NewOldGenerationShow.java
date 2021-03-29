package com.apps.jvm.show;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author ky2009666
 * @Description 新老代堆的显示
 * @Date 2021/3/29
 **/
@Slf4j
public class NewOldGenerationShow {
    /**
     * 定义num变量.
     */
    private static int num = 9;

    public static void main(String[] args) throws Exception{
        Thread.sleep(1000000);
        log.info("num={}", num);
    }
}
