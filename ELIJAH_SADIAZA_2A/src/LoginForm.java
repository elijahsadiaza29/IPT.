import javax.swing.*;
import javax.swing.border.MatteBorder;

import java.awt.*;
import java.awt.event.*;

public class LoginForm extends JFrame implements ActionListener{
    
    private JLabel header,body,footer,userplaceholder,passplaceholder;
    private JCheckBox checkbox;
    private JTextField textFieldUsername;
    private JPasswordField passwordField;

    private JButton buttonLogin,buttonSignup,forgotpass,exit;

    public LoginForm(){
        
        
        setSize(350,500);
        setUndecorated(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //Title    

        header = new JLabel("Welcome!");
        header.setBounds(69, 30, 150, 100);
        header.setFont(new Font("Monospaced", Font.BOLD, 30));
        header.setForeground(new Color(255, 255, 255));

    //Body

        body = new JLabel("Please sign in to continue.");
        body.setBounds(70, 60, 500, 100);
        body.setFont(new Font("Monospaced", Font.PLAIN, 12));
        body.setForeground(new Color(255, 255, 255));

    // Username & password placeholder
    
        userplaceholder = new JLabel("Enter username");
        userplaceholder.setFont(new Font("ARIAL", Font.PLAIN, 10));
        userplaceholder.setForeground(new Color(255, 255, 255));
        userplaceholder.setBounds(85, 150, 280, 30);
    
        passplaceholder = new JLabel("Enter password");
        passplaceholder.setFont(new Font("ARIAL", Font.PLAIN, 10));
        passplaceholder.setBounds(85, 200, 280, 30);
        passplaceholder.setForeground(new Color(255, 255, 255));

    // Username Text field & Passwoord field

        textFieldUsername = new JTextField(15); 
        textFieldUsername.setBounds(70, 150, 200, 30);
        textFieldUsername.setForeground(new Color(246, 110, 13));
        textFieldUsername.setBackground(new Color(49, 49, 49));
        textFieldUsername.setBorder(BorderFactory.createCompoundBorder(new MatteBorder(0,0,1,0,(new Color(246, 110, 13))),BorderFactory.createEmptyBorder(5,10,5,10)));

        passwordField = new JPasswordField(15);
        passwordField.setBounds(70, 200, 200, 30);
        passwordField.setForeground(new Color(246, 110, 13));
        passwordField.setBackground(new Color(49, 49, 49));
        passwordField.setBorder(BorderFactory.createCompoundBorder(new MatteBorder(0,0,1,0,(new Color(246, 110, 13))),BorderFactory.createEmptyBorder(5,10,5,10)));

    // Remeber me checkbox

        checkbox = new JCheckBox(" Remember me");
        checkbox.setBounds(70, 250, 200, 20);
        checkbox.setBackground(new Color(49, 49, 49));
        checkbox.setFont(new Font("Monospaced", Font.PLAIN, 9));
        checkbox.setForeground(Color.WHITE);
    
    // Forget password Button
        
        forgotpass = new JButton("Forgot password?");
        forgotpass.setBounds(70, 400, 200, 40);
        forgotpass.setFont(new Font("Monospaced", Font.PLAIN, 9));
        forgotpass.setForeground(Color.WHITE);
        forgotpass.setBackground(new Color(49, 49, 49));
        forgotpass.setBorder(BorderFactory.createEmptyBorder());


    // Login & Signup Button

        buttonLogin = new JButton("Login");
        buttonLogin.setBounds(70, 300, 200, 40);
        buttonLogin.setFont(new Font("ARIAL", Font.PLAIN, 12));
        buttonLogin.setForeground(Color.WHITE);
        buttonLogin.setBackground(new Color(246, 110, 13));
        buttonLogin.setBorder(BorderFactory.createEmptyBorder());
        buttonLogin.setBorder(null);
        

        buttonSignup = new JButton("Sign up");
        buttonSignup.setBounds(210, 350, 50, 30);
        buttonSignup.setFont(new Font("Monospaced", Font.PLAIN, 10));
        buttonSignup.setForeground(new Color(246, 110, 13));
        buttonSignup.setBackground(new Color(49, 49, 49));
        buttonSignup.setBorder(BorderFactory.createEmptyBorder());

    
    //Footer

        footer = new JLabel("Don't have a account?");
        footer.setBounds(80, 350, 300, 30);
        footer.setFont(new Font("Monospaced", Font.BOLD, 10));
        footer.setForeground(new Color(255, 255, 255));
        footer.setBackground(new Color(238, 238, 238));
        footer.setBorder(BorderFactory.createEmptyBorder());
      
    //exit button
        exit = new JButton("o");
        exit.setBounds(165, 450, 15, 30);
        exit.setFont(new Font("ARIAL", Font.BOLD, 15));
        exit.setForeground(new Color(246, 110, 13));
        exit.setBackground(new Color(49, 49, 49));
        exit.setBorder(BorderFactory.createEmptyBorder());
        exit.setBorder(null);


        Container container = getContentPane();
        container.setBackground(new Color(49, 49, 49));
        container.setLayout(null);

        container.add(header);
        container.add(body);
        container.add(footer);
        container.add(userplaceholder);
        container.add(passplaceholder);
        container.add(textFieldUsername);
        container.add(passwordField);
        container.add(checkbox);
        container.add(buttonLogin);
        container.add(forgotpass);
        container.add(buttonSignup);
        container.add(exit);
       
        
        buttonLogin.addActionListener(this);
        buttonSignup.addActionListener(this);
        exit.addActionListener(this);
        setVisible(true);

        textFieldUsername.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // Not used
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // Not used
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // Show userplaceholder text if the text field is empty
                String input = textFieldUsername.getText();
                if (input.isEmpty()) {
                    userplaceholder.setVisible(true);
                } else{
                    userplaceholder.setVisible(false);
                }
            }
        });

        passwordField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // Not used
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // Not used
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // Show userplaceholder text if the text field is empty
                String input = new String(passwordField.getPassword());
                if (input.isEmpty()) {
                    passplaceholder.setVisible(true);
                } else{
                    passplaceholder.setVisible(false);
                }
            }
        });

    }

    public void actionPerformed(ActionEvent e){
        String username = textFieldUsername.getText();
        String password = new String(passwordField.getPassword());
        
        if(e.getSource().equals(exit)){

          
            dispose();

        }else if (username.equals("admin") && password.equals("password")) {

            JOptionPane.showMessageDialog(this, "Login succesful");
            

        }else if (e.getSource().equals(buttonSignup)) {

            new SignupForm();
            dispose(); 

        }else if (username.isEmpty() || password.isEmpty()) { 

            JOptionPane.showMessageDialog(this, "Please fill the following");
        
        }
        else{

            JOptionPane.showMessageDialog(this, "Invalid username or password");

        }
    }

    public static void main(String[] args){
        new LoginForm();
        
    }
}
