
public class Complain {
	int uid;
	int complain_id;
	String complain_name;
	String complain_desp;
	int Date_of_complain;
	String resolution_sts;
	public Complain() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Complain(int uid, int complain_id, String complain_name, String complain_desp, int date_of_complain,
			String resolution_sts) {
		super();
		this.uid = uid;
		this.complain_id = complain_id;
		this.complain_name = complain_name;
		this.complain_desp = complain_desp;
		Date_of_complain = date_of_complain;
		this.resolution_sts = resolution_sts;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getComplain_id() {
		return complain_id;
	}
	public void setComplain_id(int complain_id) {
		this.complain_id = complain_id;
	}
	public String getComplain_name() {
		return complain_name;
	}
	public void setComplain_name(String complain_name) {
		this.complain_name = complain_name;
	}
	public String getComplain_desp() {
		return complain_desp;
	}
	public void setComplain_desp(String complain_desp) {
		this.complain_desp = complain_desp;
	}
	public int getDate_of_complain() {
		return Date_of_complain;
	}
	public void setDate_of_complain(int date_of_complain) {
		Date_of_complain = date_of_complain;
	}
	public String getResolution_sts() {
		return resolution_sts;
	}
	public void setResolution_sts(String resolution_sts) {
		this.resolution_sts = resolution_sts;
	}
	@Override
	public String toString() {
		return "Complain [uid=" + uid + ", complain_id=" + complain_id + ", complain_name=" + complain_name
				+ ", complain_desp=" + complain_desp + ", Date_of_complain=" + Date_of_complain + ", resolution_sts="
				+ resolution_sts + "]";
	}
	
	

}
