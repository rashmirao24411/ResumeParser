package RchilliApi;

import java.lang.Thread;
import java.io.*;
import java.net.*;
import java.util.*;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DataStore {

	// Set APIURL as rest api url for resume parsing provided by RChilli.
	static final String APIURL = "https://localdev.rchilli.com/RChilliParser8/Rchilli/parseResumeBinary";
	// Set USERKEY as provided by RChilli.
	static final String USERKEY = "0001111";
	static final String VERSION = "8.0.0";
	private static final Object[] File = null;
public void Database()
	{
	File file = new File("C:/Users/sonia/Desktop/Resume/");
    long[] ll = new long[64*1024*1024];


File[] files = file.listFiles();
			
	try {		
		for(File f: files) {
	
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
	//StoreData

	PreparedStatement statement;
	Connection connection;
	Class.forName("com.mysql.jdbc.Driver");


	Connection con=DriverManager.getConnection("jdbc:mysql://192.168.1.101:3306/record_sonia","training","rchilli123");  
	   Statement st=con.createStatement();
	   String s3="insert into Data_Table Values (?,?,?,?,? ,?,?,?,?,? ,?,?,?,?,? ,?,?,?,?,? ,?,?,?,?,? ,?,?,?,?,? ,?,?,?,?,? ,?,?,?,?,?\r\n)" ;
	   PreparedStatement s = con.prepareStatement(s3);	
	   s.setString(1,resumeparsedata.getResumeFileName().toString());
	   s.setString(2,resumeparsedata.getParsingDate().toString());
	   s.setString(3,resumeparsedata.getResumeCountry().toString());
	   s.setString(4,resumeparsedata.getName().toString());
	   s.setString(5,resumeparsedata.getName().getTitleName().toString());
	   s.setString(6,resumeparsedata.getName().getFirstName().toString());
	   s.setString(7,resumeparsedata.getName().getMiddleName().toString());
	   s.setString(8,resumeparsedata.getName().getLastName().toString());
	   s.setString(9,resumeparsedata.getName().getFormattedName().toString());
	   s.setString(10,resumeparsedata.getDateOfBirth().toString());
	   s.setString(11,resumeparsedata.getGender().toString());
	   s.setString(12,resumeparsedata.getFatherName().toString());
	   s.setString(13,resumeparsedata.getMotherName().toString());
	   s.setString(14,resumeparsedata.getMaritalStatus().toString());
	   s.setString(15,resumeparsedata.getNationality().toString());
	   s.setString(16,resumeparsedata.getLanguageKnown().toString());
	
	   s.setString(17,resumeparsedata.getLicenseNo().toString());  
	   s.setString(18,resumeparsedata.getUniqueID().toString()); 
	   s.setString(19,resumeparsedata.getPassportDetail().getDateOfExpiry().toString());  
	   s.setString(20,resumeparsedata.getPassportDetail().getDateOfIssue().toString()); 
	   s.setString(21,resumeparsedata.getPassportDetail().getPlaceOfIssue().toString());
	   s.setString(22,resumeparsedata.getPanNo().toString());
		  
	   s.setString(23,resumeparsedata.getPassportDetail().getPassportNumber().toString());    
		 
	   

	   s.setString(24,resumeparsedata.getEmail().toString());
	   s.setString(25,resumeparsedata.getPhoneNumber().toString());
	   s.setString(26,resumeparsedata.getWebSite().toString());
	   s.setString(27,resumeparsedata.getAddress().toString());
	   s.setString(28,resumeparsedata.getCategory().toString());
	   s.setString(29,resumeparsedata.getCurrentSalary().toString());
	   s.setString(30,resumeparsedata.getQualification().toString());
	   s.setString(31,resumeparsedata.getCertification().toString());
	   s.setString(32,resumeparsedata.getSkillBlock().toString());
	   s.setString(33,resumeparsedata.getSkillKeywords().toString());
	   s.setString(34,resumeparsedata.getJobProfile().toString());
	   s.setString(35,resumeparsedata.getCurrentEmployer().toString());
	   s.setString(36,resumeparsedata.getExperience().toString());
	

	   s.setString(37,resumeparsedata.getWorkedPeriod().getTotalExperienceInMonths().toString());
	   s.setString(38,resumeparsedata.getWorkedPeriod().getTotalExperienceInYear().toString());
	   s.setString(39,resumeparsedata.getWorkedPeriod().getTotalExperienceRange().toString());
	   s.setString(40,resumeparsedata.getGapPeriod().toString());

	   s.executeUpdate();
	   System.out.println("Data successfully inserted in Database");
	   
		}
	}
	catch(Exception e)
	{
		System.out.println("An error occurred.");
		e.printStackTrace();
	}
	}
	
	}

	
	


