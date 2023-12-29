//GUI = Graphical User Interface
import javax.swing.JOptionPane;
public class SimpleGUI {
    public static void main(String args[]){
        String name = JOptionPane.showInputDialog("Enter your name here:");//Returns a string
        JOptionPane.showMessageDialog(null, "Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age here:"));
        JOptionPane.showMessageDialog(null, "You are "+ age + " years old.");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height in cm here:"));
        JOptionPane.showMessageDialog(null, "You are "+ height + " cms tall.");
    }
}
