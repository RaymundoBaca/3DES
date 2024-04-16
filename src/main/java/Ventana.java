//Librerías utilizadas:

import javax.swing.JFileChooser;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.swing.JOptionPane;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

/*
Hecho por: José Raymundo Baca Hernández
Algoritmos y Sistemas de Cifrado - Criptografía
Instituto Tecnológico de Chihuahua ll
 */
public class Ventana extends javax.swing.JFrame {

    
    public Ventana() {
        initComponents();
        setLocationRelativeTo(null); // Centrar el JFrame en la pantalla
        setTitle("Método 3DES"); //Declaramos título
    }
    
    private String codigoSeguridad;
    
    private void generarCodigoSeguridad() {
        SecureRandom random = new SecureRandom();
        int codigo = 1000 + random.nextInt(9000); // Genera un codigo de 4 digitos
        codigoSeguridad = String.valueOf(codigo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 153));
        jLabel1.setText("3DES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 11, -1, 34));

        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setText("Texto");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 51, -1, -1));

        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 71, 382, 197));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 51));
        jButton1.setText("Cifrar");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 286, 114, 30));

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setForeground(new java.awt.Color(51, 204, 0));
        jButton3.setText("Descifrar");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 320, 114, 30));

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Seleccionar archivo");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 286, 130, 30));

        jButton5.setBackground(new java.awt.Color(51, 51, 51));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Guardar archivo");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 320, 130, 30));

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 321, 107, 30));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setForeground(new java.awt.Color(255, 153, 0));
        jButton2.setText("Enviar codigo");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 286, 107, 30));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // Obtener el texto a cifrar desde el JTextArea
            String textoACifrar = jTextArea1.getText();
            // Generar una clave secreta de 3DES (Triple DES)
            byte[] keyValue = "123456789012345678901234".getBytes(); // Clave de 24 bytes
            DESedeKeySpec keySpec = new DESedeKeySpec(keyValue);
            SecretKey key = SecretKeyFactory.getInstance("DESede").generateSecret(keySpec);
            // Configurar el cifrador
            Cipher cifrador = Cipher.getInstance("DESede/ECB/PKCS5Padding");
            cifrador.init(Cipher.ENCRYPT_MODE, key);
            // Cifrar el texto
            byte[] textoCifrado = cifrador.doFinal(textoACifrar.getBytes());
            // Convertir el resultado a una representacion legible (Base64)
            String textoCifradoBase64 = javax.xml.bind.DatatypeConverter.printBase64Binary(textoCifrado);
            // Mostrar el texto cifrado en el JTextArea
            jTextArea1.setText(textoCifradoBase64);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error de cifrado: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String codigoIngresado = jTextField1.getText(); //Para desencriptar que ingrese el código
        String textoCifrado = ""; // Inicializar con un valor predeterminado

        if (codigoIngresado.equals(codigoSeguridad)) {
            try {
                // Obtener el texto cifrado desde el JTextArea
                String textoCifradoBase64 = jTextArea1.getText();
                // Decodificar el texto cifrado de Base64 a bytes
                byte[] textoCifradoBytes = javax.xml.bind.DatatypeConverter.parseBase64Binary(textoCifradoBase64);
                // Generar una clave secreta de 3DES (Triple DES)
                byte[] keyValue = "123456789012345678901234".getBytes(); // Clave de 24 bytes
                DESedeKeySpec keySpec = new DESedeKeySpec(keyValue);
                SecretKey key = SecretKeyFactory.getInstance("DESede").generateSecret(keySpec);
                // Configurar el cifrador para descifrado
                Cipher cifrador = Cipher.getInstance("DESede/ECB/PKCS5Padding");
                cifrador.init(Cipher.DECRYPT_MODE, key);
                // Descifrar el texto
                byte[] textoDescifradoBytes = cifrador.doFinal(textoCifradoBytes);
                // Convertir el resultado a texto legible
                textoCifrado = new String(textoDescifradoBytes, "UTF-8");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error de descifrado: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // El codigo ingresado no coincide con el c�digo de seguridad
            JOptionPane.showMessageDialog(this, "Codigo de seguridad incorrecto. No puedes descifrar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        // Mostrar el texto descifrado en el JTextArea
        jTextArea1.setText(textoCifrado);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Crear un objeto JFileChooser para permitir al usuario seleccionar un archivo
        JFileChooser fileChooser = new JFileChooser();
        // Mostrar el diálogo para que el usuario seleccione un archivo y almacenar el resultado en 'seleccion'
        int seleccion = fileChooser.showOpenDialog(this);
        // Verificar si el usuario ha aprobado la selección del archivo
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            // Obtener el archivo seleccionado por el usuario
            File archivoSeleccionado = fileChooser.getSelectedFile();
            // Intentar leer el contenido del archivo utilizando un BufferedReader y FileReader
            try (BufferedReader reader = new BufferedReader(new FileReader(archivoSeleccionado))) {
                // Inicializar variables para almacenar cada línea del archivo y el contenido total
                String linea;
                String contenido = "";
                // Leer cada línea del archivo y concatenarla al contenido existente
                while ((linea = reader.readLine()) != null) {
                    contenido += linea + "\n";
                }
                // Establecer el contenido del JTextArea (jTextArea1) con el contenido del archivo
                jTextArea1.setText(contenido);
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error al seleccionar el archivo: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Crear un objeto JFileChooser para permitir al usuario seleccionar la ubicación de guardado del archivo
        JFileChooser fileChooser = new JFileChooser();
        // Mostrar el diálogo para que el usuario seleccione la ubicación de guardado del archivo y almacenar el resultado en 'seleccion'
        int seleccion = fileChooser.showSaveDialog(this);
        // Verificar si el usuario ha aprobado la selección de la ubicación de guardado del archivo
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            // El usuario ha seleccionado una ubicación para guardar el archivo
            // Obtener el objeto File que representa la ubicación y nombre del archivo a guardar
            File archivoGuardar = fileChooser.getSelectedFile();
            // Intentar abrir un flujo de salida de archivo para escribir en el archivo seleccionado
            try (FileOutputStream fos = new FileOutputStream(archivoGuardar)) {
                // Obtener el texto cifrado del JTextArea
                String textoCifrado = jTextArea1.getText();
                // Convertir el texto cifrado a bytes utilizando UTF-8 encoding
                byte[] textoCifradoBytes = textoCifrado.getBytes("UTF-8");
                // Escribir los bytes en el archivo
                fos.write(textoCifradoBytes);
                // Mostrar un mensaje de éxito en caso de que la operación de guardado sea exitosa
                JOptionPane.showMessageDialog(this, "Archivo guardado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
                // Capturar y manejar cualquier excepción que pueda ocurrir durante la operación de guardado
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error al guardar el archivo: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Generar un nuevo codigo de seguridad
        generarCodigoSeguridad();
        // Inicializar Twilio con tus credenciales
        String twilioAccountSid = ""; // Yout Twilio Acc SID bere
        String twilioAuthToken = ""; // Your Twilio AuthToken here
        Twilio.init(twilioAccountSid, twilioAuthToken);
        // Numeros de telefono
        String fromPhoneNumber = ""; // Twilio Phone Number here
        String toPhoneNumber = ""; // Your Personal Phone Number here
        // Mensaje a enviar
        String messageText = "Tu codigo de seguridad es: " + codigoSeguridad;
        // Enviar el mensaje
        Message message = Message.creator(
                new PhoneNumber(toPhoneNumber),
                new PhoneNumber(fromPhoneNumber),
                messageText
        ).create();
        // Mostrar el SID del mensaje en la consola
        System.out.println("Mensaje SID: " + message.getSid());
        // No mostramos el codigo en la interfaz
        JOptionPane.showMessageDialog(this, "Codigo de seguridad enviado por SMS.", "Exito", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
