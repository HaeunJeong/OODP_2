import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;

public class PlaneAdaptor extends Vehicle implements Transform{

    /* class variable because is is not changed. 
        And it is common attribute for all vehicles */
    private static int min_speed = 0, max_speed = 200;
    private static int min_altitude = 500, max_altitude = 2000;
    private static int min_density = 50, max_density = 100;

    private int previousEnergy;

    Blackbox box = Blackbox.getInstance();

    PlaneAdaptor(){
        super();
        previousEnergy = super.energy;
        System.out.println("Current Function: Plane");
    }
    
    public void setStatus(){
        setSpeed(min_speed,max_speed);
        setEnergy(previousEnergy);
        setAltitude();
        setTemperature();
        setHumidity();
        setDensity();
        printNext();
    }

    public void recordStatus(){
        box.recordActivity("Plane", beforeChargeEnergy, temperature, humidity);
    }

    public void setAltitude(){
        altitude = ThreadLocalRandom.current().nextInt(min_altitude, max_altitude);
        System.out.println("Altitude: "+altitude+"m");

    }

    public void setDensity(){
        density = ThreadLocalRandom.current().nextInt(min_density, max_density);
        System.out.println("Density: "+density+"%");
    }

}