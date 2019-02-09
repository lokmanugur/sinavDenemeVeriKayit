/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sinavdenemeverikaydi;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author BLUE
 */
    public class removeData 
    {    
        public void setData(DefaultTableModel model)
        {
        if (model.getRowCount() > 0) 
            {
            for (int i = model.getRowCount() - 1; i > -1; i--) 
                {
                 model.removeRow(i);
                }
             }    
         }
     }
