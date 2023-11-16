package l1q4;

public class Q4 {
    
    public static void main(String[] args) {
        int[] amounts = {2500, 1600, 2000, 2700, 3200, 800};
        
        for (int i=0; i<amounts.length; i++) {
            amounts[i] = amounts[i]/100;
        }
        
        for (int i=0; i<amounts.length; i++){
            switch(i){
                case 0 : System.out.print("Jan: ");break;
                case 1 : System.out.print("Feb: ");break;
                case 2 : System.out.print("Mar: ");break;
                case 3 : System.out.print("Apr: ");break;
                case 4 : System.out.print("May: ");break;
                case 5 : System.out.print("Jun: ");break;
            }
            for (int amount=0; amount<amounts[i]; amount++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    
}
