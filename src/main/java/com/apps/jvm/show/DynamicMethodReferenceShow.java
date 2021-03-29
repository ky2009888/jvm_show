package com.apps.jvm.show;

/**
 * @Author ky2009666
 * @Description 动态链接
 * @Date 2021/3/27
 **/
public class DynamicMethodReferenceShow {
    /**
     * 定义变量num.
     */
    private int num = 0;

    /**
     * 方法入口.
     *
     * @param args 命令行参数.
     */
    public static void main(String[] args) {
        DynamicMethodReferenceShow dynamicMethodReferenceShow = new DynamicMethodReferenceShow();
        dynamicMethodReferenceShow.methodB();
    }

    private void methodA() {
        System.out.println("methodA()-------------------------");
    }

    private void methodB() {
        methodA();
        num++;
        System.out.println("num = " + num);
    }
}
