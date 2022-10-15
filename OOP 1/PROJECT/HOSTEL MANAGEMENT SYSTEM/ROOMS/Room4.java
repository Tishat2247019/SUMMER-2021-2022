package ROOMS;
import java.lang.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Room4 extends JFrame implements ActionListener {
    JTable jt;
    JTextField name, id, room, rent;
    JLabel n, i, rnum, rv;
    JPanel p;
    JButton add, reset, bak, rem, save, imp;
    Room1 r;
    int a = 0;
    int b = 0;
    int c = 0;
    // Object []row;
    DefaultTableModel model;

    public Room4(Room1 r) {
        super("Room booking");
        this.r = r;

        this.setSize(800, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        Image icon99 = Toolkit.getDefaultToolkit().getImage("hostel-sign-.jpg");
        this.setIconImage(icon99);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

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
        Object[] columns = { "NAME", "ID", "ROOM NO", "RENT" };
        model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        jt.setModel(model);
        jt.setAutoCreateRowSorter(true);
        // model.addRow(new Object[] { "tishat", "123345", "Room3", "5000" });
        // model.addRow(new Object[] {"fj","fj","ajfd","fjda"});

        p = new JPanel();
        p.setBounds(0, 0, 800, 500);
        p.setLayout(null);

        n = new JLabel("NAME :");
        n.setBounds(10, 20, 90, 20);
        p.add(n);

        i = new JLabel("ID :");
        i.setBounds(10, 50, 90, 20);
        p.add(i);

        rnum = new JLabel("Room No :");
        rnum.setBounds(10, 80, 70, 20);
        p.add(rnum);

        rv = new JLabel("Rent :");
        rv.setBounds(10, 110, 70, 20);
        p.add(rv);

        name = new JTextField();
        name.setBounds(90, 18, 120, 25);
        p.add(name);

        id = new JTextField();
        id.setBounds(90, 45, 120, 25);
        p.add(id);

        room = new JTextField();
        room.setBounds(90, 77, 120, 25);
        room.setEditable(false);
        p.add(room);

        rent = new JTextField("5000");
        rent.setBounds(90, 104, 120, 25);
        rent.setEditable(false);
        p.add(rent);

        reset = new JButton("Reset");
        reset.setBounds(115, 140, 80, 40);
        reset.setBackground(new Color(63, 161, 251));
        reset.addActionListener(this);
        p.add(reset);

        bak = new JButton("BACK");
        bak.setBounds(70, 185, 80, 40);
        bak.setBackground(new Color(63, 161, 251));
        bak.addActionListener(this);
        p.add(bak);

        rem = new JButton("REMOVE");
        rem.setBounds(300, 430, 90, 30);
        rem.setBackground(new Color(63, 161, 251));
        rem.addActionListener(this);
        p.add(rem);

        save = new JButton("SAVE");
        save.setBounds(410, 430, 90, 30);
        save.setBackground(new Color(63, 161, 251));
        save.addActionListener(this);
        p.add(save);
        JScrollPane sp = new JScrollPane(jt);
        sp.setBounds(220, 20, 500, 400);
        p.add(sp);
        validate();
        /*
         * imp = new JButton("IMPORT");
         * imp.setBounds(520,430,90,30);
         * imp.addActionListener(this);
         * p.add(imp);
         */

        add = new JButton("ADD");
        add.setBounds(30, 140, 80, 40);
        add.setBackground(new Color(63, 161, 251));
        add.addActionListener(this);
        p.add(add);

        /*
         * add.addActionListener(new ActionListener() {
         * public void actionPerformed(ActionEvent arg0) {
         * row[0]=name.getText();
         * row[1]=id.getText();
         * row[2]=room.getText();
         * row[3]=rent.getText();
         * 
         * model.addRow(row);
         * }
         * });
         */

        this.add(p);
        this.setVisible(true);

    }

    public void my_update(String str) {
        room.setText(str);
    }

    public void readroom() {
        try {
            File file = new File("F:\\vscode practises\\My Project\\MyHostelexperiment\\meeeeee\\TXTFILES\\Save.txt");
            FileReader read = new FileReader(file);
            BufferedReader reader = new BufferedReader(read);
            /*
             * while((line = reader.readLine()) != null)
             * {
             * model.addRow(line.split(", "));
             * }
             */
            // DefaultTableModel model = (DefaultTableModel)jTableImport.getModel();
            Object[] lines = reader.lines().toArray();

            for (int i = 0; i < lines.length; i++) {
                String[] row = lines[i].toString().split(" ");
                model.addRow(row);
            }

            reader.close();
        }

        catch (IOException ae) {
            // JOptionPane.showMessageDialog(null, "Error");
            ae.printStackTrace();

        }
    }

    public void writeroom() {
        try {
            File file = new File("F:\\vscode practises\\My Project\\MyHostelexperiment\\meeeeee\\TXTFILES\\Save.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter writer = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(writer);
            for (int i = 0; i < model.getRowCount(); i++) {
                // int i = model.getRowCount();
                for (int j = 0; j < model.getColumnCount(); j++) {
                    bw.write(model.getValueAt(i, j) + " ");
                }
                // bw.write(model.getValueAt(1, 2));
                // bw.write(model.getValueAt(1,3)+" ");
                bw.write("\r\n");
            }
            bw.close();
            writer.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        /*
         * *if (e.getSource() == add && name.getText().isEmpty() == false &&
         * id.getText().isEmpty() == false
         * && room.getText().isEmpty() == false && rent.getText().isEmpty() == false &&
         * model.getRowCount()<=10) {
         * 
         * 
         * 
         * try{
         * File myfile = new File("Save.txt");
         * FileReader read1 = new FileReader(myfile);
         * BufferedReader reader1 = new BufferedReader(read1);
         * String []wordss=null;
         * String s1 = name.getText();
         * String s2 = id.getText();
         * String s6;
         * while((s6=reader1.readLine())!=null) //Reading Content from the file
         * {
         * wordss=s6.split(" "); //Split the word using space
         * for (String word3 : wordss)
         * {
         * if (word3.equals(s1)) //Search for the given word
         * {
         * ++a; //If Present increase the count by one
         * }
         * }
         * for (String word4 : wordss)
         * {
         * if (word4.equals(s2)) //Search for the given word
         * {
         * ++b; //If Present increase the count by one
         * }
         * }
         * if(a>=1 && b>=1){
         * JOptionPane.showMessageDialog(this.getComponent(0),
         * "Duplicate Student found");
         * this.setLocationRelativeTo(null);
         * }
         * }
         * reader1.close();
         * }
         * catch(IOException ex){
         * ex.printStackTrace();
         * }
         * 
         * }
         */

        if (e.getSource() == add && name.getText().isEmpty() == false && id.getText().isEmpty() == false
                && room.getText().isEmpty() == false && rent.getText().isEmpty() == false && model.getRowCount() <= 10
                && a == 0 && b == 0) {

            int count1 = 0;
            int count2 = 0;
            String s7 = name.getText();
            String s8 = id.getText();
            try {
                File file = new File("F:\\vscode practises\\My Project\\MyHostelexperiment\\meeeeee\\TXTFILES\\DataStudent.txt");
                // File myfile = new File("Save.txt");
                FileReader read = new FileReader(file);
                BufferedReader reader = new BufferedReader(read);
                // FileReader read1 = new FileReader(myfile);
                // BufferedReader reader1 = new BufferedReader(read1);
                String[] words = null;
                String s3;
                while ((s3 = reader.readLine()) != null) // Reading Content from the file
                {
                    words = s3.split(" "); // Split the word using space
                    for (String word : words) {
                        if (word.equals(s7)) // Search for the given word
                        {
                            count1++; // If Present increase the count by one
                        }
                    }
                    for (String wordss : words) {
                        if (wordss.equals(s8)) // Search for the given word
                        {
                            count2++; // If Present increase the count by one
                        }
                    }
                }

                if (count1 >= 1 && count2 >=1) {
                    try {
                        File myfile = new File("F:\\vscode practises\\My Project\\MyHostelexperiment\\meeeeee\\TXTFILES\\Save.txt");
                        FileReader read1 = new FileReader(myfile);
                        BufferedReader reader1 = new BufferedReader(read1);
                        String[] wordss = null;
                        String s1 = name.getText();
                        String s2 = id.getText();
                        String s9 = room.getText();

                        String s6;
                        while ((s6 = reader1.readLine()) != null) // Reading Content from the file
                        {
                            wordss = s6.split(" "); // Split the word using space
                            for (String word3 : wordss) {
                                if (word3.equals(s1)) // Search for the given word
                                {
                                    ++a; // If Present increase the count by one
                                }
                            }
                            for (String word4 : wordss) {
                                if (word4.equals(s2)) // Search for the given word
                                {
                                    ++b; // If Present increase the count by one
                                }
                            }
                            for (String word5 : wordss) {
                                if (word5.equals(s9)) // Search for the given word
                                {
                                    ++c; // If Present increase the count by one
                                }
                            }

                        }
                        if (a == 0 && b == 0 && c <= 2) {
                            Object[] row = new Object[4];
                            row[0] = name.getText();
                            row[1] = id.getText();
                            row[2] = room.getText();
                            row[3] = rent.getText();
                            model.addRow(row);
                            name.setText("");
                            id.setText("");
                            this.writeroom();

                        }

                        else if (a >= 1 && b >= 1) {
                            JOptionPane.showMessageDialog(this.getComponent(0), "Duplicate Student found");
                            this.setLocationRelativeTo(null);
                            --b;
                            --a;

                        } else if (c >= 3) {
                            JOptionPane.showMessageDialog(this.getComponent(0), "one room can have maximum 3 students");
                            this.setLocationRelativeTo(null);
                            c = 0;
                        }

                        reader1.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }

                } else if (count1 == 0 && count2 == 1) {
                    JOptionPane.showMessageDialog(this.getComponent(0), "Student name  does not match");
                    this.setLocationRelativeTo(null);
                } else if (count1 == 1 && count2 == 0) {
                    JOptionPane.showMessageDialog(this.getComponent(0), "Student  id does not match");
                    this.setLocationRelativeTo(null);
                } else if (count1 == 0 && count2 == 0) {
                    JOptionPane.showMessageDialog(this.getComponent(0), "Student name & id does not match");
                    this.setLocationRelativeTo(null);
                }
                reader.close();
            }

            catch (IOException ae) {
                // JOptionPane.showMessageDialog(null, "Error");
                ae.printStackTrace();
            }

        } else if (model.getRowCount() > 10 && e.getSource() == add) {
            JOptionPane.showMessageDialog(this.getComponent(0), "Can not add more rooms");
            this.setLocationRelativeTo(null);
        }

        else if (e.getSource() == reset) {
            name.setText("");
            id.setText("");
            // room.setText("");
            // rent.setText("");
        } else if (e.getSource() == bak) {
            r.setVisible(true);
            // r.countroom();
            this.setVisible(false);
            // this.dispose();
        } else if (e.getSource() == add && name.getText().isEmpty() == true && id.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(this.getComponent(0), "PLEASE INSERT NAME & ID");
            this.setLocationRelativeTo(null);
        } else if (e.getSource() == add && name.getText().isEmpty() == true && id.getText().isEmpty() == false) {
            JOptionPane.showMessageDialog(this.getComponent(0), "PLEASE INSERT NAME");
            this.setLocationRelativeTo(null);
        } else if (e.getSource() == add && name.getText().isEmpty() == false && id.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(this.getComponent(0), "PLEASE INSERT ID");
            this.setLocationRelativeTo(null);
        } else if (e.getSource() == rem) {
            if (jt.getSelectedRow() != -1) {
                // remove selected row from the model
                model.removeRow(jt.getSelectedRow());
                JOptionPane.showMessageDialog(null, "Selected row deleted successfully");
                this.setLocationRelativeTo(null);
                this.writeroom();
                c = 0;
            }
        }

        else if (e.getSource() == save) {
            this.writeroom();
            JOptionPane.showMessageDialog(null, "Data Exported");

        }

        /*
         * public static void main(String []args){
         * Room4 r = new Room4();
         * }
         */

    }
}
