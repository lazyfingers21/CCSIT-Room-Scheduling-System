
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class TableColorCellRenderer implements TableCellRenderer{
     private static final TableCellRenderer renderer = new DefaultTableCellRenderer();
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c = renderer.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        if (column == 0){
            Object result = table.getModel().getValueAt(row, column);
            String cell = result.toString();
            Color color = null;
            
            if (cell != ""){
                color = Color.BLUE;
            }
            c.setBackground(color);
        }
        else{
            c.setBackground(null);
        
        }
        return c;
    }
    
}
    
    
    


