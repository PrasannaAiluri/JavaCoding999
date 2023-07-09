package LeetCode;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
    String s="A man, a plan, a canal: Panama";
    boolean flag=true;
    s = s.replaceAll("[^a-zA-Z0-9]", "");
    s=s.toLowerCase();
    int end=s.length()-1;
    for(int i=0;i<s.length()/2;i++)
    {
        
        if(s.charAt(i)==s.charAt(end--))
        {
            continue;
        }
        else
        {
            flag=false;
            break;
            
        }
    }
    if(flag)
     System.out.println("Is a Palindrome");
    else
    System.out.println("Not a Palindrome");
    System.out.println(s);
        
    }
    

    
}
