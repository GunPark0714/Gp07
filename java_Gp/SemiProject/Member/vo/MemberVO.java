package SemiProject.Member.vo;

import lombok.Data;

@Data
public class MemberVO {
	String id;
	String pw;
	String name;
	String email;
	int birthday;
	String phonenumber;
	String address;
	String authority;
	
	public MemberVO(String id, String pw, String name, String email, int birthday, String phonenumber, String address,
			String authority) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.birthday = birthday;
		this.phonenumber = phonenumber;
		this.address = address;
		this.authority = authority;
	}
	
}
