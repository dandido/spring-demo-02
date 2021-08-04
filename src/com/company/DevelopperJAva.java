package com.company;
import org.springframework.stereotype.Component;

@Component
public class DevelopperJAva implements Developper{
    @Override
    public String getProgrammingLanguage() {
        return "Java 8+";
    }
}
