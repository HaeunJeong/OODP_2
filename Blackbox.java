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
        printWithArrow(vehicleList);

        System.out.print("Energy: ");
        printWithArrow(energyList);

        System.out.print("Temperature: ");
        printWithArrow(temperatureList);

        System.out.print("Humidity: ");
        printWithArrow(humidityList);

    }

    public void printWithArrow(ArrayList list){

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i).toString());
            if(i<list.size()-1)
                System.out.print(" -> ");
        }
        System.out.print("\n");

    }
}