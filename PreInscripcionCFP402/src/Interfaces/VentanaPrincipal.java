package Interfaces;

import java.awt.BorderLayout;
import clases.Alumno;
import clases.Curso;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VentanaPrincipal extends javax.swing.JFrame {

    private Curso curso;
    private JScrollPane scrollPaneLista;
    private DefaultTableModel modeloTabla;
    private JTable tablaAlumnos;
    private VentanaInformacionCurso vInf;

    public VentanaPrincipal(Curso curso) {
        initComponents();
        this.curso = curso;

        setVisible(true);
        InicializarVentanas();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FONDO = new javax.swing.JPanel();
        botonInformacionCurso = new javax.swing.JButton();
        texto2 = new javax.swing.JLabel();
        texto02 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        texto102 = new javax.swing.JLabel();
        texto110 = new javax.swing.JLabel();
        texto111 = new javax.swing.JLabel();
        texto112 = new javax.swing.JLabel();
        texto113 = new javax.swing.JLabel();
        texto114 = new javax.swing.JLabel();
        texto115 = new javax.swing.JLabel();
        texto101 = new javax.swing.JLabel();
        texto108 = new javax.swing.JLabel();
        texto109 = new javax.swing.JLabel();
        texto106 = new javax.swing.JLabel();
        texto107 = new javax.swing.JLabel();
        texto116 = new javax.swing.JLabel();
        campo_tipo = new javax.swing.JTextField();
        campo_nombre = new javax.swing.JTextField();
        campo_lugar = new javax.swing.JTextField();
        campo_nac = new javax.swing.JTextField();
        campo_domicilio = new javax.swing.JTextField();
        campo_fecha = new javax.swing.JTextField();
        campo_cp = new javax.swing.JTextField();
        texto03 = new javax.swing.JLabel();
        campo_dni = new javax.swing.JTextField();
        campo_apellido = new javax.swing.JTextField();
        campo_inscribio = new javax.swing.JTextField();
        campo_fecha_nac = new javax.swing.JTextField();
        campo_localidad = new javax.swing.JTextField();
        campo_telefono = new javax.swing.JTextField();
        boton_PreInscribir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        botonEliminar = new javax.swing.JButton();
        botonEditarInfoCurso = new javax.swing.JButton();
        botonExportar = new javax.swing.JButton();
        barraProgreso = new javax.swing.JProgressBar();
        campoCantidadInscriptos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PreInscripcion");
        setBackground(new java.awt.Color(204, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);

        FONDO.setBackground(new java.awt.Color(204, 255, 255));
        FONDO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonInformacionCurso.setText("INFORMACION DEL CURSO");
        botonInformacionCurso.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonInformacionCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInformacionCursoActionPerformed(evt);
            }
        });
        FONDO.add(botonInformacionCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 230, 50));

        texto2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        texto2.setText("\" CFP 402 - BERISSO \"");
        FONDO.add(texto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 270, -1));

        texto02.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        texto02.setText("PREINSCRIPCION");
        FONDO.add(texto02, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 170, -1));

        jPanel2.setBackground(new java.awt.Color(232, 232, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        texto102.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        texto102.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        texto102.setText("NOMBRE");
        jPanel2.add(texto102, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 80, 20));

        texto110.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        texto110.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        texto110.setText("APELLIDO");
        jPanel2.add(texto110, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 60, 20));

        texto111.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        texto111.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        texto111.setText("LUGAR");
        jPanel2.add(texto111, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 80, 20));

        texto112.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        texto112.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        texto112.setText("FECHA");
        jPanel2.add(texto112, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 80, 20));

        texto113.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        texto113.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        texto113.setText("DOMICILIO");
        jPanel2.add(texto113, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 80, 20));

        texto114.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        texto114.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        texto114.setText("NACIONALIDAD");
        jPanel2.add(texto114, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 100, 20));

        texto115.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        texto115.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        texto115.setText("NUM DNI");
        jPanel2.add(texto115, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 60, 20));

        texto101.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        texto101.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        texto101.setText("INSCRIBIO");
        jPanel2.add(texto101, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 60, 20));

        texto108.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        texto108.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        texto108.setText("TELEFONO");
        jPanel2.add(texto108, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 70, 20));

        texto109.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        texto109.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        texto109.setText("LOCALIDAD");
        jPanel2.add(texto109, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 80, 20));

        texto106.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        texto106.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        texto106.setText("TIPO DNI");
        jPanel2.add(texto106, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 80, 20));

        texto107.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        texto107.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        texto107.setText("FECHA NAC");
        jPanel2.add(texto107, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, 20));

        texto116.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        texto116.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        texto116.setText("CODIGO POSTAL");
        jPanel2.add(texto116, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 100, 20));

        campo_tipo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel2.add(campo_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 100, 20));

        campo_nombre.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel2.add(campo_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 100, 20));

        campo_lugar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel2.add(campo_lugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 100, 20));

        campo_nac.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel2.add(campo_nac, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 100, 20));

        campo_domicilio.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel2.add(campo_domicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 100, 20));

        campo_fecha.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel2.add(campo_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 100, 20));

        campo_cp.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel2.add(campo_cp, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 110, 20));

        texto03.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        texto03.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        texto03.setText("DATOS DEL ALUMNO");
        jPanel2.add(texto03, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 240, 20));

        campo_dni.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel2.add(campo_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 100, 20));

        campo_apellido.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel2.add(campo_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 100, 20));

        campo_inscribio.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel2.add(campo_inscribio, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 100, 20));

        campo_fecha_nac.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel2.add(campo_fecha_nac, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 100, 20));

        campo_localidad.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel2.add(campo_localidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 100, 20));

        campo_telefono.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel2.add(campo_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 100, 20));

        boton_PreInscribir.setBackground(new java.awt.Color(204, 204, 204));
        boton_PreInscribir.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        boton_PreInscribir.setText("PREINSCRIBIR");
        boton_PreInscribir.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        boton_PreInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_PreInscribirActionPerformed(evt);
            }
        });
        jPanel2.add(boton_PreInscribir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 370, 30));

        FONDO.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 410, 380));

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.SE_RESIZE_CURSOR));

        jTextPane1.setMaximumSize(new java.awt.Dimension(200, 200));
        jScrollPane1.setViewportView(jTextPane1);

        FONDO.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 570, 310));

        botonEliminar.setText("Eliminar Alumno");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        FONDO.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 140, 40));

        botonEditarInfoCurso.setText("Editar");
        botonEditarInfoCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarInfoCursoActionPerformed(evt);
            }
        });
        FONDO.add(botonEditarInfoCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 20, 50));

        botonExportar.setText("EXPORTAR");
        botonExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonExportarActionPerformed(evt);
            }
        });
        FONDO.add(botonExportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 430, 140, 40));
        FONDO.add(barraProgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(616, 420, 220, -1));

        campoCantidadInscriptos.setEditable(false);
        campoCantidadInscriptos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoCantidadInscriptos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        campoCantidadInscriptos.setOpaque(false);
        campoCantidadInscriptos.setSelectionColor(new java.awt.Color(153, 153, 153));
        FONDO.add(campoCantidadInscriptos, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 440, 210, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(FONDO, javax.swing.GroupLayout.PREFERRED_SIZE, 1515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FONDO, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(1062, 571));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void actualizarListaAlumnos() {

        // Limpiar la tabla
        modeloTabla.setRowCount(0);

        // Agregar a cada alumno a la tabla
        for (Alumno alumno : curso.getListaAlumnos()) {
            Object[] datosEnTabla = {
                alumno.getNombre(),
                alumno.getApellido(),
                alumno.getTipo_dni(),
                alumno.getNum_dni(),
                alumno.getNacionalidad(),
                alumno.getFecha_nac(),
                alumno.getLugar(),
                alumno.getInscribio(),
                alumno.getFecha(),
                alumno.getTelefono(),
                alumno.getDomicilio(),
                alumno.getLocalidad(),
                alumno.getCp()

            };
            modeloTabla.addRow(datosEnTabla);
            System.out.println(curso.getCantAlumnos());

            campoCantidadInscriptos.setText("Cantidad Inscriptos: " + curso.getCantAlumnos());
            barraProgreso.setValue(curso.getCantAlumnos());
        }
    }

    private void InicializarVentanas() {
        vInf = new VentanaInformacionCurso(curso, this);

        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("Tipo");
        modeloTabla.addColumn("Dni");
        modeloTabla.addColumn("Nacionalidad");
        modeloTabla.addColumn("Fecha Nacimiento");
        modeloTabla.addColumn("Lugar");
        modeloTabla.addColumn("Inscribio");
        modeloTabla.addColumn("Fecha Inscripcion");
        modeloTabla.addColumn("telefono");
        modeloTabla.addColumn("Domicilio");
        modeloTabla.addColumn("Localidad");
        modeloTabla.addColumn("C.P");

        tablaAlumnos = new JTable(modeloTabla);
        scrollPaneLista = new JScrollPane(tablaAlumnos);
        jTextPane1.setLayout(new BorderLayout());

        jTextPane1.add(scrollPaneLista, BorderLayout.CENTER);

        barraProgreso.setMinimum(0);
        barraProgreso.setMaximum(15);

        actualizarListaAlumnos();
    }

    private void boton_PreInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_PreInscribirActionPerformed
        //guardar las variables nuevo alumno en un listaAlumnos.add();
        if (((campo_nombre.getText() != null && campo_apellido.getText() != null
                && campo_dni.getText() != null && campo_dni.getText() != null
                && campo_nac.getText() != null && campo_fecha_nac.getText() != null
                && campo_lugar.getText() != null && campo_inscribio.getText() != null
                && campo_fecha.getText() != null && campo_telefono.getText()
                != null && campo_domicilio.getText() != null && campo_localidad.getText()
                != null && campo_cp.getText() != null && !campo_tipo.getText().isEmpty()
                && !campo_fecha.getText().isEmpty() && !campo_telefono.getText().isEmpty()
                && !campo_nombre.getText().isEmpty() && !campo_apellido.getText().isEmpty()
                && !campo_dni.getText().isEmpty() && !campo_nac.getText().isEmpty()
                && !campo_fecha_nac.getText().isEmpty() && !campo_lugar.getText().isEmpty()
                && !campo_inscribio.getText().isEmpty() && !campo_domicilio.getText().isEmpty()
                && !campo_localidad.getText().isEmpty() && !campo_cp.getText().isEmpty()))
                && (curso.getCantAlumnos() < 15)) {

            Alumno NuevoAlumno = new Alumno(campo_nombre.getText(), campo_apellido.getText(),
                    campo_tipo.getText(), campo_dni.getText(), campo_nac.getText(),
                    campo_fecha_nac.getText(), campo_lugar.getText(), campo_inscribio.getText(),
                    campo_fecha.getText(), campo_telefono.getText(), campo_domicilio.getText(),
                    campo_localidad.getText(), campo_cp.getText());

            curso.setNuevoAlumno(NuevoAlumno);
            curso.setCantAlumnos(curso.getCantAlumnos() + 1);

            //limpiar campos de texto despues de agregar el alumno
            campo_apellido.setText("");
            campo_nombre.setText("");
            campo_tipo.setText("");
            campo_dni.setText("");
            campo_nac.setText("");
            campo_fecha_nac.setText("");
            campo_lugar.setText("");
            campo_inscribio.setText("");
            campo_fecha.setText("");
            campo_telefono.setText("");
            campo_domicilio.setText("");
            campo_localidad.setText("");
            campo_cp.setText("");

        } else {
            if (curso.getCantAlumnos() < 15) {
                JOptionPane.showMessageDialog(this, "No puede haber espacios en blanco ");
            } else {
                JOptionPane.showMessageDialog(this, "El curso esta lleno ");
            }
        }

        //actualizar la lista
        actualizarListaAlumnos();
    }//GEN-LAST:event_boton_PreInscribirActionPerformed

    private void botonInformacionCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInformacionCursoActionPerformed

        JOptionPane.showMessageDialog(this, curso.toString());
    }//GEN-LAST:event_botonInformacionCursoActionPerformed

    private void eliminarAlumno() {

    }

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        int seleccion = tablaAlumnos.getSelectedRow();

        if (seleccion >= 0) {
            curso.delAlumno(seleccion);
            curso.setCantAlumnos(curso.getCantAlumnos() - 1);

        } else {
            if (tablaAlumnos.getRowCount() == 0) {
                curso.setCantAlumnos(0);
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione al menos un alumno para eliminar ");
            }

        }
        actualizarListaAlumnos();

    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonEditarInfoCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarInfoCursoActionPerformed
        vInf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonEditarInfoCursoActionPerformed

    private void botonExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonExportarActionPerformed
        ExportarTexto exp = new ExportarTexto(curso.toString() + " \n " + curso.getListaAlumnos().toString());
    }//GEN-LAST:event_botonExportarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FONDO;
    private javax.swing.JProgressBar barraProgreso;
    private javax.swing.JButton botonEditarInfoCurso;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonExportar;
    private javax.swing.JButton botonInformacionCurso;
    private javax.swing.JButton boton_PreInscribir;
    private javax.swing.JTextField campoCantidadInscriptos;
    private javax.swing.JTextField campo_apellido;
    private javax.swing.JTextField campo_cp;
    private javax.swing.JTextField campo_dni;
    private javax.swing.JTextField campo_domicilio;
    private javax.swing.JTextField campo_fecha;
    private javax.swing.JTextField campo_fecha_nac;
    private javax.swing.JTextField campo_inscribio;
    private javax.swing.JTextField campo_localidad;
    private javax.swing.JTextField campo_lugar;
    private javax.swing.JTextField campo_nac;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JTextField campo_telefono;
    private javax.swing.JTextField campo_tipo;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel texto02;
    private javax.swing.JLabel texto03;
    private javax.swing.JLabel texto101;
    private javax.swing.JLabel texto102;
    private javax.swing.JLabel texto106;
    private javax.swing.JLabel texto107;
    private javax.swing.JLabel texto108;
    private javax.swing.JLabel texto109;
    private javax.swing.JLabel texto110;
    private javax.swing.JLabel texto111;
    private javax.swing.JLabel texto112;
    private javax.swing.JLabel texto113;
    private javax.swing.JLabel texto114;
    private javax.swing.JLabel texto115;
    private javax.swing.JLabel texto116;
    private javax.swing.JLabel texto2;
    // End of variables declaration//GEN-END:variables
}
