import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel; 
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;

public class Calculadora implements ActionListener {

    private static Calculadora calc = new Calculadora();
    private static Arithmetic art = new Arithmetic();
    private static String val1 = "";
    private static String val2 = "";

    private static String input = "";
    private static String oper = "";

    private static final String inputV1 = "V1";
    private static final String inputV2 = "V2";
    private static final String inputRe = "Re";

    private static final String operSom = "+";
    private static final String operSub = "-";
    private static final String operDiv = "/";
    private static final String operMul = "*";
    
    private static JFrame frame = new JFrame("Calculadora");
    private static Font font = new Font("Arial", Font.BOLD, 20);
    
    private static JPanel pnlFields = new JPanel(null);
    private static JPanel pnlButtons = new JPanel(null);

    private static JLabel lblV1 = new JLabel("Valor 1");
    private static JLabel lblV2 = new JLabel("Valor 2");
    private static JLabel lblRe = new JLabel("Resultado");

    private static JTextField txtV1 = new JTextField(5);
    private static JTextField txtV2 = new JTextField(5);
    private static JTextField txtRe = new JTextField(5);

    private static JButton btnProxVal = new JButton("Pr�ximo Valor");
    private static JButton btnClr = new JButton("Limpar");
    private static JButton btnClo = new JButton("Fechar");

    private static JButton btn0 = new JButton("0");
    private static JButton btn1 = new JButton("1");
    private static JButton btn2= new JButton("2");
    private static JButton btn3= new JButton("3");
    private static JButton btn4= new JButton("4");
    private static JButton btn5= new JButton("5");
    private static JButton btn6= new JButton("6");
    private static JButton btn7= new JButton("7");
    private static JButton btn8= new JButton("8");
    private static JButton btn9= new JButton("9");    

    private static JButton btnSom = new JButton("+");
    private static JButton btnSub = new JButton("-");
    private static JButton btnDiv = new JButton("/");
    private static JButton btnMul = new JButton("*");
    
    private static JButton btnCal = new JButton("=");

    public static void main(String arg[]){
        
        //Formata��o
        lblV1.setFont(font);
        lblV2.setFont(font);
        lblRe.setFont(font);
        txtV1.setFont(font);
        txtV2.setFont(font);
        txtRe.setFont(font);

        btnProxVal.setFont(font);
        btnSom.setFont(font);
        btnDiv.setFont(font);
        btnMul.setFont(font);
        btnCal.setFont(font);
        btnClr.setFont(font);
        btnClo.setFont(font);

        btn0.setFont(font);
        btn1.setFont(font);
        btn2.setFont(font);
        btn3.setFont(font);
        btn4.setFont(font);
        btn5.setFont(font);
        btn6.setFont(font);
        btn7.setFont(font);
        btn8.setFont(font);
        btn9.setFont(font);

        //Posi��es
        lblV1.setBounds(20, 20, 100, 35);
        lblV2.setBounds(20, 60, 100, 35);
        lblRe.setBounds(20, 100, 100, 35);
        txtV1.setBounds(150, 20, 200, 35);
        txtV2.setBounds(150, 60, 200, 35);
        txtRe.setBounds(150, 100, 200, 35);

        btnProxVal.setBounds(20, 150, 240, 40);
        btnSom.setBounds(300, 150, 50, 40);
        btnSub.setBounds(300, 200, 50, 40);
        btnDiv.setBounds(300, 250, 50, 40);
        btnMul.setBounds(300, 300, 50, 40);
        btnCal.setBounds(300, 350, 50, 40);
        
        btnClr.setBounds(20, 350, 100, 40);
        btnClo.setBounds(190, 350, 100, 40);

        btn1.setBounds(20, 200, 50, 40);
        btn4.setBounds(20, 250, 50, 40);
        btn7.setBounds(20, 300, 50, 40);

        btn2.setBounds(130, 200, 50, 40);
        btn5.setBounds(130, 250, 50, 40);
        btn8.setBounds(130, 300, 50, 40);
        btn0.setBounds(130, 350, 50, 40);
        
        btn3.setBounds(240, 200, 50, 40);
        btn6.setBounds(240, 250, 50, 40);
        btn9.setBounds(240, 300, 50, 40);

        //Fields
        pnlFields.add(lblV1);
        pnlFields.add(txtV1);
        pnlFields.add(lblV2);
        pnlFields.add(txtV2);
        pnlFields.add(lblRe);
        pnlFields.add(txtRe);
        pnlFields.setSize(500, 150);

        //Buttons
        pnlButtons.add(btnProxVal);

        pnlButtons.add(btn0);
        pnlButtons.add(btn1);
        pnlButtons.add(btn2);
        pnlButtons.add(btn3);
        pnlButtons.add(btn4);
        pnlButtons.add(btn5);
        pnlButtons.add(btn6);
        pnlButtons.add(btn7);
        pnlButtons.add(btn8);
        pnlButtons.add(btn9);

        pnlButtons.add(btnSom);
        pnlButtons.add(btnSub);
        pnlButtons.add(btnDiv);
        pnlButtons.add(btnMul);

        pnlButtons.add(btnCal);
        pnlButtons.add(btnClr);
        pnlButtons.add(btnClo);

        //Eventos
        btnClo.addActionListener(calc);
        btnClr.addActionListener(calc);
        btnProxVal.addActionListener(calc);

        btnCal.addActionListener(calc);

        btnSom.addActionListener(calc);
        btnSub.addActionListener(calc);
        btnDiv.addActionListener(calc);
        btnMul.addActionListener(calc);
        
        btn0.addActionListener(calc);
        btn1.addActionListener(calc);
        btn2.addActionListener(calc);
        btn3.addActionListener(calc);
        btn4.addActionListener(calc);
        btn5.addActionListener(calc);
        btn6.addActionListener(calc);
        btn7.addActionListener(calc);
        btn8.addActionListener(calc);
        btn9.addActionListener(calc);

        txtV1.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                input = inputV1;
            }
            public void focusLost(FocusEvent e) { }
        });
        txtV2.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                input = inputV2;
            }
            public void focusLost(FocusEvent e) { }
        });
        txtRe.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                input = inputRe;
            }
            public void focusLost(FocusEvent e) { }
        });

        //Componentes
        frame.add(pnlFields);
        frame.add(pnlButtons);

        frame.setSize(380, 450);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent ev){
        if(ev.getSource().equals(btnClo)){
            System.exit(0);
        }
        if(ev.getSource().equals(btnCal)){
            float v1 = 0.0f;
            float v2 = 0.0f;
            float r = 0.0f;
            updateValues();
            try{
                v1 = Float.parseFloat(val1);
                v2 = Float.parseFloat(val2);

                switch(oper){
                    case operSom:
                        r = art.soma(v1, v2);
                        break;
                    case operSub:
                        r = art.subtrai(v1, v2);
                        break;
                    case operDiv:
                        r = art.divide(v1, v2);
                        break;
                    case operMul:
                        r = art.multiplica(v1, v2);
                        break;
                }

            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, 
                    "Valor inv�lido", 
                    "Erro", 
                    JOptionPane.WARNING_MESSAGE);
            }catch(NegaException ex){
                JOptionPane.showMessageDialog(null, 
                    "Resultado negativo", 
                    "Erro", 
                    JOptionPane.OK_OPTION);
            }catch(ArithmeticException ex){
                JOptionPane.showMessageDialog(null, 
                    "Divis�op por zero", 
                    "Erro", 
                    JOptionPane.OK_OPTION);

                val2 = "";
                txtV2.setText("");
            }
            txtRe.setText(Float.toString(r));
            txtV1.requestFocus();
        }
        if(ev.getSource().equals(btnSom)){
            oper = operSom;
            txtV2.requestFocus();
        }
        if(ev.getSource().equals(btnSub)){
            oper = operSub;
            txtV2.requestFocus();
        }
        if(ev.getSource().equals(btnDiv)){
            oper = operDiv;
            txtV2.requestFocus();
        }
        if(ev.getSource().equals(btnMul)){
            oper = operMul;
            txtV2.requestFocus();
        }
        if(ev.getSource().equals(btnClr)){
            val1 = "";
            val2 = "";
            oper = "";
            
            txtV1.setText("");
            txtV2.setText("");
            txtRe.setText("");
            txtV1.requestFocus();
        }
        if(ev.getSource().equals(btnProxVal)){
            switch(input){
                case inputV1:
                    txtV2.requestFocus();
                    break;
                case inputV2:
                    txtV1.requestFocus();
                    break;
                default:
                    txtV1.requestFocus();
                    break;
            }
        }
        if(ev.getSource().equals(btn0)){
            setKey("0");
        }
        if(ev.getSource().equals(btn1)){
            setKey("1");
        }
        if(ev.getSource().equals(btn2)){
            setKey("2");
        }
        if(ev.getSource().equals(btn3)){
            setKey("3");
        }
        if(ev.getSource().equals(btn4)){
            setKey("4");
        }
        if(ev.getSource().equals(btn5)){
            setKey("5");
        }
        if(ev.getSource().equals(btn6)){
            setKey("6");
        }
        if(ev.getSource().equals(btn7)){
            setKey("7");
        }
        if(ev.getSource().equals(btn8)){
            setKey("8");
        }
        if(ev.getSource().equals(btn9)){
            setKey("9");
        }
    }
    private static void setKey(String str){
        switch(input){
            case inputV1:
                txtV1.setText(txtV1.getText() + str);
                break;
            case inputV2:
                txtV2.setText(txtV2.getText() + str);
                break;
            case inputRe:
                break;
        }
        updateValues();
    }
    private static void updateValues(){
        val1 = txtV1.getText();
        val2 = txtV2.getText();
    }
}