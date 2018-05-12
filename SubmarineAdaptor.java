import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

<<<<<<< HEAD
public class SubmarineAdaptor extends Vehicle implements Transform{
=======
public class SubmarineAdaptor extends Vehicle implements Print{
>>>>>>> 9367c47e43972278b4a631e55f1d8f670dc4f6ac

    /* class variable because is is not changed. 
        And it is common attribute for all vehicles */
    private static int min_speed = 0, max_speed = 60;
<<<<<<< HEAD
    private static int min_depth = 10, max_depth = 100;

    private int previousEnergy;
    Blackbox box = Blackbox.getInstance();

    SubmarineAdaptor(){
        super();
        previousEnergy = super.energy;
        System.out.println("Current Function: Submarine");
    }

    public void setStatus(){
        setSpeed(min_speed,max_speed);
        setEnergy(previousEnergy);
        setDepth();
        setTemperature();
        setHumidity();
=======
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
>>>>>>> 9367c47e43972278b4a631e55f1d8f670dc4f6ac
        printNext();
    }

    public void recordStatus(){
<<<<<<< HEAD
        box.recordActivity("Submarine", beforeChargeEnergy, temperature, humidity);
    }

    public void setDepth(){
        depth = ThreadLocalRandom.current().nextInt(min_depth, max_depth);
=======
        box.recordActivity("Submarine", energy, temperature, humidity);
    }
    
    public void showSpeed(){
        speed = (ThreadLocalRandom.current().nextInt(min_speed/10, max_speed/10+1))*5;//5씩 증가하도록
        System.out.println("Speed: "+speed+"Km/Hour");
    }

    public void showDepth(){
        depth = (ThreadLocalRandom.current().nextInt(min_depth/10, max_depth/10+1))*5;//5씩 증가하도록
>>>>>>> 9367c47e43972278b4a631e55f1d8f670dc4f6ac
        System.out.println("Depth: "+depth+"m");

    }
}
