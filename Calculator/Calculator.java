import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Calculator implements ActionListener   {
    JTextField field;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    JButton bdec,bequ,bdiv,bmul,badd,bsub,bdel,bclr;
    JFrame frame;
    int a,b,result;
    int operation;
    Calculator()   {
        field = new JTextField(20);
        frame = new JFrame("Calculator");
        frame.setSize(300,425);
        
        
        //Declare buttons
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        bdec = new JButton(".");
        bequ = new JButton("=");
        bdiv = new JButton("/");
        bmul = new JButton("*");
        badd = new JButton("+");
        bsub = new JButton("-");
        bdel = new JButton("Delete");
        bclr = new JButton("Clear");
        
        //Setting bounds
	    frame.setLayout(null);
        b1.setBounds(35,85,50,50);
        b2.setBounds(95,85,50,50);
        b3.setBounds(155,85,50,50);
        b4.setBounds(35,145,50,50);
        b5.setBounds(95,145,50,50);
        b6.setBounds(155,145,50,50);
        b7.setBounds(35,205,50,50);
        b8.setBounds(95,205,50,50);
        b9.setBounds(155,205,50,50);
        b0.setBounds(35,265,50,50);
        bdec.setBounds(95,265,50,50);
        bequ.setBounds(155,265,50,50);
        bdiv.setBounds(215,85,50,50);
        bmul.setBounds(215,145,50,50);
        badd.setBounds(215,205,50,50);
        bsub.setBounds(215,265,50,50);
        bdel.setBounds(35,325,110,50);
        bclr.setBounds(155,325,110,50);
        field.setBounds(35,25,230,40);

        //Adding to frame
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(b0);
        frame.add(bdec);
        frame.add(bequ);
        frame.add(bdiv);
        frame.add(bmul);
        frame.add(badd);
        frame.add(bsub);
        frame.add(bdel);
        frame.add(bclr);
        frame.add(field);

 	//Adding Action Listener
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        bdec.addActionListener(this);
        bequ.addActionListener(this);
        bdiv.addActionListener(this);
        bmul.addActionListener(this);
        badd.addActionListener(this);
        bsub.addActionListener(this);
        bdel.addActionListener(this);
        bclr.addActionListener(this);
 	    frame.setVisible(true);
       

    }
    
    public void actionPerformed(ActionEvent e)   {
        if(e.getSource() == b0)   {
            field.setText(field.getText().concat("0"));  //t.setText(t.getText().concat("0"));
        }
        if(e.getSource() == b1)   {
            field.setText(field.getText().concat("1"));
        }
        if(e.getSource() == b2)   {
            field.setText(field.getText().concat("2"));
        }
        if(e.getSource() == b3)   {
            field.setText(field.getText().concat("3"));
        }
        if(e.getSource() == b4)   {
            field.setText(field.getText().concat("4"));
        }
        if(e.getSource() == b5)   {
            field.setText(field.getText().concat("5"));
        }
        if(e.getSource() == b6)   {
            field.setText(field.getText().concat("6"));
        }
        if(e.getSource() == b7)   {
            field.setText(field.getText().concat("7"));
        }
        if(e.getSource() == b8)   {
            field.setText(field.getText().concat("8"));
        }
        if(e.getSource() == b9)   {
            field.setText(field.getText().concat("9"));
        }
        if(e.getSource() == badd)   {
            a = Integer.parseInt(field.getText());
            operation = 1;
            field.setText(""); //+
        }
        if(e.getSource() == bsub)   {
            a = Integer.parseInt(field.getText());
            operation = 2;
            field.setText(""); //-
        }
        if(e.getSource() == bdiv)   {
            a = Integer.parseInt(field.getText());
            operation = 3;
            field.setText(""); // /
        }
        if(e.getSource() == bmul)   {
            a = Integer.parseInt(field.getText());
            operation = 4;
            field.setText(""); // *
        }
        if(e.getSource() == bdel)   {
            field.setText("");
        }
        if(e.getSource() == bclr)   {
            field.setText(field.getText().substring(0,field.getText().length()-1));
        }
        if(e.getSource() == bdec)   {
            field.setText(field.getText().concat("."));
        }
        if(e.getSource() == bequ)   {
            b = Integer.parseInt(field.getText());
            field.setText(" ");
            switch(operation)   {
                case 1:
                try   {
                    result = a + b;
                    break;
                }
                catch(Exception ee)   {
                    System.out.println("Error");
                }
                case 2:
                try   {
                    result = a - b;
                    break;
                }
                catch(Exception ee)   {
                    System.out.println("Error");
                }
                case 3:
                try   {
                    result = a/b;
                    break;
                }
                catch(Exception ee)   {
                    System.out.println("Division by zero is not possible");
                }
                case 4:
                try   {
                    result = a*b;
                    break;
                }
                catch(Exception ee)   {
                    System.out.println("Error");
                }
            }
            field.setText(" "+result);
        }
    }

    public static void main(String[] args)   {
        new Calculator();
    }
}

/*
 * Write a Java program that works as a simple calculator. Arrange Buttons for digits and the + - * % operations properly. Add a text field to display the result. Handle any possible exceptions like divide by zero. Use Java Swing.
 */
