import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class PlaneAdaptor extends Vehicle implements Print{

    /* class variable because is is not changed. 
        And it is common attribute for all vehicles */
    private static int min_speed = 0, max_speed = 200;
    private static int min_altitude = 500, max_altitude = 2000;
    private static int min_density = 50, max_density = 100;

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
        printNext();
    }

    public void recordStatus(){
        box.recordActivity("Plane", energy, temperature, humidity);
    }

    public void showSpeed(){
        speed = (ThreadLocalRandom.current().nextInt(min_speed/10, max_speed/10+1))*5;//5씩 증가하도록
        System.out.println("Speed: "+speed+"Km/Hour");
    }

    public void showAltitude(){
        altitude = (ThreadLocalRandom.current().nextInt(min_altitude/10, max_altitude/10+1))*5;//5씩 증가하도록
        System.out.println("Altitude: "+altitude+"m");

    }

    public void showDensity(){
        density = (ThreadLocalRandom.current().nextInt(min_density/10, max_density/10+1))*5;//5씩 증가하도록
        System.out.println("Density: "+density+"%");
    }

}