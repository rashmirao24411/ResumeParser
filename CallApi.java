package RchilliApi;
import java.io.*;
import java.net.*;
import java.util.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class CallApi {

	String apiUrl = "";
	boolean isError = false;
	String ErrorCode = "";
	String ErrorMsg = "";
	String response="";
	public String getResponse()
	{
		return response;
	}
	
	public CallApi() {
	}
	public CallApi(String ServiceURL) {
		apiUrl = ServiceURL;	
	}

	public ResumeParserData ParseResumeBinary(String fileData, String fileName, String userKey, String version, String subUserId) {
		String input = "{"
							+ "\"filedata\":\"" + fileData + "\","
							+ "\"filename\":\"" + fileName + "\","
							+ "\"userkey\":\"" + userKey+ "\","
							+ "\"version\":\"" + version+ "\","
							+ "\"subuserid\":\"" + subUserId+ "\""
					+ "}";
		response = CallService(input);
		ResumeParserData rchilliParserData = processOutput(response);
		return rchilliParserData;
	}
	
	
	

	public String CallService(String input) {
		StringBuilder sbOutput = new StringBuilder();
		try {

			URL url = new URL(apiUrl);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");
			OutputStream os = conn.getOutputStream();
			os.write(input.getBytes());
			os.flush();
			BufferedReader br = null;
			if (conn.getResponseCode() != 200) 
			{

				br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
			} else 
			{
				br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			}
			String output;
			while ((output = br.readLine()) != null) {
				sbOutput.append(output);
			}
			conn.disconnect();
		} catch (MalformedURLException e) {
			e.printStackTrace();
			isError = true;
			ErrorCode = "500";
			ErrorMsg = e.getLocalizedMessage();
		} catch (IOException e) {
			isError = true;
			ErrorCode = "500";
			ErrorMsg = e.getLocalizedMessage();
			e.printStackTrace();
		}

		return sbOutput.toString();
	}

	ResumeParserData processOutput(String jsonResponse) {
		ResumeParserData rchilliParserData = new ResumeParserData();
		JSONParser parser = new JSONParser();
		Object outputObject = null;
		try {
			outputObject = parser.parse(jsonResponse.toString());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			isError = true;
			ErrorCode = "500";
			ErrorMsg = e.getLocalizedMessage();
			Error error= new Error();
			error.setHasError(isError);
			error.setErrorCode(ErrorCode);
			error.setErrorMsg(ErrorMsg);
			rchilliParserData.setError(error);
			return rchilliParserData;
		}
		JSONObject root = (JSONObject) outputObject;
		if (jsonResponse.contains("\"error\":")) {
			JSONObject obj = (JSONObject) root.get("error");
			isError = true;
			ErrorMsg = (String) obj.get("errormsg");
			ErrorCode = Long.toString((long) obj.get("errorcode"));
			Error error= new Error();
			error.setHasError(isError);
			error.setErrorCode(ErrorCode);
			error.setErrorMsg(ErrorMsg);
			rchilliParserData.setError(error);
			return rchilliParserData;
		}

		Error error= new Error();
		error.setHasError(false);
		error.setErrorCode("");
		error.setErrorMsg("");
		rchilliParserData.setError(error);
		JSONObject obj = (JSONObject) root.get("ResumeParserData");
		JSONObject jsonObj = (JSONObject) obj;
		String value = "";

		SegregatedQualification segregatedQualification;
		List<SegregatedQualification> listSegregatedQualification = new ArrayList<SegregatedQualification>();
		SegregatedExperience segregatedExperience;
		List<SegregatedExperience> listSegregatedExperience = new ArrayList<SegregatedExperience>();
		SegregatedSkill segregatedSkill;
		List<SegregatedSkill> listSegregatedSkill = new ArrayList<SegregatedSkill>();
		SegregatedCertification segregatedCertification;
		List<SegregatedCertification> listSegregatedCertification = new ArrayList<SegregatedCertification>();
		SegregatedAchievement segregatedAchievement;
		List<SegregatedAchievement> listSegregatedAchievement = new ArrayList<SegregatedAchievement>();
		SegregatedPublication segregatedPublication;
		List<SegregatedPublication> listSegregatedPublication = new ArrayList<SegregatedPublication>();
		Location location;
		CountryCode countryCode;
		for (Object key : jsonObj.keySet()) {
			// based on you key types
			String nodeName = (String) key;
			Object val = jsonObj.get(nodeName);
			try {
				/*
				 * if(val instanceof String) { System.out.print("String-"); } if(val instanceof
				 * JSONObject) { System.out.print("Object-"); } if(val instanceof JSONArray) {
				 * System.out.print("Array-"); } System.out.println(nodeName+" : "+val);
				 */

				if (val instanceof String) {

					value = (String) val;
					if (nodeName.equalsIgnoreCase("ResumeFileName")) {
						rchilliParserData.setResumeFileName(value);
					} else if (nodeName.equalsIgnoreCase("ParsingDate")) {
						rchilliParserData.setParsingDate(value);
					} else if (nodeName.equalsIgnoreCase("DateOfBirth")) {
						rchilliParserData.setDateOfBirth(value);
					} else if (nodeName.equalsIgnoreCase("Gender")) {
						rchilliParserData.setGender(value);
					} else if (nodeName.equalsIgnoreCase("FatherName")) {
						rchilliParserData.setFatherName(value);
					} else if (nodeName.equalsIgnoreCase("MotherName")) {
						rchilliParserData.setMotherName(value);
					} else if (nodeName.equalsIgnoreCase("MaritalStatus")) {
						rchilliParserData.setMaritalStatus(value);
					} else if (nodeName.equalsIgnoreCase("Nationality")) {
						rchilliParserData.setNationality(value);
					} else if (nodeName.equalsIgnoreCase("UniqueID")) {
						rchilliParserData.setUniqueID(value);
					} else if (nodeName.equalsIgnoreCase("LicenseNo")) {
						rchilliParserData.setLicenseNo(value);
					} else if (nodeName.equalsIgnoreCase("PanNo")) {
						rchilliParserData.setPanNo(value);
					} else if (nodeName.equalsIgnoreCase("VisaStatus")) {
						rchilliParserData.setVisaStatus(value);
					} else if (nodeName.equalsIgnoreCase("Category")) {
						rchilliParserData.setCategory(value);
					} else if (nodeName.equalsIgnoreCase("SubCategory")) {
						rchilliParserData.setSubCategory(value);
					} else if (nodeName.equalsIgnoreCase("Qualification")) {
						rchilliParserData.setQualification(value);
					} else if (nodeName.equalsIgnoreCase("Certification")) {
						rchilliParserData.setCertification(value);
					} else if (nodeName.equalsIgnoreCase("SkillBlock")) {
						rchilliParserData.setSkillBlock(value);
					} else if (nodeName.equalsIgnoreCase("SkillKeywords")) {
						rchilliParserData.setSkillKeywords(value);
					} else if (nodeName.equalsIgnoreCase("Experience")) {
						rchilliParserData.setExperience(value);
					} else if (nodeName.equalsIgnoreCase("CurrentEmployer")) {
						rchilliParserData.setCurrentEmployer(value);
					} else if (nodeName.equalsIgnoreCase("JobProfile")) {
						rchilliParserData.setJobProfile(value);
					} else if (nodeName.equalsIgnoreCase("GapPeriod")) {
						rchilliParserData.setGapPeriod(value);
					} else if (nodeName.equalsIgnoreCase("AverageStay")) {
						rchilliParserData.setAverageStay(value);
					} else if (nodeName.equalsIgnoreCase("LongestStay")) {
						rchilliParserData.setLongestStay(value);
					} else if (nodeName.equalsIgnoreCase("Summary")) {
						rchilliParserData.setSummary(value);
					} else if (nodeName.equalsIgnoreCase("ExecutiveSummary")) {
						rchilliParserData.setExecutiveSummary(value);
					} else if (nodeName.equalsIgnoreCase("ManagementSummary")) {
						rchilliParserData.setManagementSummary(value);
					} else if (nodeName.equalsIgnoreCase("Coverletter")) {
						rchilliParserData.setCoverletter(value);
					} else if (nodeName.equalsIgnoreCase("Publication")) {
						rchilliParserData.setPublication(value);
					} else if (nodeName.equalsIgnoreCase("Availability")) {
						rchilliParserData.setAvailability(value);
					} else if (nodeName.equalsIgnoreCase("Hobbies")) {
						rchilliParserData.setHobbies(value);
					} else if (nodeName.equalsIgnoreCase("Objectives")) {
						rchilliParserData.setObjectives(value);
					} else if (nodeName.equalsIgnoreCase("Achievements")) {
						rchilliParserData.setAchievements(value);
					} else if (nodeName.equalsIgnoreCase("References")) {
						rchilliParserData.setReferences(value);
					} else if (nodeName.equalsIgnoreCase("CustomFields")) {
						rchilliParserData.setCustomFields(value);
					} else if (nodeName.equalsIgnoreCase("DetailResume")) {
						rchilliParserData.setDetailResume(value);
					} else if (nodeName.equalsIgnoreCase("HtmlResume")) {
						rchilliParserData.setHtmlResume(value);
					}

				} else if (nodeName.equalsIgnoreCase("SegregatedQualification")) {
					try {
						
						JSONArray eduDrill = (JSONArray) val;
						Iterator i = eduDrill.iterator();
						Institution institute;

						while (i.hasNext()) {
							segregatedQualification = new SegregatedQualification();
							institute = new Institution();
							location = new Location();
							JSONObject edu = (JSONObject) i.next();
							JSONObject instituion = (JSONObject) edu.get("Institution");
							institute.setName((String) instituion.get("Name"));
							institute.setType((String) instituion.get("Type"));

							JSONObject loc = (JSONObject) instituion.get("Location");

							location.setCity((String) loc.get("City"));
							location.setState((String) loc.get("State"));
							location.setStateIsoCode((String) loc.get("StateIsoCode"));
							location.setCountry((String) loc.get("Country"));

							JSONObject cCode = (JSONObject) loc.get("CountryCode");
							countryCode = new CountryCode();
							countryCode.setIsoAlpha2((String) cCode.get("IsoAlpha2"));
							countryCode.setIsoAlpha3((String) cCode.get("IsoAlpha3"));
							countryCode.setUNCode((String) cCode.get("UNCode"));
							location.setCountryCode(countryCode);

							institute.setLocation(location);
							JSONObject subInstituion = (JSONObject) edu.get("SubInstitution");
							segregatedQualification.setInstitution(institute);
							try {
								if (subInstituion != null) {
									SubInstitution subInstitute = new SubInstitution();
									subInstitute.setName((String) subInstituion.get("Name"));
									subInstitute.setType((String) subInstituion.get("Type"));

									loc = (JSONObject) subInstituion.get("Location");

									location.setCity((String) loc.get("City"));
									location.setState((String) loc.get("State"));
									location.setStateIsoCode((String) loc.get("StateIsoCode"));
									location.setCountry((String) loc.get("Country"));

									cCode = (JSONObject) loc.get("CountryCode");
									countryCode = new CountryCode();
									countryCode.setIsoAlpha2((String) cCode.get("IsoAlpha2"));
									countryCode.setIsoAlpha3((String) cCode.get("IsoAlpha3"));
									countryCode.setUNCode((String) cCode.get("UNCode"));
									location.setCountryCode(countryCode);
									subInstitute.setLocation(location);
									segregatedQualification.setSubInstitution(subInstitute);
								}
							} catch (Exception ex) {

							}
							
							segregatedQualification.setFormattedDegreePeriod((String) edu.get("FormattedDegreePeriod"));
							segregatedQualification.setStartDate((String) edu.get("StartDate"));
							segregatedQualification.setEndDate((String) edu.get("EndDate"));

							JSONObject degree = (JSONObject) edu.get("Degree");
							Degree deg = new Degree();
							deg.setDegreeName((String) degree.get("DegreeName"));
							deg.setNormalizeDegree((String) degree.get("NormalizeDegree"));
							List<String> specialization=(ArrayList<String>) degree.get("Specialization");
							deg.setSpecialization(specialization);
							segregatedQualification.setDegree(deg);
							JSONObject degreeAggregate = (JSONObject) edu.get("Aggregate");
							if (degreeAggregate != null) {
								Aggregate aggregate = new Aggregate();
								aggregate.setValue((String) degreeAggregate.get("Value"));
								aggregate.setMeasureType((String) degreeAggregate.get("MeasureType"));
								segregatedQualification.setAggregate(aggregate);
							}

							listSegregatedQualification.add(segregatedQualification);
						}
						rchilliParserData.setSegregatedQualification(listSegregatedQualification);
					} catch (Exception ex) {
						System.out.println(ex);
					}

				} else if (nodeName.equalsIgnoreCase("SegregatedSkill")) {
					try {

						JSONArray skillSet = (JSONArray) val;
						Iterator i = skillSet.iterator();
						while (i.hasNext()) {
							segregatedSkill = new SegregatedSkill();
							JSONObject skills1 = (JSONObject) i.next();
							segregatedSkill.setSkill((String) skills1.get("Skill"));
							segregatedSkill.setType((String) skills1.get("Type"));
							segregatedSkill.setFormattedName((String) skills1.get("FormattedName"));
							segregatedSkill.setAlias((String) skills1.get("Alias"));
							segregatedSkill.setEvidence((String) skills1.get("Evidence"));
							segregatedSkill.setLastUsed((String) skills1.get("LastUsed"));
							
							segregatedSkill.setOntology((String) skills1.get("Ontology"));
							//segregatedSkill.setExperienceInMonths(Integer.parseInt((String) skills1.get("ExperienceInMonths")));
							listSegregatedSkill.add(segregatedSkill);
						}
						rchilliParserData.setSegregatedSkill(listSegregatedSkill);
					} catch (Exception ex) {
						System.out.println(ex.getMessage());
					}
				} else if (nodeName.equalsIgnoreCase("SegregatedExperience")) {
					try {
					
						JSONArray expDrill = (JSONArray)val;
						Iterator i = expDrill.iterator();
						int expId = 1;
						while (i.hasNext()) {
							segregatedExperience = new SegregatedExperience();
							JSONObject exp = (JSONObject) i.next();
							Employer employer = new Employer();
							JSONObject emp = (JSONObject) exp.get("Employer");
							employer.setEmployerName((String) emp.get("EmployerName"));
							employer.setFormattedName((String) emp.get("FormattedName"));
							segregatedExperience.setEmployer(employer);
							JobProfile job = new JobProfile();
							JSONObject jobProfile = (JSONObject) exp.get("JobProfile");
							job.setTitle((String) jobProfile.get("Title"));
							job.setFormattedName((String) jobProfile.get("FormattedName"));
							job.setAlias((String) jobProfile.get("Alias"));
							
							if(jobProfile.containsKey("RelatedSkills"))
							{
								JSONArray relatedSkills=(JSONArray) jobProfile.get("RelatedSkills");
								Iterator itr= relatedSkills.iterator();
								RelatedSkills reSkill;
								List<RelatedSkills> relatedSkillList= new ArrayList();
								while(itr.hasNext())
								{
									JSONObject relatedSkill=(JSONObject )itr.next();
									reSkill= new RelatedSkills();
									reSkill.setSkill((String)relatedSkill.get("Skill"));
									reSkill.setProficiencyLevel((String)relatedSkill.get("ProficiencyLevel"));
									relatedSkillList.add(reSkill);
								}
								job.setRelatedSkills(relatedSkillList);
							}
							
							//job.setRelatedSkills((String) jobProfile.get("RelatedSkills"));

							segregatedExperience.setJobProfile(job);
							location = new Location();
							JSONObject loc = (JSONObject) exp.get("Location");

							location.setCity((String) loc.get("City"));
							location.setState((String) loc.get("State"));
							location.setStateIsoCode((String) loc.get("StateIsoCode"));
							location.setCountry((String) loc.get("Country"));

							JSONObject cCode = (JSONObject) loc.get("CountryCode");
							countryCode = new CountryCode();
							countryCode.setIsoAlpha2((String) cCode.get("IsoAlpha2"));
							countryCode.setIsoAlpha3((String) cCode.get("IsoAlpha3"));
							countryCode.setUNCode((String) cCode.get("UNCode"));

							location.setCountryCode(countryCode);
							segregatedExperience.setLocation(location);
							segregatedExperience.setJobPeriod((String) exp.get("JobPeriod"));
							segregatedExperience.setFormattedJobPeriod((String) exp.get("FormattedJobPeriod"));
							segregatedExperience.setStartDate((String) exp.get("StartDate"));
							segregatedExperience.setEndDate((String) exp.get("EndDate"));
							segregatedExperience.setJobDescription((String) exp.get("JobDescription"));
							JSONArray projDrill = (JSONArray) exp.get("Projects");
							Iterator proj = projDrill.iterator();
							List<Projects> listProjects = new ArrayList<Projects>();
							while (proj.hasNext()) {
								Projects projects = new Projects();
								JSONObject project = (JSONObject) proj.next();
								projects.setProjectName((String) project.get("ProjectName"));
								projects.setUsedSkills((String) project.get("UsedSkills"));
								projects.setTeamSize((String) project.get("TeamSize"));
								listProjects.add(projects);
							}
							segregatedExperience.setProjects(listProjects);
							listSegregatedExperience.add(segregatedExperience);
						}
						rchilliParserData.setSegregatedExperience(listSegregatedExperience);
					} catch (Exception ex) {
						System.out.println(ex.getMessage());
					}
				} else if (nodeName.equalsIgnoreCase("ResumeLanguage")) {
					try {
						JSONObject resumeLang = (JSONObject) val;
						ResumeLanguage resumeLanguage = new ResumeLanguage();

						resumeLanguage.setLanguage((String) resumeLang.get("Language"));
						resumeLanguage.setLanguageCode((String) resumeLang.get("LanguageCode"));
						rchilliParserData.setResumeLanguage(resumeLanguage);
					} catch (Exception ex) {
					}
				} else if (nodeName.equalsIgnoreCase("ResumeCountry")) {
					try {
						JSONObject rCountry = (JSONObject) val;
						ResumeCountry resumeCountry = new ResumeCountry();

						resumeCountry.setCountry((String) rCountry.get("Country"));
						resumeCountry.setEvidence((String) rCountry.get("Evidence"));

						JSONObject cCode = (JSONObject) rCountry.get("CountryCode");
						countryCode = new CountryCode();
						countryCode.setIsoAlpha2((String) cCode.get("IsoAlpha2"));
						countryCode.setIsoAlpha3((String) cCode.get("IsoAlpha3"));
						countryCode.setUNCode((String) cCode.get("UNCode"));
						resumeCountry.setCountryCode(countryCode);

						rchilliParserData.setResumeCountry(resumeCountry);
					} catch (Exception ex) {
					}
				} else if (nodeName.equalsIgnoreCase("Name")) {
					try {
						JSONObject candidateName = (JSONObject) val;
						Name name = new Name();

						name.setFullName((String) candidateName.get("FullName"));
						name.setTitleName((String) candidateName.get("TitleName"));
						name.setFirstName((String) candidateName.get("FirstName"));
						name.setMiddleName((String) candidateName.get("MiddleName"));
						name.setLastName((String) candidateName.get("LastName"));
						name.setFormattedName((String) candidateName.get("FormattedName"));

						rchilliParserData.setName(name);
					} catch (Exception ex) {
					}
				}

				else if (nodeName.equalsIgnoreCase("PassportDetail")) {
					try {
						JSONObject passport = (JSONObject) val;
						PassportDetail passportDetail = new PassportDetail();

						passportDetail.setPassportNumber((String) passport.get("PassportNumber"));
						passportDetail.setDateOfExpiry((String) passport.get("DateOfExpiry"));
						passportDetail.setDateOfIssue((String) passport.get("DateOfIssue"));
						passportDetail.setPlaceOfIssue((String) passport.get("PlaceOfIssue"));
						rchilliParserData.setPassportDetail(passportDetail);
					} catch (Exception ex) {
					}
				} else if (nodeName.equalsIgnoreCase("CurrentSalary")) {
					try {
						JSONObject currentSalary = (JSONObject) val;
						CurrentSalary currSalary = new CurrentSalary();

						currSalary.setAmount((String) currentSalary.get("Amount"));
						currSalary.setSymbol((String) currentSalary.get("Symbol"));
						currSalary.setCurrency((String) currentSalary.get("Currency"));
						currSalary.setUnit((String) currentSalary.get("Unit"));
						currSalary.setText((String) currentSalary.get("Text"));
						rchilliParserData.setCurrentSalary(currSalary);
					} catch (Exception ex) {
					}
				} else if (nodeName.equalsIgnoreCase("ExpectedSalary")) {
					try {
						JSONObject expectedSalary = (JSONObject) val;
						ExpectedSalary expSalary = new ExpectedSalary();

						expSalary.setAmount((String) expectedSalary.get("Amount"));
						expSalary.setSymbol((String) expectedSalary.get("Symbol"));
						expSalary.setCurrency((String) expectedSalary.get("Currency"));
						expSalary.setUnit((String) expectedSalary.get("Unit"));
						expSalary.setText((String) expectedSalary.get("Text"));
						rchilliParserData.setExpectedSalary(expSalary);
					} catch (Exception ex) {
					}
				} else if (nodeName.equalsIgnoreCase("WorkedPeriod")) {
					try {
						JSONObject WorkedPeriod = (JSONObject) val;
						WorkedPeriod workPeriod = new WorkedPeriod();
						workPeriod.setTotalExperienceInMonths((String) WorkedPeriod.get("TotalExperienceInMonths"));
						workPeriod.setTotalExperienceInYear((String) WorkedPeriod.get("TotalExperienceInYear"));
						workPeriod.setTotalExperienceRange((String) WorkedPeriod.get("TotalExperienceRange"));
						rchilliParserData.setWorkedPeriod(workPeriod);
					} catch (Exception ex) {
					}
				} else if (nodeName.equalsIgnoreCase("TemplateOutput")) {
					try {
						TemplateOutput template = new TemplateOutput();
						JSONObject TemplateOutput = (JSONObject) val;
						template.setTemplateOutputFileName((String) TemplateOutput.get("TemplateOutputFileName"));
						template.setTemplateOutputData((String) TemplateOutput.get("TemplateOutputData"));
						rchilliParserData.setTemplateOutput(template);

					} catch (Exception ex) {
					}
				} else if (nodeName.equalsIgnoreCase("CandidateImage")) {
					try {
						JSONObject CandidateImage = (JSONObject) val;
						CandidateImage candidateImage = new CandidateImage();

						candidateImage.setCandidateImageFormat((String) CandidateImage.get("CandidateImageFormat"));
						candidateImage.setCandidateImageData((String) CandidateImage.get("CandidateImageData"));
						rchilliParserData.setCandidateImage(candidateImage);
					} catch (Exception ex) {
					}
				} else if (nodeName.equalsIgnoreCase("LanguageKnown")) {
					try {
						JSONArray skillSet = (JSONArray) val;
						Iterator i = skillSet.iterator();
						List<LanguageKnown> languageKnown = new ArrayList<LanguageKnown>();
						while (i.hasNext()) {
							LanguageKnown language = new LanguageKnown();
							JSONObject lang = (JSONObject) i.next();
							language.setLanguage((String) lang.get("Language"));
							language.setLanguageCode((String) lang.get("LanguageCode"));
							languageKnown.add(language);
						}
						rchilliParserData.setLanguageKnown(languageKnown);
					} catch (Exception ex) {
					}
				} else if (nodeName.equalsIgnoreCase("Email")) {
					try {
						JSONArray emails = (JSONArray) val;
						Iterator i = emails.iterator();
						List<Email> listEmail = new ArrayList<Email>();
						while (i.hasNext()) {
							Email eml = new Email();
							JSONObject email = (JSONObject) i.next();
							eml.setEmailAddress((String) email.get("EmailAddress"));
							listEmail.add(eml);
						}
						rchilliParserData.setEmail(listEmail);
					} catch (Exception ex) {
					}
				} else if (nodeName.equalsIgnoreCase("PhoneNumber")) {
					try {
						JSONArray phoneNumber = (JSONArray) val;
						Iterator i = phoneNumber.iterator();
						List<PhoneNumber> listPhoneNumber = new ArrayList<PhoneNumber>();
						while (i.hasNext()) {
							PhoneNumber phNumber = new PhoneNumber();
							JSONObject phone = (JSONObject) i.next();
							phNumber.setNumber((String) phone.get("Number"));
							phNumber.setISDCode((String) phone.get("ISDCode"));
							phNumber.setOriginalNumber((String) phone.get("OriginalNumber"));
							phNumber.setFormattedNumber((String) phone.get("FormattedNumber"));
							phNumber.setType((String) phone.get("Type"));
							listPhoneNumber.add(phNumber);
						}
						rchilliParserData.setPhoneNumber(listPhoneNumber);
					} catch (Exception ex) {
					}
				} else if (nodeName.equalsIgnoreCase("WebSite")) {
					try {
						JSONArray webSites = (JSONArray) val;
						Iterator i = webSites.iterator();
						List<WebSite> listWebSite = new ArrayList<WebSite>();
						while (i.hasNext()) {
							WebSite webSite = new WebSite();
							JSONObject web = (JSONObject) i.next();
							webSite.setUrl((String) web.get("Url"));
							webSite.setType((String) web.get("Type"));
							listWebSite.add(webSite);
						}
						rchilliParserData.setWebSite(listWebSite);
					} catch (Exception ex) {
					}
				} else if (nodeName.equalsIgnoreCase("Address")) {
					try {
						JSONArray address = (JSONArray) val;
						Iterator i = address.iterator();
						List<Address> listAddress = new ArrayList<Address>();
						while (i.hasNext()) {
							Address addr = new Address();
							JSONObject adrss = (JSONObject) i.next();
							addr.setStreet((String) adrss.get("Street"));
							addr.setCity((String) adrss.get("City"));
							addr.setState((String) adrss.get("State"));
							addr.setStateIsoCode((String) adrss.get("StateIsoCode"));
							addr.setCountry((String) adrss.get("Country"));
							addr.setZipCode((String) adrss.get("ZipCode"));
							addr.setFormattedAddress((String) adrss.get("FormattedAddress"));
							addr.setType((String) adrss.get("Type"));

							JSONObject cCode = (JSONObject) adrss.get("CountryCode");
							countryCode = new CountryCode();
							countryCode.setIsoAlpha2((String) cCode.get("IsoAlpha2"));
							countryCode.setIsoAlpha3((String) cCode.get("IsoAlpha3"));
							countryCode.setUNCode((String) cCode.get("UNCode"));
							addr.setCountryCode(countryCode);

							listAddress.add(addr);
						}
						rchilliParserData.setAddress(listAddress);
					} catch (Exception ex) {
					}
				} else if (nodeName.equalsIgnoreCase("CurrentLocation")) {
					try {
						JSONArray currentLocation = (JSONArray) val;
						Iterator i = currentLocation.iterator();
						List<CurrentLocation> listCurrentLocation = new ArrayList<CurrentLocation>();
						while (i.hasNext()) {
							CurrentLocation curLocation = new CurrentLocation();
							JSONObject currentLoc = (JSONObject) i.next();
							curLocation.setCity((String) currentLoc.get("City"));
							curLocation.setState((String) currentLoc.get("State"));
							curLocation.setStateIsoCode((String) currentLoc.get("StateIsoCode"));
							curLocation.setCountry((String) currentLoc.get("Country"));

							JSONObject cCode = (JSONObject) currentLoc.get("CountryCode");
							countryCode = new CountryCode();
							countryCode.setIsoAlpha2((String) cCode.get("IsoAlpha2"));
							countryCode.setIsoAlpha3((String) cCode.get("IsoAlpha3"));
							countryCode.setUNCode((String) cCode.get("UNCode"));
							curLocation.setCountryCode(countryCode);

							listCurrentLocation.add(curLocation);
						}
						rchilliParserData.setCurrentLocation(listCurrentLocation);
					} catch (Exception ex) {
					}
				} else if (nodeName.equalsIgnoreCase("PreferredLocation")) {
					try {
						JSONArray preferredLocation = (JSONArray) val;
						Iterator i = preferredLocation.iterator();
						List<PreferredLocation> listPreferredLocation = new ArrayList<PreferredLocation>();
						while (i.hasNext()) {
							PreferredLocation perLocation = new PreferredLocation();
							JSONObject preferredLoc = (JSONObject) i.next();
							perLocation.setCity((String) preferredLoc.get("City"));
							perLocation.setState((String) preferredLoc.get("State"));
							perLocation.setStateIsoCode((String) preferredLoc.get("StateIsoCode"));
							perLocation.setCountry((String) preferredLoc.get("Country"));

							JSONObject cCode = (JSONObject) preferredLoc.get("CountryCode");
							countryCode = new CountryCode();
							countryCode.setIsoAlpha2((String) cCode.get("IsoAlpha2"));
							countryCode.setIsoAlpha3((String) cCode.get("IsoAlpha3"));
							countryCode.setUNCode((String) cCode.get("UNCode"));
							perLocation.setCountryCode(countryCode);

							listPreferredLocation.add(perLocation);
						}
						rchilliParserData.setPreferredLocation(listPreferredLocation);
					} catch (Exception ex) {
					}
				} else if (nodeName.equalsIgnoreCase("SegregatedCertification")) {
					try {
						JSONArray preferredLocation = (JSONArray) val;
						Iterator i = preferredLocation.iterator();

						while (i.hasNext()) {
							segregatedCertification = new SegregatedCertification();
							JSONObject segCertification = (JSONObject) i.next();
							segregatedCertification
									.setCertificationTitle((String) segCertification.get("CertificationTitle"));
							segregatedCertification.setAuthority((String) segCertification.get("Authority"));
							segregatedCertification
									.setCertificationCode((String) segCertification.get("CertificationCode"));
							segregatedCertification.setIsExpiry((String) segCertification.get("IsExpiry"));
							segregatedCertification.setStartDate((String) segCertification.get("StartDate"));
							segregatedCertification.setEndDate((String) segCertification.get("EndDate"));
							segregatedCertification
									.setCertificationUrl((String) segCertification.get("CertificationUrl"));

							listSegregatedCertification.add(segregatedCertification);
						}
						rchilliParserData.setSegregatedCertification(listSegregatedCertification);
					} catch (Exception ex) {
					}
				} else if (nodeName.equalsIgnoreCase("SegregatedPublication")) {
					try {
						JSONArray segPub = (JSONArray) val;
						Iterator i = segPub.iterator();

						while (i.hasNext()) {
							segregatedPublication = new SegregatedPublication();
							JSONObject segPublication = (JSONObject) i.next();
							segregatedPublication.setPublicationTitle((String) segPublication.get("PublicationTitle"));
							segregatedPublication.setPublisher((String) segPublication.get("Publisher"));
							segregatedPublication
									.setPublicationNumber((String) segPublication.get("PublicationNumber"));
							segregatedPublication.setPublicationUrl((String) segPublication.get("PublicationUrl"));
							segregatedPublication.setAuthors((String) segPublication.get("Authors"));
							segregatedPublication.setDescription((String) segPublication.get("Description"));
							listSegregatedPublication.add(segregatedPublication);
						}
						rchilliParserData.setSegregatedPublication(listSegregatedPublication);
					} catch (Exception ex) {
					}
				} else if (nodeName.equalsIgnoreCase("SegregatedAchievement")) {
					try {
						JSONArray segAch = (JSONArray) val;
						Iterator i = segAch.iterator();

						while (i.hasNext()) {
							segregatedAchievement = new SegregatedAchievement();
							JSONObject segAchievement = (JSONObject) i.next();
							segregatedAchievement.setAwardTitle	((String) segAchievement.get("AwardTitle"));
							segregatedAchievement.setIssuer((String) segAchievement.get("Issuer"));
							segregatedAchievement.setAssociatedWith((String) segAchievement.get("AssociatedWith"));
							segregatedAchievement.setIssuingDate((String) segAchievement.get("IssuingDate"));
							
							segregatedAchievement.setDescription((String) segAchievement.get("Description"));
							listSegregatedAchievement.add(segregatedAchievement);
						}
						rchilliParserData.setSegregatedAchievement(listSegregatedAchievement);
					} catch (Exception ex) {
					}
				} else if (nodeName.equalsIgnoreCase("Recommendations")) {
					try {
						JSONArray recommendations = (JSONArray) val;
						Iterator i = recommendations.iterator();
						List<Recommendations> listRecommendations = new ArrayList<Recommendations>();
						while (i.hasNext()) {
							Recommendations recommendation = new Recommendations();
							JSONObject recommend = (JSONObject) i.next();
							recommendation.setPersonName((String) recommend.get("PersonName"));
							recommendation.setCompanyName((String) recommend.get("CompanyName"));
							recommendation.setRelation((String) recommend.get("Relation"));
							recommendation.setPositionTitle((String) recommend.get("PositionTitle"));
							recommendation.setDescription((String) recommend.get("Description"));

							listRecommendations.add(recommendation);
						}
						rchilliParserData.setRecommendations(listRecommendations);
					} catch (Exception ex) {
					}
				}

			} catch (Exception ex) {
				ex.printStackTrace();
			}
		
		}
		return rchilliParserData;

	}

}
