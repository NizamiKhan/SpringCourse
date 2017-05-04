package start;

import impls.robot.ModelT1000;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        ModelT1000 modelT1000=(ModelT1000)context.getBean("modelT1000");
        modelT1000.action();
    }
}
