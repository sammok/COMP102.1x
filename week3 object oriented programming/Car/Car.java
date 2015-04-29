import comp102x.IO;

/**
 * A class define the Car.
 * 
 * @author (Qianglong Mo) 
 * @version (1.0.0.1)
 */
public class Car
{
    private int odometer = 0;
    private String owner = "NoName";

    /** 
     *      Default constructor for a Car object   
     **/
    public Car () {
    }
    
    /** 
     *      Constructor for a Car object with a new owner's name
     *      @param      name                name of owner
     **/
    public Car (String name) {
        owner = name;
    }
    
    /** 
     *      moveCar moves a car forwards or backwards by dist units
     *      @param      dist                Moving distance
     **/
    public void moveCar (int dist) {
        owner = owner + Math.abs(dist);
        IO.outputln(owner + "'s car has moved " + dist + " units.");
    }
    
    /** 
     *      turnCar turn a car by given degree
     *      @param      angle              Turn angle in degree
     **/
    public void turnCar (double degree) {
        IO.outputln(owner + "'s car has turned " + angle + " degrees.");
    }
    
    /** 
     *      getIdimeter gets the odometer reading of a car
     *      @return     The value of odometer
     **/
    public int getOdometer () {
        return odometer;
    }
    
    
    
}
