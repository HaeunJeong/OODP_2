import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Car extends Vehicle implements Print{

    private int min_speed = 0, max_speed = 150;

    public void showSpeed(){
        speed = (ThreadLocalRandom.current().nextInt(min_speed/10, max_speed/10+1))*5;//5씩 증가하도록
        System.out.println("Speed: "+speed+"Km/Hour");
    }

    public void printStatus(){
        printCurrent("Car");
        showSpeed();
        showEnergy();
        showTemperature();
        showHumidity();
        printNext();
    }

}