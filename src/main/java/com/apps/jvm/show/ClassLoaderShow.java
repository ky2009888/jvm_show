package com.apps.jvm.show;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author ky2009666
 * @Description 类加载器
 * @Date 2021/3/25
 **/
@Slf4j
public class ClassLoaderShow {
    public static void main(String[] args) {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        log.info(systemClassLoader.toString());
        //打印结果:sun.misc.Launcher$AppClassLoader@18b4aac2
        ClassLoader classLoaderShowClassLoader = ClassLoaderShow.class.getClassLoader();
        log.info(classLoaderShowClassLoader.toString());
        //打印结果:sun.misc.Launcher$AppClassLoader@18b4aac2
        ClassLoader stringClassLoader = String.class.getClassLoader();
        log.info(stringClassLoader + "");
        //打印结果:null,备注:null+"" 返回null
    }
}
