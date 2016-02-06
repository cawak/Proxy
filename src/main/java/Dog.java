/**
 * Created by kaga on 1/8/16.
 */
public class Dog implements DogInterface, Cloneable{
    String name;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void printBark(String name) {
        System.out.println(name + " Bark!!!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
