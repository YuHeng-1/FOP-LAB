/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hi
 */
import java.util.Scanner;
public class L4Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day,year;
        System.out.print("Enter year: ");
        year=sc.nextInt();
        System.out.print("Enter the first day of the year where 0 for Sunday, 1 for Monday,...,6 for Saturday: ");
        day=sc.nextInt();
        int MIN=5; //minimum must loop for 5 times which represent the month of May
        int MAX=8; //maximum loop for 8 times which represent the month of August
        
        for(int i=1;i<=MAX;i++){ //loop from 1 to 8 which is from January to August
            //for May
            if(i==MIN){
                System.out.println("May "+year);
                System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday");
                System.out.println("");
                for(int d=0;d<day;d++){
                    System.out.printf("%-10s","");
                }
                for(int j=1;j<=31;j++){
                    System.out.printf("%-10d",j);
                    day++;
                    day=day%7;
                    if(day==0)
                        System.out.println("");
                }
            }
            //for August
            else if(i==MAX){
                System.out.println("\n\n");
                System.out.println("August "+year);
                System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday");
                System.out.println("");
                for(int d=0;d<day;d++){
                    System.out.printf("%-10s","");
                }
                for(int j=1;j<=31;j++){
                    System.out.printf("%-10d",j);
                    day=day+1;
                    day=day%7;
                    if(day==0)
                        System.out.println("");
                }
            }
            
            //for February
            else if(i==2){
                if(year%400==0 || year%4==0&&year%100!=0){ // is leap year?
                    day=(day+29)%7; //to calculate the first day of next month(March)
                }
                else
                    day=(day+28)%7;
            }
            
            //for January and March and July
            else if(i==1||i==3||i==7){
                day=(day+31)%7; //to calculate the first day of next month(February ,April and August)
            }
            
            //for April and June
            else
                day=(day+30)%7; //to calculate the first day of next month(May and July)
        }
  
     }
}
            
    


