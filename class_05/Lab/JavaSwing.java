import javax.swing.JFrame;

class JavaSwing
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Java Frame");
		frame.setVisible(true);
		frame.setSize(500,500);
		frame.setLocation(400,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}