package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.DepartmentManagement_RemoveDepartment;

public class RemoveDepartmentListener implements ActionListener{

	private DepartmentManagement_RemoveDepartment dmrd;

	public RemoveDepartmentListener(DepartmentManagement_RemoveDepartment dmrd) {
		this.dmrd = dmrd;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		dmrd.remove_department();
	}

}
