package com.company;

import org.springframework.stereotype.Component;

@Component // so spring can register it
public class FortuneServiceImpl implements FortuneService{
    @Override
    public String getFortune() {
        return "It's Hot man !!!";
    }
}
