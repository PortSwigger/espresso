/**
 * EsPReSSO - Extension for Processing and Recognition of Single Sign-On Protocols.
 * Copyright (C) 2015 Tim Guenther and Christian Mainka
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 51
 * Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 */
package de.rub.nds.burp.espresso.gui.attacker.saml.xsw;

import de.rub.nds.burp.espresso.gui.attacker.saml.*;
import de.rub.nds.burp.espresso.gui.attacker.IAttack;
import de.rub.nds.burp.utilities.Logging;
import de.rub.nds.burp.utilities.XMLHelper;
import de.rub.nds.burp.utilities.listeners.AbstractCodeEvent;
import de.rub.nds.burp.utilities.listeners.CodeListenerController;
import de.rub.nds.burp.utilities.listeners.events.SamlCodeEvent;
import org.w3c.dom.Document;
import wsattacker.library.signatureWrapping.util.exception.InvalidWeaknessException;
import wsattacker.library.signatureWrapping.xpath.weakness.util.WeaknessLog;
import wsattacker.library.signatureWrapping.xpath.wrapping.WrappingOracle;

/**
 * The Signature Wrapping Attack
 * @author Nurullah Erinola
 * @version 1.0
 */
public class UISigWrapExec extends javax.swing.JPanel implements IAttack {

    private WrappingOracle wrappingOracle;
    private CodeListenerController listeners = null;
    
    /**
     * Creates new form UISigWrapAttack
     */
    public UISigWrapExec() {
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

        jButtonPreview = new javax.swing.JButton();
        jCheckBoxWrapLines = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jSpinnerSelectedAttack = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAttackDescription = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaFinal = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();

        jButtonPreview.setText("Pretty printed");
        jButtonPreview.setEnabled(false);
        jButtonPreview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPreviewActionPerformed(evt);
            }
        });

        jCheckBoxWrapLines.setText("Enable Softwraps");
        jCheckBoxWrapLines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxWrapLinesActionPerformed(evt);
            }
        });

        jLabel2.setText("Choose attack vevtor:");

        jSpinnerSelectedAttack.setEnabled(false);
        jSpinnerSelectedAttack.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerSelectedAttackStateChanged(evt);
            }
        });

        jTextAreaAttackDescription.setEditable(false);
        jTextAreaAttackDescription.setRows(3);
        jScrollPane1.setViewportView(jTextAreaAttackDescription);

        jScrollPane2.setViewportView(jTextAreaFinal);

        jLabel6.setText("Attack vector:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 293, Short.MAX_VALUE)
                                .addComponent(jCheckBoxWrapLines))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinnerSelectedAttack, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonPreview))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jSpinnerSelectedAttack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jCheckBoxWrapLines))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPreview)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButtonPreviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPreviewActionPerformed
        new UIPreview(jTextAreaFinal.getText());
    }//GEN-LAST:event_jButtonPreviewActionPerformed

    private void jCheckBoxWrapLinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxWrapLinesActionPerformed
        if (jCheckBoxWrapLines.isSelected()) {
            jTextAreaFinal.setLineWrap(true);
        } else {
            jTextAreaFinal.setLineWrap(false);
        }
    }//GEN-LAST:event_jCheckBoxWrapLinesActionPerformed

    private void jSpinnerSelectedAttackStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerSelectedAttackStateChanged
        int selection = (Integer) jSpinnerSelectedAttack.getValue();
        int max = wrappingOracle.maxPossibilities();
        if (selection >= 0 && selection < max) {
            try {
                Document attackDoc = wrappingOracle.getPossibility(selection);
                // Set attack description
                jTextAreaAttackDescription.setText(WeaknessLog.representation());
                jTextAreaAttackDescription.setCaretPosition(0);
                // Set attack vector 
                jTextAreaFinal.setText(XMLHelper.docToString(attackDoc));
                jTextAreaFinal.setCaretPosition(0);
                // Notify all
                Logging.getInstance().log(getClass(), "Signature wrapping successfull", Logging.INFO);
                notifyAllTabs(new SamlCodeEvent(this, jTextAreaFinal.getText().getBytes()));
            } catch (InvalidWeaknessException ex) {
                jTextAreaAttackDescription.setText("Error: " + ex);
                jTextAreaFinal.setText("");
            }
        } else {
            int res = selection % max;
            if (res < 0) {
                res += max;
            }
            jSpinnerSelectedAttack.setValue(res);
            jSpinnerSelectedAttackStateChanged(null);
        }
    }//GEN-LAST:event_jSpinnerSelectedAttackStateChanged
    
    public void initOracle(WrappingOracle wrappingOracle) {
        this.wrappingOracle = wrappingOracle;
    }
    
    public void enableObjects(boolean bln) {
        jSpinnerSelectedAttack.setEnabled(bln);
        jButtonPreview.setEnabled(bln);
        // Clear textfields
        jTextAreaAttackDescription.setText("");
        jTextAreaFinal.setText("");
        if (bln) {
            jSpinnerSelectedAttack.setValue(0);
            jSpinnerSelectedAttackStateChanged(null);
        }
    }
    
    /**
     * Is called every time new Code is available.
     * @param evt {@link de.rub.nds.burp.utilities.listeners.AbstractCodeEvent} The new source code.
     */
    @Override
    public void setCode(AbstractCodeEvent evt) {
    }
        
    /**
     * Notify all registered listeners with the new code.
     * @param evt The new source code.
     */
    @Override
    public void notifyAllTabs(AbstractCodeEvent evt) {
        if(listeners != null){
            listeners.notifyAll(evt);
        }
    }

    /**
     * Set the listener for the editor.
     * @param listeners {@link de.rub.nds.burp.utilities.listeners.CodeListenerController}
     */
    @Override
    public void setListener(CodeListenerController listeners) {
        this.listeners = listeners;
        this.listeners.addCodeListener(this);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPreview;
    private javax.swing.JCheckBox jCheckBoxWrapLines;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinnerSelectedAttack;
    private javax.swing.JTextArea jTextAreaAttackDescription;
    private javax.swing.JTextArea jTextAreaFinal;
    // End of variables declaration//GEN-END:variables
}
