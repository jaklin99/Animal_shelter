import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class MainForm {

    private JComboBox cmbSpecies;
    private JList list1;
    private JTextField txtName;
    private JRadioButton femaleRadioButton;
    private JRadioButton maleRadioButton;
    private JTextField txtBadHabits;
    private JButton addAnimalButton;
    private JTextField txtReservor;
    private JButton reserveSelectedAnimalButton;
    private Reservation reservations= new Reservation();
    DefaultListModel defaultListModel;

    private void RefreshControls()
    {
        defaultListModel = new DefaultListModel();
        list1.setModel(defaultListModel);
        //list1.clearSelection();
        for (Animal animal: this.reservations.getAnimals()) {
            defaultListModel.addElement(animal);
        }
        reserveSelectedAnimalButton.setEnabled(list1.getSelectedValue()!=null);
    }

    public MainForm(){
        cmbSpecies.addItem("Cat");
        cmbSpecies.addItem("Dog");
        ButtonGroup btnGroup=new ButtonGroup();
        btnGroup.add(femaleRadioButton);
        btnGroup.add(maleRadioButton);

        addAnimalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Gender gender = maleRadioButton.isSelected() ? Gender.Male : Gender.Female;

                if (cmbSpecies.getSelectedItem().toString() == "Cat")
                {
                    reservations.newCat(
                            txtName.getText(), gender, txtBadHabits.getText());
                }
                else if (cmbSpecies.getSelectedItem().toString() == "Dog")
                {
                    reservations.newDog(txtName.getText(), gender);
                }

                RefreshControls();
            }
        });

        list1.addComponentListener(new ComponentAdapter() {
        });
        list1.addComponentListener(new ComponentAdapter() {
        });
        list1.addComponentListener(new ComponentAdapter() {
        });
        list1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                reserveSelectedAnimalButton.setEnabled(list1.getSelectedValue()!=null);
            }
        });
        reserveSelectedAnimalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal animal = (Animal) list1.getSelectedValue();

                if (animal != null)
                {
                    animal.reserve(txtReservor.getText());
                    RefreshControls();
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MainForm");
        frame.setContentPane(new MainForm().MainF);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    private JPanel MainF;
}
