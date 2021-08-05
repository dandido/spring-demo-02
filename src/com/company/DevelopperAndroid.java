package com.company;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class DevelopperAndroid implements Developper{
    @Override
    public String getProgrammingLanguage() {
        return "Android";
    }
}
