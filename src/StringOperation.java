public class StringOperation {
    public static void main(String[] args) {
        String s1 = "Rahul";
        String s2 = s1;  // "Rahul"
        s1 = s1.concat("Avhad");  // concat will return new string and assigned to the s1 "Rahul Avhad"

        System.out.println(s1);
        System.out.println(s2);
    }
}
