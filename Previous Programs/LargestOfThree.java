import java.util.Scanner;

public class LargestOfThree {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1=sc.nextInt();
        System.out.println("Enter Second Number");
        int num2=sc.nextInt();
        System.out.println("Enter Third Number");
        int num3=sc.nextInt();

        if(num1>num2 && num1>num3)
        System.out.println("Num1 is the largest");
        else if(num3>num1 && num3>num2)
        System.out.println("Num3 is the largest");
        else
        System.out.println("Num2 is the largest");
        
    }
    
}
