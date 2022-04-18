package com.projectName.base;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownActions {
	
	public static void selectByVisibleText(WebElement dropdownElement, String optionVisibleText) {
		Select dropdown = new Select(dropdownElement);
		dropdown.selectByVisibleText(optionVisibleText);
	}
	
	public static void selectByIndex(WebElement dropdownElement, int index) {
		Select dropdown = new Select(dropdownElement);
		dropdown.selectByIndex(index);
	}
	
	public static List<WebElement> getDropdownOptions(WebElement dropdownElement) {
		Select dropdown = new Select(dropdownElement);
		List<WebElement> dropdownOptions = dropdown.getOptions();
		
		return dropdownOptions;
	}
	
	public static void deselectAllOptions(WebElement dropdownElement) {
		Select dropdown = new Select(dropdownElement);
		dropdown.deselectAll();
	}

}
