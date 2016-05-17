package number34;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonTest {

	public static void main(String[] args) {
		JFrame jframe = new JFrame("JButton Test");
		
		jframe.setLayout(new FlowLayout(FlowLayout.LEFT,15,15));
		
		for(int i=0;i<30;i++){
			JButton jbutton = new JButton("JButton"+i);
			jframe.add(jbutton);
		}
		
		jframe.setVisible(true);
		jframe.setSize(1000, 600);
		jframe.setLocation(300, 180);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
