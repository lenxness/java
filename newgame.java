import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class newgame extends JPanel{
    private JLabel navestie;


        public newgame() throws IOException {
            //super("");
            this.setPreferredSize(new Dimension(1366,768));
            GridBagLayout layout = new GridBagLayout();
            GridBagConstraints gbc = new GridBagConstraints();


            //setLayout(null);
           // GridBagLayout layout = new GridBagLayout();
            //GridBagConstraints gbc = new GridBagConstraints();

            //Container con = getContentPane();
            //DeckOfCards CardDec = new DeckOfCards();
            this.setBackground(new Color(100, 100, 100));

            Card skuska = new Card(ColorCard.CLUBS,10);

            JLabel navestie = new JLabel();
            navestie.setIcon(new ImageIcon(skuska.image));
            this.add(navestie);
        }

}
