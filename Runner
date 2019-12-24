import java.util.Scanner;

public class Runner {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the number of company");
		int n = sc.nextInt();
		Company[] com = new Company[n];
		for (int i = 0; i < n; i++) {
			com[i] = new Company();
			System.out.println("enter the company id:");
			int company_id = sc.nextInt();
			com[i].setCompany_id(company_id);
			System.out.println("enter company name");
			String company_name = sc.next();
			com[i].setCompany_name(company_name);
			System.out.println("enter company email");
			String email = sc.next();
			com[i].setCompany_email(email);
			System.out.println("enter number of complain");
			int num = sc.nextInt();
			Complain[] comp = new Complain[num];
			for (int j = 0; j < num; j++) {
				comp[j] = new Complain();
				System.out.println("enter uid");
				int uid = sc.nextInt();
				comp[j].setComplain_id(uid);
				System.out.println("enter complaint id");
				int complainid = sc.nextInt();
				comp[j].setComplain_id(complainid);
				System.out.println("enter complain desp");
				String complain_descp = sc.next();
				comp[j].setComplain_desp(complain_descp);
				System.out.println("enter complain date");
				int date = sc.nextInt();
				comp[j].setDate_of_complain(date);
				System.out.println("reolution status");
				String reso = sc.next();
				comp[j].setResolution_sts(reso);
			}
			com[i].setComp(comp);
		}
		System.out.println("to add company and complains:");
		System.out.println("upadate compalin");
		System.out.println("sort all complain by complain date");
		System.out.println("display all complain with a common complain description");
		int choice = sc.nextInt();
		switch (choice) {

		case 1:

			System.out.println("the company and complain are:");
			for (int i = 0; i < com.length; i++) {
				for (int j = 0; j < com[i].getComp().length; j++) {
					System.out.println("the company id is:" + "" + com[i].getCompany_id() + "" + "the company name is:"
							+ " " + com[i].getCompany_name() + " " + "the company email is:" + " "
							+ com[i].getCompany_email() + "" + "the complain uid is:" + " "
							+ com[i].getComp()[j].getUid() + "" + "the complain id is" + ""
							+ com[i].getComp()[j].getComplain_id() + "" + "the complain name is" + ""
							+ com[i].getComp()[j].getComplain_name() + "" + "the complain description is" + ""
							+ com[i].getComp()[j].getComplain_desp() + "" + "the complain date is" + ""
							+ com[i].getComp()[j].getDate_of_complain() + "" + "the complain resolution is"
							+ com[i].getComp()[j].getResolution_sts());
				}
			}
			Complain complain = new Complain();
			System.out.println("add new Complain uid");
			int unid = sc.nextInt();
			complain.setUid(unid);
			System.out.println("enter new complain id");
			int complain_id = sc.nextInt();
			complain.setComplain_id(complain_id);
			System.out.println("enter new complain descp");
			String descp = sc.next();

		case 2:
			Complain comp = new Complain();
			System.out.println("enter  complain id to update");
			int ncomplain_id = sc.nextInt();
			if (comp.complain_id == ncomplain_id) {
				System.out.println("enter descp to update");
				String upd = sc.next();
				comp.setComplain_desp(upd);
				System.out.println(comp.getComplain_desp());

			}
		case 3:
			Company temp;

			for (int i = 0; i < com.length; i++) {
				for (int j = 0; j < com[i].getComp().length - 1; j++) {
					for (int k = 0; k < com[i].getComp().length - i - 1; j++) {
						if (com[i].getComp()[k].getDate_of_complain() > com[i].getComp()[k + 1].getDate_of_complain()) {
							temp = com[k];
							com[k] = com[k + 1];
							com[k + 1] = temp;
						}
					}
				}
			}

			System.out.println("after sort");
			for (int i = 0; i < com.length; i++) {
				for (int j = 1; j < com[i].getComp().length; i++) {
					System.out.println(com[i].getComp()[j]);
				}
			}
		case 4:
			System.out.println("enter a description");
			String description = sc.next();
			for (int i = 0; i < com.length; i++) {
				for (int j = 1; j < com[i].getComp().length; i++) {
					if (com[i].getComp()[j].getComplain_desp().equals(description)) {
						System.out.println(com[i].getComp());
					}
				}
			}
		default:
			System.out.println("Wrong Choice");
		}

	}

}
