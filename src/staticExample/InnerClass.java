package staticExample;

public class InnerClass {

    int a = 4;

    // Where Static is Mentioned
    // as Static is mentioned , It is not dependent on the outside class

    static class Test{
        static String name;
        Test(String name){
            Test.name = name;
        }
    }
    public static void main(String[] args) {
        Test a = new Test("Kunal");
        Test b = new Test("Rahul");

        InnerClass inner = new InnerClass();
        System.out.println(inner.a);

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
