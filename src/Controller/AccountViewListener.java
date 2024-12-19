
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.AccountManagement_View;

public class AccountViewListener implements ActionListener{

	private AccountManagement_View amv;
	
	public AccountViewListener(AccountManagement_View amv) {
		super();
		this.amv = amv;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		amv.account_search();
	}

}
