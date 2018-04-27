import java.util.ArrayList;
import java.util.List;

/**
 * @author yangze1
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2018/4/14 16:54
 */
public class test {
    public static void main(String[] args) {
//        System.out.println((long) (3.5655555*10));
//        System.out.println((long)Math.floor(3.5));


        List<A> list = new ArrayList<>();
        list.add(new A("12","23"));
        list.add(new A("11","23"));
        list.add(new A("13","23"));
        list.add(new A("14","23"));
        list.add(new A("15","23"));
        list.add(new A("11","24"));

        List<A> list1 = new ArrayList<>();
        list.parallelStream().forEach((A a)->{
            if (!a.aa.equals("11")){
                list1.add(a);
            }
        });

        System.out.println(list1);
        list1.parallelStream().forEach(a -> {
            System.out.println(a.aa +"---"+a.bb );
        });
    }

    static class A {
        private String aa;
        private String bb;

        public A(String aa, String bb) {
            this.aa = aa;
            this.bb = bb;
        }
    }
}
