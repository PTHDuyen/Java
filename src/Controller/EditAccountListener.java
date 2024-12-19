package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.AccountManagement_EditAccount;

public class EditAccountListener implements ActionListener {
	private AccountManagement_EditAccount amea;
	
	public EditAccountListener(AccountManagement_EditAccount amea) {
		this.amea = amea;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		amea.edit_account();
	}
	
}
