package com.company;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
/**
 * Here is a subtle point you need to be aware of with "prototype" scoped beans.
 * For "prototype" scoped beans, Spring does not call the @PreDestroy method.;
 * Here is the answer from the Spring reference manual.
 * Section 1.5.2  "https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-factory-scopes-prototype"
 *
 */
public class DevelopperAndroid implements Developper{
    @Override
    public String getProgrammingLanguage() {
        return "Android";
    }

    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("DevelopperAndroid : doMyStartupStuff");
    }
    @PreDestroy
    public void doMySDestroyStuff(){
        System.out.println("DevelopperAndroid : doMySDestroyStuff");
    }

    /**
     * QUESTION: How can I create code to call the destroy method on prototype
     * scope beans
     * ANSWER:</em></strong></p><p>You can
     * destroy prototype beans but custom coding is required. This examples shows how to destroy
     *  prototype scoped beans.</p><p>1. Create a custom bean processor. This bean processor will
     *  keep track of prototype scoped beans. During shutdown it will call the destroy() method on
     * the prototype scoped beans.</p><p>2. The prototype scoped beans MUST implement the DisposableBean
     *  interface. This interface defines a "destory()" method. This method should be used instead of
     * the @PostDestroy annotation.</p><p>3. In this app, BeanProcessorDemoApp.java is the main program.
     * TennisCoach.java is the prototype scoped bean. TennisCoach implements the DisposableBean interface
     *  and provides the destroy() method. The custom bean processing is handled in the
     *  MyCustomBeanProcessor class
     *      See source code here for details:
     * <a href="https://drive.google.com/open?id=11YZhzKjLJVhvsMsNjKU7jMrzTHlxwvkT"
     * destroy-protoscope-bean-with-custom-processor.zip
     *
     */
}
