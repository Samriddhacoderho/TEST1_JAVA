import java.util.Scanner;

public class Que1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word:");
        String word=sc.next();
        String newWord="";
        for(int i=word.length()-1;i>=0;i--)
        {
            newWord=newWord+word.charAt(i);
        }
        System.out.println("After reversing, your word is:"+newWord);
        sc.close();
    }
}