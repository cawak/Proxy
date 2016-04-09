package DailyRule;

import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Proxy;
import java.time.LocalTime;

/**
 * Created by kaga on 2/6/16.
 */
public class Mainn {

    /**
     *
     * @param fileName contains the full path of the file to compress to gzip format.
     * @return
     */
    private boolean compressToGzip(String fileName) {
        File file2gz = new File(fileName);
        if (!file2gz.exists()){
            System.out.println("The file to compress named " + fileName + " does not exist.");
        }

        String fileNameOfGzipFile = fileName + ".gz";

        File gzedFile = new File(fileNameOfGzipFile);
    }

    public static void main(String[] args) {
        /*Interval interval = new Interval(LocalTime.now(),LocalTime.now(), LocalTime.parse("01:00"));*/
        WeakReference<String> weak = new WeakReference<>("String");
        weak.get();
        System.out.println(weak.get());
        Proxy.getInvocationHandler(weak);
        //cracking java byte code encryption
        Class<Mainn> clazz = Mainn.class;

    }
}
