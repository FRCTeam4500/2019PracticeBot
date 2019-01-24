package frc.robot.interfaces.wrappers;

import edu.wpi.first.wpilibj.Talon;
import frc.robot.interfaces.IMotor;

public class TalonMotor implements IMotor {

    private Talon talon;
    public TalonMotor(int channel){
        talon = new Talon(channel);
    }
    @Override
    public void setSpeed(double speed) {
        talon.setSpeed(speed);
    }

    @Override
    public void set(double speed) {
        talon.set(speed);
    }

}