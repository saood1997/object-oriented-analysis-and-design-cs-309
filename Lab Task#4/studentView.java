package pkg;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.BorderLayout;

public class studentView extends JFrame {
	public studentView() {
	}
	private JTextField txtName;
	private JPanel contentPane;
	public static boolean flag = false;
	public static String sName = null;
	public static boolean flag1 = false;
	
	/**
	 * Create the frame.
	 */
	
	
	public void showData(String dataArray[][]) {
		System.out.println(flag1);
		setResizable(false);
		setTitle("Search Student");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 684, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(149, 40, 56, 16);
		contentPane.add(lblName);

		txtName = new JTextField();
		txtName.setBounds(214, 37, 153, 22);
		contentPane.add(txtName);
		txtName.setColumns(10);

		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			sName = txtName.getText();
			flag = true;
			
		}
		});
		btnSearch.setBounds(270, 72, 97, 25);
		contentPane.add(btnSearch);

		JLabel lblRollNo = new JLabel("Roll No");
		lblRollNo.setBounds(10, 125, 61, 20);
		contentPane.add(lblRollNo);

		JLabel lblName_1 = new JLabel("Name");
		lblName_1.setBounds(73,125, 89, 20);
		contentPane.add(lblName_1);

		JLabel lblFathersName = new JLabel("Father's Name");
		lblFathersName.setBounds(164, 125, 105, 20);
		contentPane.add(lblFathersName);

		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(270, 125, 69, 20);
		contentPane.add(lblGender);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(341, 125, 114, 20);
		contentPane.add(lblEmail);

		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(458, 125, 198, 20);
		contentPane.add(lblAddress);
		int x = 149;
		int count = 0;
		if(flag) {
			while(count < dataArray.length) {
				JTextPane txtCheck = new JTextPane();
				txtCheck.setText(dataArray[count][0]);
				txtCheck.setBounds(10, x, 61, 20);
				contentPane.add(txtCheck);
				JTextPane textPane = new JTextPane();
				textPane.setText(dataArray[count][1]);
				textPane.setBounds(73,x, 89, 20);
				contentPane.add(textPane);
			
				JTextPane textPane_1 = new JTextPane();
				textPane_1.setText(dataArray[count][2]);
				textPane_1.setBounds(164, x, 105, 20);
				contentPane.add(textPane_1);
			
				JTextPane textPane_2 = new JTextPane();
				textPane_2.setText(dataArray[count][3]);
				textPane_2.setBounds(270, x, 69, 20);
				contentPane.add(textPane_2);
			
				JTextPane textPane_3 = new JTextPane();
				textPane_3.setText(dataArray[count][4]);
				textPane_3.setBounds(341, x, 114, 20);
				contentPane.add(textPane_3);
			
				JTextPane textPane_4 = new JTextPane();
				textPane_4.setText(dataArray[count][5]);
				textPane_4.setBounds(458, x, 198, 20);
				contentPane.add(textPane_4);
				x += 25;
				count++;
			}
		}
		setVisible(true);
		
	}

}

