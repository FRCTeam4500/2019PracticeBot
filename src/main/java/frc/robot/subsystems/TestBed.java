/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class TestBed extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  VictorSP motor1;
  VictorSP motor2;
  VictorSP motor3;
  public TestBed(int motor1Id, int motor2Id, int motor3Id){
    motor1 = new VictorSP(motor1Id);
    motor2 = new VictorSP(motor2Id);
    motor3 = new VictorSP(motor3Id);
  }
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
  public void RunMotors(double speed1,double speed2,double speed3){
    motor1.set(speed1);
    motor2.set(speed2);
    motor3.set(speed3);
  }
}

//Made by roro
