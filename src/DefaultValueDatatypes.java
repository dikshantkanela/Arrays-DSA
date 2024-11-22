public class DefaultValueDatatypes {
    static String str;        // Reference type (String)
    static Object obj;        // Reference type (Object)
    static int[] arr;         // Reference type (Array)
    static int num;

    public static void main(String[] args) {
        System.out.println("String default: " + str); // null
        System.out.println("Object default: " + obj); // null
        System.out.println("Array default: " + arr); //null
        System.out.println("integer default: " + num);  // 0
    }
}