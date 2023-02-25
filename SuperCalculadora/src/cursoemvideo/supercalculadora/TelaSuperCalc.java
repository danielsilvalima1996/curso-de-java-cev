/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoemvideo.supercalculadora;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;
import java.awt.HeadlessException;
import javax.swing.JPanel;

/**
 *
 * @author dsl15
 */
public class TelaSuperCalc extends javax.swing.JFrame {

    /**
     * Creates new form TelaSuperCalc
     */
    public TelaSuperCalc() { //Construtor
        initComponents();
        panCalc.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNum = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        panCalc = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lblResto = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblElevado = new javax.swing.JLabel();
        lblRaizQua = new javax.swing.JLabel();
        lblRaizCub = new javax.swing.JLabel();
        lblValAbs = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Super Calculadora");

        jLabel2.setText("Digite um valor");

        txtNum.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/super-calculadora.png"))); // NOI18N

        jLabel9.setText("Valor Absoluto");

        lblResto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblResto.setForeground(new java.awt.Color(51, 51, 255));
        lblResto.setText("0");

        jLabel5.setText("Resto da Divisão por 2");

        jLabel6.setText("Elevado ao Cubo");

        jLabel7.setText("Raiz Quadrada");

        jLabel8.setText("Raiz Cúbica");

        lblElevado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblElevado.setForeground(new java.awt.Color(51, 51, 255));
        lblElevado.setText("0");

        lblRaizQua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRaizQua.setForeground(new java.awt.Color(51, 51, 255));
        lblRaizQua.setText("0");

        lblRaizCub.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRaizCub.setForeground(new java.awt.Color(51, 51, 255));
        lblRaizCub.setText("0");

        lblValAbs.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblValAbs.setForeground(new java.awt.Color(51, 51, 255));
        lblValAbs.setText("0");

        javax.swing.GroupLayout panCalcLayout = new javax.swing.GroupLayout(panCalc);
        panCalc.setLayout(panCalcLayout);
        panCalcLayout.setHorizontalGroup(
            panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCalcLayout.createSequentialGroup()
                .addContainerGap(216, Short.MAX_VALUE)
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblElevado, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblRaizQua, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblRaizCub, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblValAbs, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panCalcLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9))
                    .addContainerGap(114, Short.MAX_VALUE)))
        );
        panCalcLayout.setVerticalGroup(
            panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCalcLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblResto)
                .addGap(18, 18, 18)
                .addComponent(lblElevado)
                .addGap(18, 18, 18)
                .addComponent(lblRaizQua)
                .addGap(18, 18, 18)
                .addComponent(lblRaizCub)
                .addGap(18, 18, 18)
                .addComponent(lblValAbs)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panCalcLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel5)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel6)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel7)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel8)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel9)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        btnCalcular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/calc-botao.png"))); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(239, 239, 239))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnCalcular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(21, 21, 21))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panCalc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCalcular)
                        .addGap(40, 40, 40)
                        .addComponent(panCalc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        
        //Mostrando o painel ao clicar no botão
        panCalc.setVisible(true);
        
        // pegando o número
        int num = (int) txtNum.getValue(); 
        
        // Resto da divisão
        int resto = num % 2; 
        lblResto.setText(Integer.toString(resto));
        
        //Elevado ao cubo
        double elevCub = Math.pow(num, 3);
        lblElevado.setText(Double.toString(elevCub));
        
        // Raiz Quadrada
        double raizQua = Math.sqrt(num);
        lblRaizQua.setText(String.format("%.2f", raizQua));
        
        //Raíz Cúbica
        double raizCub = Math.cbrt(num); 
        lblRaizCub.setText(String.format("%.2f", raizCub));
        
        //Valor Absoluto
        int valAbs = (int) Math.abs(num);
        lblValAbs.setText(Integer.toString(valAbs));
    }//GEN-LAST:event_btnCalcularActionPerformed

    public TelaSuperCalc(JPanel panCalc) throws HeadlessException {
        this.panCalc = panCalc;
    }

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
            java.util.logging.Logger.getLogger(TelaSuperCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSuperCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSuperCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSuperCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSuperCalc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblElevado;
    private javax.swing.JLabel lblRaizCub;
    private javax.swing.JLabel lblRaizQua;
    private javax.swing.JLabel lblResto;
    private javax.swing.JLabel lblValAbs;
    private javax.swing.JPanel panCalc;
    private javax.swing.JSpinner txtNum;
    // End of variables declaration//GEN-END:variables
}