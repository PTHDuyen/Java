package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.DepartmentManagement_View;

public class DepartmentViewListener implements ActionListener {

	private DepartmentManagement_View dmv;
		
	public DepartmentViewListener(DepartmentManagement_View dmv) {
		this.dmv = dmv;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		dmv.department_search();
	}

}
