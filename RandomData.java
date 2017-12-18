/*

CREATE TABLE Participant(
Roll_no VARCHAR2(5) UNIQUE NOT NULL, 
email_id VARCHAR2(20) PRIMARY KEY,
Application_id REFERENCES APPLICATION(Application_id) ON DELETE CASCADE, 
Scheduled_program_id VARCHAR2(5) REFERENCES Programs_Scheduled(Scheduled_program_id) ON DELETE CASCADE
);

CREATE SEQUENCE seq_applicant_id 
START WITH 1000;
*/
package DataInsertion;

import java.time.LocalDate;
import java.util.Random;

public class RandomData {

	public static void main(String[] args) {
		Random random = new Random();
		String fullName[] = {"Kamal Vidhani", "Gunjan Agarwal", "Arjun Gupta", "Gaurav Menon", "Sri Ramaya", "Jitesh Ahuja", "Preeti Jindal", "Shivam Singh", "Sagar Verliani"};
		LocalDate date[] = {LocalDate.of(2017, 8, 12), LocalDate.of(1995, 9, 18), LocalDate.of(2001, 11, 19), LocalDate.of(2001, 10, 19)};
		String highestQualification[] = {"Bachelor", "HSC", "SSC", "PhD", "Masters"};
		int numbers[] = {10,20,30,40,50,60,70,80,90,100};
		String goals[] = {"Software Developer", "Platform Engineer", "UI Developer", "Web Developer", "System Analyst"};
		String emailId[] = {"kamal@gmail.com", "gunjan@gmail.com", "jitesh@gmail.com", "arjun@yahoo.com", "sagar@mail.com"};
		String programName[] = {"B.TECH", "B.E", "M.TECH", "M.E", "MSc", "BSc", "B.COM", "M.COM"};
		String description[] = {"Summer course", "Winter course", "Crash Course", "Online course"};
		String eligibility[] = {"Graduate", "Post Graduate"};
		String degreeOffered[] = {"Bachelor", "Masters", "PhD"};
		String psId[] = {"K001", "G002", "A003", "P004", "J005", "H006"};
		String city[] = {"Bangalore", "Mumbai", "Jaipur", "Raipur", "Rajkot", "Nashik"};
		String state[] = {"Maharashtra", "Karnataka", "Madhya Pradesh", "Rajasthan", "Orissa", "Gujrat"};
		int pincode[] = {560066, 560065, 560064, 560063, 560062, 560061};
		String rollNo[] = psId;
		String loginId[] = {"kv18995", "Gunjan004", "Arjun003"};
		String role[] = {"ADMIN", "MAC"};
		
		for(int i=0;i<20;++i) {
			System.out.println("INSERT INTO APPLICATION VALUES(seq_applicant_id.NEXTVAL"
								+", '"+fullName[random.nextInt(fullName.length)]
								+"', '"+date[random.nextInt(date.length)]
								+"', '"+highestQualification[random.nextInt(highestQualification.length)]
								+"', "+numbers[random.nextInt(numbers.length)]
								+", '"+goals[random.nextInt(goals.length)]
								+"', '"+emailId[random.nextInt(emailId.length)]
								+"', '"+psId[random.nextInt(psId.length)]
								+"', 'APPLIED'"
								+", '"+date[random.nextInt(date.length)]
								+"');");
		}
			
		for(int i=0;i<20;++i) {
			System.out.println("INSERT INTO Programs_Offered VALUES('"
							  	+programName[random.nextInt(programName.length)]
							  	+"', '"+description[random.nextInt(description.length)]
							  	+"', '"+eligibility[random.nextInt(eligibility.length)]
							  	+"', "+numbers[random.nextInt(numbers.length)]
							  	+", '"+degreeOffered[random.nextInt(degreeOffered.length)]
							  	+"');");
		}
		
		for(int i=0;i<20;++i) {
			System.out.println("INSERT INTO Programs_Scheduled VALUES('"
								+psId[random.nextInt(psId.length)]
								+"', '"+ programName[random.nextInt(programName.length)]
								+"', '"+ city[random.nextInt(city.length)]
								+"', '"+ state[random.nextInt(state.length)]
								+"', " + pincode[random.nextInt(pincode.length)]
								+", '" + date[random.nextInt(date.length)]
								+"', '"+ date[random.nextInt(date.length)]
								+"', " +numbers[random.nextInt(numbers.length)]
								+");");
		}
		
		for(int i=0;i<5;++i) {
			System.out.println("INSERT INTO Users VALUES('"
								+loginId[random.nextInt(loginId.length)]
								+"', 'pass'"
								+", '"+ role[random.nextInt(role.length)]
								+"');");
		}
	}

}