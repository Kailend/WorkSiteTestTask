package pageObjects;

import core.MetodFactors;
import dataForWork.DataUserFirst;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Kailend on 25.11.2016.
 */
public class FormUser extends MetodFactors{
    private By editPersonalDataButton=By.xpath(".//a[@data-type=\"personal_data\"]");

    private By addSocialNetworkButton=By.xpath(".//a[@data-type=\"add_new_social_network\"]");
    private By networkDropDownList=By.xpath(".//div[@class=\"window_popup section\"][@style=\"\"]//*[@id='UsersSocialNetworks_network_id']");
    private By myNetworkTextBox=By.xpath(".//div[@class=\"window_popup section\"][@style=\"\"]//*[@id='UsersSocialNetworks_network_url']");
    private By saveNetworkButton=By.xpath(".//div[@class=\"window_popup section\"][@style=\"\"]//button");

    private By editSocialNetwork=By.xpath(".//a[@data-type=\"social_network_edit\"]");
    private By deleteSocialNetwork=By.xpath(".//*[@class=\"window_popup section\"]//a[@class=\"delete_link link_resume_edit_ajax\"]");

    private By addPositionButton=By.xpath(".//*[@class=\"position\"]/a");

    //window position
    private By positionTextBox=By.xpath(".//*[@class=\"window_popup section\"][@style=\"\"]//*[@id=\"Resume_position_name\"]");
    private By scheduleWorkDropDownList=By.xpath(".//*[@class=\"window_popup section\"][@style=\"\"]//*[@id=\"Resume_availability_id\"]");
    private By salaryTextBox=By.xpath(".//*[@class=\"window_popup section\"][@style=\"\"]//*[@id=\"Resume_salary\"]");
    private By moveYesRadioButton=By.xpath(".//*[@class=\"window_popup section\"][@style=\"\"]//label[@for=\"Resume_move_1\"]");
    private By moveNoRadioButton=By.xpath(".//*[@class=\"window_popup section\"][@style=\"\"]//label[@for=\"Resume_move_0\"]");
    private By buisenessTripYesRadioButton=By.xpath(".//*[@class=\"window_popup section\"][@style=\"\"]//label[@for=\"Resume_ready_for_business_trip_1\"]");
    private By buisenessTripNoRadioButton=By.xpath(".//*[@class=\"window_popup section\"][@style=\"\"]//label[@for=\"Resume_ready_for_business_trip_0\"]");
    private By savePositionButton=By.xpath(".//*[@class=\"window_popup section\"][@style=\"\"]//*[@type=\"submit\"]");

    private By purposeButton=By.xpath(".//a[contains(@class,\"purpose popup_link\")]");
    //frame
    private By frameElement=By.xpath("//*[@id=\"Resume_purpose_ifr\"]");
    private By fieldTextBoxFrame=By.xpath("//*[@id=\"tinymce\"]");
    private By saveButtonFrame=By.xpath(".//*[@class=\"window_popup section\"][@style=\"\"]//button[@type=\"submit\"]");

    private By addEducationButton=By.xpath(".//a[contains(@class,\"gtm-education-add\")]");
    //education window
    private By educationDropDonsList=By.xpath(".//*[@class=\"window_popup section\"][@style=\"\"]//*[@id='ResumeEducation_type_education']");
    private By institutionTextBox=By.xpath(".//*[@class=\"window_popup section\"][@style=\"\"]//*[@id='ResumeEducation_organization_name']");
    private By specialtyTextBox=By.xpath(".//*[@class=\"window_popup section\"][@style=\"\"]//*[@id='ResumeEducation_department']");
    private By cityEducationDropDownList=By.xpath(".//*[@class=\"window_popup section\"][@style=\"\"]//*[@id='ResumeEducation_city_id']");
    private By diplomaTextBox=By.xpath(".//*[@class=\"window_popup section\"][@style=\"\"]//*[@id='ResumeEducation_diploma']");
    private By yearEndEducation=By.xpath(".//*[@class=\"window_popup section\"][@style=\"\"]//select[@id=\"\"]");
    private By studyNowCheckBox=By.xpath(".//*[@class=\"window_popup section\"][@style=\"\"]//label[contains(@for,\"now_i_study\")]");
    private By saveEducationButton=By.xpath(".//*[@class=\"window_popup section\"][@style=\"\"]//button[@type=\"submit\"]");

    private By addLanguageButton=By.xpath(".//a[contains(@class,\"gtm-language-add\")]");
    //language button
    private By chooseLanguageDropDownList=By.xpath(".//*[@class=\"window_popup section\"][@style=\"\"]//*[@id='ResumeLanguages_language_id']");
    private By setLanguageLevelDropDownList=By.xpath(".//*[@class=\"window_popup section\"][@style=\"\"]//*[@id='ResumeLanguages_possession']");
    private By saveLanguageButtone=By.xpath(".//*[@class=\"window_popup section\"][@style=\"\"]//button[@type=\"submit\"]");

    private By addCoursesButton=By.xpath(".//a[contains(@class,\"gtm-training-add\")]");
    //courses window
    private By nameCourseTextBox=By.xpath(".//*[@class=\"window_popup section\"][@style=\"\"]//*[@id='ResumeCourse_title']");
    private By organazerCourseTextBox=By.xpath(".//*[@class=\"window_popup section\"][@style=\"\"]//*[@id='ResumeCourse_organizer']");
    private By siteOfOrganizerTextBox=By.xpath(".//*[@class=\"window_popup section\"][@style=\"\"]//*[@id='ResumeCourse_url']");
    private By yearEndCoursesDropDownList=By.xpath(".//*[@class=\"window_popup section\"][@style=\"\"]//*[@id='ResumeCourse_graduation_year']");
    private By saveCourseButton=By.xpath(".//*[@class=\"window_popup section\"][@style=\"\"]//button[@type=\"submit\"]");

    private By addExperienceButton=By.xpath(".//a[contains(@class,\"experience-add\")]");
    //experience window
    private By nameCompanyTextBox=By.xpath(".//*[@class=\"window_popup section\"][@style=\"\"]//*[@id='ResumeExperience_organization_name']");
    private By cityExperienceDropDownList=By.xpath(".//*[@class=\"window_popup section\"][@style=\"\"]//*[@id='ResumeExperience_city_id']");
    private By siteExperienceTextBox=By.xpath(".//*[@class=\"window_popup section\"][@style=\"\"]//*[@id='ResumeExperience_organization_url']");
    private By positionExperienceTextBox=By.xpath(".//*[@class=\"window_popup section\"][@style=\"\"]//*[@id='ResumeExperience_position_name']");
    private By periodMonthFromDropDownList=By.xpath(".//*[@class=\"window_popup section\"][@style=\"\"]//*[@id='ResumeExperience_month_of']");
    private By periodYearFromDropDownList=By.xpath(".//*[@class=\"window_popup section\"][@style=\"\"]//*[@id='ResumeExperience_year_of']");
    private By periodMonthToDropDownList=By.xpath(".//*[@class=\"window_popup section\"][@style=\"\"]//*[@id='ResumeExperience_month_to']");
    private By periodYearToDropDownList=By.xpath(".//*[@class=\"window_popup section\"][@style=\"\"]//*[@id='ResumeExperience_year_to']");
    private By presentDayCheckBox=By.xpath(".//*[@class=\"window_popup section\"][@style=\"\"]//label[contains(@for,\"for_present\")]");
    private By saveExperinceButton=By.xpath(".//*[@class=\"window_popup section\"][@style=\"\"]//button[@type=\"submit\"]");

    private By skillsTextBox=By.id("title");
    private By addSkillsButton=By.xpath(".//a[contains(@class,\"add-link-skill\")]");

    private By additionalInformationButton=By.xpath(".//*[@data-type=\"key_skill\"]");
    // frame additional info
    private By saveAdditionalButton=By.xpath(".//*[@class=\"window_popup section\"][@style=\"\"]//button[@type=\"submit\"]");

    private By addDriverDocumentButton=By.xpath(".//a[@data-type=\"driver_licence\"]");
    // driver window
    private By carHasRadioButton=By.xpath(".//label[@for=\"UsersInfo_has_car_1\"]");
    private By carNoHasRadioButton=By.xpath(".//label[@for=\"UsersInfo_has_car_0\"]");
    private By saveDriverButton=By.xpath(".//*[@class=\"window_popup section\"][@style=\"\"]//button[@type=\"submit\"]");

    //Settings see resume
    private By seeAllRadioButton=By.xpath(".//label[@for=\"Resume_status_0\"]");
    private By seeOnlyRegistrCompanyRadioButton=By.xpath(".//label[@for=\"Resume_status_1\"]");
    private By noOneSeeRadioButton=By.xpath(".//label[@for=\"Resume_status_2\"]");
    private By doneButton=By.xpath(".//*[@class=\"btn_block\"]/button");

    WebDriverWait webDriverWait=new WebDriverWait(driver,2);


    @Step
    public void clickAddSocialNetwork(){
        clickButton(addSocialNetworkButton);
    }
    @Step
    public void setSocialNetwork(String network){
        clickButton(networkDropDownList);
        clickButton(By.xpath(".//*[@id='UsersSocialNetworks_network_id']/option[text()=\""+network+"\"]"));
    }
    @Step
    public void inputSocialNetworh(String network){
        type(myNetworkTextBox,network);
    }
    @Step
    public void clickSaveNetwork(){
        clickButton(saveNetworkButton);
        webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class=\"popup_content b-preload-block\"]")));
    }

    @Step
    public void setDeleteSocialNetwork(){
        clickButton(editSocialNetwork);
        clickButton(deleteSocialNetwork);
        driver.switchTo().alert().accept();
        webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class=\"popup_content b-preload-block\"]")));
    }

    @Step
    public void clickEditPersonalData(){
        clickButton(editPersonalDataButton);
    }
    @Step
    public void clickAddPosition(){
        clickButton(addPositionButton);
    }
    @Step
    public void inputPosition(String position){
        type(positionTextBox,position);
    }
    @Step
    public void setSchedule(String schedule){
        clickButton(scheduleWorkDropDownList);
        clickButton(By.xpath(".//*[@id='Resume_availability_id']/option[text()=\""+schedule+"\"]"));
    }
    @Step
    public void setLevelSalary(String salary){
        type(salaryTextBox,salary);
    }
    @Step
    public void setOpportunityToMove(String str){
        switch (str){
            case "y":clickButton(moveYesRadioButton);break;
            case "n":clickButton(moveNoRadioButton);break;
        }
    }
    @Step
    public void setOpportunityBuisnessTrip(String str){
        switch (str){
            case "y":clickButton(buisenessTripYesRadioButton);break;
            case "n":clickButton(buisenessTripNoRadioButton);break;
        }
    }
    @Step
    public void clickSavePosition(){
        clickButton(savePositionButton);
        webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class=\"popup_content b-preload-block\"]")));
    }
    @Step
    public void clickPurposeButton() {
        clickButton(purposeButton);
    }
    @Step
    public void inputPorpose(String str){

        WebElement frameElem=driver.findElement(frameElement);
        driver.switchTo().frame(frameElem);
        type(fieldTextBoxFrame,str);
           driver.switchTo().defaultContent();
    }
    @Step
    public void clickSavePurpose(){
        clickButton(saveButtonFrame);
    }
    @Step
    public void clickAddAducation(){
        //webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(saveButtonFrame));
        webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class=\"popup_content b-preload-block\"]")));
        clickButton(addEducationButton);
    }
    @Step
    public void setEducation(int education){
        clickButton(educationDropDonsList);
        clickButton(By.xpath(".//*[@id='ResumeEducation_type_education']/option[@value=\""+education+"\"]"));
    }
    @Step
    public void inputInstitution(String str){
        type(institutionTextBox,str);
    }
    @Step
    public void inputSpeciality(String str){
        type(specialtyTextBox,str);
    }
    @Step
    public void setCityStudy(String city){
        clickButton(cityEducationDropDownList);
        clickButton(By.xpath(".//*[@id='ResumeEducation_city_id']/option[text()=\""+city+"\"]"));
    }
    @Step
    public void inputDiplom(String diplom){
        type(diplomaTextBox,diplom);
    }
    @Step
    public void setYearEndEducation(int year){
        clickButton(yearEndEducation);
        clickButton(By.xpath(".//select[@id=\"\"]/option[text()=\""+year+"\"]"));
    }
    @Step
    public void setStudyNowCheckBox(){
        clickButton(studyNowCheckBox);
    }
    @Step
    public void saveEducation(){
        clickButton(saveEducationButton);
        webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class=\"popup_content b-preload-block\"]")));
    }
    @Step
    public void clickAddLanguage(){

        clickButton(addLanguageButton);
    }
    @Step
    public void setLanguage(String str){
        clickButton(chooseLanguageDropDownList);
        clickButton(By.xpath(".//*[@id='ResumeLanguages_language_id']/option[text()=\""+str+"\"]"));
    }
    @Step
    public void setSetLanguageLeve(String str){
        clickButton(setLanguageLevelDropDownList);
        clickButton(By.xpath(".//*[@id='ResumeLanguages_possession']/option[@value=\""+str+"\"]"));

    }
    @Step
    public void clickSaveLanguageButtone(){
        clickButton(saveLanguageButtone);
        webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class=\"popup_content b-preload-block\"]")));
    }
    @Step
    public void clickAddCourses(){

        clickButton(addCoursesButton);
    }
    @Step
    public void inputCourseName(String course){
        type(nameCourseTextBox,course);
    }
    @Step
    public void inputOrganizer(String organizer){
        type(organazerCourseTextBox,organizer);
    }
    @Step
    public void inputSiteOrganizer(String str){
        type(siteOfOrganizerTextBox,str);
    }
    @Step
    public void setYearEndCourse(int year){
        clickButton(yearEndCoursesDropDownList);
        clickButton(By.xpath(".//*[@id='ResumeCourse_graduation_year']/option[@value=\""+year+"\"]"));
    }
    @Step
    public void setSaveCourseButton(){
        clickButton(saveCourseButton);
        webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class=\"popup_content b-preload-block\"]")));

    }
    @Step
    public void clickAddExperience(){
        clickButton(addExperienceButton);
    }
    @Step
    public void inputNameCompany(String company){
        type(nameCompanyTextBox,company);
    }
    @Step
    public void setCityExperience(String cityExperience){
        clickButton(cityExperienceDropDownList);
        clickButton(By.xpath(".//*[@id='ResumeExperience_city_id']/option[text()=\""+cityExperience+"\"]"));
    }
    @Step
    public void inputSiteCompany(String site){
        type(siteExperienceTextBox,site);
    }
    @Step
    public void inputPositionExperience(String position){
        type(positionExperienceTextBox,position);
    }
    @Step
    public void setMonthExperienceFrom(String month){
        clickButton(periodMonthFromDropDownList);
        clickButton(By.xpath(".//*[@id='ResumeExperience_month_of']/option[@value=\""+month+"\"]"));
    }
    @Step
    public void setYearExpierenceFrom(int year){
        clickButton(periodYearFromDropDownList);
        clickButton(By.xpath(".//*[@id='ResumeExperience_year_of']/option[@value=\""+year+"\"]"));
    }
    @Step
    public void setMonthExperienceTo(String month){
        clickButton(periodMonthToDropDownList);
        clickButton(By.xpath(".//*[@id='ResumeExperience_month_to']/option[@value=\""+month+"\"]"));
    }
    @Step
    public void setYearExpierenceTo(int year){
        clickButton(periodYearToDropDownList);
        clickButton(By.xpath(".//*[@id='ResumeExperience_year_to']/option[@value=\""+year+"\"]"));
    }
    @Step
    public void clickForPresentDay(){
        clickButton(presentDayCheckBox);
    }
    @Step
    public void inputSummeryExperience(String str){
        WebElement frameElem=driver.findElement(By.xpath("//*[@id=\"ResumeExperience_role_ifr\"]"));
        driver.switchTo().frame(frameElem);
        type(fieldTextBoxFrame,str);
        driver.switchTo().defaultContent();

    }
    @Step
    public void clickSaveExperience(){
        clickButton(saveExperinceButton);
        webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class=\"popup_content b-preload-block\"]")));
    }
    @Step
    public void addSkill(String skill){
        type(skillsTextBox,skill);
        clickButton(addSkillsButton);
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),\""+skill+"\")]")));
    }
    @Step
    public void clickAdditionalInfo(){
        clickButton(additionalInformationButton);
    }
    @Step
    public void inputAdditionalInfo(String str){
        WebElement frameElem=driver.findElement(By.xpath("//*[@id=\"Resume_key_skills_ifr\"]"));
        driver.switchTo().frame(frameElem);
        type(fieldTextBoxFrame,str);
        driver.switchTo().defaultContent();
    }
    @Step
    public void clickSaveAdditionalButton(){
        clickButton(saveAdditionalButton);
        webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class=\"popup_content b-preload-block\"]")));
    }
    @Step
    public void clickAddDriverDocument(){
        clickButton(addDriverDocumentButton);
    }
    @Step
    public void setCategoryDryveDocument(Character ch){
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@class=\"window_popup section\"][@style=\"\"]")));
        clickButton(By.xpath(".//label[text()=\""+ch+"\"]"));
    }
    @Step
    public void setPresentCar(String str){
        switch (str){
            case "y":clickButton(carHasRadioButton);break;
            case "n":clickButton(carNoHasRadioButton);break;
        }
    }
    @Step
    public void clickSaveDriver(){
        clickButton(saveDriverButton);
        webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class=\"popup_content b-preload-block\"]")));
    }
    @Step
    public void setCanSeeAll(){
        clickButton(seeAllRadioButton);
    }
    @Step
    public void setCanSeeOnlyRegistrUser(){
        clickButton(seeOnlyRegistrCompanyRadioButton);
    }
    @Step
    public void setCanTSee(){
        clickButton(noOneSeeRadioButton);
    }
    @Step
    public void clickDoneButton(){
        clickButton(doneButton);
    }
    @Step
    public void fillAllForm(DataUserFirst user) {
        clickAddSocialNetwork();
        setSocialNetwork(user.network);
        inputSocialNetworh(user.myNetworkUrl);
        clickSaveNetwork();
        clickAddPosition();
        inputPosition(user.positionForSearch);
        setSchedule(user.scheduleForWork);
        setLevelSalary(user.salary);
        setOpportunityToMove(user.moveOpportunity);
        setOpportunityBuisnessTrip(user.buisnessTrip);
        clickSavePosition();
        clickPurposeButton();
        inputPorpose(user.purpose);
        clickSavePurpose();
        clickAddAducation();
        setEducation(user.education);
        inputInstitution(user.institute);
        inputSpeciality(user.speciality);
        setCityStudy(user.cityEducation);
        inputDiplom(user.diplom);
        setYearEndEducation(user.yearEndStudy);
        setStudyNowCheckBox();
        saveEducation();
        clickAddLanguage();
        setLanguage(user.language);
        setSetLanguageLeve(user.languageLevel);
        clickSaveLanguageButtone();
        clickAddCourses();
        inputCourseName(user.courseName);
        inputOrganizer(user.organizerCourse);
        inputSiteOrganizer(user.siteOrganizator);
        setYearEndCourse(user.yearEndCourse);
        setSaveCourseButton();
        clickAddExperience();
        inputNameCompany(user.companyPrevious);
        setCityExperience(user.cityWorkPrevios);
        inputSiteCompany(user.siteWorkPrevios);
        inputPositionExperience(user.positionPrevios);
        setMonthExperienceFrom(user.monthExperienceFrom);
        setYearExpierenceFrom(user.yearExperienceFrom);
        setMonthExperienceTo(user.monthExperienceTo);
        setYearExpierenceTo(user.yearExperienceTo);
        clickForPresentDay();
        inputSummeryExperience(user.summeryExperience);
        clickSaveExperience();
        addSkill(user.skils);
        clickAdditionalInfo();
        inputAdditionalInfo(user.additionaInfo);
        clickSaveAdditionalButton();
        clickAddDriverDocument();
        setCategoryDryveDocument(user.categoryDriveDocument);
        setPresentCar(user.carPresent);
        clickSaveDriver();
        setCanTSee();
        clickDoneButton();
    }


}
