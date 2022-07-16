package sugangSincheong;

import java.util.Vector;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import control.CDirectory;
import control.CLogin;
import valueObject.VDirectory;

public class PDirectory extends JTable {
	private static final long serialVersionUID = 1L;
	private ListSelectionListener listSelectionHandler;
	private Vector<VDirectory> vDirectories;
	private DefaultTableModel tableModel;
	
	private CDirectory cDirectory;
	
	public PDirectory(String title, ListSelectionListener listSelectionHandler) {
		// attributes
		this.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.listSelectionHandler = listSelectionHandler;
		this.getSelectionModel().addListSelectionListener(this.listSelectionHandler);
		
		// data model
		Vector<String> header = new Vector<String>();
		header.addElement(title);
		this.tableModel = new DefaultTableModel(header, 0);
		this.setModel(this.tableModel);
		
		this.cDirectory = new CDirectory();
	}
	public String initialize(String fileName) {
		return this.getData(fileName);			
	}
	public void initialize() {
		
	}

	public String getSelectedFileName() {
		int selectedIndex = this.getSelectedRow();
		String selectedFileName = this.vDirectories.get(selectedIndex).getFileName();
		return selectedFileName;
	}

	public String getData(String fileName) {
		this.getSelectionModel().removeListSelectionListener(this.listSelectionHandler);
		
		this.vDirectories = this.cDirectory.getData(fileName);
		this.tableModel.setRowCount(0);
		
		for (VDirectory vDirectory: this.vDirectories) {
			Vector<String> row = new Vector<String>();
			row.add(vDirectory.getName());
			this.tableModel.addRow(row);
		}
		
		String selectedFileName = null;
		if (this.vDirectories.size() > 0) {
			this.getSelectionModel().addSelectionInterval(0, 0);
			selectedFileName = vDirectories.get(0).getFileName();
		}
		
		this.getSelectionModel().addListSelectionListener(this.listSelectionHandler);
		return selectedFileName;
	}
	
}
