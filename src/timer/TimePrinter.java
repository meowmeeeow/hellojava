package timer;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
/*import javax.swing.*;
import javax.swing.Timer;*/

public class TimePrinter implements ActionListener {
	public void actionPerformed(ActionEvent event){
		System.out.println("At the tone,the time is "+new Date());
		Toolkit.getDefaultToolkit().beep();
	}
	

}
