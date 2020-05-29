package superCoolPackage;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class Main {
	static JFrame frame = new JFrame("EQ Machine");
	static JButton resetButton = new JButton("reset");
	static JSlider lowSlider = new JSlider(JSlider.VERTICAL);
	static JSlider midSlider = new JSlider(JSlider.VERTICAL);
	static JSlider highSlider = new JSlider(JSlider.VERTICAL);

	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		Clicklistener click = new Clicklistener();
		resetButton.addActionListener(click);
		init();
		
		
		
		
		
		
		
		
	}
	
	private static void init() {
		//frame
		frame.setSize(250,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		//reset button
		JPanel resetButtonPanel = new JPanel();
 		resetButtonPanel.add(resetButton);
		frame.add(resetButtonPanel, BorderLayout.NORTH);
		
		//low slider
		JPanel lowSliderPanel = new JPanel();
		lowSliderPanel.add(lowSlider);
		frame.add(lowSliderPanel, BorderLayout.WEST);
		
		//mid slider
		JPanel midSliderPanel = new JPanel();
		midSliderPanel.add(midSlider);
		frame.add(midSliderPanel, BorderLayout.CENTER);
				
		//high slider
		JPanel highSliderPanel = new JPanel();
		highSliderPanel.add(highSlider);
		frame.add(highSliderPanel, BorderLayout.EAST);
	}
	
	private class Clicklistener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if (e.getSource() == resetButton)
			{
				lowSlider.setValue(50);
				midSlider.setValue(50);
				highSlider.setValue(50);
			}
		}
	}
}







