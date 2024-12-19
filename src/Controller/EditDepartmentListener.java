package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.DepartmentManagement_EditDepartment;

public class EditDepartmentListener implements ActionListener{

	private DepartmentManagement_EditDepartment dmed;

	public EditDepartmentListener(DepartmentManagement_EditDepartment dmed) {
		this.dmed = dmed;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		dmed.edit_department();
	}

}
