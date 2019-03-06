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
package de.rub.nds.burp.espresso.gui;

/**
 * Detail information to api and supported protocols.
 * @author Tim Guenther
 * @version 1.0
 */
public class UIHelp extends javax.swing.JPanel {

    /**
     * Creates new form UIHelp.
     */
    public UIHelp() {
        initComponents();
        
        //Remove if help is implemented.
        helpContainerPanel.setEnabledAt(0, false);
        helpContainerPanel.setEnabledAt(1, false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headline = new javax.swing.JLabel();
        helpContainerPanel = new javax.swing.JTabbedPane();
        apiPanel = new javax.swing.JPanel();
        protocolsTabbedPane = new javax.swing.JTabbedPane();
        samlPane = new javax.swing.JTabbedPane();
        smal1Pane = new javax.swing.JPanel();
        saml2Pane = new javax.swing.JPanel();
        browseridPane = new javax.swing.JTabbedPane();
        flowchartPane = new javax.swing.JPanel();
        openidPane = new javax.swing.JTabbedPane();
        openid11Pane = new javax.swing.JPanel();
        openid2Pane = new javax.swing.JPanel();
        openidconnectPane = new javax.swing.JPanel();
        oauthPane = new javax.swing.JTabbedPane();
        oauth1Pane = new javax.swing.JPanel();
        oauth2Pane = new javax.swing.JPanel();
        impressum = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setEnabled(false);

        headline.setText("Help for Using this Extension at: https://github.com/RUB-NDS/");

        apiPanel.setEnabled(false);

        javax.swing.GroupLayout apiPanelLayout = new javax.swing.GroupLayout(apiPanel);
        apiPanel.setLayout(apiPanelLayout);
        apiPanelLayout.setHorizontalGroup(
            apiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 599, Short.MAX_VALUE)
        );
        apiPanelLayout.setVerticalGroup(
            apiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 662, Short.MAX_VALUE)
        );

        helpContainerPanel.addTab("API", apiPanel);

        protocolsTabbedPane.setEnabled(false);

        samlPane.setEnabled(false);

        smal1Pane.setEnabled(false);
        smal1Pane.setFocusable(false);

        javax.swing.GroupLayout smal1PaneLayout = new javax.swing.GroupLayout(smal1Pane);
        smal1Pane.setLayout(smal1PaneLayout);
        smal1PaneLayout.setHorizontalGroup(
            smal1PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 589, Short.MAX_VALUE)
        );
        smal1PaneLayout.setVerticalGroup(
            smal1PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 608, Short.MAX_VALUE)
        );

        samlPane.addTab("SAML 1.0", smal1Pane);

        javax.swing.GroupLayout saml2PaneLayout = new javax.swing.GroupLayout(saml2Pane);
        saml2Pane.setLayout(saml2PaneLayout);
        saml2PaneLayout.setHorizontalGroup(
            saml2PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 589, Short.MAX_VALUE)
        );
        saml2PaneLayout.setVerticalGroup(
            saml2PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 608, Short.MAX_VALUE)
        );

        samlPane.addTab("SAML 2.0", saml2Pane);

        protocolsTabbedPane.addTab("SAML", samlPane);

        browseridPane.setDoubleBuffered(true);
        browseridPane.setFocusable(false);

        javax.swing.GroupLayout flowchartPaneLayout = new javax.swing.GroupLayout(flowchartPane);
        flowchartPane.setLayout(flowchartPaneLayout);
        flowchartPaneLayout.setHorizontalGroup(
            flowchartPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 589, Short.MAX_VALUE)
        );
        flowchartPaneLayout.setVerticalGroup(
            flowchartPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 608, Short.MAX_VALUE)
        );

        browseridPane.addTab("Flowchart", flowchartPane);

        protocolsTabbedPane.addTab("BrowserID", browseridPane);

        javax.swing.GroupLayout openid11PaneLayout = new javax.swing.GroupLayout(openid11Pane);
        openid11Pane.setLayout(openid11PaneLayout);
        openid11PaneLayout.setHorizontalGroup(
            openid11PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 589, Short.MAX_VALUE)
        );
        openid11PaneLayout.setVerticalGroup(
            openid11PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 608, Short.MAX_VALUE)
        );

        openidPane.addTab("OpenID 1.1", openid11Pane);

        javax.swing.GroupLayout openid2PaneLayout = new javax.swing.GroupLayout(openid2Pane);
        openid2Pane.setLayout(openid2PaneLayout);
        openid2PaneLayout.setHorizontalGroup(
            openid2PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 589, Short.MAX_VALUE)
        );
        openid2PaneLayout.setVerticalGroup(
            openid2PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 608, Short.MAX_VALUE)
        );

        openidPane.addTab("OpenID 2.0", openid2Pane);

        protocolsTabbedPane.addTab("OpenID", openidPane);

        javax.swing.GroupLayout openidconnectPaneLayout = new javax.swing.GroupLayout(openidconnectPane);
        openidconnectPane.setLayout(openidconnectPaneLayout);
        openidconnectPaneLayout.setHorizontalGroup(
            openidconnectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
        );
        openidconnectPaneLayout.setVerticalGroup(
            openidconnectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
        );

        protocolsTabbedPane.addTab("OpenID Connect", openidconnectPane);

        javax.swing.GroupLayout oauth1PaneLayout = new javax.swing.GroupLayout(oauth1Pane);
        oauth1Pane.setLayout(oauth1PaneLayout);
        oauth1PaneLayout.setHorizontalGroup(
            oauth1PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 589, Short.MAX_VALUE)
        );
        oauth1PaneLayout.setVerticalGroup(
            oauth1PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 608, Short.MAX_VALUE)
        );

        oauthPane.addTab("OAuth 1.0", oauth1Pane);

        javax.swing.GroupLayout oauth2PaneLayout = new javax.swing.GroupLayout(oauth2Pane);
        oauth2Pane.setLayout(oauth2PaneLayout);
        oauth2PaneLayout.setHorizontalGroup(
            oauth2PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 589, Short.MAX_VALUE)
        );
        oauth2PaneLayout.setVerticalGroup(
            oauth2PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 608, Short.MAX_VALUE)
        );

        oauthPane.addTab("OAuth 2.0", oauth2Pane);

        protocolsTabbedPane.addTab("OAuth", oauthPane);

        helpContainerPanel.addTab("Protocols", protocolsTabbedPane);

        jLabel1.setText("© 2015, Tim Guenther, Christian Mainka");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("EsPReSSO v3.2");

        jLabel3.setText("Extension for Processing and Recognition of Single Sign-On");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Dependencies");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("License");

        jLabel6.setText("GNU General Public License v2.0");

        jLabel7.setText("RSyntaxTextArea, modified BSD license, © 2012, Robert Futrell");

        jLabel8.setText("https://github.com/bobbylight/RSyntaxTextArea");

        jLabel9.setText("json-simple, Apache License 2.0, © Yidong Fang");

        jLabel10.setText("https://code.google.com/p/json-simple/ ");

        jLabel11.setText("WS-Attacker, GNU General Public License v2.0, © 2012, Mainka, Falkenberg, et al.");

        jLabel12.setText("https://github.com/RUB-NDS/WS-Attacker/");

        jLabel13.setText("junit, Eclipse Public License 1.0, © Erich Gamma and Kent Beck");

        jLabel14.setText("https://github.com/junit-team/junit4   ");

        jLabel15.setText("jutf7 , MIT license, © 2011, Jaap Beetstra");

        jLabel16.setText("https://sourceforge.net/projects/jutf7/");

        jLabel17.setText("commons-io, Apache License 2.0, © 2012, Scott Sanders, et al.");

        jLabel18.setText("https://github.com/apache/commons-io      ");

        javax.swing.GroupLayout impressumLayout = new javax.swing.GroupLayout(impressum);
        impressum.setLayout(impressumLayout);
        impressumLayout.setHorizontalGroup(
            impressumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(impressumLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(impressumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        impressumLayout.setVerticalGroup(
            impressumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(impressumLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        helpContainerPanel.addTab("About", impressum);

        helpContainerPanel.setSelectedIndex(2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(headline)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(helpContainerPanel)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(headline)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(helpContainerPanel)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel apiPanel;
    private javax.swing.JTabbedPane browseridPane;
    private javax.swing.JPanel flowchartPane;
    private javax.swing.JLabel headline;
    private javax.swing.JTabbedPane helpContainerPanel;
    private javax.swing.JPanel impressum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel oauth1Pane;
    private javax.swing.JPanel oauth2Pane;
    private javax.swing.JTabbedPane oauthPane;
    private javax.swing.JPanel openid11Pane;
    private javax.swing.JPanel openid2Pane;
    private javax.swing.JTabbedPane openidPane;
    private javax.swing.JPanel openidconnectPane;
    private javax.swing.JTabbedPane protocolsTabbedPane;
    private javax.swing.JPanel saml2Pane;
    private javax.swing.JTabbedPane samlPane;
    private javax.swing.JPanel smal1Pane;
    // End of variables declaration//GEN-END:variables
}
