import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Figury extends JFrame {
    private JPanel PanelMain;
    private JRadioButton prostokątRadioButton;
    private JRadioButton trójkątRadioButton;
    private JRadioButton trapezRadioButton;
    private JRadioButton kwadratRadioButton;
    private JRadioButton prostopadloscianRadioButton;
    private JRadioButton walecRadioButton;
    private JRadioButton szescianRadioButton;
    private JRadioButton kulaRadioButton;
    private JTextField bokAField;
    private JTextField bokBField;
    private JTextField WysokoscField;
    private JTextField PromienField;
    private JTextField PoleField;
    private JTextField ObwodField;
    private JTextField ObjetoscField;
    private JButton obliczButton;
    private JButton wyczyscButton;
    private JPanel TopJPanel;
    private JPanel TopRightJPanel;
    private JPanel JPanelRight;
    private JPanel JPanelLeft;

    public static void main(String[] args) {
        Figury figury = new Figury();
        figury.setVisible(true);
    }

    public Figury() {
        super("Figury geometryczne - kalkulator");
        this.setContentPane(this.PanelMain);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();


        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object ob1 = e.getSource();
                double pole = 0;
                double obwod = 0;
                double objetosc = 0;

                if(kwadratRadioButton.isSelected()){
                    WysokoscField.setEnabled(false);
                    bokBField.setEnabled(false);
                    PromienField.setEnabled(false);
                    bokAField.setEnabled(true);
                    prostokątRadioButton.setSelected(false);
                    trójkątRadioButton.setSelected(false);
                    trapezRadioButton.setSelected(false);
                    szescianRadioButton.setSelected(false);
                    prostopadloscianRadioButton.setSelected(false);
                    walecRadioButton.setSelected(false);
                    kulaRadioButton.setSelected(false);
                    ObwodField.setText("");
                    PoleField.setText("");
                    ObjetoscField.setText("");
                    if(ob1 == obliczButton){
                    pole = Double.parseDouble(bokAField.getText()) * Double.parseDouble(bokAField.getText());
                    PoleField.setText(String.valueOf(pole));
                    obwod = (4 * Double.parseDouble(bokAField.getText()));
                    ObwodField.setText(String.valueOf(obwod));
                    }
                }
                if (prostokątRadioButton.isSelected()) {
                    WysokoscField.setEnabled(false);
                    bokBField.setEnabled(true);
                    PromienField.setEnabled(false);
                    bokAField.setEnabled(true);
                    ObwodField.setText("");
                    PoleField.setText("");
                    ObjetoscField.setText("");
                    kwadratRadioButton.setSelected(false);
                    trójkątRadioButton.setSelected(false);
                    trapezRadioButton.setSelected(false);
                    szescianRadioButton.setSelected(false);
                    prostopadloscianRadioButton.setSelected(false);
                    walecRadioButton.setSelected(false);
                    kulaRadioButton.setSelected(false);
                    if(ob1 == obliczButton) {
                        pole = Double.parseDouble(bokAField.getText()) * Double.parseDouble(bokBField.getText());
                        PoleField.setText(String.valueOf(pole));
                        obwod = (2 * Double.parseDouble(bokAField.getText())) + (2 * Double.parseDouble(bokBField.getText()));
                        ObwodField.setText(String.valueOf(obwod));
                    }
                }  if (trójkątRadioButton.isSelected()) {
                    WysokoscField.setEnabled(true);
                    bokBField.setEnabled(false);
                    PromienField.setEnabled(false);
                    bokAField.setEnabled(true);
                    ObwodField.setText("");
                    PoleField.setText("");
                    ObjetoscField.setText("");
                    prostokątRadioButton.setSelected(false);
                    kwadratRadioButton.setSelected(false);
                    trapezRadioButton.setSelected(false);
                    szescianRadioButton.setSelected(false);
                    prostopadloscianRadioButton.setSelected(false);
                    walecRadioButton.setSelected(false);
                    kulaRadioButton.setSelected(false);
                    if(ob1 == obliczButton) {
                        pole = Double.parseDouble(bokAField.getText()) * Double.parseDouble(WysokoscField.getText());
                        PoleField.setText(String.valueOf(pole / 2));
                    }

                }   if (trapezRadioButton.isSelected()) {
                    WysokoscField.setEnabled(true);
                    bokBField.setEnabled(true);
                    PromienField.setEnabled(false);
                    bokAField.setEnabled(true);
                    ObwodField.setText("");
                    PoleField.setText("");
                    ObjetoscField.setText("");
                    prostokątRadioButton.setSelected(false);
                    trójkątRadioButton.setSelected(false);
                    kwadratRadioButton.setSelected(false);
                    szescianRadioButton.setSelected(false);
                    prostopadloscianRadioButton.setSelected(false);
                    walecRadioButton.setSelected(false);
                    kulaRadioButton.setSelected(false);
                    if(ob1 == obliczButton) {
                        pole = ((Double.parseDouble(bokAField.getText()) + Double.parseDouble(bokBField.getText())) * Double.parseDouble(WysokoscField.getText()));
                        PoleField.setText(String.valueOf(pole / 2));
                    }
                }   if (szescianRadioButton.isSelected()) {
                    WysokoscField.setEnabled(false);
                    bokBField.setEnabled(false);
                    PromienField.setEnabled(false);
                    bokAField.setEnabled(true);
                    ObwodField.setText("");
                    PoleField.setText("");
                    ObjetoscField.setText("");
                    prostokątRadioButton.setSelected(false);
                    trójkątRadioButton.setSelected(false);
                    trapezRadioButton.setSelected(false);
                    kwadratRadioButton.setSelected(false);
                    prostopadloscianRadioButton.setSelected(false);
                    walecRadioButton.setSelected(false);
                    kulaRadioButton.setSelected(false);
                    if(ob1 == obliczButton) {
                        pole = 6 * (Double.parseDouble(bokAField.getText()) * Double.parseDouble(bokAField.getText()));
                        PoleField.setText(String.valueOf(pole));
                        objetosc = Double.parseDouble(bokAField.getText()) * Double.parseDouble(bokAField.getText()) * Double.parseDouble(bokAField.getText());
                        ObjetoscField.setText(String.valueOf(objetosc));
                    }
                }   if (prostopadloscianRadioButton.isSelected()) {
                    WysokoscField.setEnabled(true);
                    bokBField.setEnabled(true);
                    PromienField.setEnabled(false);
                    bokAField.setEnabled(true);
                    ObwodField.setText("");
                    PoleField.setText("");
                    ObjetoscField.setText("");
                    prostokątRadioButton.setSelected(false);
                    trójkątRadioButton.setSelected(false);
                    trapezRadioButton.setSelected(false);
                    szescianRadioButton.setSelected(false);
                    kwadratRadioButton.setSelected(false);
                    walecRadioButton.setSelected(false);
                    kulaRadioButton.setSelected(false);
                    if(ob1 == obliczButton) {
                        pole = 2 * (Double.parseDouble(bokAField.getText()) * Double.parseDouble(bokBField.getText()) + ((Double.parseDouble(bokAField.getText())) * Double.parseDouble(WysokoscField.getText())) + (Double.parseDouble(bokBField.getText()) * Double.parseDouble(WysokoscField.getText())));
                        PoleField.setText(String.valueOf(pole));
                        objetosc = Double.parseDouble(bokAField.getText()) * Double.parseDouble(bokBField.getText()) * Double.parseDouble(WysokoscField.getText());
                        ObjetoscField.setText(String.valueOf(objetosc));
                    }
                }   if (walecRadioButton.isSelected()) {
                    WysokoscField.setEnabled(true);
                    bokBField.setEnabled(false);
                    PromienField.setEnabled(true);
                    bokAField.setEnabled(false);
                    ObwodField.setText("");
                    PoleField.setText("");
                    ObjetoscField.setText("");
                    prostokątRadioButton.setSelected(false);
                    trójkątRadioButton.setSelected(false);
                    trapezRadioButton.setSelected(false);
                    szescianRadioButton.setSelected(false);
                    prostopadloscianRadioButton.setSelected(false);
                    kwadratRadioButton.setSelected(false);
                    kulaRadioButton.setSelected(false);
                    if(ob1 == obliczButton) {
                        objetosc = Math.PI * Double.parseDouble(PromienField.getText()) * Double.parseDouble(PromienField.getText()) * Double.parseDouble(WysokoscField.getText());
                        ObjetoscField.setText(String.valueOf(objetosc));
                        pole = 2 * (Math.PI * Double.parseDouble(PromienField.getText()) * Double.parseDouble(PromienField.getText())) + 2 * (Math.PI * Double.parseDouble(PromienField.getText()) * Double.parseDouble(WysokoscField.getText()));
                        PoleField.setText(String.valueOf(pole));
                    }

                }
                    if (kulaRadioButton.isSelected()) {
                        WysokoscField.setEnabled(false);
                        bokBField.setEnabled(false);
                        PromienField.setEnabled(true);
                        bokAField.setEnabled(false);
                    ObwodField.setText("");
                    PoleField.setText("");
                    ObjetoscField.setText("");
                        prostokątRadioButton.setSelected(false);
                        trójkątRadioButton.setSelected(false);
                        trapezRadioButton.setSelected(false);
                        szescianRadioButton.setSelected(false);
                        prostopadloscianRadioButton.setSelected(false);
                        walecRadioButton.setSelected(false);
                        kulaRadioButton.setSelected(false);
                        if(ob1 == obliczButton) {
                            objetosc = (4 * (Math.PI * (Double.parseDouble(PromienField.getText())) * (Double.parseDouble(PromienField.getText())) * (Double.parseDouble(PromienField.getText())))) / 3;
                            ObjetoscField.setText(String.valueOf(objetosc));
                            pole = 4 * (Math.PI * Double.parseDouble(PromienField.getText()) * Double.parseDouble(PromienField.getText()));
                            PoleField.setText(String.valueOf(pole));
                        }

                }
                    if(ob1 == wyczyscButton) {
                    PromienField.setText("");
                    WysokoscField.setText("");
                    bokBField.setText("");
                    bokAField.setText("");
                    ObjetoscField.setText("");
                    ObwodField.setText("");
                    PoleField.setText("");
                    kwadratRadioButton.setSelected(false);
                    trapezRadioButton.setSelected(false);
                    trójkątRadioButton.setSelected(false);
                    prostokątRadioButton.setSelected(false);
                    kulaRadioButton.setSelected(false);
                    szescianRadioButton.setSelected(false);
                    walecRadioButton.setSelected(false);
                    prostopadloscianRadioButton.setSelected(false);
                        WysokoscField.setEnabled(true);
                        bokBField.setEnabled(true);
                        PromienField.setEnabled(true);
                        bokAField.setEnabled(true);

                }

            }

        };


        obliczButton.addActionListener(listener);
        wyczyscButton.addActionListener(listener);
        prostopadloscianRadioButton.addActionListener(listener);
        walecRadioButton.addActionListener(listener);
        szescianRadioButton.addActionListener(listener);
        kulaRadioButton.addActionListener(listener);
        prostokątRadioButton.addActionListener(listener);
        trójkątRadioButton.addActionListener(listener);
        trapezRadioButton.addActionListener(listener);
        kwadratRadioButton.addActionListener(listener);
        PoleField.addActionListener(listener);
        ObwodField.addActionListener(listener);
        ObjetoscField.addActionListener(listener);
        bokAField.addActionListener(listener);
        bokBField.addActionListener(listener);
        WysokoscField.addActionListener(listener);
        PromienField.addActionListener(listener);
    }



}