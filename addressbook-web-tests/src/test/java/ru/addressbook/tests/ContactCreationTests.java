package ru.addressbook.tests;

import org.testng.annotations.Test;
import ru.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    app.goTo().goToHomePage();
    app.getContactHelper().createContact(new ContactData("Donovan", "Bailey", "Sprint", "650-984-0000", "db@cantf.com", "test2"), true);
  }
}
