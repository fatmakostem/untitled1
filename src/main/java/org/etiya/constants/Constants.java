package org.etiya.constants;

public class Constants {
        // URLs
        public static final String HOME_URL = "http://localhost:4200/home";
        public static final String CREATE_CUSTOMER_URL = "http://localhost:4200/create-customer";

        // XPath Values
        public static final String B2C_BTN_XPATH = "/html/body/app-root/app-main-layout/main/div/div[1]/app-navbar/nav/div[1]";
        public static final String SEARCH_INPUT_XPATH = "/html/body/app-root/app-main-layout/main/div/div[2]/app-search-customer-page/fieldset/div/div[1]/app-search-filter/fieldset/form/input[5]";
        public static final String SEARCH_BTN_XPATH = "/html/body/app-root/app-main-layout/main/div/div[2]/app-search-customer-page/fieldset/div/div[1]/app-search-filter/fieldset/form/div/div[2]/button";
        public static final String CREATE_BTN_XPATH = "/html/body/app-root/app-main-layout/main/div/div[2]/app-search-customer-page/fieldset/div/div[2]/app-customer-not-found/div/div/button";

        public static final String FIRST_NAME_INPUT_XPATH = "//*[@id=\"first-name\"]";
        public static final String LAST_NAME_INPUT_XPATH = "//*[@id=\"last-name\"]";
        public static final String NAT_ID_INPUT_XPATH = "//*[@id=\"nationality-id\"]";
        public static final String BIRTH_DATE_INPUT_XPATH = "//*[@id=\"birth-date\"]";
        public static final String GENDER_DROPDOWN_XPATH = "//*[@id=\"gender\"]";
        public static final String NEXT_BTN_XPATH = "/html/body/app-root/app-create-customer-layout/main/div/app-create-customer-page/div/app-demographic-form/div/form/div[5]/button[2]";
        public static final String ADD_NEW_ADDRESS_BTN_XPATH = "/html/body/app-root/app-create-customer-layout/main/div/app-create-customer-page/div/app-address-info/div/div/div[1]/div/div/button";
        public static final String CITY_DROPDOWN_XPATH = "//*[@id=\"city\"]";
        public static final String DISTRICT_DROPDOWN_XPATH = "//*[@id=\"district\"]";
        public static final String STREET_INPUT_XPATH = "//*[@id=\"street\"]";
        public static final String HOUSE_INPUT_XPATH = "//*[@id=\"flat\"]";
        public static final String DESCRIPTION_INPUT_XPATH = "//*[@id=\"description\"]";
        public static final String SAVE_BTN_XPATH = "//*[@id=\"customerAddressModal\"]/div/div/div[2]/form/div[3]/button[2]";
        public static final String CHECKBOX_BTN_XPATH = "//*[@id=\"selectAddress0\"]";
        public static final String NEXT_BTN_2_XPATH = "/html/body/app-root/app-create-customer-layout/main/div/app-create-customer-page/div/app-address-info/div/div/div[2]/button[2]";
        public static final String EMAIL_INPUT_XPATH = "//*[@id=\"email\"]";
        public static final String MOBILE_PHONE_INPUT_XPATH = "//*[@id=\"mobile-phone\"]";
        public static final String CREATE_BTN_XPATH1 = "/html/body/app-root/app-create-customer-layout/main/div/app-create-customer-page/div/app-contact-medium/div/form/div[3]/button[2]";
        public static final String ERROR_MESSAGE_XPATH = "/html/body/app-root/app-create-customer-layout/main/div/app-create-customer-page/div/app-demographic-form/div[2]/app-warning-popup";

        public static final String ERROR_MESSAGE_XPATH1 = "/html/body/app-root/app-create-customer-layout/main/div/app-create-customer-page/div/app-demographic-form/div[2]/app-warning-popup";

        // Messages
        public static final String INVALID_NAT_ID_MESSAGE = "This Nationality ID is not valid.";
        public static final String MANDATORY_FIELD_MESSAGE = "This field is mandatory.";
    }

