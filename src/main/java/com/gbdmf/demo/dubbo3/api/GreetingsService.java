package com.gbdmf.demo.dubbo3.api;

public interface GreetingsService {
    String sayHi(String name);
    String sayHi2(TestParamDTO name);
}