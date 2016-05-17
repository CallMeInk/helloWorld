package number36;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class JButtonListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "I'm clicked!");
	}
	
}


public class EventTest {
	
	public static void main(String[] args) {
		JFrame jframe = new JFrame();
		JButton jbutton = new JButton("I'm a button");
		jframe.setVisible(true);
		jframe.setLocation(300,180);
		jframe.setSize(1000, 600);
		jframe.add(jbutton);
		JButtonListener jbl = new JButtonListener();
		jbutton.addActionListener(jbl);
		
		
	}

}
