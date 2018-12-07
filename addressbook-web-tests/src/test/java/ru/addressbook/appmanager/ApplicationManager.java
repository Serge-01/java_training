package ru.addressbook.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {

  WebDriver wd;

  private ContactHelper contactHelper;
  private SessionHelper sessionHelper;
  private NavigationHelper navigationHelper;
  private GroupHelper groupHelper;
  private String browser;

  public ApplicationManager(String browser) {
    this.browser = browser;
  }

  public void init() {
    if (browser.equals(BrowserType.FIREFOX)) {
      System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\geckodriver.exe");
      wd = new FirefoxDriver();
    } else if (browser.equals(BrowserType.CHROME)) {
      System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver.exe");
      wd = new ChromeDriver();
    } else if (browser.equals(BrowserType.EDGE)) {
      System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\MicrosoftWebDriver.exe");
      wd = new EdgeDriver();
    }

    wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    wd.manage().window().maximize();
    wd.get("http://localhost/addressbook/group.php");
    groupHelper = new GroupHelper(wd);
    contactHelper = new ContactHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    sessionHelper = new SessionHelper(wd);
    sessionHelper.login("admin", "secret");
  }

  public void stop() {
    wd.quit();
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }

  public ContactHelper getContactHelper() {
    return contactHelper;
  }
}
