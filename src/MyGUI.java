import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class MyGUI extends JFrame  {
	private JMenuBar menuBar = new JMenuBar();
	
	private JMenu menu1 = new JMenu("Move");
	private JMenuItem item1 = new JMenuItem("Left", KeyEvent.VK_L);
	private JMenuItem item2 = new JMenuItem("Right", KeyEvent.VK_R);
	
	private JMenu menu2 = new JMenu("Change Color");
	private JMenuItem item3 = new JMenuItem("Blue", KeyEvent.VK_B);
	private JMenuItem item4 = new JMenuItem("Yellow", KeyEvent.VK_Y);
	private JMenuItem item5 = new JMenuItem("Green", KeyEvent.VK_G);
	
	private Tile tile = new Tile();
	//private JTextField tf = new JTextField;


	public MyGUI() { 
		// this refers to "this" MyFirstGui object that is executing this   constructor.
		this.setLayout(null); // no layout manager. I will layout the components myself
		this.setSize(700,300);
		this.setLocation(400,40);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("This is my very first GUI!");

		Font font = new Font("Arial", Font.BOLD, 20);

		//set up the menus
		menu1.setMnemonic(KeyEvent.VK_M); // Alt-M is the shortcut
		menu2.setMnemonic(KeyEvent.VK_C); // Alt-C is the shortcut

		menuBar.add(menu1); // add menu1 to the menubar
		menuBar.add(menu2); // add menu2 to the menubar
		
		menu1.add(item1);
		menu1.add(item2);
		
		menu2.add(item3);
		menu2.add(item4);
		menu2.add(item5);
		
		this.setJMenuBar(menuBar);
		
		MyListener dumbo = new MyListener();
		item1.addActionListener(dumbo);
		item2.addActionListener(dumbo);
		item3.addActionListener(dumbo);
		item4.addActionListener(dumbo);
		item5.addActionListener(dumbo);

		tile.setSize(100,100);
		tile.setLocation(100, 50);
		tile.setVisible(true);
		this.add(tile);
		
	//	tf.setSize(200,100);
		//tf.setLocation(100, 100);
		//tf.setVisible(true);
		//this.add(tile);		

		


	} // end of MyGUI constructor

	public class MyListener implements ActionListener {
		// ActionListeners work on lots of different components
		// for JButtons, they hear clicks
		// for JTextFields, they hear the Enter key
		// for JMenuItems, they hear if you select that item
		
		/*
		 * All of the menu items are using the same listener, but we can separate them by asking
		 * arg0 who sent it.
		 */
		public void actionPerformed(ActionEvent arg0) {
			if(arg0.getSource() == item1) {
				tile.setLocation( tile.getX()-50, tile.getY() );
			}else if(arg0.getSource() == item2) {
				tile.setLocation( tile.getX()+50, tile.getY() );
			}else if(arg0.getSource() == item3) {
				tile.setForeground(Color.blue);
			}else if(arg0.getSource() == item4) {
				tile.setForeground(Color.yellow);
			}else if(arg0.getSource() == item5) {
				tile.setForeground(Color.green);
		//	}else if (arg0.getSource()== tf){
			//	String s = tf.getText();
		//		try{
			//	double y = Double.parseDouble(s);
		//		System.out.println("the entered " +y);
		//	}catch (NumberFormatException nfe){
			//	System.out.println("Not a number");
			//	tf.selectAll();
				
			}
		}

	}

	

}// end of MyGUI class
