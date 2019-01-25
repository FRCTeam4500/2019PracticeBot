/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.OI;
import frc.robot.commands.TankDrive_MoveAndTurn;
import frc.robot.interfaces.IMotor;

/**
 * Add your docs here.
 */
public class TankDrive extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private IMotor fl, fr, bl, br;
  private OI oi;
  public TankDrive(OI oi, IMotor fl, IMotor fr, IMotor bl, IMotor br){
    this.fl = fl;
    this.fr = fr;
    this.bl = bl;
    this.br = br;
    this.oi = oi;
  }
  public void DriveMotors(double leftSpeed, double rightSpeed){
    fl.set(leftSpeed);
    bl.set(leftSpeed);
    fr.set(rightSpeed);
    br.set(rightSpeed);
  }
  public void DriveAndTurn(double lateralInput, double turnInput){
    //-1 == fully counterclockwise, 1 = fully clockwise
    //literally just stolen from here lmao http://home.kendra.com/mauser/Joystick.html  
    double leftSpeed = lateralInput+turnInput;
    double rightSpeed = -lateralInput+turnInput;
    double maxSpeed = Math.max(Math.abs(leftSpeed), Math.abs(rightSpeed));
    leftSpeed /= maxSpeed;
    rightSpeed /= maxSpeed;
    DriveMotors(leftSpeed, rightSpeed);
  }
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new TankDrive_MoveAndTurn(this, oi));
  }
}
