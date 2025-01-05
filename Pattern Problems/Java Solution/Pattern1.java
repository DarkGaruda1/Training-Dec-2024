/*Draw The Following Pattern 
 *               
 *                * * * *
 *                * * * *
 *                * * * *
 *                * * * *
 *               
 */

import java.util.Scanner;
public class Pattern1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Of Rows And Cols");
        int rows=sc.nextInt();
        sc.close();

        for(int i=0;i<rows;i++){

            for(int j=0;j<rows;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
 
    
 }