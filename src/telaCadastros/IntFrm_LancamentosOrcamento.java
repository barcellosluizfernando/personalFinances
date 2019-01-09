/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telaCadastros;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JCheckBox;
import personalfinances.LancamentosOrcamento;
import tabelas.LancamentosTipo;
import tabelas.Pessoas;
import tabelas.dao.LancamentosOrcamentoDAO;
import tabelas.dao.LancamentosTipoDAO;
import tabelas.dao.PessoasDAO;
import telaPesquisas.jDial_PesquisaLancamentoTipo;
import telaPesquisas.jDial_PesquisaOrcamento;
import telaPesquisas.jDial_PesquisaPessoas;

/**
 *
 * @author ferna
 */
public class IntFrm_LancamentosOrcamento extends javax.swing.JInternalFrame {

    private Pessoas pessoa;
    private LancamentosTipo lancamentoTipo;
    private final int INCLUIR = 1;
    private final int ALTERAR = 2;
    private final int EXCLUIR = 3;
    private final int PESQUISA_ORCAMENTO = 1;
    private final int PESQUISA_ORCAMENTO_ID = 11;
    private final int PESQUISA_PESSOA = 2;
    private final int PESQUISA_PESSOA_ID = 22;
    private final int PESQUISA_TIPO = 3;
    private final int PESQUISA_TIPO_ID = 33;
    private LancamentosOrcamento orcamento;

    /**
     * Creates new form IntFrm_LancamentosOrcamento
     */
    public IntFrm_LancamentosOrcamento() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTxtId = new tools.JNumberField();
        jTxtIdPessoa = new tools.JNumberField();
        jLabel2 = new javax.swing.JLabel();
        jTxtNomePessoa = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTxtIdTipoLanc = new tools.JNumberField();
        jTxtNomeTipoLanc = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTxtDesc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jFmtDtInicio = new javax.swing.JFormattedTextField(tools.MascaraTextField.dataBR());
        jFTxtDtFim = new javax.swing.JFormattedTextField(tools.MascaraTextField.dataBR());
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTxtValor = new tools.JNumberFormatField99(2);
        jPanel2 = new javax.swing.JPanel();
        jRbEntrada = new javax.swing.JRadioButton();
        jRbSaida = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jChB_Janeiro = new javax.swing.JCheckBox();
        jChB_Fevereiro = new javax.swing.JCheckBox();
        jChB_Marco = new javax.swing.JCheckBox();
        jChB_Abril = new javax.swing.JCheckBox();
        jChB_Maio = new javax.swing.JCheckBox();
        jChB_Junho = new javax.swing.JCheckBox();
        jChB_Julho = new javax.swing.JCheckBox();
        jChB_Agosto = new javax.swing.JCheckBox();
        jChB_Setembro = new javax.swing.JCheckBox();
        jChB_Outubro = new javax.swing.JCheckBox();
        jChB_Novembro = new javax.swing.JCheckBox();
        jChB_Dezembro = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        jMenuItem1.setText("Copiar");
        jMenuItem1.setEnabled(false);
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("Colar");
        jMenuItem2.setEnabled(false);
        jPopupMenu1.add(jMenuItem2);

        jMenuItem3.setText("Excluir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem3);

        setTitle("Orçamento");
        setName(""); // NOI18N

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });

        jLabel1.setText("Código");

        jTxtId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTxtIdFocusLost(evt);
            }
        });
        jTxtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtIdKeyTyped(evt);
            }
        });

        jTxtIdPessoa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTxtIdPessoaFocusLost(evt);
            }
        });
        jTxtIdPessoa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtIdPessoaKeyTyped(evt);
            }
        });

        jLabel2.setText("Pessoa");

        jTxtNomePessoa.setEnabled(false);

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Tipo Lançamento");

        jTxtIdTipoLanc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTxtIdTipoLancFocusLost(evt);
            }
        });
        jTxtIdTipoLanc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtIdTipoLancKeyTyped(evt);
            }
        });

        jTxtNomeTipoLanc.setEnabled(false);

        jButton3.setText("...");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Descrição");

        jLabel5.setText("Início");

        jFTxtDtFim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jFTxtDtFimKeyReleased(evt);
            }
        });

        jLabel6.setText("Fim");

        jLabel7.setText("Valor");

        jTxtValor.setText("0");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Fluxo"));

        buttonGroup1.add(jRbEntrada);
        jRbEntrada.setText("Entrada");

        buttonGroup1.add(jRbSaida);
        jRbSaida.setSelected(true);
        jRbSaida.setText("Saída");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRbEntrada)
                    .addComponent(jRbSaida))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jRbEntrada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRbSaida))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Repetir"));

        jChB_Janeiro.setSelected(true);
        jChB_Janeiro.setText("Janeiro");

        jChB_Fevereiro.setSelected(true);
        jChB_Fevereiro.setText("Fevereiro");

        jChB_Marco.setSelected(true);
        jChB_Marco.setText("Março");

        jChB_Abril.setSelected(true);
        jChB_Abril.setText("Abril");

        jChB_Maio.setSelected(true);
        jChB_Maio.setText("Maio");

        jChB_Junho.setSelected(true);
        jChB_Junho.setText("Junho");

        jChB_Julho.setSelected(true);
        jChB_Julho.setText("Julho");

        jChB_Agosto.setSelected(true);
        jChB_Agosto.setText("Agosto");

        jChB_Setembro.setSelected(true);
        jChB_Setembro.setText("Setembro");

        jChB_Outubro.setSelected(true);
        jChB_Outubro.setText("Outubro");

        jChB_Novembro.setSelected(true);
        jChB_Novembro.setText("Novembto");

        jChB_Dezembro.setSelected(true);
        jChB_Dezembro.setText("Dezembro");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jChB_Janeiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jChB_Fevereiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jChB_Marco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jChB_Abril)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jChB_Maio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jChB_Junho)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jChB_Julho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jChB_Agosto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jChB_Setembro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jChB_Outubro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jChB_Novembro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jChB_Dezembro)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jChB_Janeiro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jChB_Julho))
                    .addComponent(jChB_Fevereiro)
                    .addComponent(jChB_Marco)
                    .addComponent(jChB_Abril)
                    .addComponent(jChB_Maio)
                    .addComponent(jChB_Junho)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jChB_Agosto)
                            .addComponent(jChB_Setembro)
                            .addComponent(jChB_Outubro)
                            .addComponent(jChB_Novembro)
                            .addComponent(jChB_Dezembro))))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtId, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtIdTipoLanc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtNomeTipoLanc))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtIdPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtNomePessoa)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtDesc))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jFmtDtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFTxtDtFim, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtIdPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtNomePessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTxtIdTipoLanc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtNomeTipoLanc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTxtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jFmtDtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTxtDtFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jTxtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jButton4.setText("Gravar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Cancelar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Limpar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFTxtDtFimKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFTxtDtFimKeyReleased
        if (KeyEvent.VK_DELETE == evt.getKeyCode()) {
            jFTxtDtFim.setValue(null);
        }

    }//GEN-LAST:event_jFTxtDtFimKeyReleased

    private void jTxtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtIdKeyTyped
        String id = jTxtId.getText();
        tools.ClearFields.ClearFields(jPanel1);
        jTxtId.setText(id);
    }//GEN-LAST:event_jTxtIdKeyTyped

    private void jTxtIdPessoaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtIdPessoaKeyTyped
        jTxtNomePessoa.setText(""); // TODO add your handling code here:
    }//GEN-LAST:event_jTxtIdPessoaKeyTyped

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        tools.ClearFields.ClearFields(jPanel1);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTxtIdTipoLancKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtIdTipoLancKeyTyped
        jTxtNomeTipoLanc.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtIdTipoLancKeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if ("".equals(jTxtId.getText())) {
            gravaDados(INCLUIR);
        } else {
            gravaDados(ALTERAR);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTxtIdPessoaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtIdPessoaFocusLost
        incluiPesquisa(PESQUISA_PESSOA_ID);        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtIdPessoaFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        incluiPesquisa(PESQUISA_PESSOA);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        incluiPesquisa(PESQUISA_TIPO);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTxtIdTipoLancFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtIdTipoLancFocusLost
        incluiPesquisa(PESQUISA_TIPO_ID);        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtIdTipoLancFocusLost

    private void jTxtIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtIdFocusLost
        incluiPesquisa(PESQUISA_ORCAMENTO_ID);        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtIdFocusLost

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
        if (evt.isPopupTrigger()) {
            jPopupMenu1.show(this, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jPanel1MouseReleased

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        gravaDados(EXCLUIR);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        incluiPesquisa(PESQUISA_ORCAMENTO);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jChB_Abril;
    private javax.swing.JCheckBox jChB_Agosto;
    private javax.swing.JCheckBox jChB_Dezembro;
    private javax.swing.JCheckBox jChB_Fevereiro;
    private javax.swing.JCheckBox jChB_Janeiro;
    private javax.swing.JCheckBox jChB_Julho;
    private javax.swing.JCheckBox jChB_Junho;
    private javax.swing.JCheckBox jChB_Maio;
    private javax.swing.JCheckBox jChB_Marco;
    private javax.swing.JCheckBox jChB_Novembro;
    private javax.swing.JCheckBox jChB_Outubro;
    private javax.swing.JCheckBox jChB_Setembro;
    private javax.swing.JFormattedTextField jFTxtDtFim;
    private javax.swing.JFormattedTextField jFmtDtInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButton jRbEntrada;
    private javax.swing.JRadioButton jRbSaida;
    private javax.swing.JTextField jTxtDesc;
    private javax.swing.JTextField jTxtId;
    private javax.swing.JTextField jTxtIdPessoa;
    private javax.swing.JTextField jTxtIdTipoLanc;
    private javax.swing.JTextField jTxtNomePessoa;
    private javax.swing.JTextField jTxtNomeTipoLanc;
    private javax.swing.JTextField jTxtValor;
    // End of variables declaration//GEN-END:variables

    public void recebePessoa(Pessoas p) {
        this.pessoa = p;
    }

    public void recebeLancamentoTipo(LancamentosTipo p) {
        this.lancamentoTipo = p;
    }

    private void incluiPesquisa(int action) {
        switch (action) {
            case PESQUISA_ORCAMENTO_ID:
                if (!"".equals(jTxtId.getText())) {
                    LancamentosOrcamentoDAO pDAO = new LancamentosOrcamentoDAO();
                    incluiPesquisa(pDAO.getOrcamento(Integer.parseInt(jTxtId.getText())));
                }
                break;
            case PESQUISA_ORCAMENTO:
                jDial_PesquisaOrcamento dOrc = new jDial_PesquisaOrcamento(this, true);
                dOrc.setVisible(true);

                incluiPesquisa(orcamento);
                break;
            case PESQUISA_PESSOA:
                jDial_PesquisaPessoas p = new jDial_PesquisaPessoas(this, true);
                p.setVisible(true);

                incluiPesquisa(pessoa);
                break;
            case PESQUISA_PESSOA_ID:
                if (!"".equals(jTxtIdPessoa.getText())) {
                    PessoasDAO pDAO = new PessoasDAO();
                    incluiPesquisa(pDAO.getPessoas(Integer.parseInt(jTxtIdPessoa.getText())));
                }
                break;
            case PESQUISA_TIPO:
                jDial_PesquisaLancamentoTipo dTipo = new jDial_PesquisaLancamentoTipo(this, true);
                dTipo.setVisible(true);

                incluiPesquisa(lancamentoTipo);
                break;
            case PESQUISA_TIPO_ID:
                if (!"".equals(jTxtIdTipoLanc.getText())) {
                    LancamentosTipoDAO tDAO = new LancamentosTipoDAO();
                    incluiPesquisa(tDAO.getLancamentosTipo(Integer.parseInt(jTxtIdTipoLanc.getText())));
                }
                break;
        }
    }

    private void gravaDados(int action) {
        try {
            if (action > INCLUIR && jTxtId.getText().equals("")) {
                throw new SQLException("Informe um cadastro para continuar.");
            }

            LancamentosOrcamento o = new LancamentosOrcamento();
            LancamentosOrcamentoDAO lDAO = new LancamentosOrcamentoDAO();
            List<Integer> meses = new ArrayList<Integer>();

            try {
                o.setId(Integer.parseInt(jTxtId.getText()));
            } catch (Exception e) {
                o.setId(0);
            }
            o.setDescricao(jTxtDesc.getText());
            o.setDtInicio(tools.ManipulaData.parseBrToDate(jFmtDtInicio.getText()));
            o.setFluxo(jRbSaida.isSelected());
            o.setValor(Double.parseDouble(jTxtValor.getText().replace(".", "").replace(",", ".")));
            try {
                o.setDtFim(tools.ManipulaData.parseBrToDate(jFTxtDtFim.getText()));
            } catch (Exception e) {
                o.setDtFim(null);
            }
            try {
                o.setIdPessoa(new Pessoas(Integer.parseInt(jTxtIdPessoa.getText())));
                o.setIdTipoLancamento(new LancamentosTipo(Integer.parseInt(jTxtIdTipoLanc.getText())));
            } catch (Exception e) {
            }

            int repeat = 1;
            for (Component comp : jPanel3.getComponents()) {
                JCheckBox cb = (JCheckBox) comp;
                if (cb.isSelected()) {
                    meses.add(repeat);
                }
                repeat++;
            }
            o.setRepeatAt(meses.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining(",")));

            switch (action) {
                case INCLUIR:
                    lDAO.create(o);
                    jTxtId.setText(o.getId() + "");
                    break;

                case ALTERAR:
                    lDAO.update(o);

                    break;

                case EXCLUIR:
                    lDAO.delete(o);

                    break;
            }

            tools.DefaultMsg.saveDataSuccessfull();
            conn.ConexaoMySQL.finalizarTransacao(true);
            tools.ClearFields.ClearFields(jPanel1);
        } catch (Exception e) {
            conn.ConexaoMySQL.finalizarTransacao(false);
            tools.DefaultMsg.errorMsg(e.getMessage());
        }
    }

    private void incluiPesquisa(Pessoas pessoa) {

        jTxtIdPessoa.setText("");
        jTxtNomePessoa.setText("");

        try {
            if (pessoa.getId() == null) {
                throw new UnsupportedOperationException();
            }

            jTxtIdPessoa.setText(pessoa.getId() + "");
            jTxtNomePessoa.setText(pessoa.getNome());

        } catch (Exception e) {

        }
    }

    private void incluiPesquisa(LancamentosTipo lancamentoTipo) {
        jTxtIdTipoLanc.setText("");
        jTxtNomeTipoLanc.setText("");
        try {
            if (lancamentoTipo.getId() == null) {
                throw new UnsupportedOperationException();
            }

            jTxtIdTipoLanc.setText(lancamentoTipo.getId() + "");
            jTxtNomeTipoLanc.setText(lancamentoTipo.getTitle());

        } catch (Exception e) {

        }
    }

    private void incluiPesquisa(LancamentosOrcamento o) {
        tools.ClearFields.ClearFields(jPanel1);

        try {
            if (o.getId() == null) {
                throw new UnsupportedOperationException();
            }
            System.out.println("Inserindo dados!");
            jTxtId.setText(o.getId() + "");
            jTxtIdPessoa.setText(o.getIdPessoa().getId() + "");
            jTxtNomePessoa.setText(o.getIdPessoa().getNome());
            jTxtIdTipoLanc.setText(o.getIdTipoLancamento().getId() + "");
            jTxtNomeTipoLanc.setText(o.getIdTipoLancamento().getTitle());
            jTxtDesc.setText(o.getDescricao());
            jFmtDtInicio.setText(tools.ManipulaData.dateBRstr(o.getDtInicio()));
            jFTxtDtFim.setText(tools.ManipulaData.dateBRstr(o.getDtFim()));
            jTxtValor.setText(tools.FormatNumbers.numUsToBr(o.getValor()));
            System.out.println("Inserindo Meses");
            int meses = 1;
            List<Integer> rptMeses = Arrays.stream(o.getRepeatAt().split(","))
                    .map(Integer::valueOf)
                    .collect(Collectors.toList());
            for (Component comp : jPanel3.getComponents()) {
                JCheckBox cb = (JCheckBox) comp;
                if (rptMeses.contains(meses)) {
                    cb.setSelected(true);
                } else {
                    cb.setSelected(false);
                }
                meses++;
            }
            jRbSaida.setSelected(o.getFluxo());

        } catch (Exception e) {

        }
    }

    public void recebeLancamentoOrcamento(LancamentosOrcamento m) {
        this.orcamento = m;
    }

}
