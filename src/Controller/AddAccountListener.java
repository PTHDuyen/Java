package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.AccoutnManagement_AddAccount;

public class AddAccountListener implements ActionListener {
	private AccoutnManagement_AddAccount amaa;
	
	public AddAccountListener(AccoutnManagement_AddAccount acv) {
		this.amaa = acv;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		amaa.add_Account();
	}
	
}
