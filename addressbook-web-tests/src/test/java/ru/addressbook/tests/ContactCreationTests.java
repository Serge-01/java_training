package ru.addressbook.tests;

import org.testng.annotations.Test;
import ru.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    app.getContactHelper().goToAddNewContact();
    app.getContactHelper().fillContactForm(new ContactData("Charlie", "Harper", "2men", "650-960-1502", "ch@2men.com"));
    app.getContactHelper().submitContactCreation();
    app.getNavigationHelper().returnToHomePage();
  }
}
