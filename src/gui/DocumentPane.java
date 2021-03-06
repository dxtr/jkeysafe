/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import misc.Document;

/**
 *
 * @author dxtr
 */
public class DocumentPane extends javax.swing.JPanel {
    public void setDocument(Document newDoc)
    {
        
    }
    
    /**
     * Creates new form DocumentPane
     */
    public DocumentPane() {
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

        splitPane = new javax.swing.JSplitPane();
        groupScrollPane = new javax.swing.JScrollPane();
        groupTreeView = new javax.swing.JTree();
        detailPane = new javax.swing.JPanel();
        entryScrollPane = new javax.swing.JScrollPane();
        entryTable = new javax.swing.JTable();
        infoScrollPane = new javax.swing.JScrollPane();
        infoTextArea = new javax.swing.JTextArea();

        groupScrollPane.setMaximumSize(new java.awt.Dimension(0, 0));
        groupScrollPane.setMinimumSize(new java.awt.Dimension(150, 0));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("*");
        groupTreeView.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        groupTreeView.setToolTipText("");
        groupTreeView.setMaximumSize(new java.awt.Dimension(0, 0));
        groupTreeView.setName(""); // NOI18N
        groupScrollPane.setViewportView(groupTreeView);

        splitPane.setLeftComponent(groupScrollPane);

        detailPane.setMaximumSize(new java.awt.Dimension(0, 0));

        entryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        entryTable.setShowHorizontalLines(false);
        entryTable.setShowVerticalLines(false);
        entryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                entryTableMousePressed(evt);
            }
        });
        entryScrollPane.setViewportView(entryTable);

        infoTextArea.setColumns(20);
        infoTextArea.setRows(5);
        infoScrollPane.setViewportView(infoTextArea);

        javax.swing.GroupLayout detailPaneLayout = new javax.swing.GroupLayout(detailPane);
        detailPane.setLayout(detailPaneLayout);
        detailPaneLayout.setHorizontalGroup(
            detailPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 848, Short.MAX_VALUE)
            .addGroup(detailPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(detailPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(entryScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(detailPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(detailPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(infoScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        detailPaneLayout.setVerticalGroup(
            detailPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 432, Short.MAX_VALUE)
            .addGroup(detailPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(detailPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(entryScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(228, Short.MAX_VALUE)))
            .addGroup(detailPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailPaneLayout.createSequentialGroup()
                    .addContainerGap(211, Short.MAX_VALUE)
                    .addComponent(infoScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        splitPane.setRightComponent(detailPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void entryTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entryTableMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_entryTableMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel detailPane;
    private javax.swing.JScrollPane entryScrollPane;
    private javax.swing.JTable entryTable;
    private javax.swing.JScrollPane groupScrollPane;
    private javax.swing.JTree groupTreeView;
    private javax.swing.JScrollPane infoScrollPane;
    private javax.swing.JTextArea infoTextArea;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}
