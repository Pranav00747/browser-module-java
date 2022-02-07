import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TitleBar extends JPanel
{
    private String text;
    public TitleBar(String text)
    {
       this.text = text;
       
    }
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setPaint(new GradientPaint(this.getWidth(), this.getHeight()/2,
        new Color(0, 51, 102), this.getWidth(), this.getHeight(), new Color(0, 76, 153)));
        g2.fillRect(0, 0, this.getWidth(), this.getHeight());
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setFont(new Font("Arial", Font.PLAIN, 14));
        g2.setColor(Color.WHITE);
        g2.drawString(this.text, 30, 24);
        g2.setColor(new Color(0, 25, 78));
        g2.drawLine(0, this.getHeight()-1, this.getWidth(), this.getHeight()-1);
        g2.drawImage(Toolkit.getDefaultToolkit().getImage("webbox.png"), 5, 14, 
                12, 12, this);
    }
}