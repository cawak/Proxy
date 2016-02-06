import java.io.PrintWriter;

/**
 * Created by kaga on 1/8/16.
 */
public class DogFactory {
    private Class dogClass;
    private boolean traceIsOn = false;

    public DogFactory(String className, boolean trace){
        try {
            dogClass = Class.forName(className);
        } catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        }
        traceIsOn = trace;
    }

    public DogInterface newInstance(String name){
        DogInterface d = null;
        try{
            d = (DogInterface) dogClass.newInstance();
            //d.printBark(name);
            if (traceIsOn){
                d = (DogInterface)TracingIH.createProxy(d, new PrintWriter(System.out));
                //d.printBark(name);
            }
        } catch (Exception e){
            throw new RuntimeException(e);
        }
        return d;
    }
}
