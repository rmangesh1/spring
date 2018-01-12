package mang.no.study;

import com.sun.javafx.scene.control.behavior.OptionalBoolean;
import org.apache.http.client.utils.URIBuilder;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

import javax.swing.text.html.Option;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.time.LocalDateTime;
import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.regex.Pattern.compile;

/**
 * Hello world! YOLO
 */
public class App {

    private static final Pattern ORG_PATTERN = compile("^(9908:|NO)?(\\d{9})?(MVA)?$");

    public static void main(String[] args) throws UnsupportedEncodingException {
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

        /*Map<BigDecimal, BigDecimal> mapVatPercentToBaseAmount = new HashMap<BigDecimal, BigDecimal>();
        Set<BigDecimal> vatPercentSet = new HashSet<BigDecimal>();
        System.out.println(vatPercentSet.add(null));*/

        /*Matcher m = ORG_PATTERN.matcher("932988607MVA");
        if (m.find()) {
            System.out.println(m.group(2));
        }*/

        //String s = "xya";

        //Optional<String> opStr = Optional.ofNullable(s).map();
        /*if(method()) {
            System.out.println("Inside method true");
        }*/
        /*opStr.ifPresent(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        /*Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("test");
            }
        };
        r.run();*/

        /*List<Envelope> listE = Arrays.asList(new Envelope("abc", null, null), new Envelope("def", null, null),new Envelope("ghi", null, null));
        List<String> listS = Arrays.asList("abc", "xyz");
        //List<String> listS = new ArrayList<String>();
        Optional<List<String>> listSOpt = Optional.ofNullable(listS);
                List<Envelope> listNewE  = listE.stream().filter(e -> !listS.contains(e.getMessage())).collect(Collectors.toList());
        //listS.stream().filter(s -> s.contains("a")).collect(Collectors.toList());
        //listSOpt.map(list -> !list.contains("aa"));

        System.out.println(listNewE);*/

        /*List<Notification> listDB = new ArrayList<Notification>();
        Notification notification1 = new Notification(20L,"test@test.no");
        Notification notification2 = new Notification(21L,"test2@test.no");
        listDB.add(notification1);
        listDB.add(notification2);

        List<Notification> listUI = new ArrayList<Notification>();
        listUI.add(new Notification(21L, "test2@test.no"));
        listUI.add(new Notification(23L, "test3@test.no"));

        BiPredicate<Notification, Notification> biPredicate = (n1, n2) -> n1.getId().equals(n2.getId());

        System.out.println(listDB.stream().filter(notDb -> listUI.stream().filter(notUi -> notDb.getId().equals(notUi.getId())).count()==0).collect(Collectors.toList()));*/

        List<Notification> listDB1 = new ArrayList<Notification>();
        /*Notification notification1 = new Notification(20L,"test3@test.no","blue1", LocalDateTime.now());
        Notification notification2 = new Notification(21L,"test2@test.no","blue", LocalDateTime.now());
        listDB1.add(notification1);
        listDB1.add(notification2);*/

        /*List<Notification> listUI = new ArrayList<Notification>();
        Notification notification3 = new Notification(null,"test3@test.no","blue1", LocalDateTime.now());
        Notification notification4 = new Notification(null,"test4@test.no","blue1", LocalDateTime.now());
        listUI.add(notification3);
        listUI.add(notification4);

        List<NotificationWrapper> listDBWrapper = listDB1.stream().map(dNot -> NotificationWrapper.wrap(dNot)).collect(Collectors.toList());
        List<NotificationWrapper> listUIWrapper = listUI.stream().map(dNot -> NotificationWrapper.wrap(dNot)).collect(Collectors.toList());

        //List<NotificationWrapper> listDBWrapper = new ArrayList<NotificationWrapper>();
       // listUIWrapper.stream().filter()
        System.out.println(listUIWrapper.stream().filter(uNot -> uNot.unWrap().getId() == null || !listDBWrapper.contains(uNot)).collect(Collectors.toList()));*/

        //System.out.println(Objects.equals("aaa", null));
        //System.out.println(new Envelope() instanceof Envelope);

        /*List<Envelope> envelopeList = new ArrayList<Envelope>();
        envelopeList.add(new Envelope("first"));
        envelopeList.add(new Envelope("second"));
        envelopeList.add(new Envelope("third"));
        System.out.println(envelopeList);
        envelopeList.stream().filter(e -> e.getMessage().equals("second")).forEach(e -> e.setMessage("yolo"));

        System.out.println(envelopeList);*/

        List<Employee> employees = Arrays.asList(new Employee("mangesh", "ran", 1000), new Employee("jay", "ran", 5000));
        Employee employee = new Employee("mangesh", "ran", 1000);

        System.out.println(employees.contains(employee));
        //System.out.println(listDB.stream().filter(notDb -> listUI.stream().filter(notUi -> notUi.getId().equals(notDb.getId())).count()==1).collect(Collectors.toList()));
        //Runnable r = () -> System.out.println("test1");
        //r.run();

        //opStr.ifPresent(System.out::println);
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
