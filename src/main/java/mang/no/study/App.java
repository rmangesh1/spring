package mang.no.study;

import com.sun.javafx.scene.control.behavior.OptionalBoolean;
import org.apache.http.client.utils.URIBuilder;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import java.util.TreeMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws UnsupportedEncodingException {
        /*ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        Envelope envelope = (Envelope) classPathXmlApplicationContext.getBean("envelope");
        Envelope envelope1 = (Envelope) envelope.getBeanFactory().getBean("envelope1");
        System.out.println("Message from envelope by getting envelope1 : "+envelope1.getMessage());
        classPathXmlApplicationContext.close();*/

        /*TestEnum testEnum = TestEnum.valueOf("zzzz");

        switch (testEnum) {
            case T1:
                System.out.println();
                default:
                    System.out.println("DEFAULT");
        }*/

        //System.out.println("abc"+null+"xxx");

        /*SubClass subObj = new SubClass();

        System.out.println(subObj);*/

        /*SuperClass sObj = new SuperClass();

        System.out.println("Boolean = " +sObj.getFlag());

        ClassB b = new ClassB();

        b.setFlag(sObj.getFlag());

        System.out.println(b.isFlag());*/

        /*SuperClass obj = new SubClass();

        System.out.println(obj.getData());*/

        /*Map<String,String> map = new TreeMap<String,String>();
        map.put("","sss");
        map.put("aa","sss1");
        map.put("bb","sss2");
        System.out.println(map);*/

        //System.out.println(URLEncoder.encode("http://localhost:8080/avtalegiro/process?uuid=5a165f66-5e6b-48ee-990b-d0fcbe02c630&callback=https://www.vg.no&timestamp=06.10.2017+12:36:21&token=esWpft4DQAhVSyAgWe5c0KTMo0teHNI06SAM2EpTC8celHvT4CI4YXPCnHGyTLweAUBgKygZOAMTVtkbX18ALw", "UTF-8"));

        //System.out.println(URLEncoder.encode("Nordea Liv", "UTF-8"));

        //System.out.println(method1());

        /*Envelope e = new Envelope();

        e.setMessage(e.getMessage() + "yoo");

        System.out.println(e.getMessage());*/

        System.out.println(new String("Kj�re kunde".getBytes("ISO-8859-1"),"UTF-8"));

        /*if(method()) {
            System.out.println("Inside method true");
        }*/

        /*String date = "2017-06-30 ";
        System.out.println(date.split(" ")[0]);*/
    }

    private static boolean method() {
        return false && false || true;
    }

    private static String method1() {

        URIBuilder builder = new URIBuilder();
        builder.setPath("pvu.do");
        builder.addParameter("name", "Nordea Liv");
        builder.addParameter("url", "http://localhost:8080/avtalegiro/process?uuid=5a165f66-5e6b-48ee-990b-d0fcbe02c630&callback=https://www.vg.no&timestamp=06.10.2017+12:36:21&token=esWpft4DQAhVSyAgWe5c0KTMo0teHNI06SAM2EpTC8celHvT4CI4YXPCnHGyTLweAUBgKygZOAMTVtkbX18ALw");
        builder.addParameter("test", null);
        return builder.toString();
    }


}
