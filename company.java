import java.util.Arrays;

public class Company {
int company_id;
String company_name;
String company_email;
Complain[]comp;
public Company() {
	super();
	// TODO Auto-generated constructor stub
}
public Company(int company_id, String company_name, String company_email, Complain[] comp) {
	super();
	this.company_id = company_id;
	this.company_name = company_name;
	this.company_email = company_email;
	this.comp = comp;
}
public int getCompany_id() {
	return company_id;
}
public void setCompany_id(int company_id) {
	this.company_id = company_id;
}
public String getCompany_name() {
	return company_name;
}
public void setCompany_name(String company_name) {
	this.company_name = company_name;
}
public String getCompany_email() {
	return company_email;
}
public void setCompany_email(String company_email) {
	this.company_email = company_email;
}
public Complain[] getComp() {
	return comp;
}
public void setComp(Complain[] comp) {
	this.comp = comp;
}
@Override
public String toString() {
	return "Company [company_id=" + company_id + ", company_name=" + company_name + ", company_email=" + company_email
			+ ", comp=" + Arrays.toString(comp) + "]";
}
}
