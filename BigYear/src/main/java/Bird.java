public class Bird {
    //Instance variables for class
    private String name;
    private String latinName;
    private int observation;
    //Initialise constructor
    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.observation = 0;
    }
    //Getter methods for each instance variable
    public String getName(){
        return this.name;
    }
    public String getLatinName(){
        return this.latinName;
    }
    public int getObservation(){
        return this.observation;
    }
    //Setter methods for each instance variable
    public void setName(String name){
        this.name = name;
    }
    public void setLatinName(String latinName){
        this.latinName = latinName;
    }
    public void setObservation(int observation){
        this.observation = observation;
    }
    //ToString method to print something useful
    public String toString(){
        return getName() + " (" + getLatinName() + ") " + getObservation() + " observations";
    }

}
