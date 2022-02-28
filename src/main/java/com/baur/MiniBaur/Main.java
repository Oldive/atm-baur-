package com.baur.MiniBaur;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(SpringConfig.class);

        AtmUI atmUI = context.getBean(AtmUI.class);
        atmUI.run();
    }
}
