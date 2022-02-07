import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BrowserModule {
    public static void createMain()
    {
        final JFrame f = new JFrame("Browse Module");
        f.setUndecorated(true);
        final int wx = Toolkit.getDefaultToolkit().getScreenSize().width;
        final int hx = Toolkit.getDefaultToolkit().getScreenSize().height;
        f.setBounds(0, 0, wx, hx);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TitleBar tb = new TitleBar("Browser Module");
        tb.setBounds(0, 0, f.getWidth(), 40);
        tb.setVisible(true);
        ToolBar tolb = new ToolBar();
        tolb.setBounds(0, 40, f.getWidth(), 36);
        tolb.setVisible(true);
        final JLabel closeb = new JLabel("x");
        closeb.setFont(new Font("Calibri", Font.PLAIN, 14));
        closeb.setForeground(Color.WHITE);
        closeb.addMouseListener(new MouseAdapter()
        {
           @Override
           public void mouseEntered(MouseEvent e)
           {
               super.mouseEntered(e);
               closeb.setFont(new Font("Calibri", Font.BOLD, 16));
               closeb.setForeground(Color.YELLOW);
           }
            @Override
           public void mouseExited(MouseEvent e)
           {
               super.mouseExited(e);
              closeb.setFont(new Font("Calibri", Font.PLAIN, 14));
              closeb.setForeground(Color.WHITE);
           }
             @Override
           public void mouseClicked(MouseEvent e)
           {
               super.mouseClicked(e);
              f.dispose();
           }
        });
        closeb.setBounds(tb.getWidth()-40, 10, 24, 24);
        closeb.setVisible(true);
        JTextField fd = new JTextField(20);
        fd.setBounds(120, 8, tolb.getWidth()-140, 24);
        fd.setVisible((true));
        final JLabel back = new JLabel("<-");
        back.setFont(new Font("Calirbi", Font.PLAIN, 16));
        back.setForeground(new Color(25, 25, 25));
        back.setBounds(5, 5, 20, 20);
        back.addMouseListener(new MouseAdapter()
        {
           @Override
           public void mouseEntered(MouseEvent e)
           {
               super.mouseEntered(e);
               back.setFont(new Font("Calibri", Font.BOLD, 18));
               back.setForeground(Color.YELLOW);
           }
            @Override
           public void mouseExited(MouseEvent e)
           {
               super.mouseExited(e);
              back.setFont(new Font("Calibri", Font.PLAIN, 16));
              back.setForeground(new Color(25, 25, 25));
           }
        });
        final JLabel forw = new JLabel("->");
        forw.setFont(new Font("Arial", Font.PLAIN, 16));
        forw.setForeground(new Color(25, 25, 25));
        forw.setBounds(45, 5, 20, 20);
        forw.addMouseListener(new MouseAdapter()
        {
           @Override
           public void mouseEntered(MouseEvent e)
           {
               super.mouseEntered(e);
               forw.setFont(new Font("Calibri", Font.BOLD, 18));
               forw.setForeground(Color.YELLOW);
           }
            @Override
           public void mouseExited(MouseEvent e)
           {
               super.mouseExited(e);
              forw.setFont(new Font("Calibri", Font.PLAIN, 16));
              forw.setForeground(new Color(25, 25, 25));
           }
        });
        tb.setLayout(null);
        tolb.setLayout(null);
        tolb.add(fd);
        tolb.add(back);
        tolb.add(forw);
        tb.add(closeb);     
        f.setLayout(null);
        f.add(tb);
        f.add(tolb);
        MenuBar mb = new MenuBar();
        Menu m1 = new Menu("File");
        Menu m2 = new Menu("Help");
        MenuItem mit = new MenuItem("About");
        mit.addActionListener(new ActionListener()
        {
            @Override
         public void actionPerformed(ActionEvent e)  
         {
           final JFrame af  = new JFrame("About");
           af.setUndecorated(true);
           af.setBounds((wx-600)/2, (hx-400)/2, 600, 400);
           JPanel pn = new JPanel();
           pn.setBackground(new Color(0, 51, 102));
           String strs[]= {"This is sample module of Web Box developed by Mr. Pranav", "Hi, this is Pranav founder/creator of this product, I am good" ,
           "person always try to help others if they need help, if you want", 
           "to connect with me follow me on :","GitHub : https://github.com/Pranav00747", "LinkedIn : https://www.linkedin.com/in/pranav-k-80750818b",
           "Contact No : 8275183946"};
           int yx=0;
           pn.setLayout(null);
           JLabel labs[] = new JLabel[7];
           for(int x=0;x<7;x++)
           {
               labs[x] = new JLabel(strs[x]);
               labs[x].setFont(new Font("MS Sans Serif", Font.PLAIN, 12));
               labs[x].setForeground(Color.WHITE);
               labs[x].setBounds(120, yx+20, 400, 20);
               labs[x].setVisible(true);
               pn.add(labs[x]);
               if(x==3)
               {
                   yx+=60;
               }
               else
               {
               yx+=20;
               }
           }
          final JLabel copyright= new JLabel("Copyright of @Pranav (Web Box)");
           copyright.setFont(new Font("Calibri", Font.PLAIN, 12));
           copyright.setForeground(Color.WHITE);
           copyright.setBounds(200, 360, 400, 20);
           copyright.setVisible(true);
           copyright.addMouseListener(new MouseAdapter()
           {
              @Override
           public void mouseEntered(MouseEvent e)
           {
               super.mouseEntered(e);
               copyright.setFont(new Font("Calibri", Font.BOLD, 14));
               copyright.setForeground(Color.YELLOW);
           }
            @Override
           public void mouseExited(MouseEvent e)
           {
               super.mouseExited(e);
              copyright.setFont(new Font("Calibri", Font.PLAIN, 12));
              copyright.setForeground(Color.WHITE);
           }  
           });
           pn.add(copyright);
           af.add(pn);
           af.setVisible(true);
           af.addMouseListener(new MouseAdapter()
           {
               @Override
               public void mouseClicked(MouseEvent e)
               {
                   super.mouseClicked(e);
                   af.dispose();
               }
           });
         }
        });
        m2.add(mit);
        mb.add(m1);
        mb.add(m2);
        f.setMenuBar(mb);
        f.setIconImage((Image)Toolkit.getDefaultToolkit().getImage("webbox.png"));
        f.setVisible(true);
    }
    public static void main(String args[]) throws Exception
    {
        createMain();
    }
}