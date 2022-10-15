import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
public class BrowseImage extends JFrame
{
  JLabel l;
    
  public BrowseImage()
  {
    super("Display an image from a JFileChooser");
    JButton btn = new JButton("Browse");
    btn.setBounds(150,310,100,40);
    l = new JLabel();
    l.setBounds(10,10,365,290);
    add(btn);
    add(l);
    
    btn.addActionListener(new ActionListener() 
    {
      public void actionPerformed(ActionEvent e) 
      {
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        //filtering files
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","jpg","png");
        file.addChoosableFileFilter(filter);
        int res = file.showSaveDialog(null);
        //if the user clicks on save in Jfilechooser
        if(res == JFileChooser.APPROVE_OPTION){
          File selFile = file.getSelectedFile();
          String path = selFile.getAbsolutePath();
          l.setIcon(resize(path));
        }
      }
    });
    
    setLayout(null);
    setLocationRelativeTo(null);
    setSize(400,400);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
     
  // Method to resize the image with the same size of the Jlabel
  public ImageIcon resize(String imgPath)
  {
    ImageIcon path = new ImageIcon(imgPath);
    Image img = path.getImage();
    Image newImg = img.getScaledInstance(l.getWidth(), l.getHeight(), Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(newImg);
    return image;
  }
    
  public static void main(String[] args){
    new BrowseImage();
  }
}