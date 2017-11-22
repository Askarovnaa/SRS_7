package kz.kaznitu.lessons.start;

import kz.kaznitu.lessons.interfaces.Phone;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PhoneManager {
    public static void main(String [] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("main.xml");
        Phone terminator = (Phone) context.getBean("t1000");
        terminator.action();
    }
}