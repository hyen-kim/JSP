package user;

public class UserDTO {

	
	String userID;
	String userPw;
	
	// ���� ��ϵ� �����͸� �������� ����
	public String getUserID() {
		return userID;
	}
	
	// �����͸� ����ϴ� ����
	public void setUserID(String userID) {
		this.userID = userID;
	}
	
	
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	
}
