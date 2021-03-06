package start;

import impls.robot.ModelT1000;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        Object object = context.getBean("t1000");
        if (object instanceof ModelT1000) {
            ModelT1000 t1000 = (ModelT1000) object;
            t1000.dance();
        }
    }
}
