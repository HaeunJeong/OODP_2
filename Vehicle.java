import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;

public abstract class Vehicle{

    public int speed;
    public int energy;
    public int temperature;
    public int humidity;

    private int min_energy= 10, max_energy = 100;
    private int min_temperature = 10, max_temperature = 50;
    private int min_humidity = 10, max_humidity = 80;

    public abstract void showSpeed();
    
    public int showEnergy(){
        energy = (ThreadLocalRandom.current().nextInt(min_energy/10, max_energy/10+1))*10;
        System.out.println("Energy: "+energy+"%");
        if(energy<=40)
            chargeEnergy(energy);
        return energy;
    }

    public void chargeEnergy(int energy){

        System.out.print("Now Charging ");

        Random random = new Random();
        int randomNum[] = new int[7];

        for(int i=1; i<randomNum.length-1; i++){
            randomNum[i] = random.nextInt(100-energy) + energy;
        }
        randomNum[0]=energy;
        randomNum[randomNum.length-1]=100;
        Arrays.sort(randomNum);

        for(int i=0; i<randomNum.length; i++){
            System.out.print(randomNum[i]);
            if(i<randomNum.length-1)
                System.out.print("%, ");
            else    
                System.out.print("% \n");
        }
        
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