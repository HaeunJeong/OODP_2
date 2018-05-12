<<<<<<< HEAD
import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;

public class PlaneAdaptor extends Vehicle implements Transform{
=======
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class PlaneAdaptor extends Vehicle implements Print{
>>>>>>> 9367c47e43972278b4a631e55f1d8f670dc4f6ac

    /* class variable because is is not changed. 
        And it is common attribute for all vehicles */
    private static int min_speed = 0, max_speed = 200;
    private static int min_altitude = 500, max_altitude = 2000;
    private static int min_density = 50, max_density = 100;

<<<<<<< HEAD
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
=======
    Blackbox box = Blackbox.getInstance();

    PlaneAdaptor(){
        energy = super.energy;
        temperature = super.temperature;
        humidity = super.humidity;
        System.out.println("Current Function: Plane");
    }
    
    public void printStatus(){
        showSpeed();
        showEnergy();
        showAltitude();
        showTemperature();
        showHumidity();
        showDensity();
>>>>>>> 9367c47e43972278b4a631e55f1d8f670dc4f6ac
        printNext();
    }

    public void recordStatus(){
<<<<<<< HEAD
        box.recordActivity("Plane", beforeChargeEnergy, temperature, humidity);
    }

    public void setAltitude(){
        altitude = ThreadLocalRandom.current().nextInt(min_altitude, max_altitude);
=======
        box.recordActivity("Plane", energy, temperature, humidity);
    }

    public void showSpeed(){
        speed = (ThreadLocalRandom.current().nextInt(min_speed/10, max_speed/10+1))*5;//5씩 증가하도록
        System.out.println("Speed: "+speed+"Km/Hour");
    }

    public void showAltitude(){
        altitude = (ThreadLocalRandom.current().nextInt(min_altitude/10, max_altitude/10+1))*5;//5씩 증가하도록
>>>>>>> 9367c47e43972278b4a631e55f1d8f670dc4f6ac
        System.out.println("Altitude: "+altitude+"m");

    }

<<<<<<< HEAD
    public void setDensity(){
        density = ThreadLocalRandom.current().nextInt(min_density, max_density);
=======
    public void showDensity(){
        density = (ThreadLocalRandom.current().nextInt(min_density/10, max_density/10+1))*5;//5씩 증가하도록
>>>>>>> 9367c47e43972278b4a631e55f1d8f670dc4f6ac
        System.out.println("Density: "+density+"%");
    }

}