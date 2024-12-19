package View;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import AccountManagementTest.AccountManagement_Main;
import Controller.AddAccountListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextField;
import java.awt.Color;

public class AccoutnManagement_AddAccount extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField usernameTextField;
    private JTextField passwordTextField;
    private JButton confirmButton;
    private JButton cancelButton;
    private JLabel ThemMoiTaiKhoanText;
    private AccountManagement_Main amm;
    
    public AccoutnManagement_AddAccount() {
		amm = new AccountManagement_Main();
		this.init();
		setVisible(true);
	}
    
	public void init() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1076, 600);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBounds(0, 91, 1062, 472);
        contentPane.add(panel_2);
        panel_2.setLayout(null);
        
        usernameTextField = new JTextField();
        usernameTextField.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        usernameTextField.setBounds(393, 47, 285, 30);
        panel_2.add(usernameTextField);
        usernameTextField.setColumns(10);
        
        JLabel lblNewLabel = new JLabel("Tên tài khoản");
        lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        lblNewLabel.setBounds(392, 11, 207, 30);
        panel_2.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Mật khẩu");
        lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        lblNewLabel_1.setBounds(392, 87, 152, 30);
        panel_2.add(lblNewLabel_1);
        
        passwordTextField = new JTextField();
        passwordTextField.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        passwordTextField.setColumns(10);
        passwordTextField.setBounds(393, 123, 285, 30);
        panel_2.add(passwordTextField);
        
        confirmButton = new JButton("Xác nhận");
        ActionListener ac = new AddAccountListener(this);
        confirmButton.addActionListener(ac);
        confirmButton.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		confirmButton.setBackground(new Color(100, 181, 246));
        		confirmButton.setForeground(Color.BLACK);
        	}
        	
        	 @Override
             public void mouseExited(MouseEvent e) {
        		 confirmButton.setBackground(Color.WHITE);
        		 confirmButton.setForeground(Color.BLACK);
             }
        });
        confirmButton.setBackground(new Color(255, 255, 255));
        confirmButton.setFont(new Font("Segoe UI", Font.BOLD, 20));
        confirmButton.setBounds(393, 410, 134, 41);
        panel_2.add(confirmButton);
        
        cancelButton = new JButton("Hủy bỏ");
        cancelButton.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		cancelButton.setBackground(new Color(255, 61, 0));
        		cancelButton.setForeground(Color.BLACK);
        	}
        	
        	 @Override
             public void mouseExited(MouseEvent e) {
        		 cancelButton.setBackground(Color.WHITE);
        		 cancelButton.setForeground(Color.BLACK);
             }
        	 
        	 @Override
             public void mouseClicked(MouseEvent e) {
                 usernameTextField.setText("");
                 passwordTextField.setText("");
             }
        });
        cancelButton.setBackground(new Color(255, 255, 255));
        cancelButton.setFont(new Font("Segoe UI", Font.BOLD, 20));
        cancelButton.setBounds(555, 410, 125, 41);
        panel_2.add(cancelButton);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(25, 118, 210));
        panel_1.setBounds(0, 0, 1062, 92);
        contentPane.add(panel_1);
        panel_1.setLayout(null);
        
        JButton backButton = new JButton("Quay lại");
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	AccountManagement_View newFrame = new AccountManagement_View();
                newFrame.setVisible(true);
                dispose();
            }
        });
        backButton.setBackground(new Color(255, 255, 255));
        backButton.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		backButton.setBackground(new Color(100, 181, 246));
        		backButton.setForeground(Color.BLACK);
        	}
        	
        	 @Override
             public void mouseExited(MouseEvent e) {
        		 backButton.setBackground(Color.WHITE);
        		 backButton.setForeground(Color.BLACK);
             }
        });
        backButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        backButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
        backButton.setBounds(0, 0, 100, 37);
        panel_1.add(backButton);
        
        ThemMoiTaiKhoanText = new JLabel("THÊM MỚI TÀI KHOẢN");
        ThemMoiTaiKhoanText.setForeground(new Color(255, 255, 255));
        ThemMoiTaiKhoanText.setFont(new Font("Segoe UI", Font.BOLD, 20));
        ThemMoiTaiKhoanText.setBounds(410, 21, 242, 61);
        panel_1.add(ThemMoiTaiKhoanText);
        
    }
	
	public void add_Account() {
	    String username = usernameTextField.getText();
	    String password = passwordTextField.getText();

	    if (username.isEmpty()) {
	        JOptionPane.showMessageDialog(this, "Vui lòng nhập  hết các trường dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
	        return;
	    }
	    if (password.isEmpty()) {
	        JOptionPane.showMessageDialog(this, "Vui lòng nhập  hết các trường dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
	        return;
	    }

	    int res = amm.signUp(username, password);
	    if (res == 1) {
	        JOptionPane.showMessageDialog(this, "Tài khoản đã tồn tại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
	    } else if (res == 2) {
	        JOptionPane.showMessageDialog(this, "Thêm mới tài khoản thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
	    } else if (res == 3) {
	        JOptionPane.showMessageDialog(this, "Vui lòng nhập  hết các trường dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
	    } else if (res == 4) {
	        JOptionPane.showMessageDialog(this, "Vui lòng nhập  hết các trường dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
	    }
	}
}
