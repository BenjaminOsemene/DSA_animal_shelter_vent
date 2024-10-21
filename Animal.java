//This is a class for all animals in the shelter
//Properties include name and arrival time
public abstract class Animal {
    private String name;
    private long arrivalTime;

    public Animal(String name) {
        this.name = name;
        this.arrivalTime = System.currentTimeMillis();
    }

    //Getter Methods 
    public String getName() {
        return name;
    }

    public long getArrivalTime() {
        return arrivalTime;
    }
}