/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeSelectionModel;
import misc.Group;

/**
 *
 * @author dxtr
 */
public class GroupTree extends JTree {
    public GroupTree(Group node) {
        super(new GroupTreeModel(node));
        getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        //javax.swing.Icon myIcon = node.getIcon();
        DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer();
        // renderer.setLeafIcon(myIcon);
        // renderer.setClosedIcon(myIcon);
        // renderer.setOpenIcon(myIcon);
        setCellRenderer(renderer);
    }
}
