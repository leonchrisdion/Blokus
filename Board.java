import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Board extends JFrame implements MouseListener
{
    JPanel [][] squares;
   
    /** Creates a new instance of ChessBoard */
    public Board()
    {
        Container c = getContentPane();
        c.setLayout(new GridLayout(20,20, 1 , 1));
        squares = new JPanel[20][20];
        for(int i=0; i<20; i++)
        {
            for(int j=0; j<20; j++)
            {
                squares[j] = new JPanel();
                if((i+j)%2 == 0)
                    squares[j].setBackground(Color.white);
                else
                    squares[j].setBackground(Color.black);
                squares[j].addMouseListener(this);
                c.add(squares[j]);
            }
        }
        
    }
    public void mouseClicked(MouseEvent e){ }
    public void mouseEntered(MouseEvent e){ }
    public void mouseExited(MouseEvent e) { }
    public void mousePressed(MouseEvent e) { }
    public void mouseReleased(MouseEvent e) { }
   
    public static void main(String args[])
    {
        Board test = new Board();
        test.setSize(300,300);
        test.setResizable(false);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setVisible(true);
    }
}