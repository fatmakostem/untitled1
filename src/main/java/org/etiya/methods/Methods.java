package org.etiya.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Methods {

    private WebDriver webDriver;
    public Methods(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public static List<String[]> readCSV(String csvFilePath) throws IOException {
        List<String[]> data = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            boolean firstLine = true; // İlk satırı atlamak için
            while ((line = br.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue;
                }
                String[] values = line.split(",", -1); // -1 parametresi boş hücreleri de korur
                data.add(values);
            }
        }
        return data;
    }

    public void enterData(String fieldName, String value) throws InterruptedException {
        WebElement inputElement = webDriver.findElement(By.xpath(fieldName));
        inputElement.clear();
        inputElement.sendKeys(value);
        Thread.sleep(1000);
    }

    public void enterDataId(String fieldName, String value){
        WebElement inputElement = webDriver.findElement(By.id(fieldName));
        inputElement.clear();
        inputElement.sendKeys(value);
    }

    public void clickElement(String xpath) throws InterruptedException {
        WebElement element = webDriver.findElement(By.xpath(xpath));
        element.click();

        Thread.sleep(1000);
    }

    public void selectDropdownByValue(String xpath, String value) {
        WebElement dropdownElement = webDriver.findElement(By.xpath(xpath));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByValue(value);
    }

    public void selectDropdownByVisibleText(String xpath, String visibleText) {
        WebElement dropdownElement = webDriver.findElement(By.xpath(xpath));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText(visibleText);
    }

    public List<String> getDropdownOptions(String xpath) {
        WebElement dropdownElement = webDriver.findElement(By.xpath(xpath));
        Select dropdown = new Select(dropdownElement);
        List<WebElement> options = dropdown.getOptions();
        List<String> optionTexts = new ArrayList<>();
        for (WebElement option : options) {
            optionTexts.add(option.getText());
        }
        return optionTexts;
    }

    public String getElementText(String xpath) {
        WebElement element = webDriver.findElement(By.xpath(xpath));
        return element.getText();
    }

    public void clearElement(String xpath) {
        WebElement element = webDriver.findElement(By.xpath(xpath));
        element.clear();
    }


    public void sendKeysToElement(String xpath, Keys key) throws InterruptedException {
        WebElement element = webDriver.findElement(By.xpath(xpath));
        element.sendKeys(key);

        Thread.sleep(1000);
    }
}
