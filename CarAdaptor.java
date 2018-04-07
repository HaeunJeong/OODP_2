import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class CarAdaptor extends Vehicle implements Print{

    /* class variable because is is not changed. 
        And it is common attribute for all vehicles */
    private static int min_speed = 0, max_speed = 150;

    Blackbox box = Blackbox.getInstance();

    CarAdaptor(){
        energy = super.energy;
        temperature = super.temperature;
        humidity = super.humidity;
        System.out.println("Current Function: Car");
    }

    public void printStatus(){
        showSpeed();
        showEnergy();
        showTemperature();
        showHumidity();
        printNext();
    }

    public void recordStatus(){
        box.recordActivity("Car", energy, temperature, humidity);
    }

    public void showSpeed(){
        speed = (ThreadLocalRandom.current().nextInt(min_speed/10, max_speed/10+1))*5;//5씩 증가하도록
        System.out.println("Speed: "+speed+"Km/Hour");
    }

}