import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

// This is the new page that opens after a successful login.
// It extends JFrame, which means it is a window.
public class NewPage extends JFrame {

    // The constructor is called when you create a new instance of this class
    NewPage(String userName) {
        
        // Create a label to welcome the user
        JLabel welcomeLabel = new JLabel("Welcome, " + userName + "!");
        welcomeLabel.setBounds(0, 30, 400, 35); // Set position and size
        welcomeLabel.setFont(new Font(null, Font.PLAIN, 25)); // Set font size
        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER); // Center the text
        
        // Add the label to this frame
        add(welcomeLabel);

        // Set up the frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application when this window is closed
        setTitle("Welcome Page");
        setSize(400, 200);
        setLayout(null); // Use null layout to manually position components
        setLocationRelativeTo(null); // Center the window on the screen
        setVisible(true); // Make the frame visible
    }
}