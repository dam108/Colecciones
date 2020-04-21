/*
Crea una aplicación gráfica con Swing, con una colección que se cargue desde el archivo
paises2019.csv (contiene una línea por país, con nombre de país, capital y población, separados por
punto y coma). El programa tendrá una lista desplegada con los países, ordenada alfabéticamente.
Cuando se elija un país, en una caja de texto se mostrará su capital y en otra su población. Elige la
colección más adecuada pensando que la interfaz con el usuario podría ser otra (consola, web…),
que queremos que la lista de países esté ordenada y que el texto de capital y población se actualiza
a partir del nombre seleccionado en la lista
 */
package dam108t3_colecciones;

import java.util.TreeMap;
import javax.swing.DefaultListModel;

public class dam108t3e0114 extends javax.swing.JFrame {
    private DefaultListModel listaModelo;
    public TreeMap <String, Colecciones0114> listado;
    public dam108t3e0114() {
        initComponents();
        listaModelo = new DefaultListModel();
        ListaPaises.setModel(listaModelo);
        listado = Ficheros0114.leerArchivo();
        
        
        for ( String x : listado.keySet()){
            listaModelo.addElement(x);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        PaisesLabel = new javax.swing.JLabel();
        CapitalLabel = new javax.swing.JLabel();
        PoblacionLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaPaises = new javax.swing.JList<>();
        CapitalTextField = new javax.swing.JTextField();
        PoblacionTextField = new javax.swing.JTextField();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PaisesLabel.setText("Elige un pais de la lista");

        CapitalLabel.setText("Capital:");

        PoblacionLabel.setText("Población:");

        ListaPaises.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ListaPaises.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaPaisesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ListaPaises);

        CapitalTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CapitalTextFieldActionPerformed(evt);
            }
        });

        PoblacionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PoblacionTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PaisesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CapitalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CapitalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PoblacionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PoblacionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(PaisesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(CapitalLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CapitalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(PoblacionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PoblacionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CapitalTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CapitalTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CapitalTextFieldActionPerformed

    private void PoblacionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PoblacionTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PoblacionTextFieldActionPerformed

    private void ListaPaisesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaPaisesValueChanged
        String key = ListaPaises.getSelectedValue();
        CapitalTextField.setText(listado.get(key).capital);
        PoblacionTextField.setText(listado.get(key).poblacion);
    }//GEN-LAST:event_ListaPaisesValueChanged

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
            java.util.logging.Logger.getLogger(dam108t3e0114.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dam108t3e0114.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dam108t3e0114.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dam108t3e0114.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dam108t3e0114().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CapitalLabel;
    private javax.swing.JTextField CapitalTextField;
    private javax.swing.JList<String> ListaPaises;
    private javax.swing.JLabel PaisesLabel;
    private javax.swing.JLabel PoblacionLabel;
    private javax.swing.JTextField PoblacionTextField;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
