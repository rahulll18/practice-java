public class StringOperation {
    public static void main(String[] args) {
        // Normal String Class
        // Which creates new string object when given string modified
        // Use When uh want to read string

        String s1 = "Rahul";
        s1 = s1.concat("Avhad");  // concat will return new string and assigned to the s1 "Rahul Avhad"

        System.out.println(s1);

        // String buffer
        // String Created with string buffer class
        // will not create new string but actually modified given string
        // Use , When uh want to change string frequently
        // slow because of synchronisation

        StringBuffer str = new StringBuffer("String with buffer class");
        str.append(" Hii");
        System.out.println(str.length()); // It will append hii to the end of the string str and also not create new string

        // String builder
        // String-builder also create mutable string ,
        // Use , When uh want to change string frequently
        // fast

        StringBuilder str2 = new StringBuilder("Hello");
        str2.append(" World");

        System.out.println(str2 + " Length is " + str2.length());
    }
}
