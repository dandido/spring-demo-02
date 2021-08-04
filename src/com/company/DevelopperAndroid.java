package com.company;

import org.springframework.stereotype.Component;

@Component
public class DevelopperAndroid implements Developper{
    @Override
    public String getProgrammingLanguage() {
        return "Android";
    }
}
