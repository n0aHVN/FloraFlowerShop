package murach.Business;

import java.security.Timestamp;

public class user {
	private String user_id;
	private String password;
	private String fullname;
	private String email;
	private String phone;
	private boolean is_admin;
	private Timestamp joined_date;
	private Timestamp last_login;
	
	public user(
			 String user_id,
		 String password,
		 String fullname,
		 String email,
		 String phone,
		 boolean is_admin,
		 Timestamp joined_date,
		 Timestamp last_login) {
		this.user_id = user_id;
		this.password= password;
		this.fullname= fullname;
		this.email= email;
		this.phone= phone;
		this.is_admin= is_admin;
	}
	
	public user() {
		this.user_id = "";
		this.password= "";
		this.fullname= "";
		this.email= "";
		this.phone= "";
		this.is_admin= false;
	}
	
	public String get_user_id() {
		return this.user_id;
	}
	public String get_password() {
		return this.password;
	}
	
	public String get_fullname() {
		return this.fullname;
	}
	
	public String get_email(){
		return this.email;
	}
	
	public String get_phone() {
		return this.phone;
	}
	
	public boolean get_is_admin() {
		return this.is_admin;
	}
	
	public Timestamp get_joined_date() {
		return this.joined_date;
	}
	
	public Timestamp get_last_login() {
		return this.last_login;
	}
	
	
	public void set_user_id(String user_id) {
		this.user_id = user_id;
	}
	public void set_password(String password) {
		this.password = password;
	}
	
	public void set_fullname(String fullname) {
		this.fullname = fullname;
	}
	
	public void set_email(String email){
		this.email = email;
	}
	
	public void set_phone(String phone) {
		this.phone = phone;
	}
	
	public void set_is_admin(boolean is_admin) {
		this.is_admin = is_admin;
	}
	
	public void set_joined_date(Timestamp joined_date) {
		this.joined_date = joined_date;
	}
	
	public void set_last_login(Timestamp last_login) {
		this.last_login = last_login;
	}
	
}
