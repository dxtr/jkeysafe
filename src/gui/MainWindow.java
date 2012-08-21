/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import misc.Document;
import misc.Keyfile;

/**
 *
 * @author dxtr
 */
public class MainWindow extends javax.swing.JFrame {
    private Document currentDocument;
    
    private class groupTreeListener implements TreeModelListener {
        @Override
        public void treeNodesChanged(TreeModelEvent e) {
            
        }

        @Override
        public void treeNodesInserted(TreeModelEvent e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void treeNodesRemoved(TreeModelEvent e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void treeStructureChanged(TreeModelEvent e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }
    
    public MainWindow() {
        initComponents();
        localInitializations();
    }
    
    private void localInitializations() {
        currentDocument = null;
    }
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toolBar = new javax.swing.JToolBar();
        toolBar_NewDatabase = new javax.swing.JButton();
        toolBar_OpenDatabase = new javax.swing.JButton();
        toolBar_SaveDatabase = new javax.swing.JButton();
        tabPane = new javax.swing.JTabbedPane();
        menuBar = new javax.swing.JMenuBar();
        file_Menu = new javax.swing.JMenu();
        file_newDatabase = new javax.swing.JMenuItem();
        file_openDatabase = new javax.swing.JMenuItem();
        file_closeDatabase = new javax.swing.JMenuItem();
        file_Separator1 = new javax.swing.JPopupMenu.Separator();
        file_Save = new javax.swing.JMenuItem();
        file_saveAs = new javax.swing.JMenuItem();
        file_Separator2 = new javax.swing.JPopupMenu.Separator();
        file_DatabaseSettings = new javax.swing.JMenuItem();
        file_Separator3 = new javax.swing.JPopupMenu.Separator();
        file_importFrom = new javax.swing.JMenu();
        file_importFrom_xml = new javax.swing.JMenuItem();
        file_importFrom_json = new javax.swing.JMenuItem();
        file_Separator4 = new javax.swing.JPopupMenu.Separator();
        file_quit = new javax.swing.JMenuItem();
        entries_Menu = new javax.swing.JMenu();
        entries_newEntry = new javax.swing.JMenuItem();
        entries_cloneEntry = new javax.swing.JMenuItem();
        entries_editEntry = new javax.swing.JMenuItem();
        entries_deleteEntry = new javax.swing.JMenuItem();
        entries_Separator1 = new javax.swing.JPopupMenu.Separator();
        entries_copyUName = new javax.swing.JMenuItem();
        entries_copyPswd = new javax.swing.JMenuItem();
        entries_openUrl = new javax.swing.JMenuItem();
        entries_copyUrl = new javax.swing.JMenuItem();
        entries_Separator2 = new javax.swing.JPopupMenu.Separator();
        entries_searchDatabase = new javax.swing.JMenuItem();
        entries_searchGroup = new javax.swing.JMenuItem();
        groups_Menu = new javax.swing.JMenu();
        view_Menu = new javax.swing.JMenu();
        extras_Menu = new javax.swing.JMenu();
        extras_pswdGenerator = new javax.swing.JMenuItem();
        help_Menu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("jkeysafe");

        toolBar.setRollover(true);

        toolBar_NewDatabase.setText("New Database");
        toolBar_NewDatabase.setFocusable(false);
        toolBar_NewDatabase.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toolBar_NewDatabase.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar_NewDatabase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                event_newDatabase(evt);
            }
        });
        toolBar.add(toolBar_NewDatabase);

        toolBar_OpenDatabase.setText("Open Database");
        toolBar_OpenDatabase.setFocusable(false);
        toolBar_OpenDatabase.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toolBar_OpenDatabase.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(toolBar_OpenDatabase);

        toolBar_SaveDatabase.setText("Save Database");
        toolBar_SaveDatabase.setFocusable(false);
        toolBar_SaveDatabase.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toolBar_SaveDatabase.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(toolBar_SaveDatabase);

        file_Menu.setText("File");

        file_newDatabase.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        file_newDatabase.setText("New Database");
        file_newDatabase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                event_newDatabase(evt);
            }
        });
        file_Menu.add(file_newDatabase);

        file_openDatabase.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        file_openDatabase.setText("Open Database");
        file_openDatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                file_openDatabaseActionPerformed(evt);
            }
        });
        file_Menu.add(file_openDatabase);

        file_closeDatabase.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        file_closeDatabase.setText("Close Database");
        file_Menu.add(file_closeDatabase);
        file_Menu.add(file_Separator1);

        file_Save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        file_Save.setText("Save");
        file_Menu.add(file_Save);

        file_saveAs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        file_saveAs.setText("Save As");
        file_Menu.add(file_saveAs);
        file_Menu.add(file_Separator2);

        file_DatabaseSettings.setText("Database Settings");
        file_Menu.add(file_DatabaseSettings);
        file_Menu.add(file_Separator3);

        file_importFrom.setText("Import From");

        file_importFrom_xml.setText("XML");
        file_importFrom.add(file_importFrom_xml);

        file_importFrom_json.setText("JSON");
        file_importFrom.add(file_importFrom_json);

        file_Menu.add(file_importFrom);
        file_Menu.add(file_Separator4);

        file_quit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        file_quit.setText("Quit");
        file_Menu.add(file_quit);

        menuBar.add(file_Menu);

        entries_Menu.setText("Entries");
        entries_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                event_newEntry(evt);
            }
        });

        entries_newEntry.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        entries_newEntry.setText("Add New Entry");
        entries_newEntry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                event_newEntry(evt);
            }
        });
        entries_Menu.add(entries_newEntry);

        entries_cloneEntry.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        entries_cloneEntry.setText("Clone entry");
        entries_Menu.add(entries_cloneEntry);

        entries_editEntry.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        entries_editEntry.setText("Edit Entry");
        entries_Menu.add(entries_editEntry);

        entries_deleteEntry.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        entries_deleteEntry.setText("Delete Entry");
        entries_Menu.add(entries_deleteEntry);
        entries_Menu.add(entries_Separator1);

        entries_copyUName.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        entries_copyUName.setText("Copy Username To Clipboard");
        entries_Menu.add(entries_copyUName);

        entries_copyPswd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        entries_copyPswd.setText("Copy Password To Clipboard");
        entries_Menu.add(entries_copyPswd);

        entries_openUrl.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        entries_openUrl.setText("Open URL");
        entries_Menu.add(entries_openUrl);

        entries_copyUrl.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        entries_copyUrl.setText("Copy URL To Clipboard");
        entries_Menu.add(entries_copyUrl);
        entries_Menu.add(entries_Separator2);

        entries_searchDatabase.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        entries_searchDatabase.setText("Search In Database");
        entries_Menu.add(entries_searchDatabase);

        entries_searchGroup.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        entries_searchGroup.setText("Search In Group");
        entries_Menu.add(entries_searchGroup);

        menuBar.add(entries_Menu);

        groups_Menu.setText("Groups");
        groups_Menu.setEnabled(false);
        menuBar.add(groups_Menu);

        view_Menu.setText("View");
        menuBar.add(view_Menu);

        extras_Menu.setText("Extras");

        extras_pswdGenerator.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        extras_pswdGenerator.setText("Password Generator");
        extras_Menu.add(extras_pswdGenerator);

        menuBar.add(extras_Menu);

        help_Menu.setText("Help");
        menuBar.add(help_Menu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolBar, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
            .addComponent(tabPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(toolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabPane, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void file_openDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_file_openDatabaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_file_openDatabaseActionPerformed
    
    private void event_newDatabase(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_event_newDatabase
        char[] newKey;
        Keyfile newKeyFile;
        TreeModel newTree;
        Document newDocument;
        DocumentPane newDocumentPane;
        
        System.out.println("omglolwut");
        NewMasterKey nmk = new NewMasterKey(this, true);
        nmk.setTitle(NewMasterKey.TITLE);
        nmk.setVisible(true);
        newKey = nmk.getKey();
        newKeyFile = nmk.getKeyFile();
        nmk.dispose();
        
        //groupTreeView.removeAll();
        
        if (nmk.getSuccess()) {
            newDocument = new Document(newKey, newKeyFile);
            newDocumentPane = new DocumentPane();
        
            tabPane.addTab("New Database", newDocumentPane);
        }        
    }//GEN-LAST:event_event_newDatabase

    private void event_newEntry(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_event_newEntry
        System.out.println("lol new entry");
    }//GEN-LAST:event_event_newEntry

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu entries_Menu;
    private javax.swing.JPopupMenu.Separator entries_Separator1;
    private javax.swing.JPopupMenu.Separator entries_Separator2;
    private javax.swing.JMenuItem entries_cloneEntry;
    private javax.swing.JMenuItem entries_copyPswd;
    private javax.swing.JMenuItem entries_copyUName;
    private javax.swing.JMenuItem entries_copyUrl;
    private javax.swing.JMenuItem entries_deleteEntry;
    private javax.swing.JMenuItem entries_editEntry;
    private javax.swing.JMenuItem entries_newEntry;
    private javax.swing.JMenuItem entries_openUrl;
    private javax.swing.JMenuItem entries_searchDatabase;
    private javax.swing.JMenuItem entries_searchGroup;
    private javax.swing.JMenu extras_Menu;
    private javax.swing.JMenuItem extras_pswdGenerator;
    private javax.swing.JMenuItem file_DatabaseSettings;
    private javax.swing.JMenu file_Menu;
    private javax.swing.JMenuItem file_Save;
    private javax.swing.JPopupMenu.Separator file_Separator1;
    private javax.swing.JPopupMenu.Separator file_Separator2;
    private javax.swing.JPopupMenu.Separator file_Separator3;
    private javax.swing.JPopupMenu.Separator file_Separator4;
    private javax.swing.JMenuItem file_closeDatabase;
    private javax.swing.JMenu file_importFrom;
    private javax.swing.JMenuItem file_importFrom_json;
    private javax.swing.JMenuItem file_importFrom_xml;
    private javax.swing.JMenuItem file_newDatabase;
    private javax.swing.JMenuItem file_openDatabase;
    private javax.swing.JMenuItem file_quit;
    private javax.swing.JMenuItem file_saveAs;
    private javax.swing.JMenu groups_Menu;
    private javax.swing.JMenu help_Menu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JTabbedPane tabPane;
    private javax.swing.JToolBar toolBar;
    private javax.swing.JButton toolBar_NewDatabase;
    private javax.swing.JButton toolBar_OpenDatabase;
    private javax.swing.JButton toolBar_SaveDatabase;
    private javax.swing.JMenu view_Menu;
    // End of variables declaration//GEN-END:variables
}
