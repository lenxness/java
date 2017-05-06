import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.lang.annotation.Target;

public class newgame extends JPanel{
    private JPanel StartPanel, TargetPanel, WorkingPanel;
    private JLabel karta0, karta1,karta2;
    //Card skuska = new Card(ColorCard.DIAMONDS,10);
        public newgame() throws IOException {
            GridBagLayout layout = new GridBagLayout();
            GridBagConstraints gbc = new GridBagConstraints();

            this.setBackground(new Color(34, 60, 25));
            this.setLayout(layout);
            this.setSize(1200,600);

            Card skuska0 = new Card(ColorCard.CLUBS,10);
            karta0 = new JLabel();
            karta0.setIcon(new ImageIcon(skuska0.image));

            Card skuska1 = new Card(ColorCard.DIAMONDS,10);
            karta1 = new JLabel();
            karta1.setIcon(new ImageIcon(skuska1.image));

            Card skuska2 = new Card(ColorCard.SPADES,1);
            karta2 = new JLabel();
            karta2.setIcon(new ImageIcon(skuska2.image));

            StartPanel = new JPanel();
            FlowLayout startLayout = new FlowLayout();
            gbc.gridx = 0;
            gbc.gridy = 0;
            StartPanel.setBackground(new Color(191, 16, 22));
            StartPanel.setSize(1000,500);
            StartPanel.setLayout(startLayout);
            StartPanel.add(karta0);
            this.add(StartPanel,gbc);

            TargetPanel = new JPanel();
            FlowLayout targetLayout = new FlowLayout();
            gbc.gridx = 1;
            gbc.gridy = 0;
            TargetPanel.setBackground(new Color(237, 230, 25));
            TargetPanel.setLayout(targetLayout);
            TargetPanel.add(karta1);
            this.add(TargetPanel,gbc);

            WorkingPanel = new JPanel();
            FlowLayout workingLayout = new FlowLayout();
            gbc.gridx = 0;
            gbc.gridy = 1;
            WorkingPanel.setBackground(new Color(28, 118, 179));
            WorkingPanel.setLayout(workingLayout);
            WorkingPanel.add(karta2);
            this.add(WorkingPanel,gbc);
        }
}
