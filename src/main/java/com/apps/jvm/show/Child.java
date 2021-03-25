package com.apps.jvm.show;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author ky2009666
 * @Description 子类
 * @Date 2021/3/25
 **/
@Slf4j
public class Child extends Parent {
    public Child() {
        super();
        parent = 2;
    }

    public static void main(String[] args) {
        log.info(Child.parent + "");
    }
}
