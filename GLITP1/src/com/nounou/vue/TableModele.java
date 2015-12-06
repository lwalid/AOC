package com.nounou.vue;




import javax.swing.table.AbstractTableModel;

import com.nounou.model.IItem;
import com.nounou.model.IModel;
import com.nounou.model.Item;


public class TableModele extends AbstractTableModel {

	String[] columnNames ={"titre","valeur","description"};
	IModel model;



	public TableModele(IModel model) {
		this.model=model;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return columnNames.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return model.nombreItem();
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		switch (arg1) {

		case 0:
			// titre
			return model.getItem(arg0).getTitre();

		case 1:
			// valeur
			return model.getItem(arg0).getValeur();

		case 2:
			// description
			return model.getItem(arg0).getDesciption();	

		default:
			throw new IllegalArgumentException();
		}
	}

	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return columnNames[column];
	}	

	@Override
	public boolean isCellEditable(int row, int column) {
		return true;
	}

	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub

		if (0 == columnIndex) {
			model.changerItemTitre(rowIndex, (String) aValue);
		} else if (1 == columnIndex) {
			model.changerItemValeur(rowIndex,  Float.parseFloat((String) aValue) );
		} else if (2 == columnIndex) {
			model.changerItemDescription(rowIndex, (String) aValue);
		}
		fireTableCellUpdated(rowIndex, columnIndex);
	}

	
	public void ajouterligne(IItem item){
		model.ajouter(item);
		fireTableRowsInserted(model.nombreItem()-1, model.nombreItem()-1);
	}
	

}




