import javax.swing.*;
import java.awt.*;

/**
 * Created by E0660645 on 3/6/2017.
 */
public class MyFrame extends JFrame
{
    private int count;
    private double radius;
    private double totalPerimeter;
    private double totalArea;
    private double averagePerimeter;
    private double averageArea;
    private String strInput;


    public MyFrame()
    {
        strInput  =  JOptionPane.showInputDialog("Enter the number of circles you want:");

        count =  Integer.parseInt(strInput);

        radius = 0.0;

        for(int i = 0; i < count; i++)
        {
            strInput = JOptionPane.showInputDialog(String.format("Enter an radius for circle #%d:", i+1));

            radius += Double.parseDouble(strInput);
        }

        totalPerimeter = 2 * Math.PI * radius;
        totalArea = Math.PI * radius * radius;

        averagePerimeter = totalPerimeter / count;
        averageArea = totalArea / count;
    }

    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        g.drawString(String.format("Total perimeter for all circles is: %.2f", totalPerimeter),  25, 200 );
        g.drawString(String.format("Total area for all circles is: %.2f", totalArea),  25, 250 );
        g.drawString(String.format("Average perimeter for all circles is: %.2f", averagePerimeter),  25, 300 );
        g.drawString(String.format("Average area for all circles is: %.2f", averageArea),  25, 350 );

    }
}
