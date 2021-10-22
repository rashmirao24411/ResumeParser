package RchilliApi;

import java.lang.Thread;
import java.io.*;
import java.net.*;
import java.util.*;


public class program implements Runnable   {

	

	
	public void run()
	{
		
		
  getCsv();		
		
	}
	

//Function which help to create CSV File
	public void getCsv()
	{
	
	Scanner sc=new Scanner(System.in);
	
System.out.println("Enter folder path :");
String path=sc.next();

File file = new File(path);

     long[] ll = new long[64*1024*1024];
File[] files = file.listFiles();

try {
for(File f: files){
String fileData = Base64.encodeFromFile(f.getAbsolutePath());

String subUserId = "sonia";
String request = "{"
+ "\"filedata\":\"" + fileData + "\","
+ "\"filename\":\"" + f.getName() + "\","
// + "\"filename\":\"" + f.getFileSizeKiloBytes() + "\","
+ "\"userkey\":\"" + USERKEY + "\","
+ "\"version\":\"" + VERSION + "\","
+ "\"subuserid\":\"" + subUserId + "\""
+ "}";
URL url = new URL(APIURL);
CallApi ca= new CallApi(APIURL);
ResumeParserData resumeparsedata= ca.ParseResumeBinary(fileData, f.getName(), USERKEY, VERSION, subUserId);
String response=ca.getResponse();
System.out.println(response);

HttpURLConnection conn = (HttpURLConnection) url.openConnection();
conn.setDoOutput(true);
conn.setRequestMethod("POST");
conn.setRequestProperty("Content-Type", "application/json");
OutputStream os = conn.getOutputStream();

os.write(request.getBytes());
os.flush();
BufferedReader br = null;
if (conn.getResponseCode() != 200) {

br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
} else {
br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
}
String output;
StringBuilder sbOutput = new StringBuilder();
while ((output = br.readLine()) != null) {
sbOutput.append(output);
}
conn.disconnect();
 
br.close();
output = sbOutput.toString();
try {  
     int a=0;
     File myObj = new File("C:\\Users\\sonia\\Desktop\\Data1.csv");
     if (myObj.createNewFile()) {
    	 a=1;
       System.out.println("File created: " + myObj.getName());
       
     } else {
    	
       System.out.println("Next File is ready to create.");
       
     } FileWriter cc = new FileWriter("C:\\Users\\sonia\\Desktop\\Data1.csv",true);
   if (a==1){
     cc.write("ResumeFileName,ParsingDate,ResumeCountry,Name,TitleName,FirstName,MiddleName,LastName,FormattedName,DateOfBirth,Gender,FatherName,MotherName,MaritalStatus,Nationality,LanguageKnown,LicenseNo,UniqueID,DateOfExpiry,DateOfIssue,PlaceOfIssue,PanNo,PassportNumber,Email,PhoneNumber,WebSite,Address,Category,CurrentSalary,Qualification,Certification,SkillBlock,SkillKeywords,JobProfile,CurrentEmployer,Experience,ExperienceInMonths,ExperienceInYears,ExperienceInRange,GapPeriod\n");
     
   }
     
     cc.write("\n");
     cc.write("\""+resumeparsedata.getResumeFileName()+"\""+",");

     cc.write("\""+resumeparsedata.getParsingDate()+"\""+",");
     cc.write("\""+resumeparsedata.getResumeCountry()+"\""+",");
     cc.write("\""+resumeparsedata.getName()+"\""+",");
     cc.write("\""+resumeparsedata.getName().getTitleName()+"\""+",");
     cc.write("\""+resumeparsedata.getName().getFirstName()+"\""+",");
     cc.write("\""+resumeparsedata.getName().getMiddleName()+"\""+",");
     cc.write("\""+resumeparsedata.getName().getLastName()+"\""+",");
     cc.write("\""+resumeparsedata.getName().getFormattedName()+"\""+",");
   
     
     cc.write("\""+resumeparsedata.getDateOfBirth()+"\""+",");
     cc.write((resumeparsedata.getGender().replaceAll("[\\t\\n\\r]","")).replace(",","")+",");
     cc.write((resumeparsedata.getFatherName().replaceAll("[\\t\\n\\r]","")).replace(",","")+",");
     cc.write((resumeparsedata.getMotherName().replaceAll("[\\t\\n\\r]","")).replace(",","")+",");
     cc.write((resumeparsedata.getMaritalStatus().replaceAll("[\\t\\n\\r]","")).replace(",","")+",");
     cc.write((resumeparsedata.getNationality().replaceAll("[\\t\\n\\r]","")).replace(",","")+",");
     cc.write("\""+resumeparsedata.getLanguageKnown()+",");
 
     cc.write("\""+resumeparsedata.getUniqueID()+",");
     cc.write("\""+resumeparsedata.getLicenseNo()+",");
     cc.write("\""+resumeparsedata.getPassportDetail()+",");
     cc.write("\""+resumeparsedata.getPassportDetail().getPassportNumber()+"\""+",");
     cc.write("\""+resumeparsedata.getPassportDetail().getDateOfExpiry()+"\""+",");
     cc.write("\""+resumeparsedata.getPassportDetail().getDateOfIssue()+"\""+",");
     cc.write("\""+resumeparsedata.getPassportDetail().getPlaceOfIssue()+"\""+",");
     cc.write("\""+resumeparsedata.getPanNo()+"\""+",");
     cc.write("\""+resumeparsedata.getVisaStatus()+"\""+",");
     cc.write("\""+resumeparsedata.getEmail()+"\""+",");
     cc.write("\""+resumeparsedata.getPhoneNumber()+"\""+",");
     cc.write("\""+resumeparsedata.getWebSite()+"\""+",");
     cc.write("\""+resumeparsedata.getAddress().toString()+"\""+",");
     cc.write("\""+resumeparsedata.getCategory()+"\""+",");
     cc.write(resumeparsedata.getCurrentSalary()+",");
     cc.write((resumeparsedata.getQualification().replaceAll("[\\t\\n\\r]","")).replace(",","")+",");
     cc.write((resumeparsedata.getCertification().replaceAll("[\\t\\n\\r]","")).replace(",","")+",");
     cc.write((resumeparsedata.getSkillBlock().replaceAll("[\\t\\n\\r]","")).replace(",","")+",");
     cc.write((resumeparsedata.getSkillKeywords().replaceAll("[\\t\\n\\r]","")).replace(",","")+",");
     cc.write((resumeparsedata.getJobProfile().replaceAll("[\\t\\n\\r]","")).replace(",","")+",");
     cc.write((resumeparsedata.getCurrentEmployer().replaceAll("[\\t\\n\\r]","")).replace(",","")+",");
   
     cc.write("\""+resumeparsedata.getWorkedPeriod()+"\""+",");
     cc.write("\""+resumeparsedata.getWorkedPeriod().getTotalExperienceInMonths()+"\""+",");
     cc.write("\""+resumeparsedata.getWorkedPeriod().getTotalExperienceInYear()+"\""+",");
     cc.write("\""+resumeparsedata.getWorkedPeriod().getTotalExperienceRange()+"\""+",");
     cc.write("\""+resumeparsedata.getGapPeriod()+"\""+",");
     cc.write((resumeparsedata.getSummary().replaceAll("[\\t\\n\\r]","")).replace(",","")+",");
    
     
     cc.close();
     System.out.println("Data is Saved Successfully in CSV Files");
   }
catch (IOException e) {
     System.out.println("An error occurred.");
     e.printStackTrace();
   }
}
} catch (Exception ex) {
ex.printStackTrace();
}

	}
	
	
	
	
	
//Set APIURL as rest api url for resume parsing provided by RChilli.
static final String APIURL = "https://localdev.rchilli.com/RChilliParser8/Rchilli/parseResumeBinary";
//Set USERKEY as provided by RChilli.
static final String USERKEY = "0001111";
static final String VERSION = "8.0.0";


public static void main(String[] args) throws InterruptedException {

	
//MultiThread 
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Please Enter number of threads");
	int thre=sc.nextInt();
	Thread[] th=new Thread[thre];
	for(int i=0;i<thre;i++)
	{
	
		
			
		th[i]=new Thread(new program());
		th[i].start();
		
	th[i].join();	
		
	}
	
//Data Store function which Store Data in Database                                                                                                                                                                                                                                             


DataStore datastore= new DataStore();
try {
	datastore.Database();
}
catch(Exception e)
{
	e.printStackTrace();
}
}


}

