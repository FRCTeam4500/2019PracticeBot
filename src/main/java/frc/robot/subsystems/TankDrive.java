/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.Drive;

/**
 * Add your docs here.
 */
public class TankDrive extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  Victor lFront, lBack;
  Victor rFront, rBack;
  public TankDrive() {
    lFront = new Victor(0);
    lBack = new Victor(1);
    rFront = new Victor (2);
    rBack = new Victor (3);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new Drive());

  }
  public void drive(double y, double z) {
    double L = z+y;
    double R = z-y;
    double max = Math.abs(L) > Math.abs(R) ? L : R;
    if (max > 1) {
      L /= max;
      R /= max;
    }

    lFront.set(L);
    lBack.set(L);
    rFront.set(R);
    rBack.set(R);
  }
}
