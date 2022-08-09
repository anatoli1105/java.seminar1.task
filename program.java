//Написать программу вычисления n-ого треугольного числа. 
import java.util.Scanner;


public class program {


    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf( "введите число =>\t");
        int number = iScanner.nextInt();
        iScanner.close();
        for(double i = 1;i<=number;i++){
            double result=i/2*(i+1);
            int indent=number;
            indent-=i;
            while(indent>0){
                System.err.print(" ");
                indent--;
            }
            for(int j=0;j<result;j++){
                System.err.print("*");
            }
            System.err.println();
           }
        

    }
    
}
