public class Typecasting {
    public static void main(String[] args) {
        // Typecasting is the process of converting one data type into another data type

        // Widening OR Implicit Type Casting
        // Process of A Lower data type is transformed into higher one
        // byte --> short --> int --> long --> float --> double

        short sh = 3232;  // lower one
        int i = sh;  // lower (sh) is being transformed into higher one

        // more examples
        char ch = 'a' + 'b' + 2 ;  // lower one
        int var = ch;  // lower one is transformed into higher one

        System.out.println(var);

        // Narrow  OR Explicit Type Casting
        // Process of downsizing bigger data type into smaller one
        // Converting higher data type into the smaller one
        // reverse of the implicit data type

        int number = 65535;
        short sho = (short) number;

        int val = 97;
        char chh = (char) val;  // int higher one is basically converted into the char which is lower one data type

        System.out.println(chh); // 'a'

        System.out.println(2 + 22 + 4.5 + 433434);
    }
}
