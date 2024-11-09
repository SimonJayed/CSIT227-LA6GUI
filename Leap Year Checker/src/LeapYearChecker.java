import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearChecker extends JFrame {
    private JPanel jpanel;
    private JTextField yearTextField;
    private JButton checkYearButton;


    public LeapYearChecker(){
        checkYearButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int year = Integer.parseInt(yearTextField.getText());
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        JOptionPane.showMessageDialog(null, "Leap year", "Message", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Not a leap year", "Message", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                catch(Exception e1){
                    JOptionPane.showMessageDialog(null, "Invalid Input", "Message", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }
    public static void main(String[] args) {
        LeapYearChecker app = new LeapYearChecker();
        app.setTitle("Leap Year Checker");
        app.setContentPane(app.jpanel);
        app.setSize(400,200);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
