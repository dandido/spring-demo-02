package com.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Scanner;

@Component
public class Entreprise {
    /**
     * When we have more than one implementation on an interface we should use @Qualifier to specify which one to inject
     * But in Pivotal they discourage the use of this , instead we should use the profiles .
     *
     * the name inside the () is the class name with a lower case first letter
     */
    /*@Autowired
    //@Qualifier("developperAndroid")
    @Qualifier("developperJAva")    private Developper developper;

    public Developper getDevelopper() {
        return developper;
    }*/

            /**
            Here we are injection developperJAva1
             And we are testing the equality with @Scope in the @Component
             instead of using the XML

             */
    private Developper developper;
    Entreprise(    @Qualifier("developperJAva")  Developper developperJAva1,
                   @Qualifier("developperJAva")  Developper developperJAva2,
                   @Qualifier("developperAndroid")  Developper developperAndroid1 ,
                   @Qualifier("developperAndroid")  Developper developperAndroid2){
        this.developper = developperJAva1;
        System.out.println("is same instance ? ? :: " + (developperJAva1==developperJAva2) + developperJAva1 + " --- "+developperJAva2 );
        System.out.println("is same instance ? ? :: " + (developperAndroid1==developperAndroid2) + developperAndroid1 + " --- "+developperAndroid2 );

    }
    public Developper getDevelopper() {
        return developper;
    }

}
