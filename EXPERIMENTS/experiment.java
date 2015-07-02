

//We need a testing suite outside of the phone thing.
//Also, I don't actually understand the Java paradigm.


public class Timer{
	
}
public class Derivative{
	
}
public class Integral{
	
}
public class PID{

}


import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

public interface PID{
	//constructor
	protected double target;
	public DcMotor(DcMotorController controller, int portNumber) {
		super(controller, portNumber, Direction.FORWARD);
		target = getPower();
	}
	public DcMotor(DcMotorController controller, int portNumber, Direction direction) {
		super(controller, portNumber, direction);
	}
	public void setPIDTarget(){
		
	}
}


public class StandardServo extends Servo{
	public double getPos(){}
	public void setPos(){}
}
public class ContinuousServo extends Servo{
	public double getSpeed(){}
	public void setSpeed(){
		//translates from {-1.0 to 1.0} to whatever {0.0 to 1.0 with .51 midpoint} idk what
	}
}


public interface DriveSystem{
	public abstract void fwd(double power);
	public abstract void back(double power);
	public abstract void cw(double power);
	public abstract void ccw(double power);
}
public interface HoloDriveSystem implements DriveSystem{
	public abstract void left(double power);
	public abstract void right(double power);
	public abstract void strafe(double power, double theta); //theta is counterclockwise from forward
}
public interface HoloForceDriveSystem implements HoloDriveSystem{
	public abstract void forceMode();
	public abstract void holoMode();
	//(in implementation, left and right will make debug errors when force is on (and DEBUG==true))
}
public interface RoverDriveSystem implements HoloDriveSystem{
	public abstract void prepareRotate();
	public abstract void prepareStrafe(double theta);
}

//Thorough design strategy: make two separate ones and merge them laboriously
//what is an MHT file


