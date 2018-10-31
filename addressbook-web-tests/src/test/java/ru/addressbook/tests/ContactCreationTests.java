package ru.addressbook.tests;

import org.testng.annotations.Test;
import ru.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    app.goToAddNewContact();
    app.fillContactForm(new ContactData("John", "Smith", "Apple", "650-960-1500", "smith.m@apple.com"));
    app.submitContactCreation();
    app.returnToHomePage();
  }
}
