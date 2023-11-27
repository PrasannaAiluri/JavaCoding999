package LeetCode;
import java.util.*;
public class reverseNumber {
    public static void main(String[] args) {
        int number=634;
        int reverse=0;
        while(number>0)
        {
            int digit=number%10;
            reverse+=digit;
            reverse=reverse*10;
            number=number/10;
        }
        System.out.println(reverse/10);

    }
}
