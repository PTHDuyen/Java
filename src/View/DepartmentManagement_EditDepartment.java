package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Controller.EditDepartmentListener;
import DepartmentManagementTest.DepartmentManagement_Main;

public class DepartmentManagement_EditDepartment extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField positionNameTextField;
	private JTextField addressTextField;
	private JTextField phoneNumberTextField;
	private JButton confirmButton;
	private JButton cancelButton;
	private JLabel suaThongTinPhongBanText;
	private DepartmentManagement_Main dmm;
	private JTextField idTextField;

	public DepartmentManagement_EditDepartment() {
		this.dmm = new DepartmentManagement_Main();
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

		positionNameTextField = new JTextField();
		positionNameTextField.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		positionNameTextField.setBounds(392, 123, 285, 30);
		panel_2.add(positionNameTextField);
		positionNameTextField.setColumns(10);

		JLabel positionNameText = new JLabel("Tên phòng ban");
		positionNameText.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		positionNameText.setBounds(392, 83, 207, 30);
		panel_2.add(positionNameText);

		JLabel addressText = new JLabel("Địa chỉ");
		addressText.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		addressText.setBounds(393, 163, 152, 30);
		panel_2.add(addressText);

		addressTextField = new JTextField();
		addressTextField.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		addressTextField.setColumns(10);
		addressTextField.setBounds(393, 203, 285, 30);
		panel_2.add(addressTextField);

		JLabel phoneNumberText = new JLabel("Số điện thoại");
		phoneNumberText.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		phoneNumberText.setBounds(393, 243, 207, 30);
		panel_2.add(phoneNumberText);

		phoneNumberTextField = new JTextField();
		phoneNumberTextField.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		phoneNumberTextField.setColumns(10);
		phoneNumberTextField.setBounds(393, 283, 285, 30);
		panel_2.add(phoneNumberTextField);

		confirmButton = new JButton("Xác nhận");
		ActionListener ac = new EditDepartmentListener(this);
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
				positionNameTextField.setText("");
				addressTextField.setText("");
				phoneNumberTextField.setText("");
				idTextField.setText("");
			}
		});
		cancelButton.setBackground(new Color(255, 255, 255));
		cancelButton.setFont(new Font("Segoe UI", Font.BOLD, 20));
		cancelButton.setBounds(555, 410, 125, 41);
		panel_2.add(cancelButton);

		idTextField = new JTextField();
		idTextField.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		idTextField.setColumns(10);
		idTextField.setBounds(392, 47, 285, 30);
		panel_2.add(idTextField);

		JLabel idText = new JLabel("Nhập ID phòng ban cần sửa\r\n");
		idText.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		idText.setBounds(392, 10, 260, 30);
		panel_2.add(idText);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(25, 118, 210));
		panel_1.setBounds(0, 0, 1062, 92);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JButton backButton = new JButton("Quay lại");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DepartmentManagement_View newFrame = new DepartmentManagement_View();
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

		suaThongTinPhongBanText = new JLabel("SỬA THÔNG TIN PHÒNG BAN\t");
		suaThongTinPhongBanText.setForeground(new Color(255, 255, 255));
		suaThongTinPhongBanText.setFont(new Font("Segoe UI", Font.BOLD, 20));
		suaThongTinPhongBanText.setBounds(390, 21, 296, 61);
		panel_1.add(suaThongTinPhongBanText);

	}

	public void edit_department() {
		String id = idTextField.getText();
		String positionName = positionNameTextField.getText();
		String address = addressTextField.getText();
		String phontNumber = phoneNumberTextField.getText();
		if (id.isEmpty() || positionName.isEmpty() || address.isEmpty() || phontNumber.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Vui lòng nhập hết các trường dữ liệu!", "Lỗi",
					JOptionPane.ERROR_MESSAGE);
			return;
		}

		int res = dmm.editDepartment(id, positionName, address,
				phontNumber); /*
								 * lưu ý: code các chức năng lúc đầu cần phải sửa đổi để phù hợp với cách chạy
								 * thông qua giao diện thay vì màn hình console
								 */
		if (res == 1) {
			JOptionPane.showMessageDialog(this, "Sửa phòng ban thành công!", "Thông báo",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (res == 2) {
			JOptionPane.showMessageDialog(this, "ID không tồn tại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
		}
	}
}
