package user;

import java.sql.Connection;
import java.sql.PreparedStatement;

import utill.DatabaseUtill;

// ���������� �����ͺ��̽��� �����ȴٰ� ����
public class UserDAO {
	public int join(String userID, String userPW) {
		String SQL = "insert into user values(?, ?)";
		
		try {
			Connection conn = DatabaseUtill.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, userID);
			pstmt.setString(2, userPW);
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
}
