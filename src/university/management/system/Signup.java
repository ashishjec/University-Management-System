package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Signup extends JFrame implements ActionListener {

    JButton signup, cancel;
    JTextField tfusername, tfpassword, tfname, tfemail, tfsecurityQ, tfanswer;

    Signup() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40, 20, 100, 20);
        add(lblusername);

        tfusername = new JTextField();
        tfusername.setBounds(150, 20, 150, 20);
        add(tfusername);

        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(40, 70, 100, 20);
        add(lblpassword);

        tfpassword = new JPasswordField();
        tfpassword.setBounds(150, 70, 150, 20);
        add(tfpassword);

        JLabel lblname = new JLabel("Name");
        lblname.setBounds(40, 120, 100, 20);
        add(lblname);

        tfname = new JTextField();
        tfname.setBounds(150, 120, 150, 20);
        add(tfname);

        JLabel lblemail = new JLabel("Email");
        lblemail.setBounds(40, 170, 100, 20);
        add(lblemail);

        tfemail = new JTextField();
        tfemail.setBounds(150, 170, 150, 20);
        add(tfemail);

        JLabel lblsecurityQ = new JLabel("Security Question");
        lblsecurityQ.setBounds(40, 220, 150, 20);
        add(lblsecurityQ);

        tfsecurityQ = new JTextField();
        tfsecurityQ.setBounds(150, 220, 150, 20);
        add(tfsecurityQ);

        JLabel lblanswer = new JLabel("Answer");
        lblanswer.setBounds(40, 270, 100, 20);
        add(lblanswer);

        tfanswer = new JTextField();
        tfanswer.setBounds(150, 270, 150, 20);
        add(tfanswer);

        signup = new JButton("Sign Up");
        signup.setBounds(40, 330, 120, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        signup.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(signup);

        cancel = new JButton("Cancel");
        cancel.setBounds(180, 330, 120, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);

        setSize(400, 450);
        setLocation(500, 250);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == signup) {
            String username = tfusername.getText();
            String password = tfpassword.getText();
            String name = tfname.getText();
            String email = tfemail.getText();
            String securityQ = tfsecurityQ.getText();
            String answer = tfanswer.getText();

            String query = "insert into login values('" + username + "','" + password + "','" + name + "','" + email
                    + "','" + securityQ + "','" + answer + "')";

            try {
                Conn c = new Conn();
                c.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Account created successfully!");
                setVisible(false);
                new Login();

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == cancel) {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}
