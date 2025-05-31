public class StringPool {
    public static void main(String[] args) {
        // A Java String Pool is a place in heap memory where all the strings defined in the program are stored.
        // JVM checks for the presence of the object in the String pool
        // If String is available in the pool, the same object reference is shared with the variable, else a new object is created
        // The string constant pool is a small cache that resides within the heap.
        // In other words, the string constant pool exists mainly to reduce memory usage and improve the reuse of existing instances in memory.

        // 1. String literals

        // BEHIND THE SCENES: str1 object gets created in stack memory and
        // value "Rahul" will be stored in the STRING CONSTANT POOL of the heap memory
        String str1 = "Rahul";

        // Declaration of other string object with the same value as per the str1
        // In this case str2 gets created at the stack memory,
        // but pointing to the same value "Rahul" which is already got created in constant pool of the heap memory
        String str2 = "Rahul";

        System.out.println(str1 == str2); // will give "true"


        // 2. with "new" keyword

        // The 'new' keyword forces a new instance to always be created regardless of
        // whether the same value was used previously or not
        // string with new keyword declaration , value always be in the heap memory not in string pool

        String name1 = new String("MS");
        String name2 = new String("MS");

        // values are same as per the string literals
        // but name1 and name2 object pointing to the two diffrent value references

        System.out.println(name1 == name2); // it will give "false"

    }
}
