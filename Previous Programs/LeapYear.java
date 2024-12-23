
import java.util.Scanner;

public class LeapYear {

    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Year For Leap Year Check");
        int year= sc.nextInt();

        if(year%100==0){

            if(year%400==0)
            System.out.println("The Year Is A Leap Year");
            else{
                System.out.println("The Year Is Not A Leap Year");
            }
        }else{
            if(year%4==0)
            System.out.println("The Year Is A Leap Year");
            else{
                System.out.println("The Year Is Not A Leap Year");
            }

        }


        
    }
}