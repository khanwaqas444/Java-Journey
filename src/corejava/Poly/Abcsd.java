package corejava.Poly;

public class Abcsd {
    public static void main(String[] args) {
        // String (Immutable)
        String str = "Hello";
        str.concat(" World");
        System.out.println("String: " + str);  // Output: Hello

        // StringBuffer (Mutable)
        StringBuffer sb = new StringBuffer("Hello");
        sb.append("World");
        System.out.println("StringBuffer: " + sb);  // Output: Hello World
    }
}
