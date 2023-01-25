import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

class Main extends JFrame {
    private JButton randomButton;
    private JComboBox<String> countryComboBox;
    private JLabel resultLabel;

    public Main() {
        setTitle("REA");
        setSize(490, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        randomButton = new JButton("Jak moc jsem rasista od 1 do 10");
        countryComboBox = new JComboBox<String>();
        resultLabel = new JLabel();
// mega echt
        randomButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random rand = new Random();
                int randomNumber = rand.nextInt(100) + 1;
                resultLabel.setText(Integer.toString(randomNumber));
            }
        });

        countryComboBox.addItem("jaký čin jste spáchal");
        countryComboBox.addItem("Hate Crime");
        countryComboBox.addItem("Brutální ubodání");
        countryComboBox.addItem("Poslán na Floridu");
        countryComboBox.addItem("Jsem člen Ku Klux Klanu");
        countryComboBox.addItem("Lynčování");
        countryComboBox.addItem("šikana s následkem sebevraždy");

        countryComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedCountry = (String) countryComboBox.getSelectedItem();
                switch (selectedCountry) {
                    case "Hate Crime":
                        resultLabel.setText("pade na pade že si půjdeš na chvilku posedět do vězení");
                        break;
                    case "Brutální ubodání":
                        resultLabel.setText("Pravděpodobně si jdeš sednout...na elektrický křeslo");
                        break;
                    case "Poslán na Floridu":
                        resultLabel.setText("Takhle krutej bejt nemůžeš");
                        break;
                    case "Jsem člen Ku Klux Klanu":
                        resultLabel.setText("Kde podám přihlášku?");
                        break;
                    case "Lynčování":
                        resultLabel.setText("Záleží pokud jsi negra ubil na smrt nebo jenom do němoty..ale i tak jdeš do vězení");
                        break;
                    case "šikana s následkem sebevraždy":
                        resultLabel.setText("když na tebe příjdou tak máš na triku v podstatě dohnání k sebevraždě a budeš ve vězení dlooooouuuuho");

                    default:
                        resultLabel.setText("Vyberte váš čin který jste spáchal");
                        break;
                }
            }
        });

        add(randomButton);
        add(countryComboBox);
        add(resultLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
