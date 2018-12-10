package ru.addressbook.tests;

import org.testng.annotations.Test;
import ru.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {
    app.goTo().goToHomePage();
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Modify1", "Modify2", "Company", "111-111-1112", "test@test.com", "Test"), true);
    }
    app.getContactHelper().selectContact();
    app.getContactHelper().editContact();
    app.getContactHelper().fillContactForm(new ContactData("Vasya", "Pupkin", "Google", "650-740-1111", "vp@google.com", null), false);
    app.getContactHelper().submitContactModification();
  }
}
