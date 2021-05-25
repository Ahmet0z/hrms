package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue
	@Column(name = "userid")
	private int userId;
	
	@Column(name = "mailadress")
	private String mailAdress;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "passwordagain")
	private String passwordAgain;

	public User() {
		super();
	}

	public User(int userId, String mailAdress, String password, String passwordAgain) {
		super();
		this.userId = userId;
		this.mailAdress = mailAdress;
		this.password = password;
		this.passwordAgain = passwordAgain;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getMailAdress() {
		return mailAdress;
	}

	public void setMailAdress(String mailAdress) {
		this.mailAdress = mailAdress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordAgain() {
		return passwordAgain;
	}

	public void setPasswordAgain(String passwordAgain) {
		this.passwordAgain = passwordAgain;
	}
}
