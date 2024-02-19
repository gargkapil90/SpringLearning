package example.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class BusinessClass{
    private DependencyClass1 dependencyClass1;
    private  DependencyClass2 dependencyClass2;

    public BusinessClass(DependencyClass1 dependencyClass1, DependencyClass2 dependencyClass2) {
        System.out.println("Constructor injection");
        this.dependencyClass1 = dependencyClass1;
        this.dependencyClass2 = dependencyClass2;
    }

    public String toString(){
        return "dependency 1 : " + dependencyClass1 + " dependency 2 : " + dependencyClass2;
    }
}

@Component
class DependencyClass1{

}

@Component
class DependencyClass2{

}

@Configuration
@ComponentScan()
public class DepInjectionAppLauncherApplication {

    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(DepInjectionAppLauncherApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(BusinessClass.class));
        }
    }
}
