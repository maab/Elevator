/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package elevator;

import elevator.Globals.directionType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author martin
 */
public class Drive {
    private Elevator _elevator;
    private Controls _controls;

    private ActionListener stepActionListener = new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            doStep();
        }
    };

    public Drive(Controls controls, Elevator elevator) {
        this._elevator = elevator;
        this._controls = controls;

        _controls.stepButton.addActionListener(stepActionListener);
    }



    private void doStep(){
        CallList callList = _elevator.getCallList();
        int destination = callList.getNextStop();
        FloorPanel floorPanel;

        if(destination == 0)
            return;

        _elevator.moveCabin(destination);
        _elevator.getCabin().getCabinPanel().fetchButtonByNum(destination).setEnabled(true);

        callList.updateCallListArea();

        floorPanel = _elevator.fetchLevelByNum(destination).getFloorPanel();
        if(callList.getCurrentDrive().equals(directionType.DOWN))
            floorPanel.getCallButtonDown().setEnabled(true);

        if(callList.getCurrentDrive().equals(directionType.UP))
            floorPanel.getCallButtonUp().setEnabled(true);

    }

}
