/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JDesktopPane;
import javax.swing.JLayeredPane;

/**
 *
 * @author Décio
 */
public class EntradaSistemaPetFast extends javax.swing.JFrame {

   private static final int DT_WIDTH = 700;
   private static final int DT_HEIGHT = 500;
   private static final Dimension DESKTOP_SIZE = new Dimension(DT_WIDTH, DT_HEIGHT);
   private JDesktopPane desktop = new JDesktopPane();
   //private static final int IF_WIDTH = 150;
   //private static final int IF_HEIGHT = 100;
   //private static final Dimension INT_FRAME_SIZE = new Dimension(IF_WIDTH, IF_HEIGHT);
    /**
     * Creates new form EntradaSistemaPetFast
     */
    public EntradaSistemaPetFast() {
        initComponents();
        
        //JDesktopPane desktop = new JDesktopPane();
        desktop.setPreferredSize(DESKTOP_SIZE);
        
        this.pack();
        String pathProjeto = System.getProperty("user.dir")+"//";
        String iconPetfast = pathProjeto + "src//Icones//petfastIcone.png";
        //System.out.println(iconPetfast);
        setIconImage(Toolkit.getDefaultToolkit().getImage( iconPetfast ));
        //setIconImage(new ImageIcon(getClass().getResource(pathProjeto + "src//Icones//petfastIcone.ico")));
        setExtendedState(MAXIMIZED_BOTH); //maximizar a tela principal
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuAtendimento = new javax.swing.JMenu();
        menuAdministrarAtendimento = new javax.swing.JMenu();
        subMenuConsultarAgenda = new javax.swing.JMenuItem();
        jMenuAgendarServico = new javax.swing.JMenuItem();
        menuCadastroCliente_Pet = new javax.swing.JMenu();
        subMenuCliente = new javax.swing.JMenuItem();
        subMenuPet = new javax.swing.JMenuItem();
        menuBox_Especialista = new javax.swing.JMenu();
        subMenuBox = new javax.swing.JMenuItem();
        MenuProfissional = new javax.swing.JMenu();
        SubMenuGestaoProfissional = new javax.swing.JMenuItem();
        menuRelatorios = new javax.swing.JMenu();
        subMenuRelatorioAtendimento = new javax.swing.JMenuItem();
        subMenuRelatorioCliente = new javax.swing.JMenuItem();
        subMenuRelatorioPet = new javax.swing.JMenuItem();
        menuMonitoria = new javax.swing.JMenu();
        PetCamOnline = new javax.swing.JMenuItem();
        menuSobre = new javax.swing.JMenu();
        subMenuSobre = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();
        subMenuSair = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(213, 245, 173));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenuBar1.setBackground(new java.awt.Color(156, 116, 64));

        menuAtendimento.setBackground(new java.awt.Color(156, 116, 64));
        menuAtendimento.setText("Atendimento");
        menuAtendimento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        menuAdministrarAtendimento.setBackground(new java.awt.Color(228, 196, 154));
        menuAdministrarAtendimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/alterar.png"))); // NOI18N
        menuAdministrarAtendimento.setText("Administrar Atendimento");
        menuAdministrarAtendimento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        subMenuConsultarAgenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        subMenuConsultarAgenda.setBackground(new java.awt.Color(228, 196, 154));
        subMenuConsultarAgenda.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        subMenuConsultarAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/IconesPet/iconeAtendimento.jpg"))); // NOI18N
        subMenuConsultarAgenda.setText("Consultar Agenda");
        subMenuConsultarAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuConsultarAgendaActionPerformed(evt);
            }
        });
        menuAdministrarAtendimento.add(subMenuConsultarAgenda);

        jMenuAgendarServico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuAgendarServico.setBackground(new java.awt.Color(228, 196, 154));
        jMenuAgendarServico.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jMenuAgendarServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/IconesPet/iconeAtendimento1.png"))); // NOI18N
        jMenuAgendarServico.setText("Agendar Serviço");
        jMenuAgendarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAgendarServicoActionPerformed(evt);
            }
        });
        menuAdministrarAtendimento.add(jMenuAgendarServico);

        menuAtendimento.add(menuAdministrarAtendimento);

        jMenuBar1.add(menuAtendimento);

        menuCadastroCliente_Pet.setBackground(new java.awt.Color(156, 116, 64));
        menuCadastroCliente_Pet.setText(" Cliente/Pet ");
        menuCadastroCliente_Pet.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        menuCadastroCliente_Pet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroCliente_PetActionPerformed(evt);
            }
        });

        subMenuCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        subMenuCliente.setBackground(new java.awt.Color(228, 196, 154));
        subMenuCliente.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        subMenuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/IconesPet/iconeClientes.png"))); // NOI18N
        subMenuCliente.setText("Cliente ");
        subMenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuClienteActionPerformed(evt);
            }
        });
        menuCadastroCliente_Pet.add(subMenuCliente);

        subMenuPet.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        subMenuPet.setBackground(new java.awt.Color(228, 196, 154));
        subMenuPet.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        subMenuPet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/IconesPet/iconePetAnimal9.jpg"))); // NOI18N
        subMenuPet.setText("Pet - Animal");
        subMenuPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuPetActionPerformed(evt);
            }
        });
        menuCadastroCliente_Pet.add(subMenuPet);

        jMenuBar1.add(menuCadastroCliente_Pet);

        menuBox_Especialista.setBackground(new java.awt.Color(156, 116, 64));
        menuBox_Especialista.setText("Box / Especialista");
        menuBox_Especialista.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        subMenuBox.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        subMenuBox.setBackground(new java.awt.Color(228, 196, 154));
        subMenuBox.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        subMenuBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/IconesPet/iconeAtendimento1.png"))); // NOI18N
        subMenuBox.setText("Box");
        subMenuBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuBoxActionPerformed(evt);
            }
        });
        menuBox_Especialista.add(subMenuBox);

        MenuProfissional.setBackground(new java.awt.Color(228, 196, 154));
        MenuProfissional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/IconesPet/iconeAtendente.png"))); // NOI18N
        MenuProfissional.setText("Profissional");
        MenuProfissional.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        SubMenuGestaoProfissional.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        SubMenuGestaoProfissional.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SubMenuGestaoProfissional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/IconesPet/iconeClientes1.png"))); // NOI18N
        SubMenuGestaoProfissional.setText("Gestão Profissional");
        SubMenuGestaoProfissional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuGestaoProfissionalActionPerformed(evt);
            }
        });
        MenuProfissional.add(SubMenuGestaoProfissional);

        menuBox_Especialista.add(MenuProfissional);

        jMenuBar1.add(menuBox_Especialista);

        menuRelatorios.setBackground(new java.awt.Color(156, 116, 64));
        menuRelatorios.setText("Relatórios");
        menuRelatorios.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        subMenuRelatorioAtendimento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        subMenuRelatorioAtendimento.setBackground(new java.awt.Color(228, 196, 154));
        subMenuRelatorioAtendimento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        subMenuRelatorioAtendimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/IconesPet/iconeCaixa.png"))); // NOI18N
        subMenuRelatorioAtendimento.setText("Atendimento");
        subMenuRelatorioAtendimento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        subMenuRelatorioAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuRelatorioAtendimentoActionPerformed(evt);
            }
        });
        menuRelatorios.add(subMenuRelatorioAtendimento);

        subMenuRelatorioCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        subMenuRelatorioCliente.setBackground(new java.awt.Color(228, 196, 154));
        subMenuRelatorioCliente.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        subMenuRelatorioCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/IconesPet/iconeClientes1.png"))); // NOI18N
        subMenuRelatorioCliente.setText("Cliente");
        subMenuRelatorioCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subMenuRelatorioCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuRelatorioClienteActionPerformed(evt);
            }
        });
        menuRelatorios.add(subMenuRelatorioCliente);

        subMenuRelatorioPet.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        subMenuRelatorioPet.setBackground(new java.awt.Color(228, 196, 154));
        subMenuRelatorioPet.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        subMenuRelatorioPet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/IconesPet/iconePetAnimal2.jpg"))); // NOI18N
        subMenuRelatorioPet.setText("Pet");
        subMenuRelatorioPet.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subMenuRelatorioPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuRelatorioPetActionPerformed(evt);
            }
        });
        menuRelatorios.add(subMenuRelatorioPet);

        jMenuBar1.add(menuRelatorios);

        menuMonitoria.setBackground(new java.awt.Color(156, 116, 64));
        menuMonitoria.setText("Monitoria");
        menuMonitoria.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        PetCamOnline.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.SHIFT_MASK));
        PetCamOnline.setBackground(new java.awt.Color(228, 196, 154));
        PetCamOnline.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        PetCamOnline.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/eye-icon.png"))); // NOI18N
        PetCamOnline.setText("PetCam Online");
        PetCamOnline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PetCamOnlineActionPerformed(evt);
            }
        });
        menuMonitoria.add(PetCamOnline);

        jMenuBar1.add(menuMonitoria);

        menuSobre.setBackground(new java.awt.Color(156, 116, 64));
        menuSobre.setText("Sobre");
        menuSobre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        subMenuSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.ALT_MASK));
        subMenuSobre.setBackground(new java.awt.Color(228, 196, 154));
        subMenuSobre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        subMenuSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/IconesPet/iconeAbout.jpg"))); // NOI18N
        subMenuSobre.setText("Sobre");
        subMenuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuSobreActionPerformed(evt);
            }
        });
        menuSobre.add(subMenuSobre);

        jMenuBar1.add(menuSobre);

        menuSair.setBackground(new java.awt.Color(156, 116, 64));
        menuSair.setText("Sair");
        menuSair.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        subMenuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        subMenuSair.setBackground(new java.awt.Color(228, 196, 154));
        subMenuSair.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        subMenuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/IconesPet/iconeSair.png"))); // NOI18N
        subMenuSair.setText("Sair");
        subMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuSairActionPerformed(evt);
            }
        });
        menuSair.add(subMenuSair);

        jMenuBar1.add(menuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 679, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subMenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuClienteActionPerformed
        // Cadastro.montaTelaCliente();
        
        String tituloCliente;
        tituloCliente = "Gestão Cliente";

        TelaCliente telaCliente = new TelaCliente();
        telaCliente.setTitle(tituloCliente);
        telaCliente.setVisible(true);
        add(telaCliente, JLayeredPane.DRAG_LAYER);
        //desktop.add(telaCliente, JLayeredPane.DRAG_LAYER);
        telaCliente.setDefaultCloseOperation(1);//DISPOSE_ON_CLOSE
        telaCliente.setLocation(40, 5); //(ponto inicial apartir lateral,altura)
        telaCliente.pack();
        
        /*
        TelaCliente telaCliente = new TelaCliente();
        telaCliente.setTitle(Cadastro.tituloCliente);
        telaCliente.setVisible(true);
        telaCliente.setDefaultCloseOperation(1);//DISPOSE_ON_CLOSE
        telaCliente.setLocation(50, 50);
        */
        
        
    }//GEN-LAST:event_subMenuClienteActionPerformed

    private void subMenuPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuPetActionPerformed
        
        String tituloCliente;
        tituloCliente = "Gestão Pet / Cliente";

        TelaClientePet telaClientePet = new TelaClientePet();
        telaClientePet.setTitle(tituloCliente);
        telaClientePet.pack();
        telaClientePet.setLocation(50, 50); //(ponto inicial apartir lateral,altura)
        telaClientePet.setVisible(true);
        
        add(telaClientePet, JLayeredPane.DRAG_LAYER);

        telaClientePet.setDefaultCloseOperation(1);//DISPOSE_ON_CLOSE
        
        
        //setLocationRelativeTo(null);
        
        
        /*
        String tituloPassageiro ;
        tituloPassageiro = "Gestão Passageiro";

        TelaNovoPassageiro telaPassageiro = new TelaNovoPassageiro();
        telaPassageiro.setTitle(tituloPassageiro);
        telaPassageiro.setVisible(true);
        //add(telaPassageiro, JLayeredPane.DRAG_LAYER);
        add(telaPassageiro, JLayeredPane.DEFAULT_LAYER);
        telaPassageiro.setDefaultCloseOperation(1);
        telaPassageiro.setLocation(40, 5);
        */
    }//GEN-LAST:event_subMenuPetActionPerformed

    private void menuCadastroCliente_PetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroCliente_PetActionPerformed

    }//GEN-LAST:event_menuCadastroCliente_PetActionPerformed

    private void subMenuBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuBoxActionPerformed
        //Cadastro.montaTelaNewVoo();
/*
        String tituloStatus;
        tituloStatus ="Gestão Voo";

        TelaNovoVoo telaVoo = new TelaNovoVoo();
        telaVoo.setTitle(tituloStatus);
        telaVoo.setVisible(true);
        add(telaVoo, JLayeredPane.DEFAULT_LAYER);
        telaVoo.setDefaultCloseOperation(1);
        telaVoo.setLocation(40, 5);
        */
    }//GEN-LAST:event_subMenuBoxActionPerformed

    private void subMenuRelatorioAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuRelatorioAtendimentoActionPerformed
      /*
        String tituloStatus;
        tituloStatus = "Relatórios Passagens";

        TelaRelatorioPassagem relPassagem = new TelaRelatorioPassagem();
        relPassagem.setTitle(tituloStatus);
        relPassagem.setVisible(true);
        add(relPassagem, JLayeredPane.DEFAULT_LAYER);
        relPassagem.setDefaultCloseOperation(1);
        relPassagem.setLocation(40, 50);
        */
    }//GEN-LAST:event_subMenuRelatorioAtendimentoActionPerformed

    private void subMenuRelatorioClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuRelatorioClienteActionPerformed
       
        String tituloStatus;
        tituloStatus = "Relatórios Clientes";

        TelaRelatorioCliente relCliente = new TelaRelatorioCliente();
        relCliente.setTitle(tituloStatus);
        relCliente.setVisible(true);
        add(relCliente, JLayeredPane.DEFAULT_LAYER);
        relCliente.setDefaultCloseOperation(1);
        relCliente.setLocation(40, 50);

    }//GEN-LAST:event_subMenuRelatorioClienteActionPerformed

    private void subMenuRelatorioPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuRelatorioPetActionPerformed
        String tituloStatus;
        tituloStatus = "Relatórios Pets";

        TelaRelatorioPet relPet = new TelaRelatorioPet();
        relPet.setTitle(tituloStatus);
        relPet.setVisible(true);
        add(relPet, JLayeredPane.DEFAULT_LAYER);
        relPet.setDefaultCloseOperation(1);
        relPet.setLocation(40, 50);
    }//GEN-LAST:event_subMenuRelatorioPetActionPerformed

    private void subMenuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuSobreActionPerformed
        // TODO add your handling code here:
       
        /*
        String tituloStatus;
        tituloStatus = "Sobre";

        TelaJavaCam camPet = new TelaJavaCam();
        camPet.setTitle(tituloStatus);
        camPet.setVisible(true);
        add(camPet, JLayeredPane.DEFAULT_LAYER);
        camPet.setDefaultCloseOperation(1);
        camPet.setLocation(40, 50);
        */
      //  Cadastro.montaTelaAbout();
    }//GEN-LAST:event_subMenuSobreActionPerformed

    private void subMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_subMenuSairActionPerformed

    private void subMenuConsultarAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuConsultarAgendaActionPerformed
        String tituloStatus;
        tituloStatus = "Consultar Agendamento";

        TelaConsultaAgendamento conPetAgenda = new TelaConsultaAgendamento();
        conPetAgenda.setTitle(tituloStatus);
        conPetAgenda.setVisible(true);
        add(conPetAgenda, JLayeredPane.DEFAULT_LAYER);
        conPetAgenda.setDefaultCloseOperation(1);
        conPetAgenda.setLocation(40, 50);
        
        
        
        
    }//GEN-LAST:event_subMenuConsultarAgendaActionPerformed

    private void SubMenuGestaoProfissionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuGestaoProfissionalActionPerformed
        // TODO add your handling code here:
        String tituloStatus;
        tituloStatus = "Gestão Profissional";

        TelaProfissional telaProf = new TelaProfissional();
        telaProf.setTitle(tituloStatus);
        telaProf.pack();
        
        
        telaProf.setLocation(50, 50);
        telaProf.setVisible(true);
        add(telaProf, JLayeredPane.DEFAULT_LAYER);
        telaProf.setDefaultCloseOperation(1);
         
        /*
        String tituloCliente;
        tituloCliente = "Gestão Pet / Cliente";

        TelaClientePet telaClientePet = new TelaClientePet();
        telaClientePet.setTitle(tituloCliente);
        telaClientePet.pack();
        telaClientePet.setLocation(50, 50); //(ponto inicial apartir lateral,altura)
        telaClientePet.setVisible(true);
        
        add(telaClientePet, JLayeredPane.DRAG_LAYER);

        telaClientePet.setDefaultCloseOperation(1);//DISPOSE_ON_CLOSE
        */
        
    }//GEN-LAST:event_SubMenuGestaoProfissionalActionPerformed

    private void jMenuAgendarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAgendarServicoActionPerformed
        // Agendar novo Serviço
        String tituloAgendamentoServico;
        tituloAgendamentoServico = "Agendamento Serviço Pet / Cliente";

        TelaAgendamentoClientePet telaAgendamentoClientePet = new TelaAgendamentoClientePet();
        telaAgendamentoClientePet.setTitle(tituloAgendamentoServico);
        telaAgendamentoClientePet.pack();
        telaAgendamentoClientePet.setLocation(50, 50); //(ponto inicial apartir lateral,altura)
        telaAgendamentoClientePet.setVisible(true);
        
        add(telaAgendamentoClientePet, JLayeredPane.DRAG_LAYER);

        telaAgendamentoClientePet.setDefaultCloseOperation(1);//DISPOSE_ON_CLOSE
        
        
    }//GEN-LAST:event_jMenuAgendarServicoActionPerformed

    private void PetCamOnlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PetCamOnlineActionPerformed
        // TODO add your handling code here:
        String tituloStatus;
        tituloStatus = "Webcam Pets";

        TelaJavaCam camPet = new TelaJavaCam();
        camPet.setTitle(tituloStatus);
        camPet.setVisible(true);
        add(camPet, JLayeredPane.DEFAULT_LAYER);
        camPet.setDefaultCloseOperation(1);
        camPet.setLocation(40, 50);
    }//GEN-LAST:event_PetCamOnlineActionPerformed

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
            java.util.logging.Logger.getLogger(EntradaSistemaPetFast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntradaSistemaPetFast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntradaSistemaPetFast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntradaSistemaPetFast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EntradaSistemaPetFast().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuProfissional;
    private javax.swing.JMenuItem PetCamOnline;
    private javax.swing.JMenuItem SubMenuGestaoProfissional;
    private javax.swing.JMenuItem jMenuAgendarServico;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menuAdministrarAtendimento;
    private javax.swing.JMenu menuAtendimento;
    private javax.swing.JMenu menuBox_Especialista;
    private javax.swing.JMenu menuCadastroCliente_Pet;
    private javax.swing.JMenu menuMonitoria;
    private javax.swing.JMenu menuRelatorios;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenu menuSobre;
    private javax.swing.JMenuItem subMenuBox;
    private javax.swing.JMenuItem subMenuCliente;
    private javax.swing.JMenuItem subMenuConsultarAgenda;
    private javax.swing.JMenuItem subMenuPet;
    private javax.swing.JMenuItem subMenuRelatorioAtendimento;
    private javax.swing.JMenuItem subMenuRelatorioCliente;
    private javax.swing.JMenuItem subMenuRelatorioPet;
    private javax.swing.JMenuItem subMenuSair;
    private javax.swing.JMenuItem subMenuSobre;
    // End of variables declaration//GEN-END:variables

    public void chamarTelaAnimal(){
        
         String tituloPet;
        tituloPet = "Gestão Pet";

        TelaAnimal telaAnimal = new TelaAnimal("Teste",1,"i","");
        telaAnimal.setTitle(tituloPet);
        telaAnimal.setVisible(true);
        add(telaAnimal, JLayeredPane.DRAG_LAYER);

        telaAnimal.setDefaultCloseOperation(1);//DISPOSE_ON_CLOSE
        telaAnimal.setLocation(40, 5); 
        
    
       /*
               String tituloPet;
        tituloPet = "Gestão Pet";

        TelaAnimal telaAnimal = new TelaAnimal();
        telaAnimal.setTitle(tituloPet);
        

        telaAnimal.setDefaultCloseOperation(1);//DISPOSE_ON_CLOSE
        telaAnimal.setLocation(40, 5);
        telaAnimal.setVisible(true);
        this.add(telaAnimal, JLayeredPane.DRAG_LAYER) ;
            try {
                telaAnimal.setSelected(true);
                //telaPrincipal.setVisible(true);
                //chamar a tela inclusão pet
                //chamarTelaAnimal(tctPetAnimalCliente.getText(), tctPetAnimalCpfCliente.getText());
            } catch (PropertyVetoException ex) {
                Logger.getLogger(TelaClientePet.class.getName()).log(Level.SEVERE, null, ex);
            }*/
    }
               

}
