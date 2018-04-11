public class HelloWorld {
    public static void main(String[] args)
    {
        HelloHelloWorld hhw = new HelloHelloWorld();
        hhw.Work();
    }
}

class HelloHelloWorld {
    public HelloHelloWorld()
    {
        System.out.println("Hello Hello World");
    }
    public void Work()
    {
        System.out.println("Work");
    }
}