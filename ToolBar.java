import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ToolBar extends JPanel
{
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(new Color(190, 191, 188));
        g2.fillRect(0, 0, this.getWidth(), this.getHeight());
   
    }
}