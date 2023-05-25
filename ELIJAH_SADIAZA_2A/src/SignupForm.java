import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.*;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class SignupForm extends JFrame implements ActionListener{
    
    private JLabel header,body;
    private JLabel fname,lname,username,password,Confirmpassword,bday,sex;
    private JTextField textFieldfname, textFieldlname;
    private JTextField textFieldusername;
    private JPasswordField passwordtextFieldpassword;
    private JPasswordField passwordFieldConfirmpassword;
    private JRadioButton maleRadioButton,femaleRadioButton;


    private JButton exit;
    private JButton buttonSignup;
    private JButton buttonback;

    String month[] = {"January", "February", "March", "April", "May", "June",
                   "July", "August", "September", "October", "November", "December"};
    String date[] = {"1", "2", "3", "4", "5", "6", "7", "9", "10", "11", "12", "13", "14", "15", "16", "17", "19", "20", "21", "22", "23", "24", "25", "26", "27", "29", "30", "31"};
    
    public SignupForm(){
        
        setTitle("Sign up");
        setSize(480,580); 
        setLocationRelativeTo(null);
        setUndecorated(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        


       //Title    
        header = new JLabel("Hi");
        header.setBounds(70, 30, 500, 100);
        header.setFont(new Font("Monospaced", Font.BOLD, 30));
        header.setForeground(Color.WHITE);

        
        //Body

        body = new JLabel("Create account now.");
        body.setBounds(70, 60, 500, 100);
        body.setFont(new Font("Monospaced", Font.PLAIN, 12));
        body.setForeground(Color.WHITE);

      

        

        fname = new JLabel("First name");
        fname.setFont(new Font("ARIAL", Font.PLAIN, 10));
        fname.setBounds(87, 150, 280, 30);
        fname.setForeground(new Color(255, 255, 255));

        textFieldfname = new JTextField(15); 
        textFieldfname.setBounds(70, 150, 150, 30);
        textFieldfname.setForeground(new Color(246, 110, 13));
        textFieldfname.setBackground(new Color(49, 49, 49));
        textFieldfname.setBorder(BorderFactory.createCompoundBorder(new MatteBorder(1,1,1,1,(new Color(246, 110, 13))),BorderFactory.createEmptyBorder(5,10,5,10)));
        
        
        lname = new JLabel("Last name");
        lname.setFont(new Font("ARIAL", Font.PLAIN, 10));
        lname.setBounds(268, 150, 280, 30);
        lname.setForeground(new Color(255, 255, 255));

        textFieldlname = new JTextField(15); 
        textFieldlname.setBounds(250, 150, 150, 30);
        textFieldlname.setForeground(new Color(246, 110, 13));
        textFieldlname.setBackground(new Color(49, 49, 49));
        textFieldlname.setBorder(BorderFactory.createCompoundBorder(new MatteBorder(1,1,1,1,(new Color(246, 110, 13))),BorderFactory.createEmptyBorder(5,10,5,10)));

        username = new JLabel("Username");
        username.setFont(new Font("ARIAL", Font.PLAIN, 10));
        username.setBounds(87, 200, 280, 30);
        username.setForeground(new Color(255, 255, 255));
        

        textFieldusername = new JTextField(15); 
        textFieldusername.setBounds(70, 200, 330, 30);
        textFieldusername.setForeground(new Color(246, 110, 13));
        textFieldusername.setBackground(new Color(49, 49, 49));
        textFieldusername.setBorder(BorderFactory.createCompoundBorder(new MatteBorder(1,1,1,1,(new Color(246, 110, 13))),BorderFactory.createEmptyBorder(5,10,5,10)));
       

        password = new JLabel("Password");
        password.setFont(new Font("ARIAL", Font.PLAIN, 10));
        password.setBounds(87, 250, 280, 30);
        password.setForeground(new Color(255, 255, 255));

        passwordtextFieldpassword = new JPasswordField(15);
        passwordtextFieldpassword.setBounds(70, 250, 150, 30);
        passwordtextFieldpassword.setForeground(new Color(246, 110, 13));
        passwordtextFieldpassword.setBackground(new Color(49, 49, 49));
        passwordtextFieldpassword.setBorder(BorderFactory.createCompoundBorder(new MatteBorder(1,1,1,1,(new Color(246, 110, 13))),BorderFactory.createEmptyBorder(5,10,5,10)));

        Confirmpassword = new JLabel("Confirm password");
        Confirmpassword.setFont(new Font("ARIAL", Font.PLAIN, 10));
        Confirmpassword.setBounds(267, 250, 280, 30);
        Confirmpassword.setForeground(new Color(255, 255, 255));
        
        passwordFieldConfirmpassword  = new JPasswordField(15);
        passwordFieldConfirmpassword.setBounds(250, 250, 150, 30);
        passwordFieldConfirmpassword.setForeground(new Color(246, 110, 13));
        passwordFieldConfirmpassword.setBackground(new Color(49, 49, 49));
        passwordFieldConfirmpassword.setBorder(BorderFactory.createCompoundBorder(new MatteBorder(1,1,1,1,(new Color(246, 110, 13))),BorderFactory.createEmptyBorder(5,10,5,10)));

        // Birth Date

        bday = new JLabel("Birthday : ");
        bday.setFont(new Font("Monospaced", Font.BOLD, 12));
        bday.setBounds(70, 280, 280, 30);
        bday.setForeground(new Color(255, 255, 255));

        JComboBox<String> Month = new JComboBox<>(month);
        Month.setBounds(70, 310, 100, 30);
        Month.setForeground(Color.WHITE);
        Month.setFont(new Font("ARIAL", Font.PLAIN, 10));
        Month.setBackground(new Color(49, 49, 49));
        Month.setBorder(BorderFactory.createCompoundBorder(new MatteBorder(1,1,1,1,(new Color(246, 110, 13))),BorderFactory.createEmptyBorder(5,10,5,10)));

        JComboBox<String> Date = new JComboBox<>(date);
        Date.setBounds(186, 310, 100, 30);
        Date.setForeground(Color.WHITE);
        Date.setFont(new Font("ARIAL", Font.PLAIN, 10));
        Date.setBackground(new Color(49, 49, 49));
        Date.setBorder(BorderFactory.createCompoundBorder(new MatteBorder(1,1,1,1,(new Color(246, 110, 13))),BorderFactory.createEmptyBorder(5,10,5,10)));

        JComboBox<Integer> yearComboBox = new JComboBox<>(getYearRange());
        yearComboBox.setBounds(300, 310, 100, 30);
        yearComboBox.setForeground(Color.WHITE);
        yearComboBox.setBackground(new Color(49, 49, 49));
        yearComboBox.setFont(new Font("ARIAL", Font.PLAIN, 10));
        yearComboBox.setBorder(BorderFactory.createCompoundBorder(new MatteBorder(1,1,1,1,(new Color(246, 110, 13))),BorderFactory.createEmptyBorder(5,10,5,10)));

        sex = new JLabel("Sex : ");
        sex.setFont(new Font("Monospaced", Font.BOLD, 12));
        sex.setBounds(70, 340, 280, 30);
        sex.setForeground(new Color(255, 255, 255));

        maleRadioButton= new JRadioButton("Male");
        maleRadioButton.setBounds(70, 370, 150, 30);
        maleRadioButton.setBackground(new Color(49, 49, 49));
        maleRadioButton.setForeground(Color.WHITE);
        maleRadioButton.setFont(new Font("ARIAL", Font.PLAIN, 10));
        

        femaleRadioButton = new JRadioButton("Female");
        femaleRadioButton.setBounds(250, 370, 150, 30);
        femaleRadioButton.setBackground(new Color(49, 49, 49));
        femaleRadioButton.setForeground(Color.WHITE);
        femaleRadioButton.setFont(new Font("ARIAL", Font.PLAIN, 10));

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(maleRadioButton);
        buttonGroup.add(femaleRadioButton);



        buttonSignup = new JButton("Sign up");
        buttonSignup.setBounds(135, 420, 200, 40);
        buttonSignup.setFont(new Font("ARIAL", Font.PLAIN, 12));
        buttonSignup.setForeground(Color.WHITE);
        buttonSignup.setBackground(new Color(246, 110, 13));
        buttonSignup.setBorder(BorderFactory.createEmptyBorder());
        buttonSignup.setBorder(null);

        buttonback = new JButton("Go back to Login");
        buttonback.setBounds(175, 475, 120, 30);
        buttonback.setFont(new Font("Monospaced", Font.BOLD, 10));
        buttonback.setForeground(new Color(246, 110, 13));
        buttonback.setBackground(new Color(49, 49, 49));
        buttonback.setBorder(BorderFactory.createEmptyBorder());
        buttonback.setBorder(null);

        exit = new JButton("o");
        exit.setBounds(230, 520, 15, 30);
        exit.setFont(new Font("ARIAL", Font.BOLD, 15));
        exit.setForeground(new Color(246, 110, 13));
        exit.setBackground(new Color(49, 49, 49));
        exit.setBorder(BorderFactory.createEmptyBorder());
        exit.setBorder(null);




        Container container = getContentPane();
        container.setBackground(new Color(49, 49, 49));
        container.setLayout(null);

        container.add(body);
        container.add(header);
        container.add(fname);
        container.add(lname);
        container.add(textFieldfname);
        container.add(textFieldlname);
        container.add(username);
        container.add(textFieldusername);
        container.add(password);
        container.add(passwordtextFieldpassword);
        container.add(Confirmpassword);
        container.add(passwordFieldConfirmpassword);
        container.add(bday);
        container.add(Month);
        container.add(Date);
        container.add(yearComboBox);
        container.add(maleRadioButton);
        container.add(femaleRadioButton);
        container.add(sex);
        
        container.add(buttonSignup);
        container.add(buttonback);
        container.add(exit);

        buttonback.addActionListener(this);
        buttonSignup.addActionListener(this);
        exit.addActionListener(this);
        setVisible(true);

        textFieldfname.addKeyListener(new KeyListener() {
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
                String input = textFieldfname.getText();
                if (input.isEmpty()) {
                    fname.setVisible(true);
                } else{
                    fname.setVisible(false);
                }
            }
        });
        textFieldlname.addKeyListener(new KeyListener() {
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
                String input = textFieldlname.getText();
                if (input.isEmpty()) {
                    lname.setVisible(true);
                } else{
                    lname.setVisible(false);
                }
            }
        });


        textFieldusername.addKeyListener(new KeyListener() {
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
                String input = textFieldusername.getText();
                if (input.isEmpty()) {
                    username.setVisible(true);
                } else{
                    username.setVisible(false);
                }
            }
        });
        passwordtextFieldpassword.addKeyListener(new KeyListener() {
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
                String input = new String(passwordtextFieldpassword.getPassword());
                if (input.isEmpty()) {
                    password.setVisible(true);
                } else{
                    password.setVisible(false);
                }
            }
        });
        passwordFieldConfirmpassword.addKeyListener(new KeyListener() {
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
                String input = new String(passwordFieldConfirmpassword.getPassword());
                if (input.isEmpty()) {
                    Confirmpassword.setVisible(true);
                } else{
                    Confirmpassword.setVisible(false);
                }
            }
        });
    }

    public void actionPerformed(ActionEvent e){
        String name = textFieldfname.getText();
        String username = textFieldusername.getText();
        String password = new String(passwordtextFieldpassword.getPassword());
        String Confirmpassword = new String(passwordFieldConfirmpassword.getPassword());
       
        if(e.getSource().equals(exit)){

          
            dispose();

        }else if(e.getSource().equals(buttonback)){

            new LoginForm();    
            dispose();

        }else if (name.isEmpty() || username.isEmpty() || password.isEmpty() || Confirmpassword.isEmpty() ) { 

            JOptionPane.showMessageDialog(this, "Please fill the following");
        
        }else if(password.equals(Confirmpassword)){
            
     
            JOptionPane.showMessageDialog(this,"Signup successful!");

            
        }else{
            JOptionPane.showMessageDialog(this,"Password doesn't match!");
        }


    }
    private static Integer[] getYearRange() {
        int currentYear = Year.now().getValue();
        int startYear = currentYear - 100; 
        int endYear = currentYear + 100; 

        List<Integer> years = new ArrayList<>();
        for (int year = startYear; year <= endYear; year++) {
            years.add(year);
        }

        return years.toArray(new Integer[0]);
    } 


    public static void main(String[] args){
        new SignupForm();
    }
}
