import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;

/* 
    This Vehicle can transform to variable vehicle form by itself.
    For example Car, Plane, Submarine.
*/

public abstract class Vehicle{

    /* All attributes for vehicle */
    public int speed, temperature, humidity;
    public int depth, altitude, density; 

    //'energy' have to be saved in any vehicle form
    public static int energy = 100;
    public int beforeChargeEnergy; //for recording on blackbox

    /* class variable because is is not changed. 
        And it is common attribute for all vehicles */

    //private static final int min_energy= 10, max_energy = 100;
    private static final int min_temperature = 10, max_temperature = 80;
    private static final int min_humidity = 10, max_humidity = 80;

    Vehicle(){}

    /* abstract method. 
        Because recordStatus() is common method but it's function is slightly different depending on a vehicle. */
    abstract void recordStatus();

    /* These methods are only some vehicls. 
        so it is defined by hook methods 
        Because it might be or might not be implemented */
    void setDepth(){};
    void setAltitude(){};
    void setDensity(){};
    

    public void setSpeed(int min_speed, int max_speed){
        int speedNum[] = new int[5];
        System.out.print("Speed: ");
    
        for(int i=0; i<speedNum.length-1; i++){
            speedNum[i] = ThreadLocalRandom.current().nextInt(min_speed, max_speed);
            for(int j=0; j<i; j++){
                if(speedNum[j]==speedNum[i]){
                    i--;
                    break;
                }
                //this for loop eliminate same randomnum
            }
        }
        speedNum[speedNum.length-1] = max_speed;
        Arrays.sort(speedNum);
    
        for(int i=0; i<speedNum.length; i++){
            System.out.print(speedNum[i]);
            if(i<speedNum.length-1)
                System.out.print(", ");
            else    
                System.out.print(" Km/Hour \n");
        }    

    }

    public void setEnergy(int previousEnergy){
        //System.out.println("previous Energy: "+previousEnergy);

        int usedEnergy = ThreadLocalRandom.current().nextInt(10,previousEnergy-10);
        //I guess that this vehicle have to spend energy <minimum 10> but it have to remain energy <minimum 10>

        //System.out.println("used Energy: "+usedEnergy);
        energy = previousEnergy - usedEnergy;
        System.out.println("Energy: "+energy+"%");

        beforeChargeEnergy = energy;
        if(energy<=50)
            chargeEnergy(energy);
    }

    public void chargeEnergy(int energy){

        System.out.print("Now Charging ");

        Random random = new Random();

        int chargeNum[] = new int[7];

        for(int i=1; i<chargeNum.length-1; i++){
            //chargeNum[i] = random.nextInt(100-energy) + energy;
            chargeNum[i]=ThreadLocalRandom.current().nextInt(60, 100);
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

        this.energy = chargeNum[chargeNum.length-1];
        
    }

    public void setTemperature(){
        temperature = ThreadLocalRandom.current().nextInt(min_temperature, max_temperature);
        System.out.println("Temperature: "+temperature+" degree");
    }

    public void setHumidity(){
        humidity = ThreadLocalRandom.current().nextInt(min_humidity, max_humidity);
        System.out.println("Humidity: "+humidity+"%");
    }


    /* using 'final' keword, it cannot be modified */
    public final void printNext(){
        System.out.println("Next Vehicle Action:\n");
    }

}