package frc.robot.commands.elevator;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.OI;
import frc.robot.subsystems.AngledElevator;
import frc.robot.util.XboxGamepad;

/**
 * ==================================
 * Remember what needs to be extended
 * What needs to be in the constructor?
 * What methods do we need?
 * ==================================
 */
public class ElevatorManual extends CommandBase {
    private static AngledElevator instance;
    /**
     * =====================================
     * Constructor - what do we need to add?
     * =====================================
     */
    public ElevatorManual()
    {
        addRequirements(AngledElevator.getInstance());
    }
    
    public void execute() {
        /**
         * ================================================================================
         * if DRIVER presses the Up DPad Button, Move the elevator up by 500 steps
         * else if DRIVER presses the Down DPad Button, Move the elevator down by 500 steps
         * ================================================================================
         */
        if (OI.getInstance().getDriverInstance().getUpDPadButtonState())
        {
            AngledElevator.getInstance().moveToPosition(AngledElevator.getInstance().getCurrentPosition() + 500);
        }
        if (OI.getInstance().getDriverInstance().getDownDPadButtonState())
        {
            AngledElevator.getInstance().moveToPosition(AngledElevator.getInstance().getCurrentPosition() - 500);
        }

        /**
         * ==========================================
         * Always move to Elevator's Desired position
         * ==========================================
         */
        AngledElevator.getInstance().moveToPosition(AngledElevator.getInstance().getDesiredPosition());
    }

    /**
     * =======================
     * set power to 0 when end
     * make sure to override
     * =======================
     */
    @Override
    public void end(boolean interrupted)
    {
        AngledElevator.getInstance().setElevatorPower(0);
    }
}
