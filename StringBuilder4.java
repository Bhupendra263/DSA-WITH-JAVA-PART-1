/* -> reverse() and delete(i , j) */
import java.io.*;
public class StringBuilder4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("physics");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.delete(2, 4);
        System.out.println(sb);
        System.out.println(sb.substring(3));
    }
}
