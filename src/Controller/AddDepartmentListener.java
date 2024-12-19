package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.DepartmentManagement_AddDepartment;

public class AddDepartmentListener implements ActionListener {

	private DepartmentManagement_AddDepartment dmad;
	
	public AddDepartmentListener(DepartmentManagement_AddDepartment dmad) {
		this.dmad = dmad;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		dmad.add_department();
	}

}
