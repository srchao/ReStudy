package test;
import org.junit.Test;
import java.lang.reflect.Field;

public class test1 {

    @Test
    public void test1() throws NoSuchFieldException, IllegalAccessException {
        String s1="abc";
        String s2="abc";

        //char v1[]={'1','2','3'};
        //char v1[]=new char[3];

        //System.out.println(v1);

        System.out.println(s1 == s2);

        Class clazz = String.class;
        Field field=clazz.getDeclaredField("value");
        field.setAccessible(true);

        char[] value= (char[]) field.get(s1);

        value[0]='q';//虽然是final修饰，但是可以改其本身的值
        //value=v1;//final修饰的value，无法改其地址引用

        System.out.println(s2);
        System.out.println(s1 == s2);
    }
}
