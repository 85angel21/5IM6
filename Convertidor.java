package examen1_hernandez_marin_miguelangel_5im6;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


/**
 * @author Miguel Angel Hernández Marín 5IM6
 * @version 1.1 12/09/2017
 */
public class Convertidor extends JFrame implements ActionListener {

    JTextField numeros;
    JButton bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt0, btp, btc, btb;
    String cadena = "";
    double opera;
    double resulta = 0.0;

    public Convertidor() {
        //defino la ventana
        setBounds(0, 0, 320, 289);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //defino el campo de texto donde aparece el resultado
        numeros = new JTextField("");
        numeros.setBounds(0, 0, 300, 50);
        numeros.setEditable(false);
        numeros.setBackground(Color.white);
        numeros.setForeground(Color.black);
        numeros.setHorizontalAlignment(JTextField.RIGHT);
        add(numeros);
        //declaro los botones
        bt1 = new JButton("1");
        bt1.setBounds(0, 50, 50, 50);
        add(bt1);
        bt1.addActionListener(this);

        bt2 = new JButton("2");
        bt2.setBounds(50, 50, 50, 50);
        add(bt2);
        bt2.addActionListener(this);

        bt3 = new JButton("3");
        bt3.setBounds(100, 50, 50, 50);
        add(bt3);
        bt3.addActionListener(this);

        bt4 = new JButton("4");
        bt4.setBounds(0, 100, 50, 50);
        add(bt4);
        bt4.addActionListener(this);

        bt5 = new JButton("5");
        bt5.setBounds(50, 100, 50, 50);
        add(bt5);
        bt5.addActionListener(this);

        bt6 = new JButton("6");
        bt6.setBounds(100, 100, 50, 50);
        add(bt6);
        bt6.addActionListener(this);

        bt7 = new JButton("7");
        bt7.setBounds(0, 150, 50, 50);
        add(bt7);
        bt7.addActionListener(this);

        bt8 = new JButton("8");
        bt8.setBounds(50, 150, 50, 50);
        add(bt8);
        bt8.addActionListener(this);

        bt9 = new JButton("9");
        bt9.setBounds(100, 150, 50, 50);
        add(bt9);
        bt9.addActionListener(this);

        bt0 = new JButton("0");
        bt0.setBounds(0, 200, 50, 50);
        add(bt0);
        bt0.addActionListener(this);

        btp = new JButton(".");
        btp.setBounds(50, 200, 50, 50);
        add(btp);
        btp.addActionListener(this);

        btc = new JButton("convertir");
        btc.setBounds(150, 50, 150, 50);
        add(btc);
        btc.addActionListener(this);

        btb = new JButton("ce");
        btb.setBounds(150, 100, 150, 50);
        add(btb);
        btb.addActionListener(this);

        setVisible(true);
    }

    /**
    * @param ae desde el evento que se crea al dar click
    */
    @Override
    public void actionPerformed(ActionEvent ae) {
        //evalua la acción que se indicó del botón
        switch (ae.getActionCommand()) {
            case "1":
                cadena = numeros.getText() + "1";
                numeros.setText(cadena);
                break;
            case "2":
                cadena = numeros.getText() + "2";
                numeros.setText(cadena);
                break;
            case "3":
                cadena = numeros.getText() + "3";
                numeros.setText(cadena);
                break;
            case "4":
                cadena = numeros.getText() + "4";
                numeros.setText(cadena);
                break;
            case "5":
                cadena = numeros.getText() + "5";
                numeros.setText(cadena);
                break;
            case "6":
                cadena = numeros.getText() + "6";
                numeros.setText(cadena);
                break;
            case "7":
                cadena = numeros.getText() + "7";
                numeros.setText(cadena);
                break;
            case "8":
                cadena = numeros.getText() + "8";
                numeros.setText(cadena);
                break;
            case "9":
                cadena = numeros.getText() + "9";
                numeros.setText(cadena);
                break;
            case "0":
                cadena = numeros.getText() + "0";
                numeros.setText(cadena);
                break;
            case ".":
                cadena = numeros.getText() + ".";
                numeros.setText(cadena);
                break;
            //es el convertidor
            case "convertir":
                opera = Double.parseDouble(cadena);
                resulta = opera / 19;
                cadena = String.valueOf(resulta);
                numeros.setText(cadena);
                break;
            //borra el contenido del campo de texto
            case "ce":
                cadena = "";
                numeros.setText(cadena);
                break;
        }
    }
}
