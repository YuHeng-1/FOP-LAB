/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hi
 */
import java.util.Random;
public class L4Q6 {
    public static void main(String[] args) {
        Random g=new Random();
        int number,digit=1;
        number=g.nextInt();
        while(number<0){
            number=g.nextInt();
        }
        System.out.println("The non-negative random integer: "+number);
        while((number/=10) != 0){
            digit++;
        }
        System.out.println("It consists of "+digit+" digit(s)");
    }
}
