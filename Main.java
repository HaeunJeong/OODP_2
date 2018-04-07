import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        boolean answer = true;//for out loop
        char vehicle;

        while(answer){

			System.out.println("(C)ar (P)lane (S)ubmarine (B)lackbox (H)alt");
            vehicle = input.nextLine().charAt(0);
            System.out.print("\n");
            
            switch(vehicle){
                case 'C': 
                            Print car = new CarAdaptor();
                            car.printStatus();
                            car.recordStatus();
                            break;
                case 'P': 
                            Print plane = new PlaneAdaptor();
                            plane.printStatus();
                            plane.recordStatus();
                            break;
                case 'S': 
                            Print submarine = new SubmarineAdaptor();
                            submarine.printStatus();
                            submarine.recordStatus();
                            break;
                case 'B': 
                            Blackbox.getInstance().printRecord();
                            break;

                case 'H': answer = false;
            }

        }

        System.out.print("\n");
        System.out.println("Halting the vehicle...");
        System.out.println("Adjusting the vehicle to the safe condition...");
    
    }
}