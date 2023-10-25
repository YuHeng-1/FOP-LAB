/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hi
 */
import java.util.Random;

public class L2Q5 {

    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(10001);  //100000 is exclusive
        System.out.println("The random number in the range of 0 to 10000: " + randomNum);
        int temp = randomNum; //assign randomNum to variable temporary
        int sum = 0;
        while (temp > 0) {
            int remainder = temp % 10; // last digit of current temp
            sum += remainder; // -> sum=sum+remainder
            temp = temp / 10;
        }
        System.out.println("The sum of all digits in the number is " + sum);
        
        // or
        int num2,sum2=0;
        final int MAX=10000;
        Random rd=new Random();
        num2=rd.nextInt(MAX);
        System.out.printf("The random number in the range of 0 to 10000:%5d\n",num2);
        
        sum2+=num2/10000; // first digit
        num2%=10000; // num2 now has 4 digits only which is the 2nd until 5th digit
        sum2+=num2/1000; // second digit
        num2%=1000;
        sum2+=num2/100; // third digit
        num2%=100;
        sum2+=num2/10; // fourth digit
        num2%=10;
        sum2+=num2; // fifth digit
        
        System.out.printf("The sum of all digits in the number is %d\n",sum2);
    }

}
