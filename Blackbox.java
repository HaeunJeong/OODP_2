import java.util.ArrayList;

public class Blackbox{

    private static Blackbox blackbox = new Blackbox();

    private ArrayList<String> vehicleList = new ArrayList<>();
    private ArrayList<Integer> energyList = new ArrayList<>();
    private ArrayList<Integer> temperatureList = new ArrayList<>();
    private ArrayList<Integer> humidityList = new ArrayList<>();

    private Blackbox(){}

    public static Blackbox getInstance(){
        return blackbox;
    }

    public void recordActivity(String vehicle, int energy, int temperature, int humidity){

        vehicleList.add(vehicle);
        energyList.add(energy);
        temperatureList.add(temperature);
        humidityList.add(humidity);

    }
    
    public void printRecord(){
        System.out.print("Function: ");
        for(int i=0; i<vehicleList.size(); i++){
            System.out.print(vehicleList.get(i).toString());
            if(i<vehicleList.size()-1)
                System.out.print("->");
        }
        System.out.print("\n");

        System.out.print("Energy: ");
        for(int i=0; i<energyList.size(); i++){
            System.out.print(energyList.get(i).toString());
            if(i<energyList.size()-1)
                System.out.print("->");
        }
        System.out.print("\n");

        System.out.print("Temperature: ");
        for(int i=0; i<temperatureList.size(); i++){
            System.out.print(temperatureList.get(i).toString());
            if(i<temperatureList.size()-1)
                System.out.print("->");
        }
        System.out.print("\n");

        System.out.print("Humidity: ");
        for(int i=0; i<humidityList.size(); i++){
            System.out.print(humidityList.get(i).toString());
            if(i<temperatureList.size()-1)
                System.out.print("->");
        }
        System.out.print("\n");


    }
}