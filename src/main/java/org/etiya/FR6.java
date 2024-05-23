package org.etiya;

import org.etiya.constants.Constants;
import org.etiya.methods.Methods;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;


public class FR6 {

    private WebDriver webDriver;
    private Methods methods;


    @BeforeEach
    public void start() throws InterruptedException {
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        methods = new Methods(webDriver);

    }

//    @AfterEach
//    public void end() throws InterruptedException {
//        webDriver.quit();
//        Thread.sleep(1000);
//    }

    @Test
    public void search() throws InterruptedException {


        webDriver.navigate().to(Constants.HOME_URL);

        String expectedResult = "EtiyacrmFrontend";
        String title = webDriver.getTitle();
        Assertions.assertEquals(expectedResult, title);

        Thread.sleep(1000);

        methods.clickElement(Constants.B2C_BTN_XPATH);
        Thread.sleep(1000);

        methods.enterData(Constants.SEARCH_INPUT_XPATH, "Ahmet");
        Thread.sleep(1000);

        methods.clickElement(Constants.SEARCH_BTN_XPATH);
        Thread.sleep(1000);

        methods.clickElement(Constants.CREATE_BTN_XPATH);

        String expectedResult1 = Constants.CREATE_CUSTOMER_URL;
        String actualResult = webDriver.getCurrentUrl();
        Assertions.assertEquals(expectedResult1, actualResult);

        Thread.sleep(1000);

//        webDriver.navigate().to("http://localhost:4200/home");
//
//        String expectedResult = "EtiyacrmFrontend";
//        String title = webDriver.getTitle();
//        Assertions.assertEquals(expectedResult, title);
//
//        Thread.sleep(1000);
//
//        String b2cBtnXpath = "/html/body/app-root/app-main-layout/main/div/div[1]/app-navbar/nav/div[1]";
//        methods.clickElement(b2cBtnXpath);
//        Thread.sleep(1000);
//
//        String searchInput = "/html/body/app-root/app-main-layout/main/div/div[2]/app-search-customer-page/fieldset/div/div[1]/app-search-filter/fieldset/form/input[5]";
//        methods.enterData(searchInput, "Ahmet");
//        Thread.sleep(1000);
//
//        String searchBtn = "/html/body/app-root/app-main-layout/main/div/div[2]/app-search-customer-page/fieldset/div/div[1]/app-search-filter/fieldset/form/div/div[2]/button";
//        methods.clickElement(searchBtn);
//        Thread.sleep(1000);
//
//        String createBtn = "/html/body/app-root/app-main-layout/main/div/div[2]/app-search-customer-page/fieldset/div/div[2]/app-customer-not-found/div/div/button";
//        methods.clickElement(createBtn);
//
//        String expectedResult1 = "http://localhost:4200/create-customer";
//        String actualResult = webDriver.getCurrentUrl();
//        Assertions.assertEquals(expectedResult1, actualResult);
//
//        Thread.sleep(1000);


    }

    @Test
    public void succesfullcreate() throws InterruptedException {

        webDriver.get(Constants.CREATE_CUSTOMER_URL);

        methods.enterData(Constants.FIRST_NAME_INPUT_XPATH, "Gülsenem");
        Thread.sleep(1000);

        methods.enterData(Constants.LAST_NAME_INPUT_XPATH, "Güven");
        Thread.sleep(1000);

        methods.enterData(Constants.NAT_ID_INPUT_XPATH, "30685743916");

        methods.enterData(Constants.BIRTH_DATE_INPUT_XPATH, "06.15.2000");

        methods.selectDropdownByValue(Constants.GENDER_DROPDOWN_XPATH, "Female");

        List<String> expectedOptions = Arrays.asList("Select Gender", "Male", "Female", "Other");
        List<String> actualOptions = methods.getDropdownOptions(Constants.GENDER_DROPDOWN_XPATH);
        Assertions.assertEquals(expectedOptions, actualOptions);

        Thread.sleep(1000);

        methods.clickElement(Constants.NEXT_BTN_XPATH);
        Thread.sleep(1000);

        methods.clickElement(Constants.ADD_NEW_ADDRESS_BTN_XPATH);
        Thread.sleep(1000);

        methods.selectDropdownByVisibleText(Constants.CITY_DROPDOWN_XPATH, "İstanbul");

        List<String> expectedOptions1 = Arrays.asList("Select City", "İstanbul");
        List<String> actualOptions1 = methods.getDropdownOptions(Constants.CITY_DROPDOWN_XPATH);
        Assertions.assertEquals(expectedOptions1, actualOptions1);

        methods.selectDropdownByVisibleText(Constants.DISTRICT_DROPDOWN_XPATH, "Kadıköy");
        Thread.sleep(2000);

        methods.enterData(Constants.STREET_INPUT_XPATH, "202 SK.");
        Thread.sleep(2000);

        methods.enterData(Constants.HOUSE_INPUT_XPATH, "173");
        Thread.sleep(2000);

        methods.enterData(Constants.DESCRIPTION_INPUT_XPATH, "Yeni ev adresi");

        methods.clickElement(Constants.SAVE_BTN_XPATH);
        Thread.sleep(2000);

        methods.clickElement(Constants.CHECKBOX_BTN_XPATH);
        Thread.sleep(2000);

        methods.clickElement(Constants.NEXT_BTN_2_XPATH);
        Thread.sleep(2000);

        methods.enterData(Constants.EMAIL_INPUT_XPATH, "embiye@gmail.com");
        Thread.sleep(2000);

        methods.enterData(Constants.MOBILE_PHONE_INPUT_XPATH, "5546457892");
        Thread.sleep(2000);

        methods.clickElement(Constants.CREATE_BTN_XPATH1);
        Thread.sleep(2000);

        webDriver.get(Constants.HOME_URL);


//
//        String url = "http://localhost:4200/create-customer";
//        webDriver.get(url);
//
//        String firstNameInputXpath = "//*[@id=\"first-name\"]";
//        methods.enterData(firstNameInputXpath, "Gülsenem");
//        Thread.sleep(1000);
//
//        String lastNameInputXpath = "//*[@id=\"last-name\"]";
//        methods.enterData(lastNameInputXpath, "Güven");
//        Thread.sleep(1000);
//
//        String natIdInputXpath = "//*[@id=\"nationality-id\"]";
//        methods.enterData(natIdInputXpath, "30685743916");
//
//        String birthDateInputXpath = "//*[@id=\"birth-date\"]";
//        methods.enterData(birthDateInputXpath, "06.15.2000");
//
//        String genderDropdownXpath = "//*[@id=\"gender\"]";
//        methods.selectDropdownByValue(genderDropdownXpath, "Female");
//
//        List<String> expectedOptions = Arrays.asList("Select Gender", "Male", "Female", "Other");
//        List<String> actualOptions = methods.getDropdownOptions(genderDropdownXpath);
//        Assertions.assertEquals(expectedOptions, actualOptions);
//
//        Thread.sleep(1000);
//
//        String nextBtnXpath = "/html/body/app-root/app-create-customer-layout/main/div/app-create-customer-page/div/app-demographic-form/div/form/div[5]/button[2]";
//        methods.clickElement(nextBtnXpath);
//        Thread.sleep(1000);
//
//        String addNewAddressBtnXpath = "/html/body/app-root/app-create-customer-layout/main/div/app-create-customer-page/div/app-address-info/div/div/div[1]/div/div/button";
//        methods.clickElement(addNewAddressBtnXpath);
//        Thread.sleep(1000);
//
//        String cityDropdownXpath = "//*[@id=\"city\"]";
//        methods.selectDropdownByVisibleText(cityDropdownXpath, "İstanbul");
//
//        List<String> expectedOptions1 = Arrays.asList("Select City", "İstanbul");
//        List<String> actualOptions1 = methods.getDropdownOptions(cityDropdownXpath);
//        Assertions.assertEquals(expectedOptions1, actualOptions1);
//
//        String districtDropdownXpath = "//*[@id=\"district\"]";
//        methods.selectDropdownByVisibleText(districtDropdownXpath, "Kadıköy");
//        Thread.sleep(2000);
//
//        String streetInputXpath = "//*[@id=\"street\"]";
//        methods.enterData(streetInputXpath, "202 SK.");
//        Thread.sleep(2000);
//
//        String houseInputXpath = "//*[@id=\"flat\"]";
//        methods.enterData(houseInputXpath, "173");
//        Thread.sleep(2000);
//
//        String descriptionInputXpath = "//*[@id=\"description\"]";
//        methods.enterData(descriptionInputXpath, "Yeni ev adresi");
//
//        String saveBtnXpath = "//*[@id=\"customerAddressModal\"]/div/div/div[2]/form/div[3]/button[2]";
//        methods.clickElement(saveBtnXpath);
//        Thread.sleep(2000);
//
//        String checkboxBtnXpath = "//*[@id=\"selectAddress0\"]";
//        methods.clickElement(checkboxBtnXpath);
//        Thread.sleep(2000);
//
//        String nextBtn2Xpath = "/html/body/app-root/app-create-customer-layout/main/div/app-create-customer-page/div/app-address-info/div/div/div[2]/button[2]";
//        methods.clickElement(nextBtn2Xpath);
//        Thread.sleep(2000);
//
//        String emailInputXpath = "//*[@id=\"email\"]";
//        methods.enterData(emailInputXpath, "embiye@gmail.com");
//        Thread.sleep(2000);
//
//        String mobilePhoneInputXpath = "//*[@id=\"mobile-phone\"]";
//        methods.enterData(mobilePhoneInputXpath, "5546457892");
//        Thread.sleep(2000);
//
//        String createBtnXpath = "/html/body/app-root/app-create-customer-layout/main/div/app-create-customer-page/div/app-contact-medium/div/form/div[3]/button[2]";
//        methods.clickElement(createBtnXpath);
//        Thread.sleep(2000);
//
//        String url1 = "http://localhost:4200/home";
//        webDriver.get(url);


           }


    @Test
    public void invalidNatId() throws InterruptedException {

        webDriver.get(Constants.CREATE_CUSTOMER_URL);

        methods.enterData(Constants.FIRST_NAME_INPUT_XPATH, "Mahmut");
        Thread.sleep(2000);

        methods.enterData(Constants.LAST_NAME_INPUT_XPATH, "Köstem");
        Thread.sleep(2000);

        methods.enterData(Constants.BIRTH_DATE_INPUT_XPATH, "06.01.1993");
        Thread.sleep(2000);

        methods.enterData(Constants.NAT_ID_INPUT_XPATH, "12312312312");
        Thread.sleep(2000);

        methods.selectDropdownByValue(Constants.GENDER_DROPDOWN_XPATH, "Male");

        List<String> expectedOptions = Arrays.asList("Select Gender", "Male", "Female", "Other");
        List<String> actualOptions = methods.getDropdownOptions(Constants.GENDER_DROPDOWN_XPATH);
        Assertions.assertEquals(expectedOptions, actualOptions);
        Thread.sleep(1000);

        String actualMessage = methods.getElementText(Constants.ERROR_MESSAGE_XPATH);
        Assertions.assertEquals(Constants.INVALID_NAT_ID_MESSAGE, actualMessage);

//            String url = "http://localhost:4200/create-customer";
//            webDriver.get(url);
//
//        String firstNameInputXpath = "//*[@id=\"first-name\"]";
//        methods.enterData(firstNameInputXpath, "Mahmut");
//        Thread.sleep(2000);
//
//        String lastNameInputXpath = "//*[@id=\"last-name\"]";
//        methods.enterData(lastNameInputXpath, "Köstem");
//        Thread.sleep(2000);
//
//        String birthDateInputXpath = "//*[@id=\"birth-date\"]";
//        methods.enterData(birthDateInputXpath, "06.01.1993");
//        Thread.sleep(2000);
//
//        String natIdInputXpath = "//*[@id=\"nationality-id\"]";
//        methods.enterData(natIdInputXpath, "12312312312");
//        Thread.sleep(2000);
//
//        String genderDropdownXpath = "//*[@id=\"gender\"]";
//        methods.selectDropdownByValue(genderDropdownXpath, "Male");
//
//        List<String> expectedOptions = Arrays.asList("Select Gender", "Male", "Female", "Other");
//        List<String> actualOptions = methods.getDropdownOptions(genderDropdownXpath);
//        Assertions.assertEquals(expectedOptions, actualOptions);
//        Thread.sleep(1000);
//
//        String errorMessageXpath = "/html/body/app-root/app-create-customer-layout/main/div/app-create-customer-page/div/app-demographic-form/div[2]/app-warning-popup";
//        String expectedMessage = "This Nationality ID is not valid.";
//        String actualMessage = methods.getElementText(errorMessageXpath);
//        Assertions.assertEquals(expectedMessage, actualMessage);

    }

    @Test
    public void Mandatoryfields() throws InterruptedException {

        webDriver.get(Constants.CREATE_CUSTOMER_URL);

        methods.enterData(Constants.FIRST_NAME_INPUT_XPATH, "Mahmut");
        Thread.sleep(1000);

        methods.enterData(Constants.LAST_NAME_INPUT_XPATH, "Köstem");
        Thread.sleep(1000);

        methods.enterData(Constants.BIRTH_DATE_INPUT_XPATH, "06.01.1993");
        Thread.sleep(1000);

        methods.selectDropdownByValue(Constants.GENDER_DROPDOWN_XPATH, "Male");

        List<String> expectedOptions = Arrays.asList("Select Gender", "Male", "Female", "Other");
        List<String> actualOptions = methods.getDropdownOptions(Constants.GENDER_DROPDOWN_XPATH);
        Assertions.assertEquals(expectedOptions, actualOptions);
        Thread.sleep(5000);

        methods.enterData(Constants.NAT_ID_INPUT_XPATH, "32935019024");
        methods.clearElement(Constants.NAT_ID_INPUT_XPATH);

        methods.sendKeysToElement(Constants.NAT_ID_INPUT_XPATH, Keys.CONTROL);
        methods.sendKeysToElement(Constants.NAT_ID_INPUT_XPATH, Keys.DELETE);
        methods.clickElement(Constants.FIRST_NAME_INPUT_XPATH);

        methods.clearElement(Constants.FIRST_NAME_INPUT_XPATH);



//        methods.sendKeysToElement(Constants.NAT_ID_INPUT_XPATH, Keys.TAB);

        Thread.sleep(5000);

        String actualMessage = methods.getElementText(Constants.ERROR_MESSAGE_XPATH);
        Assertions.assertEquals(Constants.MANDATORY_FIELD_MESSAGE, actualMessage);

        Thread.sleep(5000);

//        String url = "http://localhost:4200/create-customer";
//        webDriver.get(url);
//
//        String firstNameInputXpath = "//*[@id=\"first-name\"]";
//        methods.enterData(firstNameInputXpath, "Mahmut");
//        Thread.sleep(1000);
//
//        String lastNameInputXpath = "//*[@id=\"last-name\"]";
//        methods.enterData(lastNameInputXpath, "Köstem");
//        Thread.sleep(1000);
//
//        String birthDateInputXpath = "//*[@id=\"birth-date\"]";
//        methods.enterData(birthDateInputXpath, "06.01.1993");
//        Thread.sleep(1000);
//
//        String genderDropdownXpath = "//*[@id=\"gender\"]";
//        methods.selectDropdownByValue(genderDropdownXpath, "Male");
//
//        List<String> expectedOptions = Arrays.asList("Select Gender", "Male", "Female", "Other");
//        List<String> actualOptions = methods.getDropdownOptions(genderDropdownXpath);
//        Assertions.assertEquals(expectedOptions, actualOptions);
//
//        String natIdInputXpath = "//*[@id=\"nationality-id\"]";
//        methods.enterData(natIdInputXpath, "32935019024");
//        methods.clearElement(natIdInputXpath);
//
//        methods.sendKeysToElement(natIdInputXpath, Keys.CONTROL);
//        methods.sendKeysToElement(natIdInputXpath, Keys.DELETE);
//
//
//        Thread.sleep(5000);
//
//        methods.sendKeysToElement(natIdInputXpath, Keys.TAB);
//
//        Thread.sleep(5000);
//
//        String errorMessageXpath = "/html/body/app-root/app-create-customer-layout/main/div/app-create-customer-page/div/app-demographic-form/div[2]/app-warning-popup";
//        String expectedMessage = "This field is mandatory.";
//        String actualMessage;
//        actualMessage = methods.getElementText(errorMessageXpath);
//        Assertions.assertEquals(expectedMessage, actualMessage);
//
//        Thread.sleep(5000);


    }}
