import newOne.MainOne;

import java.io.PrintWriter;

/**
 * Created by kaga on 1/8/16.
 */
public class Main {
    public static void main(String[] args) {

        //DogInterface dogProxy = (DogInterface) TracingIH.createProxy(new Dog("Sharik"),new PrintWriter(System.out));
        //dogProxy.printBark("Sharikk");

        //DogInterface dogProxy = (DogInterface) TracingIH.createProxy(new DogFactory("Dog",true).newInstance("Sharik"),new PrintWriter(System.out));

        DogInterface dogProxy = new DogFactory("Dog",true).newInstance("Sharik");
        dogProxy.printBark("Bobic");

        //MainOne mainOne = new MainOne();
        //mainOne.TestingReflection();

        System.out.println(new Throwable().getStackTrace()[2]);
        Dog dog1 = new Dog();
    }
}
