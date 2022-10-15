package LOGINPAGE;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.io.*;
import javax.swing.*;
import javax.swing.table.*;

public class PassForg extends JFrame implements ActionListener {
    private JTable j;
    private JButton profileBtn,confirm,back;
    private JLabel label;
    private Font myFont;
    private DefaultTableModel model;
   // Room1 r;
    JTable table;
    JPanel jp;
    JLabel cp,np;
    JTextField tfcp,tfnp;
    JButton con,bak;
    

    PassForg() {
        this.setTitle("PassWord recovery form");
        this.setSize( 600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
       // this.setLayout(null);

        
       
         jp = new JPanel();
         jp.setBounds(0,0,600,400);
         jp.setBackground(new Color(87,173,251));
         jp.setLayout(null);

         JPanel jp2 = new JPanel();
         jp2.setBounds(100,0,400,400);
        // jp2.setBackground(Color.gray);
         jp2.setLayout(null);
         jp.add(jp2);

         label = new JLabel();
         label.setText("RECOVER YOUR PASSWORD");
         label.setFont(myFont);
         label.setFont(new Font("Rockwell Nova Light", Font.BOLD, 16));
         label.setBounds(100, 10, 300, 80);
        // label.setForeground(Color.BLACK);
         jp2.add(label);
         
         cp = new JLabel("ENTER YOUR NAME :");
         cp.setBounds(50, 90, 120, 50);
         jp2.add(cp);

         np = new JLabel(" YOUR PASSWORD :");
         np.setBounds(50, 130, 120, 50);
         jp2.add(np);

         tfcp = new JTextField();
        tfcp.setBounds(180, 100, 120, 30); 
       jp2.add(tfcp);

         tfnp = new JTextField();
        tfnp.setBounds(180, 140, 120, 30);
        tfnp.setEditable(false);
       jp2.add(tfnp);

       con = new JButton("CONFIRM");
        con.setBounds(80, 180, 90, 30);
        con.addActionListener(this);
        jp2.add(con);

        bak = new JButton("BACK");
        bak.setBounds(180, 180, 90, 30);
        bak.addActionListener(this);
        jp2.add(bak);

      /*  back = new JButton("BACK");
        back.setBounds(115, 140, 80, 40);
        back.addActionListener(this);
        p.add(back);*/

       /*  name = new JTextField();
        name.setBounds(90, 18, 120, 25);
        p.add(name);*/
          
        /*  reset = new JButton("Reset");
         reset.setBounds(115, 140, 80, 40);
         reset.addActionListener(this);
         p.add(reset);*/

        Image icon = Toolkit.getDefaultToolkit().getImage("hostel-sign-.jpg");
        setIconImage(icon);
        myFont = new Font("Cambria", Font.PLAIN, 25);
        
        
       /* Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);*/




        /*String col[] = { "User Name", "Password" };
        String[][] data = { { "22-47010-1", "Jahid Hasan" } };
        model = new DefaultTableModel(data, col);

        j = new JTable(model) {
            public Component prepareRenderer(TableCellRenderer renderer,
                    int row, int column) {
                Component c = super.prepareRenderer(renderer, row, column);
                Color color1 = new Color(165, 165, 165);
                Color color2 = Color.WHITE;
                if (!c.getBackground().equals(getSelectionBackground())) {
                    Color coleur = (row % 2 == 0 ? color1 : color2);
                    c.setBackground(coleur);
                    coleur = null;
                }
                return c;
            }
        };
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) j.getDefaultRenderer(Object.class);
        renderer.setHorizontalAlignment(SwingConstants.CENTER);
        JTableHeader th = j.getTableHeader();
        th.setBackground(Color.DARK_GRAY);
        th.setForeground(Color.WHITE);
        JScrollPane jsp = new JScrollPane(j);
        jsp.setViewportView(j);
        jsp.setBounds(40, 80, 500, 400);
        add(jsp);

        add(new JScrollPane(table));*/

        validate();

       /* profileBtn = new JButton("Back");
        profileBtn.setBounds(430, 500, 100, 30);
        profileBtn.addActionListener(this);
        add(profileBtn);*/
        this.add(jp);
        this.setVisible(true);
    }

    public void Read() {
        String line;
        BufferedReader reader;
        try {
            File file = new File("login.txt");
            FileReader read = new FileReader(file);
            reader = new BufferedReader(read);

            Object[] lines = reader.lines().toArray();

            for (int i = 0; i < lines.length; i++) {
                String[] row = lines[i].toString().split("\n");
                model.addRow(row);
            }
            reader.close();
        } catch (IOException ae) {
            ae.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       /*  if (e.getSource() == profileBtn) {
            LoginPage a = new LoginPage();
            a.setVisible(true);
            this.setVisible(false);
        }*/

        if(e.getSource()==con && tfcp.getText().isEmpty()==false){
            try{
            File f1=new File("Login.txt"); //Creation of File Descriptor for input file
      FileReader fr = new FileReader(f1);  //Creation of File Reader object
      BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
      String[] words=null;  //Intialize the word Array
      String s;  
      String s2;  
      String s1=tfcp.getText();   // Input word to be searched
      int count=0;   //Intialize the word to zero
      while((s=br.readLine())!=null)   //Reading Content from the file
      {
         words=s.split(" ");  //Split the word using space
          for (String word : words) 
          {
                 if (word.equals(s1))   //Search for the given word
                 {
                     count++;
                }
            }
        }
        
       /*  while((s2=br.readLine())!=null){
        words = s2.split(" ");
        int i;
        for (String word1 : words) 
        {
               if (word1.equals(s1+" "+words))   //Search for the given word
               {
                  // String t = word1;
                   JOptionPane.showMessageDialog(null,"matching");
                    //If Present increase the count by one
               }
               else{
                JOptionPane.showMessageDialog(null,"no matching");
               }
        } 
    }*/
      String s4 = count+"";
      tfnp.setText(s4);
      
      if(count!=0)  //Check for count not equal to zero
      {
         JOptionPane.showMessageDialog(null, "This is a valid Name");
      }
      else
      {
        JOptionPane.showMessageDialog(null,"Please enter a valid Name");
      }
      
         fr.close();
   }
   catch(IOException ex){
    ex.printStackTrace();
   }
   
}

    else if(e.getSource()==con && tfcp.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Please enter name");
    }
    else if(e.getSource()==bak){
        this.dispose();
        LoginPage a = new LoginPage();
        a.setVisible(true);
    }

        }
}