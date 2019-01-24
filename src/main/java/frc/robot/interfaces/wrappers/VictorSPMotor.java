/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.interfaces.wrappers;

import edu.wpi.first.wpilibj.VictorSP;
import frc.robot.interfaces.IMotor;

/**
 * Add your docs here.
 */
public class VictorSPMotor implements IMotor{

    private VictorSP victorSP;
    public VictorSPMotor(int channel){
        victorSP = new VictorSP(channel);
    }
    @Override
    public void setSpeed(double speed) {
        victorSP.setSpeed(speed);
    }

    @Override
    public void set(double speed) {
        victorSP.set(speed);
    }
}
