package ua.com.ultexplorer.timertest;

import java.awt.*;
import java.awt.event.*;
import java.lang.invoke.VarHandle;
import java.time.*;
import javax.swing.*;

public class TimerTest 
{
	public static void main(String[] args) 
	{
		var listener = new TimePrinter();
		var timer = new Timer(1000, listener);
		timer.restart();
		
		//JOptionPane.showMessageDialog(null, "Quit program?");
		
		System.exit(0);

	}

}

class TimePrinter implements ActionListener 
{
	@Override
	public void actionPerformed(ActionEvent event) {
		System.out.println("At the tone, the time is "
				+ Instant.ofEpochMilli(event.getWhen()));
		Toolkit.getDefaultToolkit().beep();
	}
	
}
