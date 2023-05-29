import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversoresForm extends JFrame{
    private JLabel valor;
    public JTextField textValor;
    private JLabel Moeda;
    public JComboBox CBMoeda;
    public JLabel Resultado;
    private JButton converterButton;
    public JPanel formConversores;
    private JTextField textResultado;

    public ConversoresForm() {
        converterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double valorConvertido = 0d;
                if (CBMoeda.getSelectedIndex() == 0) {
                    valorConvertido = Double.valueOf(textValor.getText()) / 5;
                    textResultado.setText(valorConvertido.toString());
                }
                    else if (CBMoeda.getSelectedIndex() == 1) {
                    valorConvertido = Double.valueOf(textValor.getText()) / 6;
                    textResultado.setText(valorConvertido.toString());
                }
                        else if (CBMoeda.getSelectedIndex() == 2) {
                            valorConvertido = Double.valueOf(textValor.getText()) / 7;
                            textResultado.setText(valorConvertido.toString());
                        }
            }
        });
    }
}