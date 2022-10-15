package FOODS;

import java.lang.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.ChangeEvent;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import ADMIN.Admin;

public class Confirm1 extends JFrame implements ActionListener {
	JPanel p;
	JLabel bg, sm, name, id, roomno, rice, dal, veg, ruti, meat, fish;
	JTextField n, i, rn, ai;
	JButton select, back, remove;
	JSpinner f1, f2, f3, f4, f5, f6;
	SpinnerModel m1, m2, m3, m4, m5, m6;
	JRadioButton r1, r2, r3, r4, r5, r6;
	ImageIcon img;
	Font font;
	Color c;
	JTable jt;
	DefaultTableModel model;
	Admin a;

	public Confirm1(Admin a) {

		super("Confirm Meal");
		this.setSize(700, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(null);

		Image icon = Toolkit.getDefaultToolkit().getImage("hostel-sign-.jpg");
		this.setIconImage(icon);
		this.setLocationRelativeTo(null);
		this.setVisible(true);

		p = new JPanel();
		p.setBounds(0, 0, 700, 600);
		p.setLayout(null);
		bg = new JLabel(new ImageIcon("bg11.png"));
		bg.setBounds(00, 00, 700, 600);
		p.add(bg);

		Object[] column = { "ROOM NO", "Meal", "Quantity" };
		model = new DefaultTableModel();
		model.setColumnIdentifiers(column);
		jt = new JTable();
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
		jt.setModel(model);

		JScrollPane js = new JScrollPane(jt);
		js.setBounds(10, 240, 670, 270);
		bg.add(js);
		validate();

		sm = new JLabel("Select Meal");
		sm.setBounds(290, 20, 120, 20);
		font = new Font("Rockwell", Font.BOLD, 18);
		sm.setFont(font);
		c = new Color(255, 255, 255);
		sm.setForeground(c);
		bg.add(sm);

		/*
		 * name = new JLabel("Name:");
		 * name.setBounds(15,60,60,20);
		 * font = new Font ("Dialog" , Font.BOLD, 14);
		 * name.setFont(font);
		 * c = new Color(255, 255, 255);
		 * name.setForeground(c);
		 * bg.add(name);
		 */

		/*
		 * n = new JTextField();
		 * n.setBounds(85,55,120,30);
		 * bg.add(n);
		 */

		/*
		 * id = new JLabel("ID:");
		 * id.setBounds(15,105,90,20);
		 * font = new Font ("Dialog" , Font.BOLD, 14);
		 * id.setFont(font);
		 * c = new Color(255, 255, 255);
		 * id.setForeground(c);
		 * bg.add(id);
		 */

		/*
		 * i = new JTextField();
		 * i.setBounds(85,100,120,30);
		 * bg.add(i);
		 */

		roomno = new JLabel("Room No:");
		roomno.setBounds(15, 105, 90, 20);
		font = new Font("Dialog", Font.BOLD, 14);
		roomno.setFont(font);
		c = new Color(255, 255, 255);
		roomno.setForeground(c);
		bg.add(roomno);

		rn = new JTextField();
		rn.setBounds(85, 100, 120, 30);
		bg.add(rn);

		// Select Rice
		m1 = new SpinnerNumberModel(
				0,
				0,
				5,
				1);

		JSpinner f1 = new JSpinner(m1);
		f1.setBounds(460, 190, 100, 25);
		bg.add(f1);

		rice = new JLabel("Rice:");
		rice.setBounds(280, 60, 90, 20);
		font = new Font("Dialog", Font.BOLD, 14);
		rice.setFont(font);
		c = new Color(255, 255, 255);
		rice.setForeground(c);
		bg.add(rice);

		r1 = new JRadioButton("Rice:");
		r1.setBounds(330, 60, 20, 20);
		bg.add(r1);

		/*
		 * f1.addChangeListener(new ChangeListener() {
		 * public void stateChanged(ChangeEvent e) {
		 * rice.setText("Rice:" + ((JSpinner) e.getSource()).getValue());
		 * }
		 * });
		 */
		/*
		 * // Select Dal
		 * m2 = new SpinnerNumberModel(
		 * 0,
		 * 0,
		 * 5,
		 * 1);
		 * 
		 * JSpinner f2 = new JSpinner(m2);
		 * f2.setBounds(365, 100, 50, 25);
		 * bg.add(f2);
		 */

		dal = new JLabel("Dal:");
		dal.setBounds(280, 100, 90, 20);
		font = new Font("Dialog", Font.BOLD, 14);
		dal.setFont(font);
		c = new Color(255, 255, 255);
		dal.setForeground(c);
		bg.add(dal);

		r2 = new JRadioButton("Dal:");
		r2.setBounds(330, 100, 20, 20);
		bg.add(r2);

		/*
		 * f2.addChangeListener(new ChangeListener() {
		 * public void stateChanged(ChangeEvent e) {
		 * dal.setText("Dal:" + ((JSpinner) e.getSource()).getValue());
		 * }
		 * });
		 * 
		 * // Select Vegetable
		 * m3 = new SpinnerNumberModel(
		 * 0,
		 * 0,
		 * 5,
		 * 1);
		 * 
		 * JSpinner f3 = new JSpinner(m3);
		 * f3.setBounds(365, 140, 50, 25);
		 * bg.add(f3);
		 */

		veg = new JLabel("Vegetable:");
		veg.setBounds(280, 140, 90, 20);
		font = new Font("Dialog", Font.BOLD, 14);
		veg.setFont(font);
		c = new Color(255, 255, 255);
		veg.setForeground(c);
		bg.add(veg);

		r3 = new JRadioButton("Vegetable:");
		r3.setBounds(360, 140, 20, 20);
		bg.add(r3);

		/*
		 * f3.addChangeListener(new ChangeListener() {
		 * public void stateChanged(ChangeEvent e) {
		 * veg.setText("Vegetable:" + ((JSpinner) e.getSource()).getValue());
		 * }
		 * });
		 * 
		 * // Select Ruti
		 * m4 = new SpinnerNumberModel(
		 * 0,
		 * 0,
		 * 5,
		 * 1);
		 * 
		 * JSpinner f4 = new JSpinner(m4);
		 * f4.setBounds(545, 60, 50, 25);
		 * bg.add(f4);
		 */

		ruti = new JLabel("Ruti:");
		ruti.setBounds(460, 60, 90, 20);
		font = new Font("Dialog", Font.BOLD, 14);
		ruti.setFont(font);
		c = new Color(255, 255, 255);
		ruti.setForeground(c);
		bg.add(ruti);

		r4 = new JRadioButton("Ruti:");
		r4.setBounds(520, 60, 20, 20);
		r4.setForeground(Color.WHITE);
		bg.add(r4);

		/*
		 * f4.addChangeListener(new ChangeListener() {
		 * public void stateChanged(ChangeEvent e) {
		 * ruti.setText("Ruti:" + ((JSpinner) e.getSource()).getValue());
		 * }
		 * });
		 * 
		 * // Select Meat
		 * m5 = new SpinnerNumberModel(
		 * 0,
		 * 0,
		 * 5,
		 * 1);
		 * 
		 * JSpinner f5 = new JSpinner(m5);
		 * f5.setBounds(545, 100, 50, 25);
		 * bg.add(f5);
		 */
		meat = new JLabel("Meat:");
		meat.setBounds(460, 100, 90, 20);
		font = new Font("Dialog", Font.BOLD, 14);
		meat.setFont(font);
		c = new Color(255, 255, 255);
		meat.setForeground(c);
		bg.add(meat);

		r5 = new JRadioButton("Meat:");
		r5.setBounds(520, 100, 20, 20);
		bg.add(r5);

		/*
		 * f5.addChangeListener(new ChangeListener() {
		 * public void stateChanged(ChangeEvent e) {
		 * meat.setText("Meat:" + ((JSpinner) e.getSource()).getValue());
		 * }
		 * });
		 * 
		 * // Select Fish
		 * m6 = new SpinnerNumberModel(
		 * 0,
		 * 0,
		 * 5,
		 * 1);
		 * 
		 * JSpinner f6 = new JSpinner(m6);
		 * f6.setBounds(545, 140, 50, 25);
		 * bg.add(f6);
		 */

		fish = new JLabel("Fish:");
		fish.setBounds(460, 140, 90, 20);
		font = new Font("Dialog", Font.BOLD, 14);
		fish.setFont(font);
		c = new Color(255, 255, 255);
		fish.setForeground(c);
		bg.add(fish);

		r6 = new JRadioButton("Fish:");
		r6.setBounds(520, 140, 20, 20);
		bg.add(r6);

		/*
		 * f6.addChangeListener(new ChangeListener() {
		 * public void stateChanged(ChangeEvent e) {
		 * fish.setText("Fish:" + ((JSpinner) e.getSource()).getValue());
		 * }
		 * });
		 */

		veg = new JLabel("Add new Item:");
		veg.setBounds(280, 170, 150, 20);
		font = new Font("Dialog", Font.BOLD, 14);
		veg.setFont(font);
		c = new Color(255, 255, 255);
		veg.setForeground(c);
		bg.add(veg);

		ai = new JTextField();
		ai.setBounds(280, 190, 120, 25);
		bg.add(ai);

		select = new JButton("ADD");
		select.setBounds(85, 190, 80, 35);
		select.addActionListener(this);
		font = new Font("Rockwell", Font.BOLD, 15);
		select.setFont(font);
		c = new Color(255, 255, 255);
		select.setBackground(c);
		bg.add(select);

		back = new JButton("Back");
		back.setBounds(500, 520, 80, 35);
		back.addActionListener(this);
		font = new Font("Rockwell", Font.BOLD, 15);
		back.setFont(font);
		c = new Color(255, 255, 255);
		back.setBackground(c);
		bg.add(back);

		remove = new JButton("REMOVE");
		remove.setBounds(85, 520, 100, 35);
		remove.addActionListener(this);
		font = new Font("Rockwell", Font.BOLD, 15);
		remove.setFont(font);
		c = new Color(255, 255, 255);
		remove.setBackground(c);
		bg.add(remove);

		this.a = a;
		this.add(p);
		this.setVisible(true);

	}

	public void writeFood() {
		try {
			File file = new File(
					"F:\\VSCODE\\My Project\\MyHostelexperiment\\meeeeee\\TXTFILES\\Confirm.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter writer = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(writer);
			for (int i = 0; i < model.getRowCount(); i++) {
				for (int j = 0; j < model.getColumnCount(); j++) {
					bw.write(model.getValueAt(i, j) + " ");
				}
				bw.write("\r\n");
			}
			bw.close();
			writer.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void readFood() {
		try {
			File file = new File(
					"F:\\VSCODE\\My Project\\MyHostelexperiment\\meeeeee\\TXTFILES\\Confirm.txt");
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == select && rn.getText().isEmpty() == false && r1.isSelected() == false
				&& r2.isSelected() == false && r3.isSelected() == false && r4.isSelected() == false
				&& r5.isSelected() == false && r6.isSelected() == false && ai.getText().isEmpty() == true) {
			JOptionPane.showMessageDialog(null, "Please Select atleast 1 Meal");

		}
		if (e.getSource() == select && rn.getText().isEmpty() == true) {
			JOptionPane.showMessageDialog(null, "Please imput ROOM NO");
		}
		if (e.getSource() == select && ai.getText().isEmpty() == false && rn.getText().isEmpty() == false /*
																											 * && r1.
																											 * isSelected
																											 * ()==false
																											 * && r2.
																											 * isSelected
																											 * ()==false
																											 * && r3.
																											 * isSelected
																											 * ()==false
																											 * && r4.
																											 * isSelected
																											 * ()==false
																											 * && r5.
																											 * isSelected
																											 * ()==false
																											 * && r6.
																											 * isSelected
																											 * ()==false
																											 */ ) {
			Object[] row = new Object[3];
			row[0] = rn.getText();
			row[1] = ai.getText();
			row[2] = m1.getValue().toString();
			model.addRow(row);
			this.writeFood();

			rn.setText("");

			ai.setText("");

		}
		if (e.getSource() == select && rn.getText().isEmpty() == false && ai.getText().isEmpty() == true) {
			String s1 = "", s2 = "", s3 = "", s4 = "", s5 = "", s6 = "";
			int count = 0;

			if (r1.isSelected()) {
				s1 = "RICE";
				count++;
			}
			if (r2.isSelected()) {
				s2 = "DAL";
				count++;
			}
			if (r3.isSelected()) {
				s3 = "VEGETABLE";
				count++;
			}
			if (r4.isSelected()) {
				s4 = "RUTI";
				count++;
			}
			if (r5.isSelected()) {
				s5 = "MEAT";
				count++;
			}
			if (r6.isSelected()) {
				s6 = "FISH";
				count++;
			}
			// String m = s1+" "+" "+s2+" "+s3+" "+s4+" "+s5+" "+s6+" ";
			String m = s1 + " " + s2 + s3 + s4 + s5 + s6;
			Object[] row = new Object[3];
			row[0] = rn.getText();
			row[1] = m;
			row[2] = m1.getValue().toString();
			model.addRow(row);
			this.writeFood();
			rn.setText("");
			// i.setText("");
			// rn.setText("");

		}
		/*
		 * if(e.getSource()==select && n.getText().isEmpty()==true &&
		 * i.getText().isEmpty()==false & rn.getText().isEmpty()==false){
		 * JOptionPane.showMessageDialog(null,"Please imput Name" );
		 * }
		 * if(e.getSource()==select && n.getText().isEmpty()==false &&
		 * i.getText().isEmpty()==true & rn.getText().isEmpty()==false){
		 * JOptionPane.showMessageDialog(null,"Please imput ID" );
		 * }
		 */
		/*
		 * if(e.getSource()==select && n.getText().isEmpty()==true &&
		 * i.getText().isEmpty()==true & rn.getText().isEmpty()==false){
		 * JOptionPane.showMessageDialog(null,"Please imput Name & ID" );
		 * }
		 * if(e.getSource()==select && n.getText().isEmpty()==true &&
		 * i.getText().isEmpty()==false & rn.getText().isEmpty()==true){
		 * JOptionPane.showMessageDialog(null,"Please imput Name & ROOM NO" );
		 * }
		 * if(e.getSource()==select && n.getText().isEmpty()==false &&
		 * i.getText().isEmpty()==true & rn.getText().isEmpty()==true){
		 * JOptionPane.showMessageDialog(null,"Please imput ID & ROOM NO" );
		 * }
		 */
		else if (e.getSource() == remove) {
			if (jt.getSelectedRow() != -1) {
				model.removeRow(jt.getSelectedRow());
				JOptionPane.showMessageDialog(null, "Selected row deleted successfully");
				this.setLocationRelativeTo(null);
				this.writeFood();

			}
		} else if (e.getSource() == back) {
			a.setVisible(true);
			this.setVisible(false);
		}
	}

}
