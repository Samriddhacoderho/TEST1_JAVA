import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int s=0;
        while(num!=0)
        {
            s=s+(num%10);
            num=num/10;
        }
        System.out.println("The sum of digits of:"+num+" is:"+s);
        sc.close();
    }
}
