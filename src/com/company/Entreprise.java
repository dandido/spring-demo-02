package com.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Entreprise {
    /**
     * When we have more than one implementation on an interface we should use @Qualifier to specify which one to inject
     * But in Pivotal they discourage the use of this , instead we should use the profiles .
     *
     * the name inside the () is the class name with a lower case first letter
     */
    @Autowired
    //@Qualifier("developperAndroid")
    @Qualifier("developperJAva")
    private Developper developper;


    public Developper getDevelopper() {
        return developper;
    }
}
