package day5.appletdemo;
import java.applet.*;
import java.awt.*;
public class AppletDemo extends Applet
{
    @Override
    public void start() {
        System.out.println("Start is called..!");
    }

    @Override
    public void init() {
        System.out.println("Init is called...!");
    }

    public void paint(Graphics g)
    {
        System.out.println("Graphics is Called..!");
        g.setFont(new Font("arial",Font.BOLD,18));
        g.setColor(new Color(1234567932));
        g.drawLine(35,35,165,35);
        g.drawString("Sumeet Nathe",33,33);
        g.draw3DRect(28,16,160,30,false);
        showStatus("Attending Capco Training.");
        g.drawOval(100,100,150,150);
        g.fillOval(125,137,22,22);
        g.fillOval(200,137,22,22);
        g.drawArc(140,170,70,50,180,180);
        g.drawArc(130,72,35,80,360,45);
        g.drawArc(150,72,35,80,360,45);
    }

    @Override
    public void stop() {
        System.out.println("Stop is called..!");
    }

    @Override
    public void destroy() {
        System.out.println("destroy is called..!");
    }
}
