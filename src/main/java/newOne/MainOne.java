package newOne;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by kaga on 1/14/16.
 */
public class MainOne {

    public void TestingReflection() {
        Class clazzToRun = ClassWithMethods.class;

        //Need to add sorting by annotation value.
        for (Method method : clazzToRun.getMethods()){
            if (method.isAnnotationPresent(PleaseRunMe.class)){
                try {
                    method.invoke(new ClassWithMethods());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }

        ClassWithMethods classWithMethods = new ClassWithMethods();
        classWithMethods.getStringList().add("hello");
        System.out.println(classWithMethods.getStringList());
        //classWithMethods.getInteger() = null;


    }

}
