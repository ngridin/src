package Calculator;
import java.awt.EventQueue;

import Gui.GuiConstructor;

public class Runner {
	public void start() {
        //Use the event dispatch thread for Swing components
        EventQueue.invokeLater(
            new Runnable() {
               @Override
               public void run() {
                   new GuiConstructor().start();         
               }
            }
        );
	}
}
