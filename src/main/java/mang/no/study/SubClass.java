package mang.no.study;

/**
 * Created by mrana on 25.09.2017.
 */
public class SubClass extends SuperClass {

    @Override
    public void method() {
        System.out.println("SubClass");
    }

    @Override
    public String getData() {
        System.out.println("From subclass");
        return super.getData();
    }

    @Override
    protected void doSomething() {
        System.out.println("doSomething Subclass");
    }
}

