package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.AccountManagement_RemoveAccount;

public class RemoveAccountListener implements ActionListener{

	private AccountManagement_RemoveAccount amra;
	
	public RemoveAccountListener(AccountManagement_RemoveAccount amra) {
		this.amra = amra;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		amra.remove_account();
	}

}
