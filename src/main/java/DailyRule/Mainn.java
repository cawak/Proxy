package DailyRule;

import java.io.*;
import java.lang.ref.WeakReference;
import java.lang.reflect.Proxy;
import java.time.LocalTime;
import java.util.zip.GZIPOutputStream;

/**
 * Created by kaga on 2/6/16.
 */
public class Mainn {

    static final int BUFFER_SIZE = 8192;
    /**
     *
     * @param fileName contains the full path of the file to compress to gzip format.
     * @return
     */
    private boolean compressToGzip(String fileName) {
        boolean answer = false;
        File file2gz = new File(fileName);
        if (!file2gz.exists()){
            System.out.println("Warning : The file to compress named " + fileName + " does not exist.");
            return answer;
        }

        String fileNameOfGzipFile = fileName + ".gz";
        File gzedFile = new File(fileNameOfGzipFile);
        try {
            if (!gzedFile.createNewFile()){
                System.out.println("Warning : The file to compress named " + fileNameOfGzipFile + " does not exist.");
                return answer;
            }
        } catch (IOException e) {
            System.out.println("Error: cannot create new gzip file");
        }

        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileName));
            GZIPOutputStream gzos = new GZIPOutputStream(new FileOutputStream(gzedFile))){

            byte[] inbuf = new byte[BUFFER_SIZE];
            int n;

            while ((n = bis.read(inbuf)) != -1) {
                gzos.write(inbuf, 0, n);
            }

        } catch (IOException e){
            System.out.println("Error: Error occurred while compressing + nameOfgzedFile + \"].");
        }

        if (!file2gz.delete()) {
            System.out.println("Error: Error occurred while deleting ");
        }

        return answer;
    }

    public static void main(String[] args) {
        /*Interval interval = new Interval(LocalTime.now(),LocalTime.now(), LocalTime.parse("01:00"));*//*
        WeakReference<String> weak = new WeakReference<>("String");
        weak.get();
        System.out.println(weak.get());
        Proxy.getInvocationHandler(weak);
        //cracking java byte code encryption
        Class<Mainn> clazz = Mainn.class;*/

        Mainn mainn = new Mainn();
        mainn.compressToGzip("1.txt");

        File file = new File("122.txt");
        System.out.println(file.getAbsolutePath());

    }
}
