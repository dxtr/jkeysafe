/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;

/**
 *
 * @author dxtr
 */
public class GroupTreeModelListener implements TreeModelListener {

    @Override
    public void treeNodesChanged(TreeModelEvent tme) {
        System.out.println("treeNodesChanged");
    }

    @Override
    public void treeNodesInserted(TreeModelEvent tme) {
        System.out.println("treeNodesInserted");
    }

    @Override
    public void treeNodesRemoved(TreeModelEvent tme) {
        System.out.println("treeNodesREmoved");
    }

    @Override
    public void treeStructureChanged(TreeModelEvent tme) {
        System.out.println("treeStructureCha");
    }
    
}
