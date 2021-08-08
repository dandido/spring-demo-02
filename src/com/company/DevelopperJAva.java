package com.company;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")//we can ignore it : by default when is not speciifed is singleton
public class DevelopperJAva implements Developper{
    @Override
    public String getProgrammingLanguage() {
        return "Java 8+";
    }

    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("DevelopperJAva : doMyStartupStuff ");
    }

    @PreDestroy
    public void doMySDestroyStuff(){
        System.out.println("DevelopperJAva : doMySDestroyStuff ");
    }
}
