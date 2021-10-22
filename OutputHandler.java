package RchilliApi;

import java.util.List;

import org.apache.catalina.tribes.tipis.ReplicatedMapEntry;

public class OutputHandler {

	private String contact;
	private String personal;
	private String experience;
	private String skill;
	private String education;
	private String other;
	private String error;
	private String jsonOutput;
	public String getJsonOutput() {
		return jsonOutput;
	}
	public String getError() {
		return error;
	}
	public String getContact() {
		return contact;
	}
	public String getPersonal() {
		return personal;
	}
	public String getExperience() {
		return experience;
	}
	public String getSkill() {
		return skill;
	}
	public String getEducation() {
		return education;
	}
	public String getOther() {
		return other;
	}
	private String userKey="";
	private String version="";
	private String subUserId=""; 
	private String serviceURL="";
	public void setUserKey(String userKey) {
		this.userKey = userKey;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public void setSubUserId(String subUserId) {
		this.subUserId = subUserId;
	}
	public void setServiceURL(String serviceURL) {
		this.serviceURL = serviceURL;
	}
	
	
	public void getParseResume(String fileData, String fileName) 
	{
		
		
		
		CallApi callApi= new CallApi(serviceURL);
		ResumeParserData resumeParserData =  callApi.ParseResumeBinary(fileData, fileName, userKey, version, subUserId);
		jsonOutput= callApi.getResponse();
	    if(resumeParserData.getError().getHasError())
		{
	    	
	    	error=resumeParserData.getError().getErrorCode()+":"+resumeParserData.getError().getErrorMsg();
		}else
		{
			error="";
			StringBuilder sbContact = new StringBuilder();
			sbContact.append("<table width='100%' >");
            sbContact.append("<tr><td><b>Full Name : </b></td><td>" + resumeParserData.getName().getFullName() + "</td></tr>");
            sbContact.append("<tr><td><b>Title Name : </b></td><td>" + resumeParserData.getName().getTitleName() + "</td></tr>");
            sbContact.append("<tr><td><b>First Name : </b></td><td>" +resumeParserData.getName().getFirstName() + "</td></tr>");
            sbContact.append("<tr><td><b>Middle Name : </b></td><td>" + resumeParserData.getName().getMiddleName() + "</td></tr>");
            sbContact.append("<tr><td><b>Last Name : </b></td><td>" + resumeParserData.getName().getLastName() + "</td></tr>");
            sbContact.append("<tr><td><b>Formatted Name : </b></td><td>" + resumeParserData.getName().getFormattedName() + "</td></tr>");

            List<Email> emails = resumeParserData.getEmail();
            StringBuilder sb = new StringBuilder();
            for (Email email : emails)
            {
                sb.append(email.getEmailAddress() + ",");
            }
            sbContact.append("<tr><td><b>Email : </b></td><td>" + sb.toString() + "</td></tr>");

            List<PhoneNumber> PhoneNumbers = resumeParserData.getPhoneNumber();
            sb.setLength(0);
            for(PhoneNumber phoneNumber : PhoneNumbers)
            {
                sbContact.append("<tr><td><b>" + phoneNumber.getType() + " : </b></td><td>" + phoneNumber.getFormattedNumber() +"("+phoneNumber.getISDCode()+"/"+phoneNumber.getOriginalNumber()+") </td></tr>");
            }
            List<Address> addresses = resumeParserData.getAddress();
            if (addresses.size() > 0)
            {
                for(Address address : addresses)
                {
                    sbContact.append("<tr><td><b>" + address.getType() + " Address  </b></td><td></td></tr>");
                    sbContact.append("<tr><td><b>Address : </b></td><td>" + address.getStreet() + "</td></tr>");
                    sbContact.append("<tr><td><b>City : </b></td><td>" + address.getCity() + "</td></tr>");
                    sbContact.append("<tr><td><b>State : </b></td><td>" + address.getState()+"<sub>"+address.getStateIsoCode() + "</sub></td></tr>");
                    sbContact.append("<tr><td><b>Country : </b></td><td>" + address.getCountry() + "</td></tr>");
                    if (!address.getCountryCode().getIsoAlpha2().isEmpty())
                    {
                        sbContact.append("<tr><td><b>CountryCodes : </b></td><td>" + address.getCountryCode().getIsoAlpha2() + "/" + address.getCountryCode().getIsoAlpha3() +"/"+ address.getCountryCode().getUNCode() + "</td></tr>");
                    }
                    sbContact.append("<tr><td><b>Zip Code : </b></td><td>" + address.getZipCode() + "</td></tr>");                   
                }
            }
            sbContact.append("</table>");
            
            contact=sbContact.toString();
            
            StringBuilder sbPersonal = new StringBuilder();
            sbPersonal.append("<table width=100%>");
            sbPersonal.append("<tr><td><b>Date Of Birth : </b></td><td>" + resumeParserData.getDateOfBirth() + "</td></tr>");
            sbPersonal.append("<tr><td><b>Gender : </b></td><td>" + resumeParserData.getGender() + "</td></tr>");
            sbPersonal.append("<tr><td><b>Nationality : </b></td><td>" + resumeParserData.getNationality() + "</td></tr>");
            sbPersonal.append("<tr><td><b>MaritalStatus : </b></td><td>" + resumeParserData.getMaritalStatus() + "</td></tr>");
            sbPersonal.append("<tr><td><b>Father Name : </b></td><td>" + resumeParserData.getFatherName() + "</td></tr>");
            sbPersonal.append("<tr><td><b>Mother Name : </b></td><td>" + resumeParserData.getMotherName() + "</td></tr>");
            sbPersonal.append("<tr><td><b>Current Salary  : </b></td><td>" + resumeParserData.getCurrentSalary().getSymbol() + " " + resumeParserData.getCurrentSalary().getAmount() +"("+ resumeParserData.getCurrentSalary().getCurrency() +")/"+ resumeParserData.getCurrentSalary().getUnit() + "</td></tr>");
            sbPersonal.append("<tr><td><b>Expected Salary : </b></td><td>" + resumeParserData.getExpectedSalary().getSymbol() + " " + resumeParserData.getExpectedSalary().getAmount() + "(" + resumeParserData.getExpectedSalary().getCurrency() + ")/" + resumeParserData.getExpectedSalary().getUnit() + "</td></tr>");
             sbPersonal.append("<tr><td><b>Passport No. : </b></td><td>" + resumeParserData.getPassportDetail().getPassportNumber() + "</td></tr>");
             sbPersonal.append("<tr><td><b>Date Of Issue : </b></td><td>" + resumeParserData.getPassportDetail().getDateOfIssue() + "</td></tr>");
             sbPersonal.append("<tr><td><b>Date Of Expiry : </b></td><td>" + resumeParserData.getPassportDetail().getDateOfExpiry() + "</td></tr>");
             sbPersonal.append("<tr><td><b>Place Of Issue : </b></td><td>" + resumeParserData.getPassportDetail().getPlaceOfIssue() + "</td></tr>");
             sbPersonal.append("<tr><td><b>Unique ID : </b></td><td>" + resumeParserData.getUniqueID() + "</td></tr>");
            sbPersonal.append("<tr><td><b>License No. : </b></td><td>" + resumeParserData.getLicenseNo() + "</td></tr>");
            sbPersonal.append("<tr><td><b>Visa Status : </b></td><td>" + resumeParserData.getVisaStatus() + "</td></tr>");
            sbPersonal.append("<tr><td><b>Current Location : </b></td><td></td></tr>");
            List<CurrentLocation> currentLocations = resumeParserData.getCurrentLocation();
            for (CurrentLocation currentLocation : currentLocations)
            {
                sbPersonal.append("<tr><td><b>City : </b></td><td>" + currentLocation.getCity() + "</td></tr>");
                sbPersonal.append("<tr><td><b>State : </b></td><td>" + currentLocation.getState() +"<sub>"+currentLocation.getStateIsoCode() + "</sub></td></tr>");
                sbPersonal.append("<tr><td><b>Country : </b></td><td>" + currentLocation.getCountry()  +"<sub>("+ currentLocation.getCountryCode().getIsoAlpha2()+"/" +currentLocation.getCountryCode().getIsoAlpha3() +"/"+currentLocation.getCountryCode().getUNCode() +")</sub></td></tr>");
            }
            sbPersonal.append("<tr><td><b>Preferred Location : </b></td><td></td></tr>");
            List<PreferredLocation> preferredLocations = resumeParserData.getPreferredLocation();
            for(PreferredLocation preferredLocation : preferredLocations)
            {
                sbPersonal.append("<tr><td><b>City : </b></td><td>" + preferredLocation.getCity() + "</td></tr>");
                sbPersonal.append("<tr><td><b>State : </b></td><td>" + preferredLocation.getState() +"<sub>"+preferredLocation.getStateIsoCode() + "</sub></td></tr>");
                sbPersonal.append("<tr><td><b>Country : </b></td><td>" + preferredLocation.getCountry() +"<sub>("+ preferredLocation.getCountryCode().getIsoAlpha2()+"/" +preferredLocation.getCountryCode().getIsoAlpha3() +"/"+preferredLocation.getCountryCode().getUNCode() +")</sub></td></tr>");
               
            }

           
          
            CandidateImage cImg= resumeParserData.getCandidateImage();
            if (cImg != null)
            {
                if (!cImg.getCandidateImageFormat().trim().isEmpty())
                {
                    sbPersonal.append("<tr><td><b>CandidateImage. : </b></td><td><img style='display:block;border:1px;border-radius:3px;border:1px solid #fff; width:100px;height:100px;' id='imgCandidate' alt='Candidate Image' src='data:image/" + cImg.getCandidateImageFormat() + ";base64," + cImg.getCandidateImageData() + "' /></td></tr>");
                }
            }

            List<WebSite> websites = resumeParserData.getWebSite();
            if (!websites.isEmpty())
            {
                

            	for(WebSite website : websites)
                {
                    sbPersonal.append("<tr><td><b>WebSite: Type : " + website.getType() + ": </b></td><td><a href='" +  website.getUrl() + "' target='_blank'>" +  website.getUrl() + "</a></td></tr>");
                }
            }
            sbPersonal.append("</table>");
           
            personal=sbPersonal.toString();
            
            StringBuilder sbQualification = new StringBuilder();
            sbQualification.append("<table width='100%'> ");
            List<SegregatedQualification> segQualif = resumeParserData.getSegregatedQualification();
            if (!segQualif.isEmpty())
            {
            	int i=0;
                for (SegregatedQualification segregatedQualification:segQualif)
                {
                    sbQualification.append("<tr><td colspan='2' align='center'><b>Qualification:-" + (i + 1) + "</b></td></tr>");

                    if (segregatedQualification.getInstitution()!=null)
                    {
                        if (segregatedQualification.getInstitution().getName()!=null)
                        {
                            sbQualification.append("<tr><td><b>InstitutionName:-</b></td><td>" + segregatedQualification.getInstitution().getName() + "<sub>" + segregatedQualification.getInstitution().getType() + "</sub></td></tr>");
                            sbQualification.append("<tr><td><b>InstitutionLocation:-</b></td><td>" + segregatedQualification.getInstitution().getLocation().getCity() + "<sub>City</sub>, " + segregatedQualification.getInstitution().getLocation().getState()+"("+ segregatedQualification.getInstitution().getLocation().getStateIsoCode()+")<sub>State</sub>, " + segregatedQualification.getInstitution().getLocation().getCountry() + "<sub>Country</sub>"+ "<sub>(" + segregatedQualification.getInstitution().getLocation().getCountryCode().getIsoAlpha2()+"/" + segregatedQualification.getInstitution().getLocation().getCountryCode().getIsoAlpha3() +"/"+ segregatedQualification.getInstitution().getLocation().getCountryCode().getUNCode() + ")</sub></td></tr>");
                        }
                    }
                    if (segregatedQualification.getSubInstitution() != null)
                    {
                        if (segregatedQualification.getSubInstitution().getName()!=null)
                        {
                            sbQualification.append("<tr><td><b>SubInstitutionName:-</b></td><td>" + segregatedQualification.getSubInstitution().getName() + "<sub>" + segregatedQualification.getSubInstitution().getType() + "</sub></td></tr>");
                            sbQualification.append("<tr><td><b>SubInstitutionLocation:-</b></td><td>" + segregatedQualification.getSubInstitution().getLocation().getCity() + "<sub>City</sub>, "+ segregatedQualification.getSubInstitution().getLocation().getState()+"("+ segregatedQualification.getSubInstitution().getLocation().getStateIsoCode()+")<sub>State</sub>, "  + segregatedQualification.getSubInstitution().getLocation().getCountry()+ "<sub>Country</sub>"+ "<sub>(" + segregatedQualification.getSubInstitution().getLocation().getCountryCode().getIsoAlpha2()+"/" + segregatedQualification.getSubInstitution().getLocation().getCountryCode().getIsoAlpha3() +"/"+ segregatedQualification.getSubInstitution().getLocation().getCountryCode().getUNCode() + ")</sub></td></tr>");
                        }
                    }
                    sb.setLength(0);
                   for (String spl : segregatedQualification.getDegree().getSpecialization())
                    {
                        sb.append(spl + ",");
                    }
                    sbQualification.append("<tr><td><b>Degree:-</b></td><td>" + segregatedQualification.getDegree().getDegreeName() + "(" + segregatedQualification.getDegree().getNormalizeDegree() + ")" + "</td></tr>");
                    sbQualification.append("<tr><td><b>Specialization:-</b></td><td>" + sb.toString() + "</td></tr>");
                    sbQualification.append("<tr><td><b>FormattedDegreePeriod:-</b></td><td>" +segregatedQualification.getFormattedDegreePeriod() + "</td></tr>");
                    sbQualification.append("<tr><td><b>StartDate:-</b></td><td>" +segregatedQualification.getStartDate() + "</td></tr>");
                    sbQualification.append("<tr><td><b>EndDate:-</b></td><td>" + segregatedQualification.getEndDate() + "</td></tr>");
                    if (segregatedQualification.getAggregate() != null)
                    {
                        sbQualification.append("<tr><td><b>Aggregate:-</b></td><td><sub>" + segregatedQualification.getAggregate().getMeasureType() + "</sub>" + segregatedQualification.getAggregate().getValue() + "</td></tr>");
                    }
                    sbQualification.append("<tr><td colspan='2'><hr/></td></tr>");
                    i++;
                }

                sbQualification.append("<tr><td colspan=3><hr/></td></tr>");
                sbQualification.append("<tr><td><b>Qualification Text Block</b></td><td colspan='2'><textarea>" + resumeParserData.getQualification() + "</textarea></td></tr>");
                                    
            }
            sbQualification.append("</table>");
            
            education=sbQualification.toString();
            
            StringBuilder sbExperience = new StringBuilder();
            sbExperience.append("<table width='100%' style=\"empty-cells: show\">");

            List<SegregatedExperience> segExperiences = resumeParserData.getSegregatedExperience();
            if (segExperiences != null)
             {
            	int i=0;
            	int j=0;
                 for (SegregatedExperience segExp:segExperiences)
                 {
                	 j=0;
                	 
                	//segExp.getJobProfile().getRelatedSkills().stream().forEach( p ->  System.out.println(p.getSkill()+":"+ p.getProficiencyLevel()));
                	 
                     sbExperience.append("<tr><td colspan='2' align='center'><b>Experice:-" + (i + 1) + "</b></td></tr>");
                     sbExperience.append("<tr><td><b>Employer:-</b></td><td>" + segExp.getEmployer().getEmployerName() + "</td></tr>");
                     sbExperience.append("<tr><td><b>JobProfile:-</b></td><td>" + segExp.getJobProfile().getTitle() + "</td></tr>");
                     
                     
                     
                     sbExperience.append("<tr><td><b>JobLocation:-</b></td><td>" + segExp.getLocation().getCity() + "," + segExp.getLocation().getState() +"("+ segExp.getLocation().getStateIsoCode()+")"+ ", " + segExp.getLocation().getCountry() + "<sub>(" + segExp.getLocation().getCountryCode().getIsoAlpha2()+"/" + segExp.getLocation().getCountryCode().getIsoAlpha3() +"/"+ segExp.getLocation().getCountryCode().getUNCode() + ")</sub></td></tr>");
                     
                     
                     
                     sbExperience.append("<tr><td><b>JobPeriod:-</b></td><td>" + segExp.getJobPeriod() + "</td></tr>");
                     sbExperience.append("<tr><td><b>FormattedJobPeriod:-</b></td><td>" + segExp.getFormattedJobPeriod() + "</td></tr>");
                     sbExperience.append("<tr><td><b>StartDate:-</b></td><td>" + segExp.getStartDate() + "</td></tr>");
                     sbExperience.append("<tr><td><b>EndDate:-</b></td><td>" + segExp.getEndDate() + "</td></tr>");
                     sbExperience.append("<tr><td><b>JobDescription:-</b></td><td><textarea>" +segExp.getJobDescription() + "</textarea></td></tr>");
                     StringBuilder sbProject = new StringBuilder();
                     sbProject.append("<table>");
                     sbProject.append("<tr><td>Sr.No.</td><td><b>Project Name</b></td><td><b>Used Skills</b></td><td><b>Team Size</b></td>");
                     
                     List<Projects> projects =segExp.getProjects();
                     for (Projects project:projects)
                     {
                         sbProject.append("<tr><td>" + (j + 1) + "</td><td>" + project.getProjectName() + "</td><td>" + project.getUsedSkills() + "</td><td>" + project.getTeamSize() + "</td>");
                     	j++;
                     }
                     sbProject.append("</table>");
                     sbExperience.append("<tr><td colspan='2'><div style='width:90%;' id='divProject" + (i + 1) + "'>" + sbProject + "</div></td></tr>");
                     sbExperience.append("<tr><td colspan='2'><hr/></td></tr>");
                     i++;
                 }
                 sbExperience.append("<tr><td><b>Experience Text Block</b></td><td colspan='2'><textarea>" + resumeParserData.getExperience() + "</textarea></td></tr>");
             }
            sbExperience.append("</table>");
           
            experience=sbExperience.toString();
            
            List<SegregatedSkill> skillKeywords = resumeParserData.getSegregatedSkill();
            StringBuilder sbSkills = new StringBuilder();
            sbSkills.append("<table width='100%' >");
             if (skillKeywords.size()>0)
             {

                 sbSkills.append("<tr><td><b>Skill</b></td><td><b>Exp.InMonth</b></td><td><b>LastUsed</b></td><td><b>FormattedName</b></td><td><b>Alias</b></td></tr>");
                 for(SegregatedSkill skill : skillKeywords)
                 {
                     sbSkills.append("<tr><td>" + skill.getSkill() + "<sub>" + skill.getEvidence() + "</sub></td><td>" + skill.getExperienceInMonths() + "</td><td>" + skill.getLastUsed() + "</td><td>" + skill.getFormattedName() + "</td><td>" + skill.getAlias() + "</td></tr>");
                 }
                 sbSkills.append("<tr><td><b>Skill Text Block</b></td><td colspan='4'><textarea>" + resumeParserData.getSkillBlock() + "</textarea></td></tr>");
             }
              sbSkills.append("</table>");
            
              skill=sbSkills.toString();
              StringBuilder sbOther = new StringBuilder();
              sbOther.append("<table width=100%>");
              sbOther.append("<tr><td><b>Resume File Name : </b></td><td>" + resumeParserData.getResumeFileName() + "</td></tr>");
              sbOther.append("<tr><td><b>Resume Language : </b></td><td>" + resumeParserData.getResumeLanguage().getLanguage() + "(" + resumeParserData.getResumeLanguage().getLanguageCode() + ")</td></tr>");
              sbOther.append("<tr><td><b>Parsing Date : </b></td><td>" + resumeParserData.getParsingDate() + "</td></tr>");
              sbOther.append("<tr><td><b>Category : </b></td><td>" + resumeParserData.getCategory() + "</td></tr>");
              sbOther.append("<tr><td><b>SubCategory : </b></td><td>" + resumeParserData.getSubCategory() + "</td></tr>");

              List<LanguageKnown> languageKnowns = resumeParserData.getLanguageKnown();
              sb.setLength(0);
              for(LanguageKnown languageKnown : languageKnowns)
              {
                  sb.append(languageKnown.getLanguage() + "(" + languageKnown.getLanguageCode() + "),");
              }
              sbOther.append("<tr><td><b>Language Known : </b></td><td>" + sb.toString() + "</td></tr>");
              
              WorkedPeriod workPeriod=resumeParserData.getWorkedPeriod();
              if (workPeriod != null)
              {
                  sbOther.append("<tr><td><b>Worked Period in Month: </b></td><td>" + workPeriod.getTotalExperienceInMonths() + "</td></tr>");
                  sbOther.append("<tr><td><b>Worked Period in Year: </b></td><td>" + workPeriod.getTotalExperienceInYear() + "</td></tr>");
                  sbOther.append("<tr><td><b>Worked Period Range: </b></td><td>" + workPeriod.getTotalExperienceRange() + "</td></tr>");
              }
              sbOther.append("<tr><td><b>Gap Period  : </b></td><td>" + resumeParserData.getGapPeriod() + "</td></tr>");
              sbOther.append("<tr><td><b>Average Stay  : </b></td><td>" + resumeParserData.getAverageStay() + "</td></tr>");
              sbOther.append("<tr><td><b>Longest Stay  : </b></td><td>" + resumeParserData.getLongestStay() + "</td></tr>");
              sbOther.append("<tr><td><b>Summary  : </b></td><td><textarea>" + resumeParserData.getSummary() + "</textarea></td></tr>");
              sbOther.append("<tr><td><b>ExecutiveSummary  : </b></td><td><textarea>" + resumeParserData.getExecutiveSummary() + "</textarea></td></tr>");
              sbOther.append("<tr><td><b>ManagementSummary  : </b></td><td><textarea>" + resumeParserData.getManagementSummary() + "</textarea></td></tr>");
              sbOther.append("<tr><td><b>Availability  : </b></td><td>" + resumeParserData.getAvailability() + "</td></tr>");
              sbOther.append("<tr><td><b>Cover Letter	 : </b></td><td><textarea>" + resumeParserData.getCoverletter() + "</textarea></td></tr>");
              sbOther.append("<tr><td><b>Certification : </b></td><td><textarea>" + resumeParserData.getCertification() + "</textarea></td></tr>");
              sbOther.append("<tr><td><b>SegregatedCertification : </b></td><td></td></tr>");

              for (SegregatedCertification segCertification : resumeParserData.getSegregatedCertification())
              {
                  sbOther.append("<tr><td><b>Certification Title : </b></td><td>" + segCertification.getCertificationTitle() + "</td></tr>");
                  sbOther.append("<tr><td><b>Certification Code : </b></td><td>" + segCertification.getCertificationCode() + "</td></tr>");
                  sbOther.append("<tr><td><b>Certification Url : </b></td><td>" + segCertification.getCertificationUrl() + "</td></tr>");
                  sbOther.append("<tr><td><b>Authority : </b></td><td>" + segCertification.getAuthority() + "</td></tr>");
                  sbOther.append("<tr><td><b>StartDate : </b></td><td>" + segCertification.getStartDate() + "</td></tr>");
                  sbOther.append("<tr><td><b>EndDate : </b></td><td>" + segCertification.getEndDate() + "</td></tr>");
                  sbOther.append("<tr><td><b>IsExpiry : </b></td><td>" + segCertification.getIsExpiry() + "</td></tr>");
                  sbOther.append("<tr><td colspan='2'><hr/></td></tr>");
              }

              sbOther.append("<tr><td><b>Publication : </b></td><td><textarea>" + resumeParserData.getPublication() + "</textarea></td></tr>");
              sbOther.append("<tr><td><b>SegregatedPublication : </b></td><td></td></tr>");
              
              for (SegregatedPublication segPublication : resumeParserData.getSegregatedPublication())
              {
                  sbOther.append("<tr><td><b>Publication Title : </b></td><td>" + segPublication.getPublicationTitle() + "</td></tr>");
                  sbOther.append("<tr><td><b>Publication Number : </b></td><td>" + segPublication.getPublicationNumber() + "</td></tr>");
                  sbOther.append("<tr><td><b>PublicationUrl  : </b></td><td>" + segPublication.getPublicationUrl() + "</td></tr>");
                  sbOther.append("<tr><td><b>Publisher : </b></td><td>" + segPublication.getPublisher() + "</td></tr>");
                  sbOther.append("<tr><td><b>Authors : </b></td><td>" + segPublication.getAuthors() + "</td></tr>");
                  sbOther.append("<tr><td><b>Description : </b></td><td><textarea>" + segPublication.getDescription() + "</textarea></td></tr>");
                  sbOther.append("<tr><td colspan='2'><hr/></td></tr>");
              }
              sbOther.append("<tr><td><b>Hobbies : </b></td><td><textarea>" + resumeParserData.getHobbies() + "</textarea></td></tr>");
              sbOther.append("<tr><td><b>Objectives : </b></td><td><textarea>" + resumeParserData.getObjectives() + "</textarea></td></tr>");
              sbOther.append("<tr><td><b>Achievements : </b></td><td><textarea>" + resumeParserData.getAchievements() + "</textarea></td></tr>");

              for(SegregatedAchievement segAchievement : resumeParserData.getSegregatedAchievement())
              {
                  sbOther.append("<tr><td><b>Award Title : </b></td><td>" + segAchievement.getAwardTitle() + "</td></tr>");
                  sbOther.append("<tr><td><b>Associated With : </b></td><td>" + segAchievement.getAssociatedWith() + "</td></tr>");
                  sbOther.append("<tr><td><b>Issuer : </b></td><td>" + segAchievement.getIssuer() + "</td></tr>");
                  sbOther.append("<tr><td><b>Issuing Date : </b></td><td>" + segAchievement.getIssuingDate() + "</td></tr>");

                  sbOther.append("<tr><td><b>Description : </b></td><td><textarea>" + segAchievement.getDescription() + "</textarea></td></tr>");
                  sbOther.append("<tr><td colspan='2'><hr/></td></tr>");
              }

              sbOther.append("<tr><td><b>References   : </b></td><td><textarea>" + resumeParserData.getReferences() + "</textarea></td></tr>");
              sbOther.append("<tr><td><b>Detail Resume   : </b></td><td><textarea>" + resumeParserData.getDetailResume() + "</textarea></td></tr>");
              sbOther.append("<tr><td><b>Html Resume   : </b></td><td><textarea>" + resumeParserData.getHtmlResume() + "</textarea></td></tr>");
              sbOther.append("</table>");
              
              other=sbOther.toString();

           
		}
	}
}
