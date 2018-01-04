package comp.prod.spring;

import org.springframework.stereotype.Component;

/**
 * Created by mrana on 04.01.2018.
 */
@Component("specialComponent")
public class SomeComponent {

    public SomeComponent() {
        System.out.println("Component constructor");
    }
}
