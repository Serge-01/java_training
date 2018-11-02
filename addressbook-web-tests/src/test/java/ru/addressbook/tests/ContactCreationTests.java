package ru.addressbook.tests;

import org.testng.annotations.Test;
import ru.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    app.getContactHelper().goToAddNewContact();
    app.getContactHelper().fillContactForm(new ContactData("Donovan", "Bailey", "Sprint", "650-984-0000", "db@cantf.com", "test2"), true);
    app.getContactHelper().submitContactCreation();
    app.getNavigationHelper().returnToHomePage();
  }
}
