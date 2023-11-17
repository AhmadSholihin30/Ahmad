import javax.swing.JOptionPane;
public class Cod1 {
public static void main(String args[]) {
String username =
JOptionPane.showInputDialog("Username:");
String password =
JOptionPane.showInputDialog("Password:");
if (
username != null && password != null &&
(
(username.equals("Kucing") &&
password.equals("12345")) ||
(username.equals("hritter") &&
password.equals("preakston"))
)
)
{
JOptionPane.showMessageDialog
(null, "You're in.");
} else {
JOptionPane.showMessageDialog
(null, "You're suspicious.");
}
}
}