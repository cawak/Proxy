package newOne;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kaga on 1/14/16.
 */
public class ClassWithMethods {

    private List<String> stringList = new ArrayList<>();
    private Integer integer = 0;

    @PleaseRunMe
    public void method1(){
        System.out.println("Hello1!");
    }

    @PleaseRunMe
    public void method2(){
        System.out.println("PApa1");
    }

    @PleaseRunMe
    public void method3(){
        System.out.println("Here");
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }
}
