/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeswing;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author User
 */
public class Numerologia extends javax.swing.JFrame {
    
    Random r = new Random();
    
    
    public Numerologia() {
        initComponents();
        txtNome.setText(AssistenteNumerologia.nome);
        txtNascimento.setText(String.valueOf(AssistenteNumerologia.dia)+" /"+ AssistenteNumerologia.mes
                +" /"+AssistenteNumerologia.ano);
        txtIdade.setText(String.valueOf(AssistenteNumerologia.idade));
        txtSigno.setText(AssistenteNumerologia.signo);
        txtNSorte.setText(String.valueOf(r.nextInt(100))+ ", " + String.valueOf(r.nextInt(100))+ ", " + String.valueOf(r.nextInt(100)));
        
        if(AssistenteNumerologia.signo.equals("Áries")){
            txtACaracteristica.setText("Características de Áries.\n\n"
                    + " Como o primeiro signo do zodíaco,\n"
                    + " a presença de Áries quase sempre marca\n"
                    + " o início de algo enérgico e turbulento. ...\n"
                    + " Áries é um signo de fogo, assim como Leão e Sagitário.\n"
                    + " Isso significa que está em sua natureza tomar\n"
                    + " medidas e ações, mesmo às vezes sem pensar.");
            ImageIcon ImgSig = new ImageIcon(getClass().getResource("/imagens/aries.png"));
            Image ImgSigImg = ImgSig.getImage().getScaledInstance(130,167, Image.SCALE_DEFAULT);
            lblImg.setIcon(new ImageIcon(ImgSigImg));
        }else if(AssistenteNumerologia.signo.equals("Touro")){
            txtACaracteristica.setText("O Touro, que pertence\n"
                    + " ao elemento Terra, é possessivo,\n"
                    + " teimoso mas realista. É construtivo,\n"
                    + " determinado, firme, mas por vezes inflexível.\n"
                    + " Ele gosta de acumular, afeiçoa-se\n"
                    + " às situações, agarra-se às pessoas.\n"
                    + " É o signo que mais gosta de conservar\n"
                    + " e de dar continuidade aos seus projectos de vida.");
            ImageIcon ImgSig = new ImageIcon(getClass().getResource("/imagens/touro.png"));
            Image ImgSigImg = ImgSig.getImage().getScaledInstance(130,167, Image.SCALE_DEFAULT);
            lblImg.setIcon(new ImageIcon(ImgSigImg));
        }else if(AssistenteNumerologia.signo.equals("Gêmeos")){
            txtACaracteristica.setText("O signo de Gémeos,\n"
                    + " que pertence ao elemento Ar,\n"
                    + " é racionalista, comunicativo,\n"
                    + " inconstante, vivo, irrequieto,\n"
                    + " curioso, e… um tanto volúvel.\n"
                    + " Ele é nervoso, mutável e por vezes\n"
                    + " imprevisível. ... O desassossego e a inconstância\n"
                    + " não são as características principais dos nativos de Gémeos.");
            ImageIcon ImgSig = new ImageIcon(getClass().getResource("/imagens/gemeos.png"));
            Image ImgSigImg = ImgSig.getImage().getScaledInstance(130,167, Image.SCALE_DEFAULT);
            lblImg.setIcon(new ImageIcon(ImgSigImg));
        }else if(AssistenteNumerologia.signo.equals("Câncer")){
            txtACaracteristica.setText("Alguns dos traços negativos\n"
                    + " de Câncer incluem mau humor, pessimismo,\n"
                    + " e ser grudento. No entanto,\n"
                    + " eles também têm muitos traços positivos.\n"
                    + " Algumas das características positivas de\n"
                    + " Câncer são criatividade, espontaneidade,\n"
                    + " lealdade e generosidade.\n"
                    + " O homem de Câncer é uma pessoa emocional,\n"
                    + " que gosta de cuidar das pessoas.");
            ImageIcon ImgSig = new ImageIcon(getClass().getResource("/imagens/cancer.png"));
            Image ImgSigImg = ImgSig.getImage().getScaledInstance(130,167, Image.SCALE_DEFAULT);
            lblImg.setIcon(new ImageIcon(ImgSigImg));
        }else if(AssistenteNumerologia.signo.equals("Leão")){
            txtACaracteristica.setText("O Leão, que pertence\n"
                    + " ao elemento fogo, é dominador,\n"
                    + " cintilante, autoritário, mas benevolente.\n"
                    + " Ardente nas suas paixões e supremo mestre\n"
                    + " na arte de amar, ele traduz bem a\n"
                    + " energia de um signo de fogo. Não sabemos\n"
                    + " se o Leão é despótico. ... Este ardente\n"
                    + " signo do Fogo não se compadece com pequenas medidas.");
            ImageIcon ImgSig = new ImageIcon(getClass().getResource("/imagens/leao.png"));
            Image ImgSigImg = ImgSig.getImage().getScaledInstance(130,167, Image.SCALE_DEFAULT);
            lblImg.setIcon(new ImageIcon(ImgSigImg));
        }else if(AssistenteNumerologia.signo.equals("Virgem")){
            txtACaracteristica.setText("Alguns dos traços positivos\n"
                    + " de Virgem incluem confiabilidade,\n"
                    + " inteligência, praticidade e modéstia.\n"
                    + " No entanto, como qualquer outro\n"
                    + " signo do zodíaco, Virgem também\n"
                    + " tem características negativas.\n"
                    + " Algumas delas incluem pieguice,\n"
                    + " meticulosidade, negatividade,\n"
                    + " irritabilidade, e ser excessivamente reservado.");
            ImageIcon ImgSig = new ImageIcon(getClass().getResource("/imagens/virgem.png"));
            Image ImgSigImg = ImgSig.getImage().getScaledInstance(130,167, Image.SCALE_DEFAULT);
            lblImg.setIcon(new ImageIcon(ImgSigImg));
        }else if(AssistenteNumerologia.signo.equals("Libra")){
            txtACaracteristica.setText("O signo de libra\n"
                    + " é regido por Vênus, isso\n"
                    + " o faz ser especialista na arte\n"
                    + " do sexo e da sedução. A sensualidade\n"
                    + " está grudada na pele dele,\n"
                    + " e com esse jeitinho é romântico,\n"
                    + " charmoso e até refinado na hora do vamos ver.");
            ImageIcon ImgSig = new ImageIcon(getClass().getResource("/imagens/libra.png"));
            Image ImgSigImg = ImgSig.getImage().getScaledInstance(130,167, Image.SCALE_DEFAULT);
            lblImg.setIcon(new ImageIcon(ImgSigImg));
        }else if(AssistenteNumerologia.signo.equals("Escorpião")){
            txtACaracteristica.setText("Escorpião é um signo\n"
                    + " de água e vive para experimentar\n"
                    + " e expressar emoções. Embora as emoções sejam\n"
                    + " muito importantes para o Escorpião,\n"
                    + " elas se manifestam de forma diferente do que\n"
                    + " os outros signos de água. De qualquer\n"
                    + " forma, você pode ter certeza de que\n"
                    + " o Escorpião vai manter seus segredos,\n"
                    + " sejam eles quais forem.");
            ImageIcon ImgSig = new ImageIcon(getClass().getResource("/imagens/escorpiao.png"));
            Image ImgSigImg = ImgSig.getImage().getScaledInstance(130,167, Image.SCALE_DEFAULT);
            lblImg.setIcon(new ImageIcon(ImgSigImg));
        }else if(AssistenteNumerologia.signo.equals("Sagitário")){
            txtACaracteristica.setText("Sagitário é extrovertido,\n"
                    + " otimista e entusiasta,\n"
                    + " e gosta de mudanças. Os nascidos\n"
                    + " em Sagitário são capazes de\n"
                    + " transformar seus pensamentos\n"
                    + " em ações concretas e fazem qualquer\n"
                    + " coisa para atingir seus objetivos.");
            ImageIcon ImgSig = new ImageIcon(getClass().getResource("/imagens/sagitario.png"));
            Image ImgSigImg = ImgSig.getImage().getScaledInstance(130,167, Image.SCALE_DEFAULT);
            lblImg.setIcon(new ImageIcon(ImgSigImg));
        }else if(AssistenteNumerologia.signo.equals("Capricórnio")){
            txtACaracteristica.setText("Como um signo de Terra,\n"
                    + " para um capricorniano não\n"
                    + " há nada mais importante na vida\n"
                    + " do que a família. Capricórnio\n"
                    + " é um mestre em autocontrole e tem\n"
                    + " o potencial para ser um grande\n"
                    + " líder ou gestor, desde que seja\n"
                    + " na esfera dos negócios.");
            ImageIcon ImgSig = new ImageIcon(getClass().getResource("/imagens/capricornio.png"));
            Image ImgSigImg = ImgSig.getImage().getScaledInstance(130,167, Image.SCALE_DEFAULT);
            lblImg.setIcon(new ImageIcon(ImgSigImg));
        }else if(AssistenteNumerologia.signo.equals("Aquário")){
            txtACaracteristica.setText(" Pelo lado positivo,\n"
                    + " o aquariano é simpático e humanitário.\n"
                    + " É honesto e totalmente leal;\n"
                    + " é original e brilhante;\n"
                    + " é independente e intelectual.\n"
                    + " Pelo lado negativo, o aquariano\n"
                    + " é imprevisível e tende a contrariar.");
            ImageIcon ImgSig = new ImageIcon(getClass().getResource("/imagens/aquario.png"));
            Image ImgSigImg = ImgSig.getImage().getScaledInstance(130,167, Image.SCALE_DEFAULT);
            lblImg.setIcon(new ImageIcon(ImgSigImg));
        }else if(AssistenteNumerologia.signo.equals("Peixe")){
            txtACaracteristica.setText("Peixes é um signo de água e,\n"
                    + " dessa forma, este signo\n"
                    + " do zodíaco é caracterizado\n"
                    + " por empatia e capacidade\n"
                    + " emocional expressa.");
            ImageIcon ImgSig = new ImageIcon(getClass().getResource("/imagens/peixes.png"));
            Image ImgSigImg = ImgSig.getImage().getScaledInstance(130,167, Image.SCALE_DEFAULT);
            lblImg.setIcon(new ImageIcon(ImgSigImg));
        }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtNascimento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtIdade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNSorte = new javax.swing.JTextField();
        txtSigno = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtACaracteristica = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        lblImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel1.setText("Nome");

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel2.setText("Nascimento");

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel3.setText("Signo");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Características");

        txtNome.setEditable(false);

        txtNascimento.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel5.setText("Idade");

        txtIdade.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel6.setText("Número da Sorte");

        txtNSorte.setEditable(false);

        txtSigno.setEditable(false);

        txtACaracteristica.setEditable(false);
        txtACaracteristica.setColumns(20);
        txtACaracteristica.setRows(5);
        jScrollPane1.setViewportView(txtACaracteristica);

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNascimento)
                                    .addComponent(txtSigno, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNSorte))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)))
                .addGap(40, 40, 40))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(txtNSorte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSigno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1)
                    .addComponent(lblImg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AssistenteNumerologia assis = new AssistenteNumerologia();
        assis.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Numerologia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Numerologia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Numerologia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Numerologia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Numerologia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImg;
    private javax.swing.JTextArea txtACaracteristica;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNSorte;
    private javax.swing.JTextField txtNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSigno;
    // End of variables declaration//GEN-END:variables
}
