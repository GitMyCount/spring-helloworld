import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat beanCat =
                (Cat) applicationContext.getBean("tom");
        Cat beanCat2 =
                (Cat) applicationContext.getBean("tom");

        System.out.println(bean2.getMessage().equals(bean.getMessage()));
        System.out.println(beanCat2.getName().equals(beanCat.getName()));
    }
}