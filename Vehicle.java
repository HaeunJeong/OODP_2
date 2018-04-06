import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Vehicle{

    public int speed;
    public int energy;
    public int temperature;
    public int humidity;

    private int min_energy= 10, max_energy = 100;
    private int min_temperature = 10, max_temperature = 50;
    private int min_humidity = 10, max_humidity = 80;

    //생성자 어떻게 쓰지?

    public abstract void showSpeed();
    
    public int showEnergy(){
        energy = (ThreadLocalRandom.current().nextInt(min_energy/10, max_energy/10+1))*10;
        System.out.println("Energy: "+energy+"%");
        return energy;
    }

    public int showTemperature(){
        temperature = (ThreadLocalRandom.current().nextInt(min_temperature/10, max_temperature/10+1))*10;
        System.out.println("Temperature: "+temperature+" degree");
        return temperature;
    }

    public int showHumidity(){
        humidity = (ThreadLocalRandom.current().nextInt(min_humidity/10, max_humidity/10+1))*10;
        System.out.println("Humidity: "+humidity+"%");
        return humidity;
    }

    public void printCurrent(String string){
        System.out.println("Current Function: "+string);
    }
    public void printNext(){
        System.out.println("Next Vehicle Action:");
    }

}