import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SubmarineAdaptor extends Vehicle implements Print{

    /* class variable because is is not changed. 
        And it is common attribute for all vehicles */
    private static int min_speed = 0, max_speed = 60;
    private static int min_depth = 0, max_depth = 100;

    Blackbox box = Blackbox.getInstance();

    SubmarineAdaptor(){
        energy = super.energy;
        temperature = super.temperature;
        humidity = super.humidity;
        System.out.println("Current Function: Submarine");
    }

    public void printStatus(){
        showSpeed();
        showEnergy();
        showDepth();
        showTemperature();
        showHumidity();
        printNext();
    }

    public void recordStatus(){
        box.recordActivity("Submarine", energy, temperature, humidity);
    }
    
    public void showSpeed(){
        speed = (ThreadLocalRandom.current().nextInt(min_speed/10, max_speed/10+1))*5;//5씩 증가하도록
        System.out.println("Speed: "+speed+"Km/Hour");
    }

    public void showDepth(){
        depth = (ThreadLocalRandom.current().nextInt(min_depth/10, max_depth/10+1))*5;//5씩 증가하도록
        System.out.println("Depth: "+depth+"m");

    }
}
