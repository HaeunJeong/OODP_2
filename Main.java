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
                case 'C': //Car car = Car.getInstance();
                            Print car = new Car();
                            car.printStatus();
                            Blackbox.getInstance("Car").recordActivity(car.energy, car.temperature, car.humidity);
                            break;
                case 'P': //Plane plane = Plane.getInstance();
                            Print plane = new Plane();
                            plane.printStatus();
                            Blackbox.getInstance().recordActivity(plane.energy, plane.temperature, plane.humidity));
                            break;
                case 'S': //Submarine submarine = Submarine.getInstance();
                            Print submarine = new Submarine();
                            submarine.printStatus();
                            Blackbox.getInstance().recordActivity(submarine.energy, submarine.temperature, submarine.humidity);
                            break;
                case 'B': Blackbox.getInstance().printRecord();
                        break;
                case 'H': answer = false;
            }

        }

        System.out.print("\n");
        System.out.println("Halting the vehicle...");
        System.out.println("Adjusting the vehicle to the safe condition...");
    
    }
}