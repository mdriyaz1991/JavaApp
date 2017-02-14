package Test;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class TitledExample extends JPanel {

  public TitledExample() {
    super(true);

    this.setLayout(new GridLayout(1, 1, 5, 5));

    JLabel label = new JLabel("Titled Border");
    label.setHorizontalAlignment(JLabel.CENTER);

    TitledBorder titled = new TitledBorder("Title");
    label.setBorder(titled);

    add(label);
  }

  public static void main(String s[]) {
    JFrame frame = new JFrame("Borders");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(200, 100);
    frame.setContentPane(new TitledExample());
    frame.setVisible(true);
  }
}

