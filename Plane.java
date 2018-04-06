import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Plane extends Vehicle implements Print{

    private int min_speed = 0, max_speed = 200;

    private int altitude, density;
    private int min_altitude = 500, max_altitude = 2000;
    private int min_density = 50, max_density = 100;

    public int energy, temperature, humidity;

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

    public void printStatus(){
        printCurrent("Plane");
        showSpeed();
        energy = showEnergy();
        showAltitude();
        temperature = showTemperature();
        humidity = showHumidity();
        showDensity();
        printNext();
    }

    public int[] getStatus(){

        int list[] = {energy, temperature, humidity};
        return list;

    }

}