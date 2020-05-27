package com.springboot.dubbo.service.impl;

import com.springboot.dubbo.service.TestInter;

public class TestInterImpl implements TestInter {


    @Override
    public String testDemo(String param) {
        return param;
    }
}
