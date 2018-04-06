import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        boolean answer = true;//for out loop
        char vehicle;

        while(answer){

			System.out.println("(C)ar (P)lane (S)ubmarine (B)lackbox (H)alt");
            vehicle = input.nextLine().charAt(0);
            int status[]; //for saving energy, tempo, humidity
            
            System.out.print("\n");
            switch(vehicle){
                case 'C': 
                            Print car = new Car();
                            car.printStatus();
                            status = car.getStatus();
                            Blackbox.getInstance().recordActivity("Car", status[0], status[1], status[2]);
                            break;
                case 'P': 
                            Print plane = new Plane();
                            plane.printStatus();
                            status = plane.getStatus();
                            Blackbox.getInstance().recordActivity("Plane", status[0], status[1], status[2]);
                            break;
                case 'S': 
                            Print submarine = new Submarine();
                            submarine.printStatus();
                            status = submarine.getStatus();
                            Blackbox.getInstance().recordActivity("Submarine",status[0], status[1], status[2]);
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