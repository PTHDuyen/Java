package DepartmentManagementTest;

import Model.Department;
import Model.DepartmentManagement;

public class DepartmentManagement_Main {
	
		private DepartmentManagement dm;
			
		public DepartmentManagement_Main() {
			this.dm = new DepartmentManagement();
		}	
			
		public int addDepartment(String id, String positionName, String address, String phoneNumber) {
				Department d = new Department(Integer.parseInt(id), positionName, address, phoneNumber);
				return dm.addDepartment(d);
			}
			
		public int removeDepartment(String id) {
			return dm.removeDepartment(id);
		}	
		
		public int editDepartment(String id, String positionName, String address, String phontNumber) {
			return dm.editDepartment(id, positionName, address, phontNumber);

		}	
	
}