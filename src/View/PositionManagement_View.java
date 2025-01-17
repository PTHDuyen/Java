package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Controller.PositionViewListener;

public class PositionManagement_View extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField ID_SearchBox;
	private DefaultTableModel tableModel;

	public PositionManagement_View() {
		String[] columnNames = { "ID", "Tên chức vụ", "Lương" };
		tableModel = new DefaultTableModel(columnNames, 0);
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

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(0, 0, 167, 563);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		String logoPath = "E:\\employeeManagerSoftware\\OIP.jpg";
		ImageIcon logoIcon = new ImageIcon(logoPath);
		Image logoImage = logoIcon.getImage();
		Image scaledLogoImage = logoImage.getScaledInstance(105, 50, Image.SCALE_SMOOTH);
		ImageIcon scaledLogoIcon = new ImageIcon(scaledLogoImage);
		panel_1.setLayout(null);
		JLabel logo = new JLabel(scaledLogoIcon);
		logo.setBounds(36, 5, 95, 50);
		panel_1.add(logo);

		JButton employeeButton = new JButton("Nhân viên");
		employeeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeeManagement_View newFrame = new EmployeeManagement_View();
				newFrame.setVisible(true);
				dispose();
			}
		});
		employeeButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				employeeButton.setBackground(new Color(100, 181, 246));
				employeeButton.setForeground(Color.BLACK);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				employeeButton.setBackground(Color.WHITE);
				employeeButton.setForeground(Color.BLACK);
			}
		});
		employeeButton.setBackground(new Color(255, 255, 255));
		employeeButton.setPreferredSize(new Dimension(150, 40));
		employeeButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
		employeeButton.setBounds(8, 114, 150, 40);
		panel_1.add(employeeButton);

		JButton positionButton = new JButton("Chức vụ");
		positionButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				positionButton.setBackground(new Color(100, 181, 246));
				positionButton.setForeground(Color.BLACK);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				positionButton.setBackground(Color.WHITE);
				positionButton.setForeground(Color.BLACK);
			}
		});
		positionButton.setBackground(new Color(255, 255, 255));
		positionButton.setPreferredSize(new Dimension(150, 40));
		positionButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
		positionButton.setBounds(8, 164, 150, 40);
		panel_1.add(positionButton);

		JButton departmentButton = new JButton("Phòng ban");
		departmentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DepartmentManagement_View newFrame = new DepartmentManagement_View();
				newFrame.setVisible(true);
				dispose();
			}
		});
		departmentButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				departmentButton.setBackground(new Color(100, 181, 246));
				departmentButton.setForeground(Color.BLACK);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				departmentButton.setBackground(Color.WHITE);
				departmentButton.setForeground(Color.BLACK);
			}
		});
		departmentButton.setBackground(new Color(255, 255, 255));
		departmentButton.setPreferredSize(new Dimension(150, 40));
		departmentButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
		departmentButton.setBounds(8, 214, 150, 40);
		panel_1.add(departmentButton);

		JButton salaryButton = new JButton("Lương");
		salaryButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PositionSalaryManagement_View newFrame = new PositionSalaryManagement_View();
				newFrame.setVisible(true);
				dispose();
			}
		});
		salaryButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				salaryButton.setBackground(new Color(100, 181, 246));
				salaryButton.setForeground(Color.BLACK);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				salaryButton.setBackground(Color.WHITE);
				salaryButton.setForeground(Color.BLACK);
			}
		});
		salaryButton.setBackground(new Color(255, 255, 255));
		salaryButton.setPreferredSize(new Dimension(150, 40));
		salaryButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
		salaryButton.setBounds(8, 264, 150, 40);
		panel_1.add(salaryButton);

		JButton reportButton = new JButton("Thống kê");
		reportButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Report_View newFrame = new Report_View();
				newFrame.setVisible(true);
				dispose();
			}
		});
		reportButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				reportButton.setBackground(new Color(100, 181, 246));
				reportButton.setForeground(Color.BLACK);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				reportButton.setBackground(Color.WHITE);
				reportButton.setForeground(Color.BLACK);
			}
		});
		reportButton.setBackground(new Color(255, 255, 255));
		reportButton.setPreferredSize(new Dimension(150, 40));
		reportButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
		reportButton.setBounds(8, 314, 150, 40);
		panel_1.add(reportButton);

		JButton accountButton = new JButton("Quản lý tài khoản");
		accountButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AccountManagement_View newFrame = new AccountManagement_View();
				newFrame.setVisible(true);
				dispose();
			}
		});
		accountButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				accountButton.setBackground(new Color(100, 181, 246));
				accountButton.setForeground(Color.BLACK);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				accountButton.setBackground(Color.WHITE);
				accountButton.setForeground(Color.BLACK);
			}
		});
		accountButton.setBackground(new Color(255, 255, 255));
		accountButton.setPreferredSize(new Dimension(150, 40));
		accountButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
		accountButton.setBounds(8, 364, 150, 40);
		panel_1.add(accountButton);

		JButton logoutButton = new JButton("Đăng xuất");
		logoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login newFrame = new Login();
				newFrame.setVisible(true);
				dispose();
			}
		});
		logoutButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				logoutButton.setBackground(new Color(100, 181, 246));
				logoutButton.setForeground(Color.BLACK);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				logoutButton.setBackground(Color.WHITE);
				logoutButton.setForeground(Color.BLACK);
			}
		});
		logoutButton.setBackground(new Color(255, 255, 255));
		logoutButton.setPreferredSize(new Dimension(150, 40));
		logoutButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
		logoutButton.setBounds(8, 513, 150, 40);
		panel_1.add(logoutButton);

		JButton homeButton = new JButton("Trang chủ\r\n");
		homeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage newFrame = new HomePage();
				newFrame.setVisible(true);
				dispose();
			}
		});
		homeButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				homeButton.setBackground(new Color(100, 181, 246));
				homeButton.setForeground(Color.BLACK);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				homeButton.setBackground(Color.WHITE);
				homeButton.setForeground(Color.BLACK);
			}
		});
		homeButton.setBackground(new Color(255, 255, 255));
		homeButton.setPreferredSize(new Dimension(150, 40));
		homeButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
		homeButton.setBounds(8, 64, 150, 40);
		panel_1.add(homeButton);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(177, 0, 885, 54);
		contentPane.add(panel_2);

		JButton addEmployeeButton = new JButton("Thêm");
		addEmployeeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PositionManagement_AddPosition newFrame = new PositionManagement_AddPosition();
				newFrame.setVisible(true);
				dispose();
			}
		});
		addEmployeeButton.setBounds(120, 9, 78, 37);
		addEmployeeButton.setBackground(new Color(144, 238, 144));
		addEmployeeButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				addEmployeeButton.setBackground(new Color(100, 181, 246));
				addEmployeeButton.setForeground(Color.BLACK);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				addEmployeeButton.setBackground(Color.GREEN);
				addEmployeeButton.setForeground(Color.BLACK);
			}
		});
		panel_2.setLayout(null);
		addEmployeeButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
		panel_2.add(addEmployeeButton);

		JButton editEmployeeButton = new JButton("Sửa\r\n");
		editEmployeeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PositionManagement_EditPosition newFrame = new PositionManagement_EditPosition();
				newFrame.setVisible(true);
				dispose();
			}
		});
		editEmployeeButton.setBounds(208, 9, 69, 37);
		editEmployeeButton.setBackground(new Color(255, 255, 0));
		editEmployeeButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				editEmployeeButton.setBackground(new Color(100, 181, 246));
				editEmployeeButton.setForeground(Color.BLACK);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				editEmployeeButton.setBackground(Color.YELLOW);
				editEmployeeButton.setForeground(Color.BLACK);
			}
		});
		editEmployeeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		editEmployeeButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
		panel_2.add(editEmployeeButton);

		JButton removeEmployeeButton = new JButton("Xóa");
		removeEmployeeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PositionManagement_RemovePosition newFrame = new PositionManagement_RemovePosition();
				newFrame.setVisible(true);
				dispose();
			}
		});
		removeEmployeeButton.setBounds(287, 9, 69, 37);
		removeEmployeeButton.setBackground(new Color(255, 0, 0));
		removeEmployeeButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				removeEmployeeButton.setBackground(new Color(100, 181, 246));
				removeEmployeeButton.setForeground(Color.BLACK);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				removeEmployeeButton.setBackground(Color.RED);
				removeEmployeeButton.setForeground(Color.BLACK);
			}
		});
		removeEmployeeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		removeEmployeeButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
		panel_2.add(removeEmployeeButton);

		ID_SearchBox = new JTextField();
		ID_SearchBox.setText("Nhập ID chức vụ"); // Đặt placeholder ban đầu
		ID_SearchBox.setForeground(Color.GRAY); // Màu văn bản placeholder
		ID_SearchBox.setToolTipText("");
		ID_SearchBox.setBounds(627, 9, 148, 37);
		ID_SearchBox.setFont(new Font("Segoe UI", Font.ITALIC, 12));
		panel_2.add(ID_SearchBox);
		ID_SearchBox.setColumns(10);
		ID_SearchBox.addFocusListener((FocusListener) new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (ID_SearchBox.getText().equals("Nhập ID chức vụ")) {
					ID_SearchBox.setText("");
					ID_SearchBox.setForeground(Color.BLACK);
					ID_SearchBox.setFont(new Font("Segoe UI", Font.PLAIN, 12));
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (ID_SearchBox.getText().isEmpty()) {
					ID_SearchBox.setText("Nhập ID chức vụ");
					ID_SearchBox.setForeground(Color.GRAY);
					ID_SearchBox.setFont(new Font("Segoe UI", Font.ITALIC, 12));
				}
			}
		});

		JButton employeeSearchButton = new JButton("Tìm kiếm");
		ActionListener ac = new PositionViewListener(this);
		employeeSearchButton.addActionListener(ac);
		employeeSearchButton.setBounds(785, 7, 100, 40);
		employeeSearchButton.setBackground(new Color(255, 255, 255));
		employeeSearchButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				employeeSearchButton.setBackground(new Color(100, 181, 246));
				employeeSearchButton.setForeground(Color.BLACK);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				employeeSearchButton.setBackground(Color.WHITE);
				employeeSearchButton.setForeground(Color.BLACK);
			}
		});
		employeeSearchButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
		panel_2.add(employeeSearchButton);

		JButton backButton = new JButton("Quay lại");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage newFrame = new HomePage();
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
		backButton.setBounds(10, 9, 100, 37);
		panel_2.add(backButton);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBounds(177, 64, 885, 498);
		contentPane.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));

		JTable employeeTable = new JTable(tableModel);
		employeeTable.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		JScrollPane scrollPane = new JScrollPane(employeeTable);
		panel_3.add(scrollPane, BorderLayout.CENTER);
		loadPositionData();

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(224, 255, 255));
		panel_4.setBounds(166, 0, 896, 562);
		contentPane.add(panel_4);
	}

	public void loadPositionData() {
		String filePath = "E:\\employeeManagerSoftware\\Position.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] accountData = line.split(",");
				if (accountData.length == 3) {
					tableModel.addRow(accountData);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void position_search() {
		String id = ID_SearchBox.getText().trim();
		if (id.isEmpty() || id.equals("Nhập ID chức vụ")) {
			JOptionPane.showMessageDialog(null, "Vui lòng nhập ID chức vụ", "Lỗi", JOptionPane.ERROR_MESSAGE);
			return;
		}

		boolean accountFound = false;
		String filePath = "E:\\employeeManagerSoftware\\Position.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] employeeData = line.split(",");
				if (employeeData.length == 3 && employeeData[0].equals(id)) {
					accountFound = true;

					PositionManagement_SearchResult searchResultFrame = new PositionManagement_SearchResult(
							employeeData[0], employeeData[1], employeeData[2]);
					searchResultFrame.setVisible(true);
					this.dispose();
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (!accountFound) {
			JOptionPane.showMessageDialog(this, "Không tìm thấy kết quả phù hợp!", "Lỗi", JOptionPane.ERROR_MESSAGE);
		}
	}
}
