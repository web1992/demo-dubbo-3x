package com.gbdmf.demo.dubbo3.api;


public class GreetingsServiceImpl implements GreetingsService {
    @Override
    public String sayHi(String name) {
        return "hi, " + name;
    }

    @Override
    public String sayHi2(TestParamDTO name) {
        System.out.println("okkkk");
        return null;
    }
}