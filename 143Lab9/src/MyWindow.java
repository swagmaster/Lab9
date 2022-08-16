import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class MyWindow extends JFrame implements MouseListener{ 
	
	ArrayList<Student> myShapes = new ArrayList<Student>();
	
	/**
	 * Constructor with no type arguments.
	 */
	public MyWindow() {
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		addMouseListener(this);
	}
	
	@Override
	public void mouseClicked(MouseEvent mE) {
		String data = "mouseClicked (x = " + mE.getX() + " , y= " + mE.getY() + ")";
		JOptionPane.showMessageDialog(rootPane, data , mE.getSource().toString(), JOptionPane.INFORMATION_MESSAGE);
		double tempGPA = ((mE.getX() + mE.getY()) / 100) * 1.1;
		Student newKid = new Student("some ked",tempGPA);
		// Add student to list.
		myShapes.add(newKid);
		JOptionPane.showMessageDialog(rootPane, "added " + newKid.getGPA() + " to the list");
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@SuppressWarnings("javadoc")
	public static void main(String[] args) {
		JFrame myWin = new MyWindow();
		JLabel info = new JLabel("Click within the window to add a student to the list");
		myWin.add(info);
	}
}