package com.apps.jvm.show;

import lombok.extern.slf4j.Slf4j;
import sun.misc.Launcher;
import sun.misc.URLClassPath;

import java.net.URL;

/**
 * @Author ky2009666
 * @Description 演示classLoader加载类的路径
 * @Date 2021/3/25
 **/
@Slf4j
public class ClassLoaderPathShow {
    /**
     * 定义分号
     */
    public static final String REGEX = ";";

    public static void main(String[] args) {
        URLClassPath bootstrapClassPath = Launcher.getBootstrapClassPath();
        URL[] urLs = bootstrapClassPath.getURLs();
        for (int i = 0; i < urLs.length; i++) {
            System.out.println(urLs[i].toString());
        }
        //打印展示的结果,引导类加载器记载的内容:
       /* file:/C:/java/jdk1.8.0_281/jre/lib/resources.jar
        file:/C:/java/jdk1.8.0_281/jre/lib/rt.jar
        file:/C:/java/jdk1.8.0_281/jre/lib/sunrsasign.jar
        file:/C:/java/jdk1.8.0_281/jre/lib/jsse.jar
        file:/C:/java/jdk1.8.0_281/jre/lib/jce.jar
        file:/C:/java/jdk1.8.0_281/jre/lib/charsets.jar
        file:/C:/java/jdk1.8.0_281/jre/lib/jfr.jar
        file:/C:/java/jdk1.8.0_281/jre/classes*/
        //下面显示扩展类加载器可以加载哪些内容
        log.info("-------------------------------------------------------");
        String exPaths = System.getProperty("java.ext.dirs");
        for (String path : exPaths.split(REGEX)) {
            System.out.println(path);
        }
        //打印结果如下:
        /*
        C:\Java\jdk1.8.0_281\jre\lib\ext
        C:\WINDOWS\Sun\Java\lib\ext
        */

    }
}
