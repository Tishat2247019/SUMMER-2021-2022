package ROOMS;

import java.lang.*;
import javax.swing.*;
import javax.swing.table.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import ADMIN.*;

public class Room1 extends JFrame implements ActionListener {

  JPanel panel;
  JLabel label1, label2, label3;
  JButton r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, br1, br2, br3, br4, br5, br6, br7, br8, br9, br10, ar1, ar2, ar3,
      ar4, ar5, cnf, can, back;
  JCheckBox cbr1, cbr2, cbr3, cbr4, cbr5;
  ButtonGroup checkbox;
  Admin a;
  // Room4 room4;
  Icon icon, icon2;
  Font myfFont;
  JTable jt;
  DefaultTableModel model;
  String s1 = "Room1";
  String s2 = "Room2";
  String s3 = "Room3";
  String s4 = "Room4";
  String s5 = "Room5";
  String s6 = "Room6";
  String s7 = "Room7";
  String s8 = "Room8";
  String s9 = "Room9";
  String s10 = "Room10";

  public Room1(Admin a) {
    super("Room management page");
    this.a = a;
    // this.room4 = room4;
    this.setSize(800, 800);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // this.getContentPane().setBackground(Color.BLACK);
    // this.setLayout(null);

    Image icon99 = Toolkit.getDefaultToolkit().getImage("hostel-sign-.jpg");
    this.setIconImage(icon99);
    this.setLocationRelativeTo(null);
    this.setVisible(true);

    panel = new JPanel();
    panel.setLayout(null);
    panel.setVisible(true);
    /// panel.setBackground(Color.lightGray);
    this.add(panel);

    label1 = new JLabel("ALL ROOMS");
    label1.setBounds(80, 10, 200, 50);
    label1.setFont(new Font("Rockwell", Font.BOLD, 20));
    panel.add(label1);

    icon = new ImageIcon("Room.jpg");
    icon2 = new ImageIcon("Room2.jpg");

    myfFont = new Font("Serif", Font.PLAIN, 25);

    r1 = new JButton("Room1", icon);
    r1.setHorizontalTextPosition(JButton.CENTER);
    r1.setVerticalTextPosition(JButton.CENTER);
    // r1.setText("Room1");
    r1.setBounds(40, 70, 200, 50);
    // r1.setForeground(Color.WHITE);
    r1.setFont(myfFont);
    panel.add(r1);

    r2 = new JButton("Room2", icon);
    r2.setHorizontalTextPosition(JButton.CENTER);
    r2.setVerticalTextPosition(JButton.CENTER);
    r2.setBounds(40, 130, 200, 50);
    r2.setFont(myfFont);
    panel.add(r2);

    r3 = new JButton("Room3", icon);
    r3.setHorizontalTextPosition(JButton.CENTER);
    r3.setVerticalTextPosition(JButton.CENTER);
    r3.setBounds(40, 190, 200, 50);
    r3.setFont(myfFont);
    panel.add(r3);

    r4 = new JButton("Room4", icon);
    r4.setHorizontalTextPosition(JButton.CENTER);
    r4.setVerticalTextPosition(JButton.CENTER);
    r4.setBounds(40, 250, 200, 50);
    r4.setFont(myfFont);
    panel.add(r4);

    r5 = new JButton("Room5", icon);
    r5.setHorizontalTextPosition(JButton.CENTER);
    r5.setVerticalTextPosition(JButton.CENTER);
    r5.setBounds(40, 310, 200, 50);
    r5.setFont(myfFont);
    panel.add(r5);

    r6 = new JButton("Room6", icon);
    r6.setHorizontalTextPosition(JButton.CENTER);
    r6.setVerticalTextPosition(JButton.CENTER);
    r6.setBounds(40, 370, 200, 50);
    r6.setFont(myfFont);
    panel.add(r6);

    r7 = new JButton("Room7", icon);
    r7.setHorizontalTextPosition(JButton.CENTER);
    r7.setVerticalTextPosition(JButton.CENTER);
    r7.setBounds(40, 430, 200, 50);
    r7.setFont(myfFont);
    panel.add(r7);

    r8 = new JButton("Room8", icon);
    r8.setHorizontalTextPosition(JButton.CENTER);
    r8.setVerticalTextPosition(JButton.CENTER);
    r8.setBounds(40, 490, 200, 50);
    r8.setFont(myfFont);
    panel.add(r8);

    r9 = new JButton("Room9", icon);
    r9.setHorizontalTextPosition(JButton.CENTER);
    r9.setVerticalTextPosition(JButton.CENTER);
    r9.setBounds(40, 550, 200, 50);
    r9.setFont(myfFont);
    panel.add(r9);

    r10 = new JButton("Room10", icon);
    r10.setHorizontalTextPosition(JButton.CENTER);
    r10.setVerticalTextPosition(JButton.CENTER);
    r10.setBounds(40, 610, 200, 50);
    r10.setFont(myfFont);
    r10.addActionListener(this);
    panel.add(r10);

    label2 = new JLabel("BOOKED ROOMS");
    label2.setFont(new Font("Rockwell", Font.BOLD, 20));
    label2.setBounds(260, 10, 200, 50);
    panel.add(label2);

    br1 = new JButton("Room1", icon);
    br1.setHorizontalTextPosition(JButton.CENTER);
    br1.setVerticalTextPosition(JButton.CENTER);
    br1.setBounds(250, 70, 200, 50);
    br1.setFont(myfFont);
    panel.add(br1);

    br2 = new JButton("Room2", icon);
    br2.setHorizontalTextPosition(JButton.CENTER);
    br2.setVerticalTextPosition(JButton.CENTER);
    br2.setBounds(250, 130, 200, 50);
    br2.setFont(myfFont);
    panel.add(br2);
    r1.setFont(myfFont);

    br3 = new JButton("Room3", icon);
    br3.setHorizontalTextPosition(JButton.CENTER);
    br3.setVerticalTextPosition(JButton.CENTER);
    br3.setBounds(250, 190, 200, 50);
    br3.setFont(myfFont);
    panel.add(br3);

    br4 = new JButton("Room4", icon);
    br4.setHorizontalTextPosition(JButton.CENTER);
    br4.setVerticalTextPosition(JButton.CENTER);
    br4.setBounds(250, 250, 200, 50);
    br4.setFont(myfFont);
    panel.add(br4);

    br5 = new JButton("Room5", icon);
    br5.setHorizontalTextPosition(JButton.CENTER);
    br5.setVerticalTextPosition(JButton.CENTER);
    br5.setBounds(250, 310, 200, 50);
    br5.setFont(myfFont);
    panel.add(br5);

    br6 = new JButton("Room6", icon);
    br6.setHorizontalTextPosition(JButton.CENTER);
    br6.setVerticalTextPosition(JButton.CENTER);
    br6.setBounds(250, 370, 200, 50);
    br6.setFont(myfFont);
    panel.add(br6);
    br6.setVisible(false);

    br7 = new JButton("Room7", icon);
    br7.setHorizontalTextPosition(JButton.CENTER);
    br7.setVerticalTextPosition(JButton.CENTER);
    br7.setBounds(250, 430, 200, 50);
    br7.setFont(myfFont);
    panel.add(br7);
    br7.setVisible(false);

    br8 = new JButton("Room8", icon);
    br8.setHorizontalTextPosition(JButton.CENTER);
    br8.setVerticalTextPosition(JButton.CENTER);
    br8.setBounds(250, 490, 200, 50);
    br8.setFont(myfFont);
    panel.add(br8);
    br8.setVisible(false);

    br9 = new JButton("Room9", icon);
    br9.setHorizontalTextPosition(JButton.CENTER);
    br9.setVerticalTextPosition(JButton.CENTER);
    br9.setBounds(250, 550, 200, 50);
    br9.setFont(myfFont);
    panel.add(br9);
    br9.setVisible(false);

    br10 = new JButton("Room10", icon);
    br10.setHorizontalTextPosition(JButton.CENTER);
    br10.setVerticalTextPosition(JButton.CENTER);
    br10.setBounds(250, 610, 200, 50);
    br10.setFont(myfFont);
    panel.add(br10);
    br10.setVisible(false);

    label3 = new JLabel("AVAILABLE ROOMS");
    label3.setFont(new Font("RockWell", Font.BOLD, 20));
    label3.setBounds(470, 10, 200, 50);
    panel.add(label3);

    ar1 = new JButton("Room6", icon);
    ar1.setHorizontalTextPosition(JButton.CENTER);
    ar1.setVerticalTextPosition(JButton.CENTER);
    ar1.setBounds(460, 70, 200, 50);
    ar1.setFont(myfFont);
    panel.add(ar1);

    ar2 = new JButton("Room7", icon);
    ar2.setHorizontalTextPosition(JButton.CENTER);
    ar2.setVerticalTextPosition(JButton.CENTER);
    ar2.setBounds(460, 130, 200, 50);
    ar2.setFont(myfFont);
    panel.add(ar2);

    ar3 = new JButton("Room8", icon);
    ar3.setHorizontalTextPosition(JButton.CENTER);
    ar3.setVerticalTextPosition(JButton.CENTER);
    ar3.setBounds(460, 190, 200, 50);
    ar3.setFont(myfFont);
    panel.add(ar3);

    ar4 = new JButton("Room9", icon);
    ar4.setHorizontalTextPosition(JButton.CENTER);
    ar4.setVerticalTextPosition(JButton.CENTER);
    ar4.setBounds(460, 250, 200, 50);
    ar4.setFont(myfFont);
    panel.add(ar4);

    ar5 = new JButton("Room10", icon);
    ar5.setHorizontalTextPosition(JButton.CENTER);
    ar5.setVerticalTextPosition(JButton.CENTER);
    ar5.setBounds(460, 310, 200, 50);
    ar5.setFont(myfFont);
    panel.add(ar5);

    cbr1 = new JCheckBox();
    cbr1.setBounds(672, 85, 20, 20);
    panel.add(cbr1);

    cbr2 = new JCheckBox();
    cbr2.setBounds(670, 145, 20, 20);
    panel.add(cbr2);

    cbr3 = new JCheckBox();
    cbr3.setBounds(670, 205, 20, 20);
    panel.add(cbr3);

    cbr4 = new JCheckBox();
    cbr4.setBounds(670, 265, 20, 20);
    panel.add(cbr4);

    cbr5 = new JCheckBox();
    cbr5.setBounds(670, 325, 20, 20);
    panel.add(cbr5);

    cnf = new JButton("CONFIRM");
    cnf.setBounds(470, 370, 90, 30);
    cnf.setBackground(new Color(63, 161, 251));
    // cnf.setForeground(Color.WHITE);
    cnf.addActionListener(this);
    panel.add(cnf);

    can = new JButton("Cancel");
    can.setBounds(570, 370, 80, 30);
    can.setBackground(new Color(63, 161, 251));
    can.addActionListener(this);
    panel.add(can);

    back = new JButton("Back");
    back.setBounds(700, 700, 70, 40);
    back.setBackground(new Color(63, 161, 251));
    // back.setForeground(Color.WHITE);
    back.addActionListener(this);
    panel.add(back);

    checkbox = new ButtonGroup();
    checkbox.add(cbr1);
    checkbox.add(cbr2);
    checkbox.add(cbr3);
    checkbox.add(cbr4);
    checkbox.add(cbr5);

    jt = new JTable() {
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
    DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) jt.getDefaultRenderer(Object.class);
    renderer.setHorizontalAlignment(SwingConstants.CENTER);
    JTableHeader th = jt.getTableHeader();
    // th.setBackground(new Color(170,168,170));
    th.setBackground(Color.DARK_GRAY);
    th.setForeground(Color.WHITE);
    Object[] columns = { "ROOM NO", "COUNT" };
    model = new DefaultTableModel();
    model.setColumnIdentifiers(columns);
    jt.setModel(model);

    JScrollPane sp = new JScrollPane(jt);
    sp.setBounds(460, 420, 230, 190);
    panel.add(sp);
    validate();

    this.setVisible(true);
    this.setLocationRelativeTo(null);
  }

  public void countroom() {
    try {
      File f1 = new File("F:\\vscode practises\\My Project\\MyHostelexperiment\\meeeeee\\TXTFILES\\Save.txt"); // Creation
                                                                                                               // of
                                                                                                               // File
                                                                                                               // Descriptor
                                                                                                               // for
                                                                                                               // input
                                                                                                               // file
      FileReader fr = new FileReader(f1); // Creation of File Reader object
      BufferedReader br = new BufferedReader(fr); // Creation of BufferedReader object
      String[] words = null; // Intialize the word Array
      String s;
      // String input="hi"; // Input word to be searched

      int count1 = 0;
      int count2 = 0;
      int count3 = 0;
      int count4 = 0;
      int count5 = 0;
      int count6 = 0;
      int count7 = 0;
      int count8 = 0;
      int count9 = 0;
      int count10 = 0;
      while ((s = br.readLine()) != null) // Reading Content from the file
      {
        words = s.split(" "); // Split the word using space
        for (String word : words) {
          if (word.equals(s1)) // Search for the given word
          {
            count1++; // If Present increase the count by one
          }
        }
        for (String word : words) {
          if (word.equals(s2)) // Search for the given word
          {
            count2++; // If Present increase the count by one
          }
        }
        for (String word : words) {
          if (word.equals(s3)) // Search for the given word
          {
            count3++; // If Present increase the count by one
          }
        }
        for (String word : words) {
          if (word.equals(s4)) // Search for the given word
          {
            count4++; // If Present increase the count by one
          }
        }
        for (String word : words) {
          if (word.equals(s5)) // Search for the given word
          {
            count5++; // If Present increase the count by one
          }
        }
        for (String word : words) {
          if (word.equals(s6)) // Search for the given word
          {
            count6++;
            if (count6 >= 3) {
              cbr1.setEnabled(false);
            } // If Present increase the count by one
          }
        }
        for (String word : words) {
          if (word.equals(s7)) // Search for the given word
          {
            count7++;
            if (count7 >= 3) {
              cbr2.setEnabled(false);
            } // If Present increase the count by one
          }
        }
        for (String word : words) {
          if (word.equals(s8)) // Search for the given word
          {
            count8++;
            if (count8 >= 3) {
              cbr3.setEnabled(false);
            } // If Present increase the count by one
          }
        }
        for (String word : words) {
          if (word.equals(s9)) // Search for the given word
          {
            count9++;
            if (count9 >= 3) {
              cbr4.setEnabled(false);
            } // If Present increase the count by one
          }
        }
        for (String word : words) {
          if (word.equals(s10)) // Search for the given word
          {
            count10++;
            if (count10 >= 3) {
              cbr5.setEnabled(false);
            } // If Present increase the count by one
          }
        }
      }
      // String [] data={s1,count+""};
      model.addRow(new Object[] { s1, count1 });
      model.addRow(new Object[] { s2, count2 });
      model.addRow(new Object[] { s3, count3 });
      model.addRow(new Object[] { s4, count4 });
      model.addRow(new Object[] { s5, count5 });
      model.addRow(new Object[] { s6, count6 });
      model.addRow(new Object[] { s7, count7 });
      model.addRow(new Object[] { s8, count8 });
      model.addRow(new Object[] { s9, count9 });
      model.addRow(new Object[] { s10, count10 });

      /*
       * if(count!=0) //Check for count not equal to zero
       * {
       * System.out.println("The given word is present for "+count+
       * " Times in the file");
       * }
       * else
       * {
       * System.out.println("The given word is not present in the file");
       * }
       */

      fr.close();
    } catch (IOException ae) {
      ae.printStackTrace();
    }
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    if (cbr1.isSelected() && e.getSource() == cnf) {
      // this.dispose();
      String str = br6.getText();
      ar1.setVisible(false);
      br6.setVisible(true);
      br6.setText("Room6");
      cbr1.setVisible(false);
      checkbox.clearSelection();
      this.dispose();
      Room4 r4 = new Room4(this);
      r4.setVisible(true);
      r4.my_update(str);
      r4.readroom();

    }

    else if (cbr2.isSelected() && e.getSource() == cnf) {
      ar2.setVisible(false);
      String str = br7.getText();
      br7.setVisible(true);
      br7.setText("Room7");
      cbr2.setVisible(false);
      checkbox.clearSelection();
      this.dispose();
      Room4 r4 = new Room4(this);
      // r4.my_update(str);
      r4.setVisible(true);
      r4.my_update(str);
      r4.readroom();
    }

    else if (cbr3.isSelected() && e.getSource() == cnf) {
      ar3.setVisible(false);
      String str = br8.getText();
      br8.setVisible(true);
      br8.setText("Room8");
      cbr3.setVisible(false);
      checkbox.clearSelection();
      this.dispose();
      Room4 r4 = new Room4(this);
      // r4.my_update(str);
      r4.setVisible(true);
      r4.my_update(str);
      r4.readroom();
    }

    else if (cbr4.isSelected() && e.getSource() == cnf) {
      ar4.setVisible(false);
      String str = br9.getText();
      br9.setVisible(true);
      br9.setText("Room9");
      cbr4.setVisible(false);
      checkbox.clearSelection();
      this.dispose();
      Room4 r4 = new Room4(this);
      // r4.my_update(str);
      r4.setVisible(true);
      r4.my_update(str);
      r4.readroom();
    }

    else if (cbr5.isSelected() && e.getSource() == cnf) {
      ar5.setVisible(false);
      String str = br10.getText();
      br10.setVisible(true);
      br10.setText("Room10");
      cbr5.setVisible(false);
      checkbox.clearSelection();
      this.dispose();
      Room4 r4 = new Room4(this);
      // r4.my_update(str);
      r4.setVisible(true);
      r4.my_update(str);
      r4.readroom();
    }

    else if (e.getSource() == back) {
      a.setVisible(true);
      this.setVisible(false);
      // this.dispose();

    } else if (e.getSource() == can) {
      checkbox.clearSelection();
      // cbr2.setSelected(false);
      // cbr3.setSelected(false);
      // cbr4.setSelected(false);
      // cbr5.setSelected(false);
      // br6.setVisible(true);
    }
  }
}
