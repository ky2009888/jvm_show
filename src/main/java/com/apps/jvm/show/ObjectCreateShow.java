package com.apps.jvm.show;

/**
 * @Author ky2009666
 * @Description 对象创建
 * @Date 2021/3/30
 **/
public class ObjectCreateShow {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class childClass = Class.forName(Child.class.getName());
        Child child = Child.class.newInstance();
    }
}
