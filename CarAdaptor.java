import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;

public class CarAdaptor extends Vehicle implements Transform{

    /* class variable because is is not changed. 
        And it is common attribute for all vehicles */
    private static int min_speed = 0, max_speed = 150;
    private int previousEnergy;

    Blackbox box = Blackbox.getInstance();

    CarAdaptor(){
        super();
        previousEnergy = super.energy;
        System.out.println("Current Function: Car");
    }

    public void setStatus(){
        setSpeed(min_speed,max_speed);
        setEnergy(previousEnergy);
        setTemperature();
        setHumidity();
        printNext();
    }

    public void recordStatus(){
        box.recordActivity("Car", beforeChargeEnergy, temperature, humidity);
    }

}