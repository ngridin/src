package Actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Action controller.
 */
public class ActionController implements ActionListener {
    private String operator;
    CommonControllerActions actions = new CommonControllerActions();
    
    public ActionController(String operation)
    {
        operator = operation;
    }
    
    public void actionPerformed(ActionEvent event)
    {
    	actions.performAction(operator);
    }
}
