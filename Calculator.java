/*
CSE 17
Russell Laros
892583512
Program Description: Simple calculator that takes two numbers(or decimals) and applies a simple operation to them(+,-,*,/)
*/
package prog9;

import java.util.Stack;//import the stack class(i dont know why we were told to make our own because it is an importable class)

/**
 *
 * @author Canalis
 */
public class Calculator extends javax.swing.JFrame {

    private Stack<String> stack;//make String stack (string because it is easier to add the decimal point if needed)
    private char op;//make character to hold the operation to be applied
    private boolean aD = false;//make a boolean to hold if the decimal button was pressed(more on this later)

    /**
     * Creates new form Calculator
     */
    public Calculator() {
        initComponents();
        stack = new Stack();//initialize the stack
    }

    public void enter() {//enter method
        double num1 = Double.parseDouble(stack.pop());//pop the first number off and convert it to a double
        double num2 = Double.parseDouble(stack.pop());//pop second number and make a double
        switch (op) {//switch block to see which op is going to be applied
            case '+':
                num2 += num1;
                break;
            case '-':
                num2 -= num1;
                break;
            case '*':
                num2 *= num1;
                break;
            case '/':
                num2 /= num1;//apply change to num 2 because that was the first number entered into the stack
                break;
        }

        display(Double.toString(num2));//display the number
    }

    public void display(String d) {
        textField.setText(d);
    }

    public void addDot() {
        String second = stack.pop();//pop first 2 numbers off because those will be the numbers that are the decimal number to be
        String first = stack.pop();//also make the second popped off number the "first" because it is actually going to be first ( "first"."second" )
        first += ".";//add a decimal(this is why i made it a string stack. so it would be easier to modify numbers and put them back in
        first += second;
        stack.push(first);//
        aD = false;//reset the add decimal boolean because the decimal has been added
    }

    public void clear() {//clear is simple. just erase everything
        stack.clear();
        textField.setText("");
        op = ' ';
        aD = false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        butt17 = new javax.swing.JButton();
        textField = new javax.swing.JTextField();
        butt1 = new javax.swing.JButton();
        butt2 = new javax.swing.JButton();
        butt3 = new javax.swing.JButton();
        butt4 = new javax.swing.JButton();
        butt5 = new javax.swing.JButton();
        butt6 = new javax.swing.JButton();
        butt7 = new javax.swing.JButton();
        butt8 = new javax.swing.JButton();
        butt9 = new javax.swing.JButton();
        buttDot = new javax.swing.JButton();
        butt0 = new javax.swing.JButton();
        buttEntr = new javax.swing.JButton();
        buttPlus = new javax.swing.JButton();
        buttMinus = new javax.swing.JButton();
        buttMult = new javax.swing.JButton();
        buttDiv = new javax.swing.JButton();
        buttClr = new javax.swing.JButton();

        butt17.setText("1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        butt1.setText("1");
        butt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butt1MouseClicked(evt);
            }
        });

        butt2.setText("2");
        butt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butt2MouseClicked(evt);
            }
        });

        butt3.setText("3");
        butt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butt3MouseClicked(evt);
            }
        });

        butt4.setText("4");
        butt4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butt4MouseClicked(evt);
            }
        });

        butt5.setText("5");
        butt5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butt5MouseClicked(evt);
            }
        });

        butt6.setText("6");
        butt6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butt6MouseClicked(evt);
            }
        });

        butt7.setText("7");
        butt7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butt7MouseClicked(evt);
            }
        });

        butt8.setText("8");
        butt8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butt8MouseClicked(evt);
            }
        });

        butt9.setText("9");
        butt9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butt9MouseClicked(evt);
            }
        });

        buttDot.setText(".");
        buttDot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttDotMouseClicked(evt);
            }
        });

        butt0.setText("0");
        butt0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butt0MouseClicked(evt);
            }
        });

        buttEntr.setText("Entr");
        buttEntr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttEntrMouseClicked(evt);
            }
        });

        buttPlus.setText("+");
        buttPlus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttPlusMouseClicked(evt);
            }
        });

        buttMinus.setText("-");
        buttMinus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttMinusMouseClicked(evt);
            }
        });

        buttMult.setText("*");
        buttMult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttMultMouseClicked(evt);
            }
        });

        buttDiv.setText("/");
        buttDiv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttDivMouseClicked(evt);
            }
        });

        buttClr.setText("Clr");
        buttClr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttClrMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttDot)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(butt0)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttClr)
                                .addGap(18, 18, 18)
                                .addComponent(buttDiv))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(butt7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(butt8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(butt9)
                                .addGap(18, 18, 18)
                                .addComponent(buttMult))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(butt4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(butt5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(butt6)
                                .addGap(18, 18, 18)
                                .addComponent(buttMinus))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(textField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(butt1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(butt2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(butt3)))
                                .addGap(18, 18, 18)
                                .addComponent(buttPlus))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(buttEntr)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butt1)
                    .addComponent(butt2)
                    .addComponent(butt3)
                    .addComponent(buttPlus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butt4)
                    .addComponent(butt5)
                    .addComponent(butt6)
                    .addComponent(buttMinus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butt7)
                    .addComponent(butt8)
                    .addComponent(butt9)
                    .addComponent(buttMult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttDot)
                    .addComponent(butt0)
                    .addComponent(buttDiv)
                    .addComponent(buttClr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttEntr)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butt1MouseClicked
        if (aD) {//check if add decimal boolean is true. because if it is that means this number will need to be added to another to make a decimal
            stack.push("1");
            addDot();
        } else {//else just add the number to the stack
            stack.push("1");
        }// TODO add your handling code here:
    }//GEN-LAST:event_butt1MouseClicked

    private void butt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butt2MouseClicked
        if (aD) {//do the same for the rest of the number buttons
            stack.push("2");
            addDot();
        } else {
            stack.push("2");
        }// TODO add your handling code here:
    }//GEN-LAST:event_butt2MouseClicked

    private void butt3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butt3MouseClicked
        if (aD) {
            stack.push("3");
            addDot();
        } else {
            stack.push("3");
        }// TODO add your handling code here:
    }//GEN-LAST:event_butt3MouseClicked

    private void butt4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butt4MouseClicked
        if (aD) {
            stack.push("4");
            addDot();
        } else {
            stack.push("4");
        }// TODO add your handling code here:
    }//GEN-LAST:event_butt4MouseClicked

    private void butt5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butt5MouseClicked
        if (aD) {
            stack.push("5");
            addDot();
        } else {
            stack.push("5");
        }// TODO add your handling code here:
    }//GEN-LAST:event_butt5MouseClicked

    private void butt6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butt6MouseClicked
        if (aD) {
            stack.push("6");
            addDot();
        } else {
            stack.push("6");
        }// TODO add your handling code here:
    }//GEN-LAST:event_butt6MouseClicked

    private void butt7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butt7MouseClicked
        if (aD) {
            stack.push("7");
            addDot();
        } else {
            stack.push("7");
        }// TODO add your handling code here:
    }//GEN-LAST:event_butt7MouseClicked

    private void butt8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butt8MouseClicked
        if (aD) {
            stack.push("8");
            addDot();
        } else {
            stack.push("8");
        }// TODO add your handling code here:
    }//GEN-LAST:event_butt8MouseClicked

    private void butt9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butt9MouseClicked
        if (aD) {
            stack.push("9");
            addDot();
        } else {
            stack.push("9");
        }// TODO add your handling code here:
    }//GEN-LAST:event_butt9MouseClicked

    private void buttDotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttDotMouseClicked
        aD = true;// make the add decimal button true so when the user presses another number button it will add the decimal inbetween the 2 numbers
    }//GEN-LAST:event_buttDotMouseClicked

    private void butt0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butt0MouseClicked
        if (aD) {
            stack.push("0");
            addDot();
        } else {
            stack.push("0");
        }// TODO add your handling code here:
    }//GEN-LAST:event_butt0MouseClicked

    private void buttClrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttClrMouseClicked
        clear();// TODO add your handling code here:
    }//GEN-LAST:event_buttClrMouseClicked

    private void buttPlusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttPlusMouseClicked
        op = '+';// make the desired operation whatever button was clicked
    }//GEN-LAST:event_buttPlusMouseClicked

    private void buttMinusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttMinusMouseClicked
        op = '-';// TODO add your handling code here:
    }//GEN-LAST:event_buttMinusMouseClicked

    private void buttMultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttMultMouseClicked
        op = '*';// TODO add your handling code here:
    }//GEN-LAST:event_buttMultMouseClicked

    private void buttDivMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttDivMouseClicked
        op = '/';// TODO add your handling code here:
    }//GEN-LAST:event_buttDivMouseClicked

    private void buttEntrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttEntrMouseClicked
        enter();// call enter
    }//GEN-LAST:event_buttEntrMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butt0;
    private javax.swing.JButton butt1;
    private javax.swing.JButton butt17;
    private javax.swing.JButton butt2;
    private javax.swing.JButton butt3;
    private javax.swing.JButton butt4;
    private javax.swing.JButton butt5;
    private javax.swing.JButton butt6;
    private javax.swing.JButton butt7;
    private javax.swing.JButton butt8;
    private javax.swing.JButton butt9;
    private javax.swing.JButton buttClr;
    private javax.swing.JButton buttDiv;
    private javax.swing.JButton buttDot;
    private javax.swing.JButton buttEntr;
    private javax.swing.JButton buttMinus;
    private javax.swing.JButton buttMult;
    private javax.swing.JButton buttPlus;
    private javax.swing.JTextField textField;
    // End of variables declaration//GEN-END:variables
}
