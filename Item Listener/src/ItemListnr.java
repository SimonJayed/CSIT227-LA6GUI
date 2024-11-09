import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemListnr extends JFrame {
    private JPanel jpanel;
    private JCheckBox cCheckBox;
    private JCheckBox cppCheckBox;
    private JCheckBox cSharpCheckBox;
    private JCheckBox javaCheckBox;
    private JCheckBox pythonCheckBox;
    private JComboBox proficiencyComboBox;
    private JLabel languageLabel;
    private JLabel proficiencyLabel;

    public ItemListnr() {
        proficiencyComboBox.addItem("Low");
        proficiencyComboBox.addItem("Medium");
        proficiencyComboBox.addItem("High");

        JCheckBox[] checkBoxes = {cCheckBox, cppCheckBox, cSharpCheckBox, javaCheckBox, pythonCheckBox};

        for (JCheckBox cb : checkBoxes) {
            cb.addItemListener(new ItemListener() {
                public void itemStateChanged(ItemEvent e) {
                    StringBuilder selectedLanguages = new StringBuilder();
                    for (JCheckBox box : checkBoxes) {
                        if (box.isSelected()) {
                            selectedLanguages.append(box.getText()).append(" ");
                        }
                    }
                    languageLabel.setText(selectedLanguages.toString());
                }
            });
        }

        proficiencyComboBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                String proficiency = (String) proficiencyComboBox.getSelectedItem();
                proficiencyLabel.setText(proficiency);
            }
        });
    }

    public static void main(String[] args) {
        ItemListnr app = new ItemListnr();
        app.setTitle("Item Listener");
        app.setContentPane(app.jpanel);
        app.setSize(400, 400);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
