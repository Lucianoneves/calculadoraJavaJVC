/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.calculadora;

public class janelaPrincipal extends javax.swing.JFrame {

  
    public janelaPrincipal() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        numero1 = new javax.swing.JTextField();
        numero2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        resultado = new javax.swing.JTextField();
        adicao = new javax.swing.JButton();
        subtracao = new javax.swing.JButton();
        multiplicacao = new javax.swing.JButton();
        divisao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(null);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(54, 577, 0, 0);
        getContentPane().add(numero1);
        numero1.setBounds(40, 80, 120, 24);
        getContentPane().add(numero2);
        numero2.setBounds(180, 80, 110, 24);

        jLabel1.setText("=");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(330, 90, 41, 16);
        getContentPane().add(resultado);
        resultado.setBounds(380, 90, 140, 24);

        adicao.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        adicao.setText("+");
        adicao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                adicaoMouseReleased(evt);
            }
        });
        adicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicaoActionPerformed(evt);
            }
        });
        getContentPane().add(adicao);
        adicao.setBounds(30, 220, 50, 30);

        subtracao.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        subtracao.setText("-");
        subtracao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                subtracaoMouseReleased(evt);
            }
        });
        getContentPane().add(subtracao);
        subtracao.setBounds(130, 220, 50, 32);

        multiplicacao.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        multiplicacao.setText("*");
        multiplicacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                multiplicacaoMouseReleased(evt);
            }
        });
        getContentPane().add(multiplicacao);
        multiplicacao.setBounds(240, 220, 50, 32);

        divisao.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        divisao.setText("/");
        divisao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                divisaoMouseReleased(evt);
            }
        });
        getContentPane().add(divisao);
        divisao.setBounds(350, 220, 60, 32);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adicaoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adicaoMouseReleased
           int  x, y;
           x =  Integer.parseInt(numero1.getText());  // conversao de texto para numero//
           y = Integer.parseInt(numero2.getText());
           resultado.setText(( x+y) +"");
    }//GEN-LAST:event_adicaoMouseReleased

    private void adicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adicaoActionPerformed

    private void subtracaoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subtracaoMouseReleased
            int  x, y;
           x =  Integer.parseInt(numero1.getText());  // conversao de texto para numero//
           y = Integer.parseInt(numero2.getText());
           resultado.setText(( x-y) + "");
    }//GEN-LAST:event_subtracaoMouseReleased

    private void multiplicacaoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiplicacaoMouseReleased
            int  x, y;
           x =  Integer.parseInt(numero1.getText());  // conversao de texto para numero//
           y = Integer.parseInt(numero2.getText());
           resultado.setText(( x*y) +"");
    }//GEN-LAST:event_multiplicacaoMouseReleased

    private void divisaoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_divisaoMouseReleased
            int  x, y;
           x =  Integer.parseInt(numero1.getText());  // conversao de texto para numero//
           y = Integer.parseInt(numero2.getText());
           resultado.setText(( x/y) +"");
    }//GEN-LAST:event_divisaoMouseReleased

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
            java.util.logging.Logger.getLogger(janelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(janelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(janelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(janelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new janelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicao;
    private javax.swing.JButton divisao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton multiplicacao;
    private javax.swing.JTextField numero1;
    private javax.swing.JTextField numero2;
    private javax.swing.JTextField resultado;
    private javax.swing.JButton subtracao;
    // End of variables declaration//GEN-END:variables
}
