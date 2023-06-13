/* We define that we want a class to use an interface
 * with the implements keyword. This class must create
 * a method for each method defined in Drivable
 * We can implement more than 1 interface like this
 * public class Vehicle implements Drivable, Crashable
 */

public class Vehicle extends Crashable implements Drivable {

    int numOfWheels = 2;
    double theSpeed = 0;

    int carStrength = 0;

    // All methods must be as visible as those in the
    // interface. If they are public in the interface
    // they must be public in the subclass
    public int getWheels() {
        return numOfWheels;
    }

    public void setWheels(int numWheels){
        this.numOfWheels = numWheels;
    }

    public double getSpeed(){
        return theSpeed;
    }

    public void setSpeed(double Speed){
        this.theSpeed = Speed;
    }

    public Vehicle(){

    }

    public Vehicle(int wheels, double speed){
        this.numOfWheels = wheels;
        this.theSpeed = speed;
    }

    public void setCarStrength(int carStrength){
        this.carStrength = carStrength;
    }

    public int getCarStrength(){
        return this.carStrength;
    }

}
