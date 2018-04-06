import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Submarine extends Vehicle implements Print{
    
    private int min_speed = 0, max_speed = 60;

    private int depth;
    private int min_depth = 10, max_depth = 100;

    public static int energy, temperature, humidity;

    // Submarine(){
    //     super();
    //     energy = super.energy;
    //     temperature = super.temperature;
    //     humidity = super.humidity;
    // }

    public void showSpeed(){
        speed = (ThreadLocalRandom.current().nextInt(min_speed/10, max_speed/10+1))*5;//5씩 증가하도록
        System.out.println("Speed: "+speed+"Km/Hour");
    }

    public void showDepth(){
        depth = (ThreadLocalRandom.current().nextInt(min_depth/10, max_depth/10+1))*5;//5씩 증가하도록
        System.out.println("Depth: "+depth+"m");

    }

    public void printStatus(){
        printCurrent("Submarine");
        showSpeed();
        showDepth();
        energy = showEnergy();
        temperature = showTemperature();
        humidity = showHumidity();
        printNext();
    }
    public int[] getStatus(){

        int list[] = {energy, temperature, humidity};
        return list;

    }

}
