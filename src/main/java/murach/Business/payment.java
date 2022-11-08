package murach.Business;

import java.security.Timestamp;

public class payment {
	private String payment;
	private String user;
	private String payment_method;
	private float amount_paid;
	private String status;
	private Timestamp created_at;
	public String get_Payment() {
		return payment;
	}
	public void set_Payment(String payment) {
		this.payment = payment;
	}
	public String get_User() {
		return user;
	}
	public void set_User(String user) {
		this.user = user;
	}
	public String get_Payment_method() {
		return payment_method;
	}
	public void set_Payment_method(String payment_method) {
		this.payment_method = payment_method;
	}
	public float get_Amount_paid() {
		return amount_paid;
	}
	public void set_Amount_paid(float amount_paid) {
		this.amount_paid = amount_paid;
	}
	public String get_Status() {
		return status;
	}
	public void set_Status(String status) {
		this.status = status;
	}
	public Timestamp get_Created_at() {
		return created_at;
	}
	public void set_Created_at(Timestamp created_at) {
		this.created_at = created_at;
	}
}
