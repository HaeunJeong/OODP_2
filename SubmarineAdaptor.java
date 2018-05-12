import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SubmarineAdaptor extends Vehicle implements Transform{

    /* class variable because is is not changed. 
        And it is common attribute for all vehicles */
    private static int min_speed = 0, max_speed = 60;
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
        printNext();
    }

    public void recordStatus(){
        box.recordActivity("Submarine", beforeChargeEnergy, temperature, humidity);
    }

    public void setDepth(){
        depth = ThreadLocalRandom.current().nextInt(min_depth, max_depth);
        System.out.println("Depth: "+depth+"m");

    }
}
