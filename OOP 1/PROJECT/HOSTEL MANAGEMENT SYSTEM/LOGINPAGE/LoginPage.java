package LOGINPAGE;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.awt.Font;
import java.awt.*;
import java.io.*;
import static javax.swing.JOptionPane.showMessageDialog;
import ADMIN.*;

public class LoginPage implements ActionListener {

    JFrame f;
    JLabel UsernameNameLabel;
    JLabel PasswordLabel;
    JLabel LoginPageLogo;
    JLabel LogoMessage;
    JTextField UsernameTextField;
    JPasswordField PasswordField;
    JButton Login;
    JButton ForgotPassword;
    JButton RegisterAccount;

    // Room1 r;
    public LoginPage() {

        f = new JFrame();

        // --------------------------------------------------- Color, Font initializer
        Color lightBlue = new Color(102, 178, 255);
        // f.getContentPane().setBackground(lightBlue);

        Color ForButtonInLoginPage = new Color(102, 178, 255);
        Color ForButton = new Color(0, 0, 255);

        Font ButtonFont = new Font("Arial Black", Font.BOLD, 12);
        Font UnderLogo = new Font("classic-roman", Font.ITALIC, 25);

        // -------------------------------------------------- JPanel Borders
        JPanel border = new JPanel();
        border.setBounds(0, 0, 700, 450);
        // border.setBackground(lightBlue);
        border.add(new JLabel(new ImageIcon("photo.jpg")));
        border.setBorder(BorderFactory.createLineBorder(Color.white, 4, true));

        // ---------------------------------------------- JLebel bounds, color
        // ------------------------------------------------ JTextField JPasswordField
        // bounds, color

        UsernameNameLabel = new JLabel("Username");
        UsernameNameLabel.setBounds(190, 230, 200, 30);
        UsernameNameLabel.setForeground(Color.white);
        UsernameTextField = new JTextField();
        UsernameTextField.setBounds(290, 230, 200, 30);

        PasswordLabel = new JLabel("Password");
        PasswordLabel.setBounds(190, 280, 200, 30);
        PasswordLabel.setForeground(Color.white);
        PasswordField = new JPasswordField();
        PasswordField.setBounds(290, 280, 200, 30);

        // --------------------------------------------------------------- Login Page
        // Logo and Message
        LoginPageLogo = new JLabel();
        LoginPageLogo.setIcon(new ImageIcon("aa.png"));
        LoginPageLogo.setBounds(248, -11, 200, 200);
        LoginPageLogo.setLayout(null);

        LogoMessage = new JLabel("Premium Alcazaba Hostel");
        LogoMessage.setBounds(200, 140, 500, 100);
        LogoMessage.setForeground(Color.BLACK);
        LogoMessage.setFont(UnderLogo);

        // ------------------------------------------------- JButton bounds
        Login = new JButton("Login");
        Login.setBounds(280, 350, 80, 30);
        Login.addActionListener(this);
        Login.setBackground(ForButtonInLoginPage);
        Login.setForeground(Color.BLACK);
        Login.setFont(ButtonFont);
        Login.setFocusPainted(false); // removes the selection border

        ForgotPassword = new JButton("Forgot Password");
        ForgotPassword.setBounds(385, 350, 150, 30);
        ForgotPassword.setBackground(ForButtonInLoginPage);
        ForgotPassword.setForeground(Color.black);
        ForgotPassword.addActionListener(this);
        ForgotPassword.setFont(ButtonFont);
        ForgotPassword.setFocusPainted(false); // removes the selection border

        RegisterAccount = new JButton("Register");
        RegisterAccount.setBounds(150, 350, 110, 30);
        RegisterAccount.addActionListener(this);
        RegisterAccount.setBackground(ForButtonInLoginPage);
        RegisterAccount.setForeground(Color.black);
        RegisterAccount.setFont(ButtonFont);
        RegisterAccount.setFocusPainted(false); // removes the selection border

        // ---------------------------------------------------- Adding in frame
        f.add(UsernameNameLabel);
        f.add(PasswordLabel);
        f.add(UsernameTextField);
        f.add(PasswordField);
        f.add(Login);
        f.add(ForgotPassword);
        f.add(RegisterAccount);
        f.add(LoginPageLogo);
        f.add(LogoMessage);
        f.add(border);

        // ---------------------------------------------------- Setting size of frame
        f.setTitle("Premium Alcazaba Hostel");
        f.setSize(700, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(new java.awt.Color(145, 204, 243));
        // -------------------------------------- for centering the frame
        f.setLocationRelativeTo(null);
        f.setLayout(null);

        // ---------------------------------------- Icon Settings
        Image icon = Toolkit.getDefaultToolkit().getImage("hostel-sign-.jpg");

        f.setIconImage(icon);
        f.setLayout(null);
        f.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == RegisterAccount) {
            f.dispose();
            Registration r = new Registration();
            r.setVisible(true);
        }

        if (e.getSource() == ForgotPassword) {
            PassForg r = new PassForg();
            r.setVisible(true);
            f.setVisible(false);
        }

        if (e.getSource() == Login && UsernameTextField.getText().isEmpty() == false
                && PasswordField.getText().isEmpty() == false) {
            Boolean matched = false;
            String user = UsernameTextField.getText().toString();
            String pass = PasswordField.getText().toString(); // this will not keep pass in the string pool
            try {
                FileReader fr = new FileReader(
                        "F:\\VSCODE\\My Project\\MyHostelexperiment\\meeeeee\\TXTFILES\\Login.txt");
                BufferedReader br = new BufferedReader(fr);
                String line;
                while ((line = br.readLine()) != null) {
                    if (line.equals(user + " " + pass)) {
                        matched = true;
                        break;
                    }
                }
                fr.close();
            } catch (Exception a) {
            }
            if (matched) {

                // ------------------- Disabling previous frame so that new frame can emerge
                f.setVisible(false);

                // ------------------------- Sample() contains new JFrame
                new Admin();
            } else {
                showMessageDialog(null, "Invalid Username and password! Try Again");

            }
        }
        if (e.getSource() == Login && UsernameTextField.getText().isEmpty() == true
                && PasswordField.getText().isEmpty() == false) {
            JOptionPane.showMessageDialog(null, "Please input Username");
        }
        if (e.getSource() == Login && UsernameTextField.getText().isEmpty() == false
                && PasswordField.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "Please input Password");
        }
        if (e.getSource() == Login && UsernameTextField.getText().isEmpty() == true
                && PasswordField.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "Please input Username and Password");
        }

    }

    public void setVisible(boolean b) {
    }
}
