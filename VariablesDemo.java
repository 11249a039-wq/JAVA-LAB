
public class VariablesDemo{
    int instanceVar = 10;
    static String staticVar = "I am a static";
    public void showVariable()
    {
        int localVar = 5;
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Local Variable: " + localVar);
    }
    public static void main(String[] args)
    {
        VariablesDemo obj1 = new VariablesDemo();
        obj1.showVariable();
        System.out.println("Accessing Static Variable via class: " + VariablesDemo.staticVar);
  }
}