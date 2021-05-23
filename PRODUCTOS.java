
package modulo.altas.de.productos;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Uziel
 */
public class PRODUCTOS extends javax.swing.JFrame {

    /**
     * Creates new form PRODUCTOS
     */
    public PRODUCTOS() {

        initComponents();

        String[] Titulos = {"CODIGO", "NOMBRE", "COLOR", "TAMAÑO", "PRECIO_UNIDAD", "CANTIDAD_STOCK", "FECHA_REGISTRO", "HORA_REGISTRO"};
        DefaultTableModel DATOS = new DefaultTableModel(null, Titulos);
        PRODUCTOS.uTABLA.setModel(DATOS);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        DESCRIPCION = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        CODIGO = new javax.swing.JTextField();
        NOMBRE = new javax.swing.JTextField();
        BARRAS = new javax.swing.JLabel();
        TAMAÑO = new javax.swing.JComboBox<>();
        PRECIO = new javax.swing.JTextField();
        CANTIDAD = new javax.swing.JTextField();
        FECHA = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        HORA = new javax.swing.JTextField();
        COLOR = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        uTABLA = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("ALTAS PRODUCTOS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 20, 370, 44);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("NOMBRE:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 150, 125, 29);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("TAMAÑO:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 250, 123, 29);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 204, 0));
        jLabel4.setText("INGRESA ID:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 650, 180, 29);

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("COLOR:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 200, 92, 29);

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 255));
        jLabel7.setText("PRECIO/UNITARIO:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 300, 263, 29);

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 255));
        jLabel9.setText("CANTIDAD/STOCK:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 350, 263, 29);

        DESCRIPCION.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        DESCRIPCION.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(DESCRIPCION);
        DESCRIPCION.setBounds(950, 660, 190, 40);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modulo/altas/de/productos/CODIGO.jpg"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(800, 530, 440, 130);

        jButton6.setBackground(new java.awt.Color(255, 255, 51));
        jButton6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 51, 51));
        jButton6.setText("LIMPIAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(540, 550, 130, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 255));
        jLabel10.setText("HORA DE REGISTRO:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 470, 270, 29);
        getContentPane().add(CODIGO);
        CODIGO.setBounds(140, 100, 240, 30);

        NOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOMBREActionPerformed(evt);
            }
        });
        getContentPane().add(NOMBRE);
        NOMBRE.setBounds(150, 150, 230, 30);

        BARRAS.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        getContentPane().add(BARRAS);
        BARRAS.setBounds(810, 470, 420, 80);

        TAMAÑO.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        TAMAÑO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona...", "Chico", "Mediano", "Grande" }));
        getContentPane().add(TAMAÑO);
        TAMAÑO.setBounds(160, 250, 150, 28);
        getContentPane().add(PRECIO);
        PRECIO.setBounds(270, 300, 160, 30);
        getContentPane().add(CANTIDAD);
        CANTIDAD.setBounds(270, 350, 100, 30);
        getContentPane().add(FECHA);
        FECHA.setBounds(300, 420, 220, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 255));
        jLabel11.setText("FECHA DE REGISTRO:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 420, 270, 29);
        getContentPane().add(HORA);
        HORA.setBounds(280, 470, 240, 30);

        COLOR.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        COLOR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona...", "Verde", "Verde Limon", "Verde Bandera", "Vrede Pistache", "Rojo", "Azul", "Azul Rey", "Amarillo", "Naranja", "Morado", "Violeta", "Blanco", "Negro", "Vino", "Gris", "Cafe" }));
        getContentPane().add(COLOR);
        COLOR.setBounds(130, 210, 160, 28);

        jButton1.setBackground(new java.awt.Color(255, 255, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 51));
        jButton1.setText("CONSULTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 530, 150, 31);

        uTABLA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(uTABLA);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(550, 20, 900, 402);

        jButton2.setBackground(new java.awt.Color(255, 255, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setText("AGREGAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(20, 580, 140, 30);

        jButton3.setBackground(new java.awt.Color(255, 255, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("ELIMINAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(210, 580, 130, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("CODIGO:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 100, 109, 29);
        getContentPane().add(ID);
        ID.setBounds(190, 650, 210, 30);

        jButton4.setBackground(new java.awt.Color(255, 255, 102));
        jButton4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 0, 0));
        jButton4.setText("BUSCAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(210, 530, 120, 30);

        jButton5.setBackground(new java.awt.Color(255, 255, 51));
        jButton5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 0, 0));
        jButton5.setText("ACTUALIZAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(360, 550, 160, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modulo/altas/de/productos/BLANCO.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 1470, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOMBREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NOMBREActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Consultas.CONSULTAR();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        LocalTime hora = LocalTime.now();
        LocalDate fecha = LocalDate.now();

        FECHA.setText(String.valueOf(fecha));
        HORA.setText(String.valueOf(hora));

        Object OPC;
        String Col, Tam;
        float P, CAN;
        P = Float.parseFloat(PRECIO.getText());
        CAN = Float.parseFloat(CANTIDAD.getText());

        OPC = COLOR.getSelectedItem();
        Col = String.valueOf(OPC);

        OPC = TAMAÑO.getSelectedItem();
        Tam = String.valueOf(OPC);

        Consultas.AGREGAR(CODIGO.getText(), NOMBRE.getText(), Col, Tam, P, CAN, FECHA.getText(), HORA.getText());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Consultas.ELIMINAR(ID.getText());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Consultas.BUSCAR(ID.getText());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        CODIGO.setText("");
        NOMBRE.setText("");
        COLOR.setSelectedItem("Selecciona...");
        TAMAÑO.setSelectedItem("Selecciona...");
        PRECIO.setText("");
        CANTIDAD.setText("");
        FECHA.setText("");
        HORA.setText("");
        ID.setText("");
        BARRAS.setText("");
        DESCRIPCION.setText("");

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        LocalTime hora = LocalTime.now();
        LocalDate fecha = LocalDate.now();

        Object OPC;
        String Col, Tam;
        float P, CAN;
        P = Float.parseFloat(PRECIO.getText());
        CAN = Float.parseFloat(CANTIDAD.getText());

        OPC = COLOR.getSelectedItem();
        Col = String.valueOf(OPC);

        OPC = TAMAÑO.getSelectedItem();
        Tam = String.valueOf(OPC);

        FECHA.setText(String.valueOf(fecha));
        HORA.setText(String.valueOf(hora));

        Consultas.ACTUALIZAR(CODIGO.getText(), ID.getText(), NOMBRE.getText(), Col, Tam, P, CAN, FECHA.getText(), HORA.getText());
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(PRODUCTOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PRODUCTOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PRODUCTOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PRODUCTOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PRODUCTOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel BARRAS;
    public static javax.swing.JTextField CANTIDAD;
    public static javax.swing.JTextField CODIGO;
    public static javax.swing.JComboBox<String> COLOR;
    public static javax.swing.JLabel DESCRIPCION;
    public static javax.swing.JTextField FECHA;
    public static javax.swing.JTextField HORA;
    public static javax.swing.JTextField ID;
    public static javax.swing.JTextField NOMBRE;
    public static javax.swing.JTextField PRECIO;
    public static javax.swing.JComboBox<String> TAMAÑO;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable uTABLA;
    // End of variables declaration//GEN-END:variables
}
