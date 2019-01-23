/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class TankDrive extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private VictorSP fl, fr, bl, br;
  public TankDrive(int flPort,int frPort,int blPort, int brPort){
    fl = new VictorSP(flPort);
    fr = new VictorSP(frPort);
    bl = new VictorSP(blPort);
    br = new VictorSP(brPort);
  }
  public void DriveMotors(double leftSpeed, double rightSpeed){
    fl.set(leftSpeed);
    bl.set(leftSpeed);
    fr.set(rightSpeed);
    br.set(rightSpeed);
  }
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
