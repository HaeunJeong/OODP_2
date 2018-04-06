import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        boolean answer = true;//for out loop
        char vehicle;

        while(answer){

			System.out.println("(C)ar (P)lane (S)ubmarine (B)lackbox (H)alt");
            vehicle = input.nextLine().charAt(0);
            
            //충전하는거랑
            
            switch(vehicle){
                case 'C': 
                            Print car = new Car();
                            car.printStatus();
                            Blackbox.getInstance().recordActivity("Car", Car.energy, Car.temperature, Car.humidity);
                            break;
                case 'P': 
                            Print plane = new Plane();
                            plane.printStatus();
                            Blackbox.getInstance().recordActivity("Plane", Plane.energy, Plane.temperature, Plane.humidity);
                            break;
                case 'S': 
                            Print submarine = new Submarine();
                            submarine.printStatus();
                            Blackbox.getInstance().recordActivity("Submarine", Submarine.energy, Submarine.temperature, Submarine.humidity);
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