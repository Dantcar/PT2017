/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import controle.ClienteCtrl;
import static controle.Util.reduzString;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Cliente;



/**
 *
 * @author Décio
 */
public class TelaRelatorioCliente extends javax.swing.JInternalFrame {

    private static int openFrameCount = 0; //teste
private static final int xOffset = 30, yOffset = 30; //teste
    
    
    public static String rgCliente, nomeCliente;

    /**
     * Creates new form TelaRelatorioCliente
     */
    public TelaRelatorioCliente() {
        initComponents();
         // Center in the screen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        //setLocation(new Point((screenSize.width - frameSize.width) / 2,
        //                     (screenSize.height - frameSize.width) / 2));
        
        //this.setLocation(50, 100); //(ponto inicial apartir lateral,altura)
        setLocation(xOffset*openFrameCount, yOffset*openFrameCount);
        setLocation(new Point((screenSize.width - frameSize.width) / 2,
                              (screenSize.height - frameSize.width) / 2));
        this.repaint();
        populaJComboBoxClientesNome();
        btnListarCliente.setEnabled(false);
        tctCpfCliente.setEditable(false);
        tctIdCliente.setEditable(false);
        //Limpar ComboBox
        cbxNomeCliente.removeAllItems();
        cbxNomeCliente.setSelectedIndex(-1);
        String url = System.getProperty("user.dir") + "\\src\\Icones\\clientePet.jpg";
        colocarFotoLabelUrl(url);
         this.repaint();
    }

    private void populaJComboBoxClientesNome() {
        ClienteCtrl cCliente = new ClienteCtrl();
        cbxNomeCliente.removeAllItems(); //remove os itens atuais do comboBox.
        ArrayList lista = cCliente.populaComboClienteNome(); //retorna os nomes dos clientes do banco.
        Iterator i = lista.iterator();
        while (i.hasNext()) {
            cbxNomeCliente.addItem(String.valueOf(i.next()));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelRelTituloCliente = new javax.swing.JPanel();
        lblTituloRelatorioCliente = new javax.swing.JLabel();
        lblTelaRelatorioCliente = new javax.swing.JLabel();
        PanelRelClientesBotoes = new javax.swing.JPanel();
        btnLimparTelaRelClientes = new javax.swing.JButton();
        btnSairTelaRelatorioCliente = new javax.swing.JButton();
        btnImprimirRelatorioCliente = new javax.swing.JButton();
        PanelTabRelClientesImpresso = new javax.swing.JTabbedPane();
        PainelRelOpcoesCliente = new javax.swing.JPanel();
        lblNomeCliente = new javax.swing.JLabel();
        cbxNomeCliente = new javax.swing.JComboBox();
        btnListarCliente = new javax.swing.JButton();
        btnListarClientesTodos = new javax.swing.JButton();
        lblTelaPetNomeCliente = new javax.swing.JLabel();
        tctNomeCliente = new javax.swing.JTextField();
        btnPesquisarCliente = new javax.swing.JButton();
        lblTelaPetCodigoCliente = new javax.swing.JLabel();
        tctCpfCliente = new javax.swing.JTextField();
        lblTelaPetCodigoCliente1 = new javax.swing.JLabel();
        tctIdCliente = new javax.swing.JTextField();
        PainelRelImpresso = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRelCliente = new javax.swing.JTextArea();
        lblRelatorioClientesFundo = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PainelRelTituloCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        lblTituloRelatorioCliente.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        lblTituloRelatorioCliente.setForeground(new java.awt.Color(102, 102, 102));
        lblTituloRelatorioCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloRelatorioCliente.setText("Petfast - Clientes");

        lblTelaRelatorioCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/pessoaFisica.jpeg"))); // NOI18N

        javax.swing.GroupLayout PainelRelTituloClienteLayout = new javax.swing.GroupLayout(PainelRelTituloCliente);
        PainelRelTituloCliente.setLayout(PainelRelTituloClienteLayout);
        PainelRelTituloClienteLayout.setHorizontalGroup(
            PainelRelTituloClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelRelTituloClienteLayout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(lblTelaRelatorioCliente)
                .addGap(67, 67, 67)
                .addComponent(lblTituloRelatorioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(361, Short.MAX_VALUE))
        );
        PainelRelTituloClienteLayout.setVerticalGroup(
            PainelRelTituloClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelRelTituloClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelRelTituloClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTelaRelatorioCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTituloRelatorioCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(PainelRelTituloCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 940, -1));

        PanelRelClientesBotoes.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnLimparTelaRelClientes.setBackground(new java.awt.Color(204, 204, 204));
        btnLimparTelaRelClientes.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnLimparTelaRelClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/oopsRed.png"))); // NOI18N
        btnLimparTelaRelClientes.setText("Limpar");
        btnLimparTelaRelClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLimparTelaRelClientes.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnLimparTelaRelClientes.setPreferredSize(new java.awt.Dimension(100, 50));
        btnLimparTelaRelClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparTelaRelClientesActionPerformed(evt);
            }
        });

        btnSairTelaRelatorioCliente.setBackground(new java.awt.Color(204, 204, 204));
        btnSairTelaRelatorioCliente.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSairTelaRelatorioCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/saidaDireitaRed.png"))); // NOI18N
        btnSairTelaRelatorioCliente.setText("Voltar");
        btnSairTelaRelatorioCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSairTelaRelatorioCliente.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnSairTelaRelatorioCliente.setPreferredSize(new java.awt.Dimension(100, 50));
        btnSairTelaRelatorioCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairTelaRelatorioClienteActionPerformed(evt);
            }
        });

        btnImprimirRelatorioCliente.setBackground(new java.awt.Color(204, 204, 204));
        btnImprimirRelatorioCliente.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnImprimirRelatorioCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/infraero/pdf2.png"))); // NOI18N
        btnImprimirRelatorioCliente.setText("Imprimir em PDF");
        btnImprimirRelatorioCliente.setToolTipText("Salvar Alterações");
        btnImprimirRelatorioCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnImprimirRelatorioCliente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnImprimirRelatorioCliente.setIconTextGap(2);
        btnImprimirRelatorioCliente.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnImprimirRelatorioCliente.setPreferredSize(new java.awt.Dimension(100, 50));
        btnImprimirRelatorioCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirRelatorioClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelRelClientesBotoesLayout = new javax.swing.GroupLayout(PanelRelClientesBotoes);
        PanelRelClientesBotoes.setLayout(PanelRelClientesBotoesLayout);
        PanelRelClientesBotoesLayout.setHorizontalGroup(
            PanelRelClientesBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRelClientesBotoesLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnLimparTelaRelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(btnImprimirRelatorioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btnSairTelaRelatorioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelRelClientesBotoesLayout.setVerticalGroup(
            PanelRelClientesBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRelClientesBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelRelClientesBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSairTelaRelatorioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimirRelatorioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparTelaRelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(PanelRelClientesBotoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 670, -1));

        PainelRelOpcoesCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        lblNomeCliente.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblNomeCliente.setText("Nome Cliente: ");

        cbxNomeCliente.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        cbxNomeCliente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxNomeClienteItemStateChanged(evt);
            }
        });
        cbxNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNomeClienteActionPerformed(evt);
            }
        });

        btnListarCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnListarCliente.setMnemonic('E');
        btnListarCliente.setText("<= Mostrar Cliente");
        btnListarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarClienteActionPerformed(evt);
            }
        });

        btnListarClientesTodos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnListarClientesTodos.setText("Listar todos Clientes");
        btnListarClientesTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarClientesTodosActionPerformed(evt);
            }
        });

        lblTelaPetNomeCliente.setBackground(new java.awt.Color(102, 102, 102));
        lblTelaPetNomeCliente.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblTelaPetNomeCliente.setText("Cliente:");

        tctNomeCliente.setBackground(new java.awt.Color(255, 239, 191));
        tctNomeCliente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tctNomeCliente.setForeground(new java.awt.Color(51, 51, 51));
        tctNomeCliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        btnPesquisarCliente.setBackground(new java.awt.Color(0, 128, 0));
        btnPesquisarCliente.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        btnPesquisarCliente.setForeground(new java.awt.Color(0, 0, 51));
        btnPesquisarCliente.setText("Pesquisar");
        btnPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarClienteActionPerformed(evt);
            }
        });

        lblTelaPetCodigoCliente.setBackground(new java.awt.Color(102, 102, 102));
        lblTelaPetCodigoCliente.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblTelaPetCodigoCliente.setText("Cpf:");

        tctCpfCliente.setBackground(new java.awt.Color(255, 239, 191));
        tctCpfCliente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tctCpfCliente.setForeground(new java.awt.Color(51, 51, 51));
        tctCpfCliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        lblTelaPetCodigoCliente1.setBackground(new java.awt.Color(102, 102, 102));
        lblTelaPetCodigoCliente1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblTelaPetCodigoCliente1.setText("Id Cliente:");

        tctIdCliente.setEditable(false);
        tctIdCliente.setBackground(new java.awt.Color(255, 239, 191));
        tctIdCliente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        javax.swing.GroupLayout PainelRelOpcoesClienteLayout = new javax.swing.GroupLayout(PainelRelOpcoesCliente);
        PainelRelOpcoesCliente.setLayout(PainelRelOpcoesClienteLayout);
        PainelRelOpcoesClienteLayout.setHorizontalGroup(
            PainelRelOpcoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelRelOpcoesClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelRelOpcoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelRelOpcoesClienteLayout.createSequentialGroup()
                        .addComponent(lblTelaPetNomeCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tctNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                        .addGap(111, 111, 111))
                    .addGroup(PainelRelOpcoesClienteLayout.createSequentialGroup()
                        .addGroup(PainelRelOpcoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelRelOpcoesClienteLayout.createSequentialGroup()
                                .addComponent(lblTelaPetCodigoCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tctCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(lblTelaPetCodigoCliente1)
                                .addGap(18, 18, 18)
                                .addComponent(tctIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnListarClientesTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PainelRelOpcoesClienteLayout.createSequentialGroup()
                                .addComponent(lblNomeCliente)
                                .addGap(18, 18, 18)
                                .addComponent(cbxNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btnListarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        PainelRelOpcoesClienteLayout.setVerticalGroup(
            PainelRelOpcoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelRelOpcoesClienteLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(PainelRelOpcoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelaPetCodigoCliente)
                    .addComponent(tctCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelaPetCodigoCliente1)
                    .addComponent(tctIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(PainelRelOpcoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelaPetNomeCliente)
                    .addComponent(tctNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(PainelRelOpcoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomeCliente)
                    .addComponent(btnListarCliente))
                .addGap(51, 51, 51)
                .addComponent(btnListarClientesTodos)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        PanelTabRelClientesImpresso.addTab("Relatórios Clientes", PainelRelOpcoesCliente);

        txtRelCliente.setEditable(false);
        txtRelCliente.setBackground(new java.awt.Color(125, 181, 199));
        txtRelCliente.setColumns(20);
        txtRelCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtRelCliente.setRows(7);
        txtRelCliente.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 255)));
        jScrollPane1.setViewportView(txtRelCliente);

        javax.swing.GroupLayout PainelRelImpressoLayout = new javax.swing.GroupLayout(PainelRelImpresso);
        PainelRelImpresso.setLayout(PainelRelImpressoLayout);
        PainelRelImpressoLayout.setHorizontalGroup(
            PainelRelImpressoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelRelImpressoLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
                .addContainerGap())
        );
        PainelRelImpressoLayout.setVerticalGroup(
            PainelRelImpressoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelRelImpressoLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        PanelTabRelClientesImpresso.addTab("Relatório Impresso", PainelRelImpresso);

        getContentPane().add(PanelTabRelClientesImpresso, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 680, 340));

        lblRelatorioClientesFundo.setText(" ");
        lblRelatorioClientesFundo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(lblRelatorioClientesFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 270, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparTelaRelClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparTelaRelClientesActionPerformed
        //Limpar ComboBox
        cbxNomeCliente.setSelectedIndex(-1);
        txtRelCliente.setText("");

    }//GEN-LAST:event_btnLimparTelaRelClientesActionPerformed

    private void btnSairTelaRelatorioClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairTelaRelatorioClienteActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairTelaRelatorioClienteActionPerformed

    private void btnImprimirRelatorioClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirRelatorioClienteActionPerformed
        //criamos um documento vazio
        String msg = "";
        String tituloMsg = "Relatório PDF";
        String passagemTexto = txtRelCliente.getText();
        Document documento = new Document();

        try {
            try {
                //criar o documento no diretório do projeto Netbeans AeroFast
                PdfWriter.getInstance(documento, new FileOutputStream("RelatóriosPdf\\documentoPetfastClientes.pdf"));
            } catch (FileNotFoundException ex) {
                msg = msg + ex;
                msg = reduzString(msg);
                Logger.getLogger(TelaRelatorioCliente.class.getName()).log(Level.SEVERE, null, ex);
            }

            //abrir o documento criado.
            documento.open();

            //ajustar o tamanho da pagina
            documento.setPageSize(PageSize.A4);

            //Adicionar um paragrafo
            documento.add(new Paragraph(passagemTexto));

        } catch (DocumentException ex) {
            msg = msg + ex;
            msg = reduzString(msg);
            Logger.getLogger(FrameListaCliente.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            documento.close();

            if (!"".equals(msg)) {
                JOptionPane.showMessageDialog(this, msg, tituloMsg, JOptionPane.WARNING_MESSAGE);
                msg = "";
            } else {
                msg = "Relatório criado em PDF com sucesso";
                JOptionPane.showMessageDialog(this, msg, tituloMsg, JOptionPane.WARNING_MESSAGE);
                msg = "";
            }
        }
    }//GEN-LAST:event_btnImprimirRelatorioClienteActionPerformed

    private void cbxNomeClienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxNomeClienteItemStateChanged

        if (cbxNomeCliente.isValid()) {
            ClienteCtrl cCliente = new ClienteCtrl();
            String nomeCliente = cbxNomeCliente.getSelectedItem().toString();
            System.out.println(nomeCliente);
            Cliente cliNome = cCliente.buscarClientesPorNome(nomeCliente);

            tctCpfCliente.setText(cliNome.getCpf());
            System.out.println(cliNome.getNome());
            System.out.println(cliNome.getCpf());
            System.out.println(cliNome.getIdCliente());
            tctNomeCliente.setText(cliNome.getNome());
            tctIdCliente.setText(cliNome.getIdCliente());
        }

    }//GEN-LAST:event_cbxNomeClienteItemStateChanged

    private void cbxNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNomeClienteActionPerformed
        if ((cbxNomeCliente.getSelectedIndex()) != -1) {
            btnListarCliente.setEnabled(true);
        } else {
            btnListarCliente.setEnabled(false);
        }
    }//GEN-LAST:event_cbxNomeClienteActionPerformed

    private void btnListarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarClienteActionPerformed
        String title = "Relatórios Clientes";
        nomeCliente = cbxNomeCliente.getSelectedItem().toString();
        ClienteCtrl cCliente = new ClienteCtrl();
        List cliente = cCliente.listaClientesNome(nomeCliente);
        PanelTabRelClientesImpresso.setSelectedIndex(1);
        this.carregarListaCliente2(cliente);

    }//GEN-LAST:event_btnListarClienteActionPerformed

    private void btnListarClientesTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarClientesTodosActionPerformed
        String title = "Relatórios Clientes";
        ClienteCtrl cCliente = new ClienteCtrl();
        PanelTabRelClientesImpresso.setSelectedIndex(1);
        List clientes = cCliente.listarClientes();
        this.carregarListaCliente2(clientes);

    }//GEN-LAST:event_btnListarClientesTodosActionPerformed

    private void btnPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarClienteActionPerformed
        // Pesquisar Cliente e buscar lista animais por cliente
        int idClienteP, tam;
        DefaultListModel model = new DefaultListModel();

        ClienteCtrl ccliente = new ClienteCtrl();
        ArrayList listaNome = null;
        listaNome = (ArrayList) ccliente.listaClientesPorNome(tctNomeCliente.getText());
        //Jlist listaAnimais = canimal.receberListaAnimaisCliente(WIDTH);
        if (!listaNome.isEmpty()) {

            tam = listaNome.size() - 1;
            Cliente cli = (Cliente) listaNome.get(0);
            tctCpfCliente.setText(cli.getCpf());
            tctNomeCliente.setText(cli.getNome());
            tctIdCliente.setText(cli.getIdCliente());

            populaJComboBoxClientesNomePesquisado(listaNome);

            // colocarMiniFotoLabel();
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não localizado!");
            tctCpfCliente.setText("");
            tctNomeCliente.setText("");
            tctIdCliente.setText("");
            cbxNomeCliente.setSelectedItem(null);
            cbxNomeCliente.setSelectedIndex(-1);
            cbxNomeCliente.removeAllItems();
            cbxNomeCliente.removeAll();

        }

        /*
         */
    }//GEN-LAST:event_btnPesquisarClienteActionPerformed

    private void populaJComboBoxClientesNomePesquisado(ArrayList cliente) {

        cbxNomeCliente.removeAllItems(); //remove os itens atuais do comboBox.
        Cliente cli = new Cliente();
        String str = null;
        for (int i = 0; i < cliente.size(); i++) {
            cli = (Cliente) cliente.get(i);
            cbxNomeCliente.addItem(cli.getNome());
        }
        /*
         Iterator i = cliente.iterator();
        
         while (i.hasNext()) {
           
         cbxNomeCliente.addItem(cliente.get(i));
         }
         */
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelRelImpresso;
    private javax.swing.JPanel PainelRelOpcoesCliente;
    private javax.swing.JPanel PainelRelTituloCliente;
    private javax.swing.JPanel PanelRelClientesBotoes;
    private javax.swing.JTabbedPane PanelTabRelClientesImpresso;
    private javax.swing.JButton btnImprimirRelatorioCliente;
    private javax.swing.JButton btnLimparTelaRelClientes;
    private javax.swing.JButton btnListarCliente;
    private javax.swing.JButton btnListarClientesTodos;
    private javax.swing.JButton btnPesquisarCliente;
    private javax.swing.JButton btnSairTelaRelatorioCliente;
    private javax.swing.JComboBox cbxNomeCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblRelatorioClientesFundo;
    private javax.swing.JLabel lblTelaPetCodigoCliente;
    private javax.swing.JLabel lblTelaPetCodigoCliente1;
    private javax.swing.JLabel lblTelaPetNomeCliente;
    private javax.swing.JLabel lblTelaRelatorioCliente;
    private javax.swing.JLabel lblTituloRelatorioCliente;
    private static javax.swing.JTextField tctCpfCliente;
    private javax.swing.JTextField tctIdCliente;
    private static javax.swing.JTextField tctNomeCliente;
    private javax.swing.JTextArea txtRelCliente;
    // End of variables declaration//GEN-END:variables

    private void carregarListaCliente2(List<Cliente> ListaClientes) {
        String newline = System.getProperty("line.separator"); //verificar propriedades de System.getProperty
        String resultado = "";

        for (Cliente c : ListaClientes) {

            resultado += ""
                    + "\n\tCódigo Cliente: " + c.getIdCliente() + "\n"
                    + "\n\tNome: " + c.getNome()
                    + "\n\tEndereço: " + c.getEndereco().trim() + "," + c.getNumero()
                    + "\n\tBairro: " + c.getBairro().trim() + " - Cep: " + c.getCep()
                    + "\n\tCidade: " + c.getCidade().trim() + " - UF: " + c.getUf()
                    + "\n\tEmail: " + c.getEmail().trim()
                    + "\n\tTelefone: " + c.getTelefone()
                    + "\n\tRG: " + c.getRg() + " - CPF: " + c.getCpf();

            resultado += newline;

        }
        resultado = "\n\n\t\t\t CADASTRO CLIENTES\n" + resultado;
        txtRelCliente.setText(resultado);
        txtRelCliente.setEditable(false);

    }
    
    private void colocarFotoLabelUrl(String urlFoto) {
        lblRelatorioClientesFundo.setIcon(null);
        Dimension d = lblRelatorioClientesFundo.getSize();
        int width = lblRelatorioClientesFundo.getWidth()-20;
        int height = lblRelatorioClientesFundo.getHeight()-20;
        ImageIcon foto;
        foto = new ImageIcon(urlFoto);
        foto.setImage(foto.getImage().getScaledInstance(250, 400, 100));
        //foto.setImage(foto.getImage().getScaledInstance((d.width - 20), (d.height - 20), 100));
        lblRelatorioClientesFundo.setIcon(foto);
    }

}//Final da Classe TelaRelatorioCliente