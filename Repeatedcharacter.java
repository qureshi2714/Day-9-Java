import java.util.*;
public class Repeatedcharacter{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //only for capital
        String a="SHAIKMS";
        int c[]=new int [26];
        for(int i = 0; i < a.length(); i++){
            c[((int)(a.charAt(i)))-65]++;
        }
        int max = 0;
        int index = 0 ;
        for (int i = 0; i < 26; i++){
            if (c[i] > max){
                index = i;
            }
        }
        System.out.println((char) (index + 65));
    }
    
    }
