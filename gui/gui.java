import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class gui extends JFrame{
	JPanel pane = new JPanel();
	JButton pressed = new JButton("Pressedo");
	gui(){
		super("Demo Title");
		setBounds(100,200,300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		con.add(pane);
		pressed.setMnemonic('P');
		pressed.setBackground(Color.GREEN);
		pane.add(pressed);
		pressed.requestFocus();
		setVisible(true);
	}
	public static void main(String args[]){
		new gui();
	}
}