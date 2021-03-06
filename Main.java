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
                            Transform car = new CarAdaptor();
                            car.setStatus();
                            car.recordStatus();
                            break;
                case 'P': 
                            Transform plane = new PlaneAdaptor();
                            plane.setStatus();
                            plane.recordStatus();
                            break;
                case 'S': 
                            Transform submarine = new SubmarineAdaptor();
                            submarine.setStatus();
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