package pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class StudentModel {
	private Connection cn;
	private java.sql.Statement s;
	private int size;
	private static String[][] dataArray;
	
	public void connection() {
		try {
			cn = DriverManager.getConnection("jdbc:mysql://localhost/student_info","root","");
			JOptionPane.showMessageDialog(null, "Data Base Connected");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Could Not Connect: \nReason: "+e.getMessage());
		}
	}
	
	public String[][] search(String name) {
		JOptionPane.showMessageDialog(null, name);
		String queryCount = "Select count(*) as rowcount from student where (name = '"+name+"')";
		String query = "Select * from student where (name = '"+name+"')";
		ResultSet res;
		size = 0;
		try {
			s = cn.createStatement();
			res = s.executeQuery(queryCount);
			if(res.next()) {
				size = res.getInt("rowcount");
			
			}
			dataArray = new String[size][6];
			res = s.executeQuery(query);
			int count = 0;
			while(res.next()) {
				dataArray[count][0] = res.getString("roll_no");
				dataArray[count][1] = res.getString("name");
				dataArray[count][2] = res.getString("father_name");
				dataArray[count][3] = res.getString("gender");
				dataArray[count][4] = res.getString("email");
				dataArray[count][5] = res.getString("address");
				count++;
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dataArray;
		
		
	}
}
