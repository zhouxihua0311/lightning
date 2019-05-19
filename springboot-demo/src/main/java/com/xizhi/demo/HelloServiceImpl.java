/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.xizhi.demo;

import org.springframework.stereotype.Service;

/**
 * @author xihua.zxh
 * @version $Id: WelcomServiceImpl.java, v 0.1 2019年05月15日 3:54 PM xihua.zxh Exp $
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String getString(String ss) {
        String a = ss + "nihao";
        return a;
    }

    private String getResult() {
        for (int i = 0; i < 20; i++) {
            System.out.println(1);
        }
        return "12";
    }

    private String getResult2() {
        for (int i = 0; i < 20; i++) {
            System.out.println(2);
        }
        return "12";
    }
}