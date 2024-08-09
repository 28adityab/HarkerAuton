package frc.robot.commands.claw;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.subsystems.Claw;

import edu.wpi.first.wpilibj.Relay.Value;

/**
 * ==================================
 * Remember what needs to be extended
 * What needs to be in the constructor?
 * What methods do we need?
 * ==================================
 */
public class OpenClaw extends InstantCommand {

    /**
     * =====================================
     * Constructor - what do we need to add?
     * =====================================
     */
    public OpenClaw()
    {
        addRequirements(Claw.getInstance());
    }


    /**
     * ================================
     * Set the claw state to be reverse
     * What method?
     * ================================
     */
    public void initialize()
    {
        Claw.getInstance().getDoubleSolenoid().set(DoubleSolenoid.Value.kReverse);
    }

    
}
