package frc.robot.commands.claw;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.subsystems.Claw;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

/**
 * ==================================
 * Remember what needs to be extended
 * What needs to be in the constructor?
 * What methods do we need?
 * ==================================
 */
public class ToggleClaw extends InstantCommand {

    /**
     * =====================================
     * Constructor - what do we need to add?
     * =====================================
     */
    public ToggleClaw()
    {
        addRequirements(Claw.getInstance());
    }


    /**
     * ================================
     * Toggle the state of the solenoid
     * What method?
     * ================================
     */
    public void initialize()
    {
        if (Claw.getInstance().getDoubleSolenoid().get() == DoubleSolenoid.Value.kForward)
        {
            Claw.getInstance().getDoubleSolenoid().set(DoubleSolenoid.Value.kReverse);
        }
        else
        {
            Claw.getInstance().getDoubleSolenoid().set(DoubleSolenoid.Value.kForward);
        }
    }
    
}