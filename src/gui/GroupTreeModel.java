/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.Vector;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;
import misc.Group;

/**
 *
 * @author dxtr
 */
public class GroupTreeModel implements TreeModel {
    private Group myRoot = null;
    private Vector<GroupTreeModelListener> listeners = new Vector<GroupTreeModelListener>();
    public GroupTreeModel(Group root) {
        myRoot = root;
    }
    
    @Override
    public Object getRoot() { return myRoot; }
    @Override
    public void addTreeModelListener(TreeModelListener l) { listeners.addElement((GroupTreeModelListener)l); }
    @Override
    public void removeTreeModelListener(TreeModelListener l) { listeners.removeElement(l); }
    @Override
    public void valueForPathChanged(TreePath path, Object newValue) { System.out.println(path + " -> " + newValue); }

    @Override
    public Object getChild(Object parent, int index) {
        Group g = (Group)parent;
        return g.getSubGroups().get(index);
    }

    @Override
    public int getChildCount(Object parent) {
        Group g = (Group)parent;
        return g.getSubGroups().size();
    }

    @Override
    public boolean isLeaf(Object node) {
        Group g = (Group)node;
        return g.getSubGroups().isEmpty();
    }

    @Override
    public int getIndexOfChild(Object parent, Object child) {
        Group pg = (Group)parent; // Parent group
        Group cg = (Group)parent; // Child group
        
        // TODO
        System.out.println("getIndexOfChild()");
        return 0;
    }
}
