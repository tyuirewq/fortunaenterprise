package mainpackage;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import java.awt.Panel;
import java.awt.Label;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class Mainpage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	public Mainpage() {
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		size = new Dimension((int)size.getWidth()+10,(int)size.getHeight()-20);
		setMinimumSize(size);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setMinimumSize(new Dimension(0, 0));

		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Ticket Raise Panel");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel, 73, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel, 599, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNewLabel, 97, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel, -600, SpringLayout.EAST, contentPane);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 10, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_1, 40, SpringLayout.WEST, contentPane);
		ImageIcon icon = new ImageIcon("D:\\Hariom\\Software\\IssueTicketManagement\\src\\img_login\\caregroup_logo.png");
        Image img = icon.getImage();
        Image imgresize = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        ImageIcon scaledicon = new ImageIcon(imgresize);
		lblNewLabel_1.setIcon(scaledicon);
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 18));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Care Group Sight Solutions");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 0, SpringLayout.NORTH, lblNewLabel_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_2, 0, SpringLayout.EAST, lblNewLabel_1);
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBorder(null);
		lblNewLabel_2.setBackground(new Color(240, 240, 240));
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 22));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 0, SpringLayout.NORTH, lblNewLabel_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel_3, -59, SpringLayout.EAST, contentPane);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton, 0, SpringLayout.NORTH, lblNewLabel_1);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(240, 240, 240));
		ImageIcon icon1 = new ImageIcon("D:\\Hariom\\Software\\IssueTicketManagement\\src\\img_login\\icons8-setting-50.png");
        Image img1 = icon1.getImage();
        Image imgresize1 = img1.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        ImageIcon scaledicon1 = new ImageIcon(imgresize1);
		btnNewButton.setIcon(scaledicon1);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton, -6, SpringLayout.WEST, btnNewButton_1);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_1, 0, SpringLayout.NORTH, lblNewLabel_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_1, -23, SpringLayout.EAST, contentPane);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(new Color(240, 240, 240));
		ImageIcon icon2 = new ImageIcon("D:\\Hariom\\Software\\IssueTicketManagement\\src\\img_login\\icons8-logout-32.png");
        Image img2 = icon2.getImage();
        Image imgresize2 = img2.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        ImageIcon scaledicon2 = new ImageIcon(imgresize2);
		btnNewButton_1.setIcon(scaledicon2);
		contentPane.add(btnNewButton_1);
		
		Panel panel = new Panel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel, 28, SpringLayout.SOUTH, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel, 282, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel, 430, SpringLayout.SOUTH, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel, 1077, SpringLayout.WEST, contentPane);
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		Label label = new Label("Selcet Case type");
		sl_panel.putConstraint(SpringLayout.EAST, label, 189, SpringLayout.WEST, panel);
		label.setFont(new Font("Georgia", Font.BOLD, 16));
		sl_panel.putConstraint(SpringLayout.NORTH, label, 33, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, label, 48, SpringLayout.WEST, panel);
		panel.add(label);
		
		JMenu mnNewMenu = new JMenu("New menu");
		sl_panel.putConstraint(SpringLayout.NORTH, mnNewMenu, 0, SpringLayout.NORTH, label);
		sl_panel.putConstraint(SpringLayout.WEST, mnNewMenu, 19, SpringLayout.EAST, label);
		panel.add(mnNewMenu);

		
		JMenuItem menuitem1 = new JMenuItem("Type 1");
		JMenuItem menuitem2 = new JMenuItem("Type 2");
		JMenuItem menuitem3 = new JMenuItem("Type 3");
		JMenuItem menuitem4 = new JMenuItem("Type 4");
		
		mnNewMenu.add(menuitem1);
		mnNewMenu.add(menuitem2);
		mnNewMenu.add(menuitem3);
		mnNewMenu.add(menuitem4);
		
		
	}
}
