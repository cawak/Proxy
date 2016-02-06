import java.io.PrintWriter;
import java.lang.reflect.*;

/**
 * Created by kaga on 1/8/16.
 */
public class TracingIH implements InvocationHandler{

    public static Object createProxy(Object obj, PrintWriter out){
        return Proxy.newProxyInstance(
                obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),
                new TracingIH(obj,out));
    }

    private Object target;
    private PrintWriter out;

    private TracingIH(Object obj, PrintWriter out){
        this.target = obj;
        this.out = out;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        try{
            System.out.println(method.getName() + "(...) called");
            result = method.invoke(target,args);
        } catch (InvocationTargetException e){
            System.out.println(method.getName() + "throws " + e.getCause());
            throw e.getCause();
        }
        System.out.println(method.getName() + " returns");
        return result;
    }
}
