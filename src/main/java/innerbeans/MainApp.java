package innerbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class MainApp {
    @Autowired
    static TextEditor te;

    public static void main(String[] args) {
        System.out.println("Before beans.xml is read");
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        System.out.println("After beans.xml is read");
        // TextEditor te = (TextEditor) context.getBean("textEditor");
        System.out.println("After textEditor bean was assigned to TextEditor");

        te.spellCheck();
    }
}
