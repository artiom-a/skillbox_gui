import javax.swing.*;
import java.awt.event.*;
import java.beans.PropertyChangeListener;

public class MainForm {
    private JPanel mainPanel;
    private JTextArea textArea;
    private JButton collapseButton;
    private JButton clearButton;
    private JTextField firstNameArea;
    private JTextField lastNameArea;
    private JTextField middleNameArea;
    private JPanel fioFieldPanel;

    public MainForm() {
        clearButton.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                firstNameArea.setText("");
                lastNameArea.setText("");
                middleNameArea.setText("");
            }
        });
        collapseButton.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = firstNameArea.getText();
                String lastName = lastNameArea.getText();
                String middleName = middleNameArea.getText();
                if (collapseButton.getText().equals("Объединить")) {
                    if (firstName.equals("") || lastName.equals("") || middleName.equals("")) {
                        JOptionPane.showMessageDialog(mainPanel, "Введите данные в поля ввода", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
//                    JOptionPane.showMessageDialog(mainPanel, String.format("%s %s %s", lastName, firstName, middleName), "ФИО", JOptionPane.PLAIN_MESSAGE);
                        textArea.setText(String.format("%s %s %s", lastName, firstName, middleName));
                        textArea.setVisible(true);
                        collapseButton.setText("Разделить");
                    }
                } else {
                    String[] fioArray = textArea.getText().split(" ");
                    if (fioArray.length == 3) {
                        firstNameArea.setText(fioArray[1]);
                        lastNameArea.setText(fioArray[0]);
                        middleNameArea.setText(fioArray[2]);
                        textArea.setVisible(false);
                        collapseButton.setText("Объединить");
                    } else {
                        JOptionPane.showMessageDialog(mainPanel, "Ошибка", "Ошибка ввода", JOptionPane.ERROR_MESSAGE);
                    }

                }
            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
