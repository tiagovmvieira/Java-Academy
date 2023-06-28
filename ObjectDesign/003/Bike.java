import java.awt.*;

public class Bike
{
    private Wheel theWheel;
    private Frame theFrame;

    Bike(Wheel newWheel, Frame newFrame){

        theWheel = newWheel;
        theFrame = newFrame;
    }

    Bike(int wheelWid, int frameLen){

        theWheel = new Wheel(wheelWid);
        theFrame = new Frame(frameLen);

    }

    public static void main(String[] args){

        // Without creator
        Wheel wheel = new Wheel(24);
        Frame frame = new Frame(52);

        Bike bike = new Bike(wheel, frame);

        // With creator
        Bike bike2 = new Bike(24, 52);

    }

}
