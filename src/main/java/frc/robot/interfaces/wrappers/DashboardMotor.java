/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.interfaces.wrappers;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.interfaces.IMotor;

/**
 * Add your docs here.
 */
public class DashboardMotor implements IMotor {

    private int id;
    public DashboardMotor(int id){
        this.id = id;
    }
    @Override
    public void setSpeed(double speed) {
        SmartDashboard.putNumber("Dashboard Motor "+Integer.toString(id)+" Speed: ", speed);
    }

    @Override
    public void set(double speed) {
        SmartDashboard.putNumber("Dashboard Motor "+Integer.toString(id)+" Speed: ", speed);
    }
}
