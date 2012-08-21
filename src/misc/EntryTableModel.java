/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package misc;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dxtr
 */
public class EntryTableModel extends AbstractTableModel {
    
    @Override
    public int getRowCount() {
        return 1;
    }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
