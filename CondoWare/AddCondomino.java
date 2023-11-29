/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package condoware.CondoWare;

import javax.swing.JOptionPane;

/**
 *
 * @author joaop
 */
public class AddCondomino extends javax.swing.JFrame {

    /**
     * Creates new form AddFuncionario
     */
    private AddCondomino() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    private static AddCondomino addCondominoUnic;
    public static AddCondomino getAddCondominoUnic() {
        if (addCondominoUnic == null) {
            addCondominoUnic = new AddCondomino();
        }
        return addCondominoUnic;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotNome = new javax.swing.JLabel();
        rotCPF = new javax.swing.JLabel();
        rotBloco = new javax.swing.JLabel();
        rotAp = new javax.swing.JLabel();
        rotEmail = new javax.swing.JLabel();
        rotSenha = new javax.swing.JLabel();
        rotPlaca = new javax.swing.JLabel();
        cxNome = new javax.swing.JTextField();
        cxCPF = new javax.swing.JTextField();
        cxBloco = new javax.swing.JTextField();
        cxAp = new javax.swing.JTextField();
        cxEmail = new javax.swing.JTextField();
        cxSenha = new javax.swing.JTextField();
        cxPlaca = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Condômino");

        rotNome.setText("Nome:");

        rotCPF.setText("CPF:");

        rotBloco.setText("Bloco:");

        rotAp.setText("Apartamento:");

        rotEmail.setText("Email:");

        rotSenha.setText("Senha:");

        rotPlaca.setText("Placa do Veiculo:");

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rotNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rotCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cxCPF))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rotBloco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cxBloco))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rotAp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxAp))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rotEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cxEmail))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rotSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cxSenha))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rotPlaca)
                            .addComponent(btVoltar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cxPlaca)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btCadastrar)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotNome)
                    .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotCPF)
                    .addComponent(cxCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotBloco)
                    .addComponent(cxBloco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotAp)
                    .addComponent(cxAp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotEmail)
                    .addComponent(cxEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotSenha)
                    .addComponent(cxSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotPlaca)
                    .addComponent(cxPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltar)
                    .addComponent(btCadastrar)
                    .addComponent(btLimpar))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        this.dispose();
        limpar();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        int addCondomino = Conexao.getConexao().addCondomino(cxCPF.getText(), cxNome.getText(), Integer.parseInt(cxBloco.getText()), Integer.parseInt(cxAp.getText()), cxPlaca.getText(), cxEmail.getText(), cxSenha.getText());    
        if(addCondomino == 1) {
            JOptionPane.showMessageDialog(
                        null,
                        "Condômino adicionado com sucesso!",
                        "Adicionado",
                        1);
        }
        else {
            JOptionPane.showMessageDialog(
                        null,
                        "Erro ao adicionar condômino",
                        "Erro",
                        0);
        }
        this.dispose();
    }//GEN-LAST:event_btCadastrarActionPerformed

    public void limpar(){
        cxNome.setText("");
        cxCPF.setText("");
        cxBloco.setText("");
        cxAp.setText("");
        cxEmail.setText("");
        cxSenha.setText("");
        cxPlaca.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField cxAp;
    private javax.swing.JTextField cxBloco;
    private javax.swing.JTextField cxCPF;
    private javax.swing.JTextField cxEmail;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxPlaca;
    private javax.swing.JTextField cxSenha;
    private javax.swing.JLabel rotAp;
    private javax.swing.JLabel rotBloco;
    private javax.swing.JLabel rotCPF;
    private javax.swing.JLabel rotEmail;
    private javax.swing.JLabel rotNome;
    private javax.swing.JLabel rotPlaca;
    private javax.swing.JLabel rotSenha;
    // End of variables declaration//GEN-END:variables
}
