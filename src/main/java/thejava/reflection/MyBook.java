package thejava.reflection;

@MyAnnotation
public class MyBook implements Book{
    private int a;
    public int b;
    public String c = "c";

    @Override
    public void read() {
        System.out.println("read!");
    }

    private int returnA(int a){
        return a;
    }
    public void printStr(String a){
        System.out.println(a);
    }

}
