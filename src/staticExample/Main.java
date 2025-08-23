package staticExample;

public class Main {
    public static void main(String[] args) {
        Human Rohan = new Human(19 , "Rohan Avhad" , 50000 , false);
        System.out.println(Human.population);  // 1

        Human Rahul = new Human(23 , "Rahul Avhad" , 30000 , false);
        System.out.println(Human.population);  // 2

        Human Vaibhav = new Human(21 , "Vaibhav Avhad" , 40000 , true);
        System.out.println(Human.population);  // 3

      //  Class (Blueprint) → No memory allocated for fields when you declare it.
      //  Object (Instance) → Memory is allocated on the heap when you use new.
      //  Static members → Memory allocated once in the Method Area when the class is loaded.
    }
}
