import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;

/* 
    This Vehicle can transform to variable vehicle form by itself.
    For example Car, Plane, Submarine.
*/

public abstract class Vehicle{

    /* All attributes for vehicle */
    public int speed, energy, temperature, humidity;
    public int depth, altitude, density; 

    /* class variable because is is not changed. 
        And it is common attribute for all vehicles */
    private static final int min_energy= 10, max_energy = 100;
    private static final int min_temperature = 10, max_temperature = 50;
    private static final int min_humidity = 10, max_humidity = 80;

    Vehicle(){}

    /* abstract method. 
        Because speed is common attribute but range of speed is up to a vehicle. */
    abstract void showSpeed();

    /* These methods are only some vehicls. 
        so it is defined by hook methods 
        Because it might be or might not be implemented */
    void showDepth(){};
    void showAltitude(){};
    void showDensity(){};
    
    public void showEnergy(){
        energy = (ThreadLocalRandom.current().nextInt(min_energy/10, max_energy/10+1))*10;
        System.out.println("Energy: "+energy+"%");
        if(energy<=40)
            chargeEnergy(energy);
    }

    public void chargeEnergy(int energy){

        System.out.print("Now Charging ");

        Random random = new Random();
        int chargeNum[] = new int[7];

        for(int i=1; i<chargeNum.length-1; i++){
            chargeNum[i] = random.nextInt(100-energy) + energy;
        }
        chargeNum[0]=energy;
        chargeNum[chargeNum.length-1]=100;
        Arrays.sort(chargeNum);

        for(int i=0; i<chargeNum.length; i++){
            System.out.print(chargeNum[i]);
            if(i<chargeNum.length-1)
                System.out.print("%, ");
            else    
                System.out.print("% \n");
        }
        
    }

    public void showTemperature(){
        temperature = (ThreadLocalRandom.current().nextInt(min_temperature/10, max_temperature/10+1))*10;
        System.out.println("Temperature: "+temperature+" degree");
    }

    public void showHumidity(){
        humidity = (ThreadLocalRandom.current().nextInt(min_humidity/10, max_humidity/10+1))*10;
        System.out.println("Humidity: "+humidity+"%");
    }


    /* using 'final' keword, it cannot be modified */
    public final void printNext(){
        System.out.println("Next Vehicle Action:\n");
    }

}