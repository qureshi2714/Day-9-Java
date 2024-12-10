import java.util.*;
public class Countarray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String a="Muskan";
        char c[]=new char[26];
        for(int i=0;i<a.length();i++) 
        {
            c[((int)(a.charAt(i)))-65] ++;
        }
        System.out.println(Arrays.toString(c));      
    }
    

    
}
