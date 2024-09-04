import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConvertorAppSwing extends JFrame {
    private JComboBox<String> fromCurrencyCombo;
    private JComboBox<String> toCurrencyCombo;
    private JTextField amountField;
    private JLabel resultLabel;

    private CurrencyManager currencyManager;

    public ConvertorAppSwing() {
        currencyManager = new CurrencyManager();
        setTitle("Currency Converter - Welcome, Armaan!");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());

        // Blue theme colors and font
        Color backgroundColor = new Color(0x2a2b2a);
        Color buttonColor = new Color(0x5A9BD5);
        Color textColor = Color.WHITE;
        Font customFont = new Font("Arial", Font.BOLD, 14);

        // Setting background color
        getContentPane().setBackground(backgroundColor);

        // Greeting label
        JLabel greetingLabel = new JLabel("Hello, Armaan! Convert currencies easily:");
        greetingLabel.setForeground(textColor);
        greetingLabel.setFont(customFont);

        // Labels and combo boxes
        JLabel fromLabel = new JLabel("From Currency:");
        fromLabel.setForeground(textColor);
        fromLabel.setFont(customFont);

        fromCurrencyCombo = new JComboBox<>(currencyManager.getCurrencyNames());
        fromCurrencyCombo.setFont(customFont);

        JLabel toLabel = new JLabel("To Currency:");
        toLabel.setForeground(textColor);
        toLabel.setFont(customFont);

        toCurrencyCombo = new JComboBox<>(currencyManager.getCurrencyNames());
        toCurrencyCombo.setFont(customFont);

        JLabel amountLabel = new JLabel("Amount:");
        amountLabel.setForeground(textColor);
        amountLabel.setFont(customFont);

        amountField = new JTextField(10);
        amountField.setFont(customFont);

        JButton convertButton = new JButton("Convert");
        convertButton.setBackground(buttonColor);
        convertButton.setForeground(textColor);
        convertButton.setFont(customFont);
        convertButton.addActionListener(new ConvertButtonListener());

        resultLabel = new JLabel("Result: ");
        resultLabel.setForeground(textColor);
        resultLabel.setFont(customFont);

        // Layout setup using GridBagLayout
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        add(greetingLabel, gbc);

        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(fromLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        add(fromCurrencyCombo, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(toLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        add(toCurrencyCombo, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        add(amountLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        add(amountField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        add(convertButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        add(resultLabel, gbc);
    }

    private class ConvertButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                double amount = Double.parseDouble(amountField.getText());
                Currency fromCurrency = currencyManager.getCurrency((String) fromCurrencyCombo.getSelectedItem());
                Currency toCurrency = currencyManager.getCurrency((String) toCurrencyCombo.getSelectedItem());

                Convertor convertor = new Convertor(amount, fromCurrency, toCurrency);
                double result = convertor.convert();
                resultLabel.setText(String.format("Result: %.2f", result));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(ConvertorAppSwing.this, "Invalid amount!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ConvertorAppSwing app = new ConvertorAppSwing();
            app.setVisible(true);
        });
    }
}
