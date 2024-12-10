public class Counting {
    public static void main(String args[]){
        String a = "Shaik";
        int c[]=new int[26];
        for(int i=0;i<a.length();i++)
        {
            c[((int)(a.charAt(i)))-97]++;
        }
        System.out.println(c);
        }

    
}
