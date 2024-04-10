package org.openxava.test.tests.byfeature;

import java.util.*;

import org.openqa.selenium.*;

/**
 * To test pop up calendar with Selenium.
 * 
 * @author Chungyen Tsai
 */
public class DateCalendarTest extends WebDriverTestBase {
		
	public void testGreek() throws Exception { 
		changeLanguage("el");
		goModule("Event");
		WebElement calendarIcon = getDriver().findElement(By.cssSelector(".ox_openxavatest_Event__list_col0 .mdi-calendar"));
		calendarIcon.click();
		Thread.sleep(100); 
		WebElement days = getDriver().findElement(By.className("flatpickr-weekdaycontainer"));
		String daysText = days.getText();
		assertEquals(916, daysText.charAt(0)); 
		assertEquals(949, daysText.charAt(1));
	}
	
	public void testMultipleDateWithOnChange_localeTranslationWellLoaded() throws Exception {
		changeLanguage("ja");
		goModule("Event");
		execute("List.viewDetail", "row=0"); 
		List<WebElement> iconElements = getDriver().findElements(By.cssSelector("i.mdi.mdi-calendar"));
		if (!iconElements.isEmpty()) {
		    WebElement firstIconElement = iconElements.get(0);
		    firstIconElement.click();
		}
		Thread.sleep(500);
		List<WebElement> spanElements = getDriver().findElements(By.xpath("//div[@class='dayContainer']//span[@class='flatpickr-day ' and text()='8']"));
		if (!spanElements.isEmpty()) {
		    WebElement firstSpanElement = spanElements.get(0);
		    firstSpanElement.click();
		}
		wait(getDriver());
		WebElement divElement = getDriver().findElement(By.cssSelector("div.ox-message-box"));
		String message = divElement.getText();
		String expectedMessage = "Calendar changed";
		assertEquals(expectedMessage, message);
		
		getDriver().navigate().refresh();
		wait(getDriver());
		iconElements = getDriver().findElements(By.cssSelector("i.mdi.mdi-calendar"));
		if (!iconElements.isEmpty()) {
		    WebElement firstIconElement = iconElements.get(0);
		    firstIconElement.click();
		}
		List<WebElement> weekdaycontainerDivElement = getDriver().findElements(By.className("flatpickr-weekdaycontainer"));
        WebElement thirdSpanElement = weekdaycontainerDivElement.get(0).findElements(By.tagName("span")).get(2);
		assertTrue("The translation of dateCalendar is not loaded correctly", !thirdSpanElement.getText().equals("Tue")); 
		execute("Mode.list");
		acceptInDialogJS(getDriver());
	}
	
	public void testDutch_zhCN() throws Exception { 
		changeLanguage("nl");
		goModule("Appointment");
		setConditionValue("26-5-2015 8:15", 0);
		execute("List.filter");
		assertNoErrors(); 
		
		changeLanguage("zh-CN");
		goModule("Appointment");
		setConditionValue("2015/5/26 AM8:15", 0);
		execute("List.filter");
		assertNoErrors(); 
	}

	public void testChineseDateTimeInJava8AndAmIssue_formatDateAndDateTimeUsingTwoDigits() throws Exception { 
		changeLanguage("zh-TW");
		appointment2();
		quarter();
		changeLanguage("zh-CN");
		appointment2();
		quarter();
		
		formatDateUsingTwoDigits("zh-CN");
		changeLanguage("es-ES");
		goModule("Quarter");
		formatDateUsingTwoDigits("es-ES");
		goModule("Shipment");
		formatDateTimeUsingTwoDigits(); 
	}
	
	public void testTime_dateTimeSeparatedUseTimeEditor_separatedTimePartOnChange() throws Exception {
		goModule("Event");
		execute("List.viewDetail", "row=0");
		assertValue("endTime", "1:00 PM");
		List<WebElement> iconElements = getDriver().findElements(By.cssSelector("i.mdi.mdi-clock-outline"));
		assertTrue(iconElements.size() == 2);
		if (!iconElements.isEmpty()) {
		    WebElement firstIconElement = iconElements.get(0);
		    firstIconElement.click();
		}
		List<WebElement> spanElements = getDriver().findElements(By.cssSelector("span.flatpickr-am-pm"));
		if (!spanElements.isEmpty()) {
		    WebElement firstSpanElement = spanElements.get(0);
		    firstSpanElement.click();
		}
		WebElement label = getDriver().findElement(By.id("ox_openxavatest_Event__label_name"));
		label.click();
		assertValue("endTime", "1:00 AM");
		List<WebElement> createDateTime = getDriver().findElements(By.id("ox_openxavatest_Event__createDate"));
		WebElement timePart = createDateTime.get(1);
		timePart.sendKeys(Keys.TAB);
		List<WebElement> messages = getDriver().findElements(By.cssSelector(".ox-messages .ox-message-box"));
		assertTrue(messages.isEmpty());
		setValue("endTime", "1:00 PM");
		messages = getDriver().findElements(By.cssSelector(".ox-messages .ox-message-box"));
		assertTrue(messages.isEmpty());
		execute("CRUD.save");
		
		changeLanguage("zh-CN");
		goModule("Event");
		execute("List.viewDetail", "row=0");
		WebElement endTime = getDriver().findElement(By.id("ox_openxavatest_Event__endTime"));
		endTime.sendKeys(Keys.TAB);
		assertValue("endTime", "AM1:00");
		openTimeCalendar(0);
		changeAmPm(0);
		assertValue("endTime", "PM1:00");
		execute("CRUD.save");
	}
	
	private void formatDateUsingTwoDigits(String format) throws Exception {
		execute("CRUD.new");
		Calendar calendar = Calendar.getInstance();
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int month = calendar.get(Calendar.MONTH) + 1;
		int year = calendar.get(Calendar.YEAR);
		setValue("initDate", String.valueOf(day));
		WebElement input = getDriver().findElement(By.id("ox_openxavatest_Quarter__initDate"));
		input.sendKeys(Keys.TAB);
		if (format.equals("zh-CN")) {
			assertEquals(getValue("initDate"), year + "/" + month + "/" + day);
		} else {
			String m = month < 10 ? "0"+ String.valueOf(month) : String.valueOf(month);
			String d = day < 10 ? "0"+ String.valueOf(day) : String.valueOf(day);
			assertEquals(getValue("initDate"), d + "/" + m + "/" + year);
		} 
	}
	
	private void formatDateTimeUsingTwoDigits() throws Exception {
		execute("CRUD.new"); 
		Calendar calendar = Calendar.getInstance();
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int month = calendar.get(Calendar.MONTH) + 1;
		int year = calendar.get(Calendar.YEAR);
		setValue("time", String.valueOf(day));
		WebElement input = getDriver().findElement(By.id("ox_openxavatest_Shipment__time"));
		input.sendKeys(Keys.TAB);
		String m = month < 10 ? "0"+ String.valueOf(month) : String.valueOf(month);
		String d = day < 10 ? "0"+ String.valueOf(day) : String.valueOf(day);
		assertEquals(getValue("time"), d + "/" + m + "/" + year + " 00:00");
	}
	
	
	private void appointment2() throws Exception {
		goModule("Appointment2");
		execute("List.viewDetail", "row=2");
		assertValue("time", "2015/5/26 PM1:34");
		assertValue("dateTime", "2015/5/26 PM2:34");
		List<WebElement> calendarPopUp = getDriver().findElements(By.cssSelector("i.mdi.mdi-calendar-clock"));
		calendarPopUp.get(1).click();
		WebElement label = getDriver().findElement(By.id("ox_openxavatest_Appointment2__label_time"));
		label.click();
		calendarPopUp.get(1).click();
		label.click();
		assertValue("time", "2015/5/26 PM1:34");
		assertValue("dateTime", "2015/5/26 PM2:34");
		execute("Mode.list");
	}
	
	private void quarter() throws Exception {
		goModule("Quarter");
		execute("List.viewDetail", "row=0");
		assertValue("initDate", "2009/8/11");
		execute("CRUD.save");
		assertNoErrors();
		execute("Mode.list");
	}
	
	private void openTimeCalendar(int i) throws InterruptedException {
		List<WebElement> iconElements = getDriver().findElements(By.cssSelector("i.mdi.mdi-clock-outline"));
		if (!iconElements.isEmpty()) {
		    WebElement timeIcon = iconElements.get(i);
		    timeIcon.click();
		}
		Thread.sleep(500);
	}
	
	private void changeAmPm(int i ) throws InterruptedException {
		List<WebElement> iconElements = getDriver().findElements(By.className("flatpickr-am-pm"));
		if (!iconElements.isEmpty()) {
		    WebElement timeIcon = iconElements.get(i);
		    timeIcon.click();
		}
		Thread.sleep(500);
	}

}
