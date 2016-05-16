package number33;

import java.awt.Color;

import javax.swing.JFrame;

public class JFrameTest {
	
	public static void main(String[] args) {
		JFrame jframe = new JFrame();
		jframe.setVisible(true);
		jframe.setSize(1000, 680);
		jframe.setLocation(300, 180);
		jframe.getContentPane().setBackground(Color.BLUE);
	}

}
