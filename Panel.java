import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

public class Panel {
    JFrame window = new JFrame("Blokus");
    JPanel bWindow = new JPanel();//board window
    JPanel pWindow = new JPanel();//pieces window
    JPanel buttonWindow = new JPanel();
    JButton rButton = new JButton("Rotate");
    JButton fhButton = new JButton("Flip Horizontal");
    JButton fvButton = new JButton("Flip Vertical");
    JButton nextButton = new JButton("next");
    JButton previousButton = new JButton("previous");
    

    Panel()
    {
        // panel untuk board
        bWindow.setBackground(Color.WHITE);
        bWindow.setLayout( new GridLayout(20, 20) );
        bWindow.setPreferredSize( new Dimension(540,540) );
        bWindow.setMaximumSize( new Dimension(540,540) );
        bWindow.setBounds(0, 0, 540, 540);
        // Looping untuk  buat board
        for (int i = 0; i < 400; i++) {
            JPanel square = new JPanel( new BorderLayout() );
            bWindow.add( square );
           
            int row = (i / 20) % 2;
            if (row == 0)
            square.setBackground( i % 2 == 0 ? Color.gray : Color.white );
            else
            square.setBackground( i % 2 == 0 ? Color.white : Color.GRAY );
            }
        
        //panel untuk window pieces
        pWindow.setBackground(Color.YELLOW);
        pWindow.setPreferredSize(new Dimension(150,600));
        JScrollPane jsp = new JScrollPane(pWindow);
        jsp.getVerticalScrollBar().setUnitIncrement(Piece.DEFAULT_RESOLUTION / 3);
        //ugly
        jsp.setPreferredSize(new Dimension(Piece.DEFAULT_RESOLUTION - 80, 600));
        

        // panel untuk window tombol 
        buttonWindow.setBackground(Color.BLACK);
        buttonWindow.add(rButton);
        buttonWindow.add(fvButton);
        buttonWindow.add(fhButton);
        buttonWindow.setPreferredSize(new Dimension(600,40));
        buttonWindow.setMaximumSize(new Dimension(600,40));
        rButton.setPreferredSize(new Dimension(120,30));
        fhButton.setPreferredSize(new Dimension(120,30));
        fvButton.setPreferredSize(new Dimension(120,30));

        
        // untuk atur posisi panel
        window.add(bWindow, BorderLayout.CENTER);
        window.add(pWindow, BorderLayout.WEST);
        window.add(buttonWindow, BorderLayout.SOUTH);

        window.setSize(690,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);


    }

    @Override
    public void ActionPerformed(ActionEvent arg0){

    }

    
}