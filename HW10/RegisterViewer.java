import java.sql.SQLException;
import javax.swing.JFrame;

public class RegisterViewer {
 
	public static void main(String[] args) throws SQLException {
		RegisterFrame frame = new RegisterFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
 
	}
}