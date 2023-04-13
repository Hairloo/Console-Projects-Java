package Mirea.Fourth;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class BorderExample extends JFrame
{
    JPanel panel = new JPanel();
    GridLayout table = new GridLayout(1, 3);
    JButton milan = new JButton("AC Milan");
    JButton real_madrid = new JButton("Real Madrid");
    JLabel result = new JLabel("Result: 0 x 0", SwingConstants.CENTER);
    JLabel lasScorer = new JLabel("Last Scorer: N/A", SwingConstants.CENTER);
    Label winner = new Label("Winner: DRAW", SwingConstants.TOP);
    int realGoals = 0;
    int milanGoals = 0;
    public BorderExample()
    {
        super("Match");
        setSize(800,600);
        setLayout(new BorderLayout());
        result.setFont(new Font("Courier", Font.BOLD, 50));
        winner.setFont(new Font("Courier", Font.BOLD, 50));
        lasScorer.setFont(new Font("Courier", Font.BOLD, 50));
        milan.setFont(new Font("Courier", Font.BOLD, 20));
        real_madrid.setFont(new Font("Courier", Font.BOLD, 20));
        add(real_madrid, BorderLayout.WEST);
        add(milan, BorderLayout.EAST);
        add(result, BorderLayout.CENTER);
        add(winner, BorderLayout.NORTH);
        add(lasScorer, BorderLayout.SOUTH);
        real_madrid.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                realGoals++;
                if(realGoals > milanGoals){
                    winner.setText("Winner: Real Madrid");
                }
                if(realGoals == milanGoals){
                    winner.setText("Winner: DRAW");
                }
                lasScorer.setText("Last Scorer: Real Madrid");
                result.setText("Result: " + realGoals + " X " + milanGoals);
            }
        });
        milan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanGoals++;
                if(realGoals < milanGoals){
                    winner.setText("Winner: Milan");
                }
                if(realGoals == milanGoals){
                    winner.setText("Winner: DRAW");
                }
                lasScorer.setText("Last Scorer: Milan");
                result.setText("Result: " + realGoals + " X " + milanGoals);
            }
        });
    }
    public static void main(String[]args)
    {
        new BorderExample().setVisible(true);
    }
}
