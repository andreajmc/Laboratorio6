package lab6_andreamendoza;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class LogIn extends javax.swing.JFrame {

    public LogIn() {
        initComponents();

    }

    private void LeerArchivos() throws FileNotFoundException, IOException {
        boolean d = false;
        boolean s = false;

        File Movie = new File("./pelis.txt");
        File Series = new File("./series.txt");
        DefaultTreeModel m = (DefaultTreeModel) netflix.getModel();
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) m.getRoot();
        FileReader fr = new FileReader(Movie);
        BufferedReader buff = new BufferedReader(fr);
        FileReader fr2 = new FileReader(Series);
        BufferedReader buff2 = new BufferedReader(fr2);
        String Peli = buff.readLine();
        String Serie = buff2.readLine();

        String[] P1 = Peli.split(";");
        String[] P2 = Serie.split(";");

        for (Object P : Arrays.asList(P1)) {
            String[] Atributos = ((String) P).split(",");
            if (Atributos[6].equals("true")) {
                d = true;
            }

            if (Atributos[7].equals("true")) {
                s = true;
            }
            double dur = Double.parseDouble(Atributos[1]);
            String[] Actores = Atributos[3].split(":");
            ArrayList Actores2 = new ArrayList();
            for (int i = 0; i < Actores.length; i++) {
                Actores2.add(Actores[i]);
            }
            PMain.add(new Pelicula(Atributos[0], dur, Atributos[2], Actores2, Atributos[5], Atributos[6], d, s, Atributos[4]));
        }

        for (Object P : Arrays.asList(P2)) {
            String[] Atributos = ((String) P).split(",");
            if (Atributos[6].equals("true")) {
                d = true;
            }

            if (Atributos[7].equals("true")) {
                s = true;
            }
            double dur = Double.parseDouble(Atributos[1]);
            int temp = Integer.parseInt(Atributos[4]);
            String[] Actores3 = Atributos[3].split(":");
            ArrayList Actores4 = new ArrayList();
            for (int i = 0; i < Actores3.length; i++) {
                Actores4.add(Actores3[i]);
            }
            SMain.add(new Serie(Atributos[0], dur, Atributos[2], Actores4, temp, Atributos[6], Atributos[5], d, s));
        }

        for (int i = 0; i < root.getChildCount(); i++) {
            for (Pelicula pe : PMain) {
                if (root.getChildAt(0).getChildCount() > 0) {

                    if (root.getChildAt(0).getChildAt(i).toString().equals(pe.getCategoría())) {
                        DefaultMutableTreeNode p = (DefaultMutableTreeNode) root.getChildAt(0);
                        DefaultMutableTreeNode c = (DefaultMutableTreeNode) root.getChildAt(0).getChildAt(i);
                        c.add(new DefaultMutableTreeNode(pe.getName()));
                    } else {
                        DefaultMutableTreeNode p = (DefaultMutableTreeNode) root.getChildAt(0);
                        DefaultMutableTreeNode n = new DefaultMutableTreeNode(pe.getCategoría());
                        DefaultMutableTreeNode x = new DefaultMutableTreeNode(pe.getName());
                        n.add(x);
                        p.add(n);
                        root.add(p);
                    }
                } else {
                    DefaultMutableTreeNode p = (DefaultMutableTreeNode) root.getChildAt(0);
                    DefaultMutableTreeNode n = new DefaultMutableTreeNode(pe.getCategoría());
                    DefaultMutableTreeNode x = new DefaultMutableTreeNode(pe.getName());
                    n.add(x);
                    p.add(n);
                    root.add(p);
                }
                m.reload();
                netflix.setModel(m);
            }
        }
        
        for (int i = 0; i < root.getChildCount(); i++) {
            for (Serie se : SMain) {
                if (root.getChildAt(1).getChildCount() > 0) {
                    if (root.getChildAt(1).getChildAt(i).toString().equals(se.getCategoría())) {
                        DefaultMutableTreeNode c = (DefaultMutableTreeNode) root.getChildAt(1).getChildAt(i);
                        c.add(new DefaultMutableTreeNode(se.getName()));
                    } else {
                        DefaultMutableTreeNode p = (DefaultMutableTreeNode) root.getChildAt(1);
                        DefaultMutableTreeNode n = new DefaultMutableTreeNode(se.getCategoría());
                        DefaultMutableTreeNode x = new DefaultMutableTreeNode(se.getName());
                        n.add(x);
                        p.add(n);
                        root.add(p);
                    }

                } else {
                    DefaultMutableTreeNode p = (DefaultMutableTreeNode) root.getChildAt(1);
                    DefaultMutableTreeNode n = new DefaultMutableTreeNode(se.getCategoría());
                    DefaultMutableTreeNode x = new DefaultMutableTreeNode(se.getName());
                    n.add(x);
                    p.add(n);
                    root.add(p);
                }
                m.reload();
                netflix.setModel(m);
            }

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JTree = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        netflix = new javax.swing.JTree();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        AddMovie = new javax.swing.JMenuItem();
        AddSerie = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenuItem();
        PPMenu = new javax.swing.JPopupMenu();
        NewPeli = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        Subtitulos = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        Guardar = new javax.swing.JButton();
        NewSerie = new javax.swing.JDialog();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jCheckBox2 = new javax.swing.JCheckBox();
        Subtitulos1 = new javax.swing.JCheckBox();
        jLabel16 = new javax.swing.JLabel();
        Guardar1 = new javax.swing.JButton();
        jTextField13 = new javax.swing.JTextField();
        user = new javax.swing.JTextField();
        pw = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Nesflis");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Películas");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Series");
        treeNode1.add(treeNode2);
        netflix.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        netflix.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                netflixMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(netflix);

        jMenu1.setText("Opciones");

        AddMovie.setText("Agregar Película");
        AddMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMovieActionPerformed(evt);
            }
        });
        jMenu1.add(AddMovie);

        AddSerie.setText("Agregar Serie");
        AddSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSerieActionPerformed(evt);
            }
        });
        jMenu1.add(AddSerie);

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jMenu1.add(Salir);

        jMenuBar1.add(jMenu1);

        JTree.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout JTreeLayout = new javax.swing.GroupLayout(JTree.getContentPane());
        JTree.getContentPane().setLayout(JTreeLayout);
        JTreeLayout.setHorizontalGroup(
            JTreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JTreeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
                .addContainerGap())
        );
        JTreeLayout.setVerticalGroup(
            JTreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JTreeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText("Nombre");

        jLabel4.setText("Duración");

        jLabel5.setText("Categoría");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Romantica", "Suspenso", "Terror", "Animacion", "Fantasia" }));

        jLabel6.setText("Actores");

        jLabel7.setText("Productora");

        jLabel8.setText("Idioma");

        jCheckBox1.setText("Doblaje");

        Subtitulos.setText("Subtitulos");

        jLabel9.setText("Director");

        Guardar.setText("Guardar");
        Guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GuardarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout NewPeliLayout = new javax.swing.GroupLayout(NewPeli.getContentPane());
        NewPeli.getContentPane().setLayout(NewPeliLayout);
        NewPeliLayout.setHorizontalGroup(
            NewPeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewPeliLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NewPeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NewPeliLayout.createSequentialGroup()
                        .addGroup(NewPeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(NewPeliLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(NewPeliLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(NewPeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, NewPeliLayout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, NewPeliLayout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, NewPeliLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(NewPeliLayout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(NewPeliLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(NewPeliLayout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addGap(18, 18, 18)
                        .addComponent(Subtitulos)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(NewPeliLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(Guardar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        NewPeliLayout.setVerticalGroup(
            NewPeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewPeliLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(NewPeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NewPeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(NewPeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(NewPeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NewPeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NewPeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NewPeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(NewPeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(Subtitulos))
                .addGap(18, 18, 18)
                .addComponent(Guardar)
                .addGap(5, 5, 5))
        );

        jLabel10.setText("Nombre");

        jLabel11.setText("Duración");

        jLabel12.setText("Categoría");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reality TV", "Drama", "Paranormal", "Comedia", "Medieval" }));

        jLabel13.setText("Actores");

        jLabel14.setText("Productora");

        jLabel15.setText("Idioma");

        jCheckBox2.setText("Doblaje");

        Subtitulos1.setText("Subtitulos");

        jLabel16.setText("Temporadas");

        Guardar1.setText("Guardar");
        Guardar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Guardar1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout NewSerieLayout = new javax.swing.GroupLayout(NewSerie.getContentPane());
        NewSerie.getContentPane().setLayout(NewSerieLayout);
        NewSerieLayout.setHorizontalGroup(
            NewSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewSerieLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NewSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NewSerieLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(NewSerieLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(NewSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, NewSerieLayout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, NewSerieLayout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, NewSerieLayout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(NewSerieLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(NewSerieLayout.createSequentialGroup()
                        .addComponent(jCheckBox2)
                        .addGap(18, 18, 18)
                        .addComponent(Subtitulos1))
                    .addGroup(NewSerieLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(NewSerieLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(Guardar1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        NewSerieLayout.setVerticalGroup(
            NewSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewSerieLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(NewSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NewSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(NewSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(NewSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NewSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NewSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NewSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(NewSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox2)
                    .addComponent(Subtitulos1))
                .addGap(18, 18, 18)
                .addComponent(Guardar1)
                .addGap(5, 5, 5))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jButton1.setText("Guardar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel1.setText("Usuario");

        jLabel2.setText("Contraseña");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pw)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pw, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String un = user.getText();
        String password = pw.getText();
        for (String U : Usuarios) {
            String[] temp = U.split(",");
            if (un.equals(temp[0]) && password.equals(temp[1])) {
                JTree.pack();
                JTree.setVisible(true);
                this.setVisible(false);
                try {
                    LeerArchivos();
                } catch (FileNotFoundException ex) {
                    System.out.println("error");
                } catch (IOException ex) {
                    Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            } else if (Usuarios.indexOf(U) == Usuarios.size() - 1) {
                JOptionPane.showMessageDialog(this, "El usuario o la contraseña son incorrectos. Inténtelo de nuevo.");
            }
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void netflixMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_netflixMouseClicked
        if (evt.isMetaDown()) {
            PPMenu.show(this, evt.getX(), getY());
        }
    }//GEN-LAST:event_netflixMouseClicked

    private void AddMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMovieActionPerformed
        NewPeli.pack();
        NewPeli.setVisible(true);
    }//GEN-LAST:event_AddMovieActionPerformed

    private void GuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarMouseClicked
        String n = this.jTextField1.getText();
        int dur = Integer.parseInt(this.jTextField2.getText());
        String cat = this.jComboBox1.getSelectedItem().toString();
        String act = this.jTextField3.getText();
        String pro = this.jTextField4.getText();
        String idioma = this.jTextField5.getText();
        String director = this.jTextField6.getText();
        boolean doblaje = this.jCheckBox1.isSelected();
        boolean sub = this.Subtitulos.isSelected();
        PMain.add(new Pelicula(n, dur, cat, new ArrayList(), pro, idioma, doblaje, sub, director));
        String[] Actores = act.split(",");
        for (int i = 0; i < Actores.length; i++) {
            PMain.get(PMain.size() - 1).getActores().add(Actores[i]);
        }
        Admin a = new Admin("./pelis.txt");
        try {
            a.escribirArchivo();
        } catch (IOException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_GuardarMouseClicked

    private void Guardar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Guardar1MouseClicked
        String n = this.jTextField7.getText();
        int dur = Integer.parseInt(this.jTextField8.getText());
        String cat = this.jComboBox2.getSelectedItem().toString();
        String act = this.jTextField9.getText();
        String pro = this.jTextField10.getText();
        String idioma = this.jTextField11.getText();
        int temp = Integer.parseInt(this.jTextField13.getText());
        boolean doblaje = this.jCheckBox2.isSelected();
        boolean sub = this.Subtitulos1.isSelected();
        SMain.add(new Serie(n, dur, cat, new ArrayList(), temp, pro, idioma, doblaje, sub));
        String[] Actores = act.split(",");
        for (int i = 0; i < Actores.length; i++) {
            SMain.get(SMain.size() - 1).getActores().add(Actores[i]);
        }
        Admin a = new Admin("./series.txt");
        try {
            a.escribirArchivo();
        } catch (IOException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Guardar1MouseClicked

    private void AddSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSerieActionPerformed
        NewSerie.pack();
        NewSerie.setVisible(true);
    }//GEN-LAST:event_AddSerieActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        JTree.setVisible(false);
        this.setVisible(true);

    }//GEN-LAST:event_SalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws FileNotFoundException {
        Users = new File("./usuarios.txt");
        try {
            Scanner sc = new Scanner(Users);
            Usuarios = new ArrayList();
            sc.useDelimiter(";");
            while (sc.hasNext()) {
                Usuarios.add(sc.next());
            }
            System.out.println(Usuarios);
        } catch (Exception e) {
        }

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AddMovie;
    private javax.swing.JMenuItem AddSerie;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton Guardar1;
    private javax.swing.JDialog JTree;
    private javax.swing.JDialog NewPeli;
    private javax.swing.JDialog NewSerie;
    private javax.swing.JPopupMenu PPMenu;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JCheckBox Subtitulos;
    private javax.swing.JCheckBox Subtitulos1;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTree netflix;
    private javax.swing.JPasswordField pw;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
static File Users;
    static ArrayList<String> Usuarios;
    ArrayList<Pelicula> PMain = new ArrayList();
    ArrayList<Serie> SMain = new ArrayList();
    ArrayList Pelis;
}
