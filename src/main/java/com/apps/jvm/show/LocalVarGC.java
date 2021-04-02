package com.apps.jvm.show;

/**
 * @Author ky2009666
 * @Description 演示通过GC释放的例子
 * @Date 2021/4/2
 **/
public class LocalVarGC {
    public void localvarGC1() {
        //10MB
        byte[] buffer = new byte[10 * 1024 * 1024];
        System.gc();
    }

    public void localvarGC2() {
        //10MB
        byte[] buffer = new byte[10 * 1024 * 1024];
        buffer = null;
        System.gc();
    }

    public void localvarGC3() {
        //10MB
        {
            byte[] buffer = new byte[10 * 1024 * 1024];
        }
        System.gc();
    }

    public void localvarGC4() {
        //10MB
        {
            byte[] buffer = new byte[10 * 1024 * 1024];
        }
        int value = 10;
        System.gc();
    }

    public void localvarGC5() {
        localvarGC1();
        System.gc();
    }

    public static void main(String[] args) {
        LocalVarGC local = new LocalVarGC();
        local.localvarGC5();
    }
}
