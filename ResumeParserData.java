package RchilliApi;
import java.util.ArrayList;
import java.util.List;

public class ResumeParserData
{
    private String ResumeFileName;

    private ResumeLanguage ResumeLanguage;

    private String ParsingDate;

    private ResumeCountry ResumeCountry;

    private Name Name;

    private String DateOfBirth;

    private String Gender;

    private String FatherName;

    private String MotherName;

    private String MaritalStatus;

    private String Nationality;

    private List<LanguageKnown> LanguageKnown;

    private String UniqueID;

    private String LicenseNo;

    private PassportDetail PassportDetail;

    private String PanNo;

    private String VisaStatus;

    private List<Email> Email;

    private List<PhoneNumber> PhoneNumber;

    private List<WebSite> WebSite;

    private List<Address> Address;

    private String Category;

    private String SubCategory;

    private CurrentSalary CurrentSalary;

    private ExpectedSalary ExpectedSalary;

    private String Qualification;

    private List<SegregatedQualification> SegregatedQualification;

    private String Certification;

    private List<SegregatedCertification> SegregatedCertification;

    private String SkillBlock;

    private String SkillKeywords;

    private List<SegregatedSkill> SegregatedSkill;

    private String Experience;

    private List<SegregatedExperience> SegregatedExperience;

    private String CurrentEmployer;

    private String JobProfile;

    private WorkedPeriod WorkedPeriod;

    private String GapPeriod;

    private String AverageStay;

    private String LongestStay;

    private String Summary;

    private String ExecutiveSummary;

    private String ManagementSummary;

    private String Coverletter;

    private String Publication;

    private List<SegregatedPublication> SegregatedPublication;

    private List<CurrentLocation> CurrentLocation;

    private List<PreferredLocation> PreferredLocation;

    private String Availability;

    private String Hobbies;

    private String Objectives;

    private String Achievements;

    private List<SegregatedAchievement> SegregatedAchievement;

    private String References;

    private String CustomFields;

    private EmailInfo EmailInfo;

    private List<Recommendations> Recommendations;

    private String DetailResume;

    private String HtmlResume;

    private CandidateImage CandidateImage;

    private TemplateOutput TemplateOutput;

    private ApiInfo ApiInfo;
    
    private Error Error;
    

    public Error getError() {
		return Error;
	}
	public void setError(Error error) {
		Error = error;
	}
	public void setResumeFileName(String ResumeFileName){
        this.ResumeFileName = ResumeFileName;
    }
    public String getResumeFileName(){
        return this.ResumeFileName;
    }
    public void setResumeLanguage(ResumeLanguage ResumeLanguage){
        this.ResumeLanguage = ResumeLanguage;
    }
    public ResumeLanguage getResumeLanguage(){
        return this.ResumeLanguage;
    }
    public void setParsingDate(String ParsingDate){
        this.ParsingDate = ParsingDate;
    }
    public String getParsingDate(){
        return this.ParsingDate;
    }
    public void setResumeCountry(ResumeCountry ResumeCountry){
        this.ResumeCountry = ResumeCountry;
    }
    public ResumeCountry getResumeCountry(){
        return this.ResumeCountry;
    }
    public void setName(Name Name){
        this.Name = Name;
    }
    public Name getName(){
        return this.Name;
    }
    public void setDateOfBirth(String DateOfBirth){
        this.DateOfBirth = DateOfBirth;
    }
    public String getDateOfBirth(){
        return this.DateOfBirth;
    }
    public void setGender(String Gender){
        this.Gender = Gender;
    }
    public String getGender(){
        return this.Gender;
    }
    public void setFatherName(String FatherName){
        this.FatherName = FatherName;
    }
    public String getFatherName(){
        return this.FatherName;
    }
    public void setMotherName(String MotherName){
        this.MotherName = MotherName;
    }
    public String getMotherName(){
        return this.MotherName;
    }
    public void setMaritalStatus(String MaritalStatus){
        this.MaritalStatus = MaritalStatus;
    }
    public String getMaritalStatus(){
        return this.MaritalStatus;
    }
    public void setNationality(String Nationality){
        this.Nationality = Nationality;
    }
    public String getNationality(){
        return this.Nationality;
    }
    public void setLanguageKnown(List<LanguageKnown> LanguageKnown){
        this.LanguageKnown = LanguageKnown;
    }
    public List<LanguageKnown> getLanguageKnown(){
        return this.LanguageKnown;
    }
    public void setUniqueID(String UniqueID){
        this.UniqueID = UniqueID;
    }
    public String getUniqueID(){
        return this.UniqueID;
    }
    public void setLicenseNo(String LicenseNo){
        this.LicenseNo = LicenseNo;
    }
    public String getLicenseNo(){
        return this.LicenseNo;
    }
    public void setPassportDetail(PassportDetail PassportDetail){
        this.PassportDetail = PassportDetail;
    }
    public PassportDetail getPassportDetail(){
        return this.PassportDetail;
    }
    public void setPanNo(String PanNo){
        this.PanNo = PanNo;
    }
    public String getPanNo(){
        return this.PanNo;
    }
    public void setVisaStatus(String VisaStatus){
        this.VisaStatus = VisaStatus;
    }
    public String getVisaStatus(){
        return this.VisaStatus;
    }
    public void setEmail(List<Email> Email){
        this.Email = Email;
    }
    public List<Email> getEmail(){
        return this.Email;
    }
    public void setPhoneNumber(List<PhoneNumber> PhoneNumber){
        this.PhoneNumber = PhoneNumber;
    }
    public List<PhoneNumber> getPhoneNumber(){
        return this.PhoneNumber;
    }
    public void setWebSite(List<WebSite> WebSite){
        this.WebSite = WebSite;
    }
    public List<WebSite> getWebSite(){
        return this.WebSite;
    }
    public void setAddress(List<Address> Address){
        this.Address = Address;
    }
    public List<Address> getAddress(){
        return this.Address;
    }
    public void setCategory(String Category){
        this.Category = Category;
    }
    public String getCategory(){
        return this.Category;
    }
    public void setSubCategory(String SubCategory){
        this.SubCategory = SubCategory;
    }
    public String getSubCategory(){
        return this.SubCategory;
    }
    public void setCurrentSalary(CurrentSalary CurrentSalary){
        this.CurrentSalary = CurrentSalary;
    }
    public CurrentSalary getCurrentSalary(){
        return this.CurrentSalary;
    }
    public void setExpectedSalary(ExpectedSalary ExpectedSalary){
        this.ExpectedSalary = ExpectedSalary;
    }
    public ExpectedSalary getExpectedSalary(){
        return this.ExpectedSalary;
    }
    public void setQualification(String Qualification){
        this.Qualification = Qualification;
    }
    public String getQualification(){
        return this.Qualification;
    }
    public void setSegregatedQualification(List<SegregatedQualification> SegregatedQualification){
        this.SegregatedQualification = SegregatedQualification;
    }
    public List<SegregatedQualification> getSegregatedQualification(){
        return this.SegregatedQualification;
    }
    public void setCertification(String Certification){
        this.Certification = Certification;
    }
    public String getCertification(){
        return this.Certification;
    }
    public void setSegregatedCertification(List<SegregatedCertification> SegregatedCertification){
        this.SegregatedCertification = SegregatedCertification;
    }
    public List<SegregatedCertification> getSegregatedCertification(){
        return this.SegregatedCertification;
    }
    public void setSkillBlock(String SkillBlock){
        this.SkillBlock = SkillBlock;
    }
    public String getSkillBlock(){
        return this.SkillBlock;
    }
    public void setSkillKeywords(String SkillKeywords){
        this.SkillKeywords = SkillKeywords;
    }
    public String getSkillKeywords(){
        return this.SkillKeywords;
    }
    public void setSegregatedSkill(List<SegregatedSkill> SegregatedSkill){
        this.SegregatedSkill = SegregatedSkill;
    }
    public List<SegregatedSkill> getSegregatedSkill(){
        return this.SegregatedSkill;
    }
    public void setExperience(String Experience){
        this.Experience = Experience;
    }
    public String getExperience(){
        return this.Experience;
    }
    public void setSegregatedExperience(List<SegregatedExperience> SegregatedExperience){
        this.SegregatedExperience = SegregatedExperience;
    }
    public List<SegregatedExperience> getSegregatedExperience(){
        return this.SegregatedExperience;
    }
    public void setCurrentEmployer(String CurrentEmployer){
        this.CurrentEmployer = CurrentEmployer;
    }
    public String getCurrentEmployer(){
        return this.CurrentEmployer;
    }
    public void setJobProfile(String JobProfile){
        this.JobProfile = JobProfile;
    }
    public String getJobProfile(){
        return this.JobProfile;
    }
    public void setWorkedPeriod(WorkedPeriod WorkedPeriod){
        this.WorkedPeriod = WorkedPeriod;
    }
    public WorkedPeriod getWorkedPeriod(){
        return this.WorkedPeriod;
    }
    public void setGapPeriod(String GapPeriod){
        this.GapPeriod = GapPeriod;
    }
    public String getGapPeriod(){
        return this.GapPeriod;
    }
    public void setAverageStay(String AverageStay){
        this.AverageStay = AverageStay;
    }
    public String getAverageStay(){
        return this.AverageStay;
    }
    public void setLongestStay(String LongestStay){
        this.LongestStay = LongestStay;
    }
    public String getLongestStay(){
        return this.LongestStay;
    }
    public void setSummary(String Summary){
        this.Summary = Summary;
    }
    public String getSummary(){
        return this.Summary;
    }
    public void setExecutiveSummary(String ExecutiveSummary){
        this.ExecutiveSummary = ExecutiveSummary;
    }
    public String getExecutiveSummary(){
        return this.ExecutiveSummary;
    }
    public void setManagementSummary(String ManagementSummary){
        this.ManagementSummary = ManagementSummary;
    }
    public String getManagementSummary(){
        return this.ManagementSummary;
    }
    public void setCoverletter(String Coverletter){
        this.Coverletter = Coverletter;
    }
    public String getCoverletter(){
        return this.Coverletter;
    }
    public void setPublication(String Publication){
        this.Publication = Publication;
    }
    public String getPublication(){
        return this.Publication;
    }
    public void setSegregatedPublication(List<SegregatedPublication> SegregatedPublication){
        this.SegregatedPublication = SegregatedPublication;
    }
    public List<SegregatedPublication> getSegregatedPublication(){
        return this.SegregatedPublication;
    }
    public void setCurrentLocation(List<CurrentLocation> CurrentLocation){
        this.CurrentLocation = CurrentLocation;
    }
    public List<CurrentLocation> getCurrentLocation(){
        return this.CurrentLocation;
    }
    public void setPreferredLocation(List<PreferredLocation> PreferredLocation){
        this.PreferredLocation = PreferredLocation;
    }
    public List<PreferredLocation> getPreferredLocation(){
        return this.PreferredLocation;
    }
    public void setAvailability(String Availability){
        this.Availability = Availability;
    }
    public String getAvailability(){
        return this.Availability;
    }
    public void setHobbies(String Hobbies){
        this.Hobbies = Hobbies;
    }
    public String getHobbies(){
        return this.Hobbies;
    }
    public void setObjectives(String Objectives){
        this.Objectives = Objectives;
    }
    public String getObjectives(){
        return this.Objectives;
    }
    public void setAchievements(String Achievements){
        this.Achievements = Achievements;
    }
    public String getAchievements(){
        return this.Achievements;
    }
    public void setSegregatedAchievement(List<SegregatedAchievement> SegregatedAchievement){
        this.SegregatedAchievement = SegregatedAchievement;
    }
    public List<SegregatedAchievement> getSegregatedAchievement(){
        return this.SegregatedAchievement;
    }
    public void setReferences(String References){
        this.References = References;
    }
    public String getReferences(){
        return this.References;
    }
    public void setCustomFields(String CustomFields){
        this.CustomFields = CustomFields;
    }
    public String getCustomFields(){
        return this.CustomFields;
    }
    public void setEmailInfo(EmailInfo EmailInfo){
        this.EmailInfo = EmailInfo;
    }
    public EmailInfo getEmailInfo(){
        return this.EmailInfo;
    }
    public void setRecommendations(List<Recommendations> Recommendations){
        this.Recommendations = Recommendations;
    }
    public List<Recommendations> getRecommendations(){
        return this.Recommendations;
    }
    public void setDetailResume(String DetailResume){
        this.DetailResume = DetailResume;
    }
    public String getDetailResume(){
        return this.DetailResume;
    }
    public void setHtmlResume(String HtmlResume){
        this.HtmlResume = HtmlResume;
    }
    public String getHtmlResume(){
        return this.HtmlResume;
    }
    public void setCandidateImage(CandidateImage CandidateImage){
        this.CandidateImage = CandidateImage;
    }
    public CandidateImage getCandidateImage(){
        return this.CandidateImage;
    }
    public void setTemplateOutput(TemplateOutput TemplateOutput){
        this.TemplateOutput = TemplateOutput;
    }
    public TemplateOutput getTemplateOutput(){
        return this.TemplateOutput;
    }
    public void setApiInfo(ApiInfo ApiInfo){
        this.ApiInfo = ApiInfo;
    }
    public ApiInfo getApiInfo(){
        return this.ApiInfo;
    }
}
class ResumeLanguage
{
    private String Language;

    private String LanguageCode;

    public void setLanguage(String Language){
        this.Language = Language;
    }
    public String getLanguage(){
        return this.Language;
    }
    public void setLanguageCode(String LanguageCode){
        this.LanguageCode = LanguageCode;
    }
    public String getLanguageCode(){
        return this.LanguageCode;
    }
}
class CountryCode
{
    private String IsoAlpha2;

    private String IsoAlpha3;

    private String UNCode;

    public void setIsoAlpha2(String IsoAlpha2){
        this.IsoAlpha2 = IsoAlpha2;
    }
    public String getIsoAlpha2(){
        return this.IsoAlpha2;
    }
    public void setIsoAlpha3(String IsoAlpha3){
        this.IsoAlpha3 = IsoAlpha3;
    }
    public String getIsoAlpha3(){
        return this.IsoAlpha3;
    }
    public void setUNCode(String UNCode){
        this.UNCode = UNCode;
    }
    public String getUNCode(){
        return this.UNCode;
    }
}

 

class ResumeCountry
{
    private String Country;

    private String Evidence;

    private CountryCode CountryCode;

    public void setCountry(String Country){
        this.Country = Country;
    }
    public String getCountry(){
        return this.Country;
    }
    public void setEvidence(String Evidence){
        this.Evidence = Evidence;
    }
    public String getEvidence(){
        return this.Evidence;
    }
    public void setCountryCode(CountryCode CountryCode){
        this.CountryCode = CountryCode;
    }
    public CountryCode getCountryCode(){
        return this.CountryCode;
    }
}

 
 
class Name
{
    private String FullName;

    private String TitleName;

    private String FirstName;

    private String MiddleName;

    private String LastName;

    private String FormattedName;

    private int ConfidenceScore;

    public void setFullName(String FullName){
        this.FullName = FullName;
    }
    public String getFullName(){
        return this.FullName;
    }
    public void setTitleName(String TitleName){
        this.TitleName = TitleName;
    }
    public String getTitleName(){
        return this.TitleName;
    }
    public void setFirstName(String FirstName){
        this.FirstName = FirstName;
    }
    public String getFirstName(){
        return this.FirstName;
    }
    public void setMiddleName(String MiddleName){
        this.MiddleName = MiddleName;
    }
    public String getMiddleName(){
        return this.MiddleName;
    }
    public void setLastName(String LastName){
        this.LastName = LastName;
    }
    public String getLastName(){
        return this.LastName;
    }
    public void setFormattedName(String FormattedName){
        this.FormattedName = FormattedName;
    }
    public String getFormattedName(){
        return this.FormattedName;
    }
    public void setConfidenceScore(int ConfidenceScore){
        this.ConfidenceScore = ConfidenceScore;
    }
    public int getConfidenceScore(){
        return this.ConfidenceScore;
    }
}

 
 
class LanguageKnown
{
    private String Language;

    private String LanguageCode;

    public void setLanguage(String Language){
        this.Language = Language;
    }
    public String getLanguage(){
        return this.Language;
    }
    public void setLanguageCode(String LanguageCode){
        this.LanguageCode = LanguageCode;
    }
    public String getLanguageCode(){
        return this.LanguageCode;
    }
}

 
 
class PassportDetail
{
    private String PassportNumber;

    private String DateOfExpiry;

    private String DateOfIssue;

    private String PlaceOfIssue;

    public void setPassportNumber(String PassportNumber){
        this.PassportNumber = PassportNumber;
    }
    public String getPassportNumber(){
        return this.PassportNumber;
    }
    public void setDateOfExpiry(String DateOfExpiry){
        this.DateOfExpiry = DateOfExpiry;
    }
    public String getDateOfExpiry(){
        return this.DateOfExpiry;
    }
    public void setDateOfIssue(String DateOfIssue){
        this.DateOfIssue = DateOfIssue;
    }
    public String getDateOfIssue(){
        return this.DateOfIssue;
    }
    public void setPlaceOfIssue(String PlaceOfIssue){
        this.PlaceOfIssue = PlaceOfIssue;
    }
    public String getPlaceOfIssue(){
        return this.PlaceOfIssue;
    }
	/*
	 * public String toString(){ return
	 * getPassportNumber()+" "+getDateOfExpiry()+""+getDateOfIssue(); }
	 */
}

 
 
class Email
{
    private String EmailAddress;

    private int ConfidenceScore;

    public void setEmailAddress(String EmailAddress){
        this.EmailAddress = EmailAddress;
    }
    public String getEmailAddress(){
        return this.EmailAddress;
    }
    public void setConfidenceScore(int ConfidenceScore){
        this.ConfidenceScore = ConfidenceScore;
    }
    public int getConfidenceScore(){
        return this.ConfidenceScore;
    }
	/*
	 * public String toString(){ return
	 * getEmailAddress()+" "+getConfidenceScore()+""+getConfidenceScore(); }
	 */
}

 
 
class PhoneNumber
{
    private String Number;

    private String ISDCode;

    private String OriginalNumber;

    private String FormattedNumber;

    private String Type;

    private int ConfidenceScore;

    public void setNumber(String Number){
        this.Number = Number;
    }
    public String getNumber(){
        return this.Number;
    }
    public void setISDCode(String ISDCode){
        this.ISDCode = ISDCode;
    }
    public String getISDCode(){
        return this.ISDCode;
    }
    public void setOriginalNumber(String OriginalNumber){
        this.OriginalNumber = OriginalNumber;
    }
    public String getOriginalNumber(){
        return this.OriginalNumber;
    }
    public void setFormattedNumber(String FormattedNumber){
        this.FormattedNumber = FormattedNumber;
    }
    public String getFormattedNumber(){
        return this.FormattedNumber;
    }
    public void setType(String Type){
        this.Type = Type;
    }
    public String getType(){
        return this.Type;
    }
    public void setConfidenceScore(int ConfidenceScore){
        this.ConfidenceScore = ConfidenceScore;
    }
    public int getConfidenceScore(){
        return this.ConfidenceScore;
    }
    public String toString(){
    	return getNumber()+" "+getISDCode()+""+getOriginalNumber()+""+getFormattedNumber()+""+
    getType()+""+getConfidenceScore();
    }
}

 
 
class WebSite
{
    private String Type;

    private String Url;

    public void setType(String Type){
        this.Type = Type;
    }
    public String getType(){
        return this.Type;
    }
    public void setUrl(String Url){
        this.Url = Url;
    }
    public String getUrl(){
        return this.Url;
    }
	/*
	 * public String toString(){ return getType()+" "+getType(); }
	 */
}

 
 
 
class Address
{
    private String Street;

    private String City;

    private String State;
    
    private String StateIsoCode;

    private String Country;

    private CountryCode CountryCode;

    private String ZipCode;

    private String FormattedAddress;

    private String Type;

    private int ConfidenceScore;

    public void setStreet(String Street){
        this.Street = Street;
    }
    public String getStreet(){
        return this.Street;
    }
    public void setCity(String City){
        this.City = City;
    }
    public String getCity(){
        return this.City;
    }
    public void setState(String State){
        this.State = State;
    }
    public String getState(){
        return this.State;
    }
    public void setStateIsoCode(String StateIsoCode){
        this.StateIsoCode = StateIsoCode;
    }
    public String getStateIsoCode(){
        return this.StateIsoCode;
    }
    public void setCountry(String Country){
        this.Country = Country;
    }
    public String getCountry(){
        return this.Country;
    }
    public void setCountryCode(CountryCode CountryCode){
        this.CountryCode = CountryCode;
    }
    public CountryCode getCountryCode(){
        return this.CountryCode;
    }
    public void setZipCode(String ZipCode){
        this.ZipCode = ZipCode;
    }
    public String getZipCode(){
        return this.ZipCode;
    }
    public void setFormattedAddress(String FormattedAddress){
        this.FormattedAddress = FormattedAddress;
    }
    public String getFormattedAddress(){
        return this.FormattedAddress;
    }
    public void setType(String Type){
        this.Type = Type;
    }
    public String getType(){
        return this.Type;
    }
    public void setConfidenceScore(int ConfidenceScore){
        this.ConfidenceScore = ConfidenceScore;
    }
    public int getConfidenceScore(){
        return this.ConfidenceScore;
    }
    public String toString(){
    	return getFormattedAddress()+" "+getCity()+""+getState()+""+getStateIsoCode()+""+
    getCountry()+""+getZipCode()+""+getFormattedAddress()+""+getType();
    }
}
class CurrentSalary
{
    private String Amount;

    private String Symbol;

    private String Currency;

    private String Unit;

    private String Text;

    public void setAmount(String Amount){
        this.Amount = Amount;
    }
    public String getAmount(){
        return this.Amount;
    }
    public void setSymbol(String Symbol){
        this.Symbol = Symbol;
    }
    public String getSymbol(){
        return this.Symbol;
    }
    public void setCurrency(String Currency){
        this.Currency = Currency;
    }
    public String getCurrency(){
        return this.Currency;
    }
    public void setUnit(String Unit){
        this.Unit = Unit;
    }
    public String getUnit(){
        return this.Unit;
    }
    public void setText(String Text){
        this.Text = Text;
    }
    public String getText(){
        return this.Text;
    }
	/*
	 * public String toString(){ return
	 * getAmount()+" "+getSymbol()+""+getCurrency()+""+getUnit()+""+getText(); }
	 */
}

 
 
class ExpectedSalary
{
    private String Amount;

    private String Symbol;

    private String Currency;

    private String Unit;

    private String Text;

    public void setAmount(String Amount){
        this.Amount = Amount;
    }
    public String getAmount(){
        return this.Amount;
    }
    public void setSymbol(String Symbol){
        this.Symbol = Symbol;
    }
    public String getSymbol(){
        return this.Symbol;
    }
    public void setCurrency(String Currency){
        this.Currency = Currency;
    }
    public String getCurrency(){
        return this.Currency;
    }
    public void setUnit(String Unit){
        this.Unit = Unit;
    }
    public String getUnit(){
        return this.Unit;
    }
    public void setText(String Text){
        this.Text = Text;
    }
    public String getText(){
        return this.Text;
    }
	/*
	 * public String toString(){ return
	 * getAmount()+" "+getSymbol()+""+getCurrency()+""+getUnit()+""+getText(); }
	 */
}

 
 
class Location
{
    private String City;

    private String State;

    private String StateIsoCode;
    
    private String Country;

    private CountryCode CountryCode;

    public void setCity(String City){
        this.City = City;
    }
    public String getCity(){
        return this.City;
    }
    public void setState(String State){
        this.State = State;
    }
    public String getState(){
        return this.State;
    }
    
    public void setStateIsoCode(String StateIsoCode){
        this.StateIsoCode = StateIsoCode;
    }
    public String getStateIsoCode(){
        return this.StateIsoCode;
    }
    public void setCountry(String Country){
        this.Country = Country;
    }
    public String getCountry(){
        return this.Country;
    }
    public void setCountryCode(CountryCode CountryCode){
        this.CountryCode = CountryCode;
    }
    public CountryCode getCountryCode(){
        return this.CountryCode;
    }
	/*
	 * public String toString(){ return
	 * getCity()+" "+getState()+""+getStateIsoCode()+""+getCountry()+""+
	 * getCountryCode(); }
	 */
}

 
 
class Institution
{
    private String Name;

    private String Type;

    private int ConfidenceScore;

    private Location Location;

    public void setName(String Name){
        this.Name = Name;
    }
    public String getName(){
        return this.Name;
    }
    public void setType(String Type){
        this.Type = Type;
    }
    public String getType(){
        return this.Type;
    }
    public void setConfidenceScore(int ConfidenceScore){
        this.ConfidenceScore = ConfidenceScore;
    }
    public int getConfidenceScore(){
        return this.ConfidenceScore;
    }
    public void setLocation(Location Location){
        this.Location = Location;
    }
    public Location getLocation(){
        return this.Location;
    }
	/*
	 * public String toString(){ return
	 * getName()+" "+getType()+""+getConfidenceScore()+""+getLocation(); }
	 */
}

 
class SubInstitution
{
    private String Name;

    private int ConfidenceScore;

    private String Type;

    private Location Location;

    public void setName(String Name){
        this.Name = Name;
    }
    public String getName(){
        return this.Name;
    }
    public void setConfidenceScore(int ConfidenceScore){
        this.ConfidenceScore = ConfidenceScore;
    }
    public int getConfidenceScore(){
        return this.ConfidenceScore;
    }
    public void setType(String Type){
        this.Type = Type;
    }
    public String getType(){
        return this.Type;
    }
    public void setLocation(Location Location){
        this.Location = Location;
    }
    public Location getLocation(){
        return this.Location;
    }
}

class Degree
{
    private String DegreeName;

    private String NormalizeDegree;

    private List<String> Specialization;

    private int ConfidenceScore;

    public void setDegreeName(String DegreeName){
        this.DegreeName = DegreeName;
    }
    public String getDegreeName(){
        return this.DegreeName;
    }
    public void setNormalizeDegree(String NormalizeDegree){
        this.NormalizeDegree = NormalizeDegree;
    }
    public String getNormalizeDegree(){
        return this.NormalizeDegree;
    }
    public void setSpecialization(List<String> Specialization){
        this.Specialization = Specialization;
    }
    public List<String> getSpecialization(){
        return this.Specialization;
    }
    public void setConfidenceScore(int ConfidenceScore){
        this.ConfidenceScore = ConfidenceScore;
    }
    public int getConfidenceScore(){
        return this.ConfidenceScore;
    }
	/*
	 * public String toString(){ return
	 * getDegreeName()+" "+getNormalizeDegree()+""+getConfidenceScore()+""+
	 * getSpecialization(); }
	 */
}

 
 
class Aggregate
{
    private String Value;

    private String MeasureType;

    public void setValue(String Value){
        this.Value = Value;
    }
    public String getValue(){
        return this.Value;
    }
    public void setMeasureType(String MeasureType){
        this.MeasureType = MeasureType;
    }
    public String getMeasureType(){
        return this.MeasureType;
    }
}

 
 
class SegregatedQualification
{
    private Institution Institution;

    private SubInstitution SubInstitution;

    private Degree Degree;

    private String FormattedDegreePeriod;
    
   
	private String StartDate;

    private String EndDate;

    private Aggregate Aggregate;

    public void setInstitution(Institution Institution){
        this.Institution = Institution;
    }
    public Institution getInstitution(){
        return this.Institution;
    }
    public void setSubInstitution(SubInstitution SubInstitution){
        this.SubInstitution = SubInstitution;
    }
    public SubInstitution getSubInstitution(){
        return this.SubInstitution;
    }
    public void setDegree(Degree Degree){
        this.Degree = Degree;
    }
    public Degree getDegree(){
        return this.Degree;
    }
    public String getFormattedDegreePeriod() {
		return FormattedDegreePeriod;
	}
	public void setFormattedDegreePeriod(String formattedDegreePeriod) {
		FormattedDegreePeriod = formattedDegreePeriod;
	}
    public void setStartDate(String StartDate){
        this.StartDate = StartDate;
    }
    public String getStartDate(){
        return this.StartDate;
    }
    public void setEndDate(String EndDate){
        this.EndDate = EndDate;
    }
    public String getEndDate(){
        return this.EndDate;
    }
    public void setAggregate(Aggregate Aggregate){
        this.Aggregate = Aggregate;
    }
    public Aggregate getAggregate(){
        return this.Aggregate;
    }
    public String toString(){
    	return getInstitution()+" "+getSubInstitution()+""+getDegree()+""+getFormattedDegreePeriod();
    }
}

 
 
class SegregatedCertification
{
    private String CertificationTitle;

    private String Authority;

    private String CertificationCode;

    private String IsExpiry;

    private String StartDate;

    private String EndDate;

    private String CertificationUrl;

    public void setCertificationTitle(String CertificationTitle){
        this.CertificationTitle = CertificationTitle;
    }
    public String getCertificationTitle(){
        return this.CertificationTitle;
    }
    public void setAuthority(String Authority){
        this.Authority = Authority;
    }
    public String getAuthority(){
        return this.Authority;
    }
    public void setCertificationCode(String CertificationCode){
        this.CertificationCode = CertificationCode;
    }
    public String getCertificationCode(){
        return this.CertificationCode;
    }
    public void setIsExpiry(String IsExpiry){
        this.IsExpiry = IsExpiry;
    }
    public String getIsExpiry(){
        return this.IsExpiry;
    }
    public void setStartDate(String StartDate){
        this.StartDate = StartDate;
    }
    public String getStartDate(){
        return this.StartDate;
    }
    public void setEndDate(String EndDate){
        this.EndDate = EndDate;
    }
    public String getEndDate(){
        return this.EndDate;
    }
    public void setCertificationUrl(String CertificationUrl){
        this.CertificationUrl = CertificationUrl;
    }
    public String getCertificationUrl(){
        return this.CertificationUrl;
    }
    public String toString(){
    	return getCertificationTitle()+" "+getAuthority()+""+getCertificationCode()+""+getIsExpiry()+""+
    getStartDate()+" "+getEndDate()+""+getCertificationUrl();
    }
}

 
 
class SegregatedSkill
{
    private String Skill;

    private String Type;

    private String Evidence;

    private int ExperienceInMonths;

    private String LastUsed;

    private String FormattedName;

    private String Alias;


    private String Ontology;

    public void setSkill(String Skill){
        this.Skill = Skill;
    }
    public String getSkill(){
        return this.Skill;
    }
    public void setType(String Type){
        this.Type = Type;
    }
    public String getType(){
        return this.Type;
    }
    public void setEvidence(String Evidence){
        this.Evidence = Evidence;
    }
    public String getEvidence(){
        return this.Evidence;
    }
    public void setExperienceInMonths(int ExperienceInMonths){
        this.ExperienceInMonths = ExperienceInMonths;
    }
    public int getExperienceInMonths(){
        return this.ExperienceInMonths;
    }
    public void setLastUsed(String LastUsed){
        this.LastUsed = LastUsed;
    }
    public String getLastUsed(){
        return this.LastUsed;
    }
    public void setFormattedName(String FormattedName){
        this.FormattedName = FormattedName;
    }
    public String getFormattedName(){
        return this.FormattedName;
    }
    public void setAlias(String Alias){
        this.Alias = Alias;
    }
    public String getAlias(){
        return this.Alias;
    }
   
    public void setOntology(String Ontology){
        this.Ontology = Ontology;
    }
    public String getOntology(){
        return this.Ontology;
    }
}

 
 
class Employer
{
    private String EmployerName;

    private String FormattedName;

    private int ConfidenceScore;

    public void setEmployerName(String EmployerName){
        this.EmployerName = EmployerName;
    }
    public String getEmployerName(){
        return this.EmployerName;
    }
    public void setFormattedName(String FormattedName){
        this.FormattedName = FormattedName;
    }
    public String getFormattedName(){
        return this.FormattedName;
    }
    public void setConfidenceScore(int ConfidenceScore){
        this.ConfidenceScore = ConfidenceScore;
    }
    public int getConfidenceScore(){
        return this.ConfidenceScore;
    }
}

class RelatedSkills
{
	private String Skill; 
   
	public String getSkill() {
		return Skill;
	}

	public void setSkill(String skill) {
		Skill = skill;
	}

	public String getProficiencyLevel() {
		return ProficiencyLevel;
	}

	public void setProficiencyLevel(String proficiencyLevel) {
		ProficiencyLevel = proficiencyLevel;
	}

	private String ProficiencyLevel;
}
 
class JobProfile
{
    private String Title;

    private String FormattedName;

    private String Alias;
  

   // private String RelatedSkills;
   
    private List <RelatedSkills> RelatedSkills;  
    private int ConfidenceScore;

	

    public void setTitle(String Title){
        this.Title = Title;
    }
    public String getTitle(){
        return this.Title;
    }
    public void setFormattedName(String FormattedName){
        this.FormattedName = FormattedName;
    }
    public String getFormattedName(){
        return this.FormattedName;
    }
    public void setAlias(String Alias){
        this.Alias = Alias;
    }
    public String getAlias(){
        return this.Alias;
    }
    public void setRelatedSkills(List<RelatedSkills> relatedSkills) {
		RelatedSkills = relatedSkills;
	}
    public List<RelatedSkills> getRelatedSkills(){
        return this.RelatedSkills;
    }
   
    public void setConfidenceScore(int ConfidenceScore){
        this.ConfidenceScore = ConfidenceScore;
    }
    public int getConfidenceScore(){
        return this.ConfidenceScore;
    }
    
}

 
class Projects
{
    private String UsedSkills;

    private String ProjectName;

    private String TeamSize;

    public void setUsedSkills(String UsedSkills){
        this.UsedSkills = UsedSkills;
    }
    public String getUsedSkills(){
        return this.UsedSkills;
    }
    public void setProjectName(String ProjectName){
        this.ProjectName = ProjectName;
    }
    public String getProjectName(){
        return this.ProjectName;
    }
    public void setTeamSize(String TeamSize){
        this.TeamSize = TeamSize;
    }
    public String getTeamSize(){
        return this.TeamSize;
    }
}

 
 
class SegregatedExperience
{
    private Employer Employer;

    private JobProfile JobProfile;

    private Location Location;

    private String JobPeriod;
    private String FormattedJobPeriod;

   
	private String StartDate;

    private String EndDate;

    private String IsCurrentEmployer;

    private String JobDescription;

    private List<Projects> Projects;

    public void setEmployer(Employer Employer){
        this.Employer = Employer;
    }
    public Employer getEmployer(){
        return this.Employer;
    }
    public void setJobProfile(JobProfile JobProfile){
        this.JobProfile = JobProfile;
    }
    public JobProfile getJobProfile(){
        return this.JobProfile;
    }
    public void setLocation(Location Location){
        this.Location = Location;
    }
    public Location getLocation(){
        return this.Location;
    }
    public void setJobPeriod(String JobPeriod){
        this.JobPeriod = JobPeriod;
    }
    
    public String getJobPeriod(){
        return this.JobPeriod;
    }
    public String getFormattedJobPeriod() {
		return FormattedJobPeriod;
	}
	public void setFormattedJobPeriod(String formattedJobPeriod) {
		FormattedJobPeriod = formattedJobPeriod;
	}
    public void setStartDate(String StartDate){
        this.StartDate = StartDate;
    }
    public String getStartDate(){
        return this.StartDate;
    }
    public void setEndDate(String EndDate){
        this.EndDate = EndDate;
    }
    public String getEndDate(){
        return this.EndDate;
    }
    public void setIsCurrentEmployer(String IsCurrentEmployer){
        this.IsCurrentEmployer = IsCurrentEmployer;
    }
    public String getIsCurrentEmployer(){
        return this.IsCurrentEmployer;
    }
    public void setJobDescription(String JobDescription){
        this.JobDescription = JobDescription;
    }
    public String getJobDescription(){
        return this.JobDescription;
    }
    public void setProjects(List<Projects> Projects){
        this.Projects = Projects;
    }
    public List<Projects> getProjects(){
        return this.Projects;
    }
}

 
 
class WorkedPeriod
{
    private String TotalExperienceInMonths;

    private String TotalExperienceInYear;

    private String TotalExperienceRange;

    public void setTotalExperienceInMonths(String TotalExperienceInMonths){
        this.TotalExperienceInMonths = TotalExperienceInMonths;
    }
    public String getTotalExperienceInMonths(){
        return this.TotalExperienceInMonths;
    }
    public void setTotalExperienceInYear(String TotalExperienceInYear){
        this.TotalExperienceInYear = TotalExperienceInYear;
    }
    public String getTotalExperienceInYear(){
        return this.TotalExperienceInYear;
    }
    public void setTotalExperienceRange(String TotalExperienceRange){
        this.TotalExperienceRange = TotalExperienceRange;
    }
    public String getTotalExperienceRange(){
        return this.TotalExperienceRange;
    }
    public String toString(){
    	return getTotalExperienceInMonths()+" "+getTotalExperienceInYear()+""+getTotalExperienceRange();
    }
}

 
 
class SegregatedPublication
{
    private String PublicationTitle;

    private String Publisher;

    private String PublicationNumber;

    private String PublicationUrl;

    private String Authors;

    private String Description;

    public void setPublicationTitle(String PublicationTitle){
        this.PublicationTitle = PublicationTitle;
    }
    public String getPublicationTitle(){
        return this.PublicationTitle;
    }
    public void setPublisher(String Publisher){
        this.Publisher = Publisher;
    }
    public String getPublisher(){
        return this.Publisher;
    }
    public void setPublicationNumber(String PublicationNumber){
        this.PublicationNumber = PublicationNumber;
    }
    public String getPublicationNumber(){
        return this.PublicationNumber;
    }
    public void setPublicationUrl(String PublicationUrl){
        this.PublicationUrl = PublicationUrl;
    }
    public String getPublicationUrl(){
        return this.PublicationUrl;
    }
    public void setAuthors(String Authors){
        this.Authors = Authors;
    }
    public String getAuthors(){
        return this.Authors;
    }
    public void setDescription(String Description){
        this.Description = Description;
    }
    public String getDescription(){
        return this.Description;
    }
}

class CurrentLocation
{
    private String City;

    private String State;
    
    private String StateIsoCode;

    private String Country;

    private CountryCode CountryCode;

    public void setCity(String City){
        this.City = City;
    }
    public String getCity(){
        return this.City;
    }
    public void setState(String State){
        this.State = State;
    }
    public String getState(){
        return this.State;
    }
    public void setStateIsoCode(String StateIsoCode){
        this.StateIsoCode = StateIsoCode;
    }
    public String getStateIsoCode(){
        return this.StateIsoCode;
    }
    public void setCountry(String Country){
        this.Country = Country;
    }
    public String getCountry(){
        return this.Country;
    }
    public void setCountryCode(CountryCode CountryCode){
        this.CountryCode = CountryCode;
    }
    public CountryCode getCountryCode(){
        return this.CountryCode;
    }
}

 
class PreferredLocation
{
    private String City;

    private String State;
    
    private String StateIsoCode;
    
    private String Country;

    private CountryCode CountryCode;

    public void setCity(String City){
        this.City = City;
    }
    public String getCity(){
        return this.City;
    }
    public void setState(String State){
        this.State = State;
    }
    public String getState(){
        return this.State;
    }
    public void setStateIsoCode(String StateIsoCode){
        this.StateIsoCode = StateIsoCode;
    }
    public String getStateIsoCode(){
        return this.StateIsoCode;
    }
    public void setCountry(String Country){
        this.Country = Country;
    }
    public String getCountry(){
        return this.Country;
    }
    public void setCountryCode(CountryCode CountryCode){
        this.CountryCode = CountryCode;
    }
    public CountryCode getCountryCode(){
        return this.CountryCode;
    }
}

 
 
class SegregatedAchievement
{
    private String AwardTitle;

    private String Issuer;

    private String AssociatedWith;

    private String IssuingDate;

    private String Description;

    public void setAwardTitle(String AwardTitle){
        this.AwardTitle = AwardTitle;
    }
    public String getAwardTitle(){
        return this.AwardTitle;
    }
    public void setIssuer(String Issuer){
        this.Issuer = Issuer;
    }
    public String getIssuer(){
        return this.Issuer;
    }
    public void setAssociatedWith(String AssociatedWith){
        this.AssociatedWith = AssociatedWith;
    }
    public String getAssociatedWith(){
        return this.AssociatedWith;
    }
    public void setIssuingDate(String IssuingDate){
        this.IssuingDate = IssuingDate;
    }
    public String getIssuingDate(){
        return this.IssuingDate;
    }
    public void setDescription(String Description){
        this.Description = Description;
    }
    public String getDescription(){
        return this.Description;
    }
}

 
 
class EmailInfo
{
    private String EmailTo;

    private String EmailBody;

    private String EmailReplyTo;

    private String EmailSignature;

    private String EmailFrom;

    private String EmailSubject;

    private String EmailCC;

    public void setEmailTo(String EmailTo){
        this.EmailTo = EmailTo;
    }
    public String getEmailTo(){
        return this.EmailTo;
    }
    public void setEmailBody(String EmailBody){
        this.EmailBody = EmailBody;
    }
    public String getEmailBody(){
        return this.EmailBody;
    }
    public void setEmailReplyTo(String EmailReplyTo){
        this.EmailReplyTo = EmailReplyTo;
    }
    public String getEmailReplyTo(){
        return this.EmailReplyTo;
    }
    public void setEmailSignature(String EmailSignature){
        this.EmailSignature = EmailSignature;
    }
    public String getEmailSignature(){
        return this.EmailSignature;
    }
    public void setEmailFrom(String EmailFrom){
        this.EmailFrom = EmailFrom;
    }
    public String getEmailFrom(){
        return this.EmailFrom;
    }
    public void setEmailSubject(String EmailSubject){
        this.EmailSubject = EmailSubject;
    }
    public String getEmailSubject(){
        return this.EmailSubject;
    }
    public void setEmailCC(String EmailCC){
        this.EmailCC = EmailCC;
    }
    public String getEmailCC(){
        return this.EmailCC;
    }
}

 
 
class Recommendations
{
    private String PersonName;

    private String CompanyName;

    private String Relation;

    private String PositionTitle;

    private String Description;

    public void setPersonName(String PersonName){
        this.PersonName = PersonName;
    }
    public String getPersonName(){
        return this.PersonName;
    }
    public void setCompanyName(String CompanyName){
        this.CompanyName = CompanyName;
    }
    public String getCompanyName(){
        return this.CompanyName;
    }
    public void setRelation(String Relation){
        this.Relation = Relation;
    }
    public String getRelation(){
        return this.Relation;
    }
    public void setPositionTitle(String PositionTitle){
        this.PositionTitle = PositionTitle;
    }
    public String getPositionTitle(){
        return this.PositionTitle;
    }
    public void setDescription(String Description){
        this.Description = Description;
    }
    public String getDescription(){
        return this.Description;
    }
}

 
 
class CandidateImage
{
    private String CandidateImageData;

    private String CandidateImageFormat;

    public void setCandidateImageData(String CandidateImageData){
        this.CandidateImageData = CandidateImageData;
    }
    public String getCandidateImageData(){
        return this.CandidateImageData;
    }
    public void setCandidateImageFormat(String CandidateImageFormat){
        this.CandidateImageFormat = CandidateImageFormat;
    }
    public String getCandidateImageFormat(){
        return this.CandidateImageFormat;
    }
}

 
 
class TemplateOutput
{
    private String TemplateOutputFileName;

    private String TemplateOutputData;

    public void setTemplateOutputFileName(String TemplateOutputFileName){
        this.TemplateOutputFileName = TemplateOutputFileName;
    }
    public String getTemplateOutputFileName(){
        return this.TemplateOutputFileName;
    }
    public void setTemplateOutputData(String TemplateOutputData){
        this.TemplateOutputData = TemplateOutputData;
    }
    public String getTemplateOutputData(){
        return this.TemplateOutputData;
    }
}

 
 
class ApiInfo
{
    private String Metered;

    private String CreditLeft;

    private String AccountExpiryDate;

    private String BuildVersion;

    public void setMetered(String Metered){
        this.Metered = Metered;
    }
    public String getMetered(){
        return this.Metered;
    }
    public void setCreditLeft(String CreditLeft){
        this.CreditLeft = CreditLeft;
    }
    public String getCreditLeft(){
        return this.CreditLeft;
    }
    public void setAccountExpiryDate(String AccountExpiryDate){
        this.AccountExpiryDate = AccountExpiryDate;
    }
    public String getAccountExpiryDate(){
        return this.AccountExpiryDate;
    }
    public void setBuildVersion(String BuildVersion){
        this.BuildVersion = BuildVersion;
    }
    public String getBuildVersion(){
        return this.BuildVersion;
    }
}

class Error
{
	private boolean HasError=false;
	public boolean getHasError() {
		return HasError;
	}
	public void setHasError(boolean hasError) {
		HasError = hasError;
	}
	private String ErrorCode;
	
    public String getErrorCode() {
		return ErrorCode;
	}
	public void setErrorCode(String errorCode) {
		ErrorCode = errorCode;
	}
	private String ErrorMsg;
	public String getErrorMsg() {
		return ErrorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		ErrorMsg = errorMsg;
	}
}



 


