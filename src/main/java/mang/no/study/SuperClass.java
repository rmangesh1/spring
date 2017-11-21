package mang.no.study;

/**
 * Created by mrana on 25.09.2017.
 */
public class SuperClass {

    private String id;

    private Boolean flag;

    public String getData() {
        doSomething();
        return getDataFromDB();
    }

    protected void doSomething() {
        System.out.println("doSomething Superclass");
    }

    private String getDataFromDB() {
        return "superclass";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public void method() {
        System.out.println("SuperClass");
    }

    public void build() {
        method();
    }
}
