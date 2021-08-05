package com.company;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")//we can ignore it : by default when is not speciifed is singleton
public class DevelopperJAva implements Developper{
    @Override
    public String getProgrammingLanguage() {
        return "Java 8+";
    }
}
