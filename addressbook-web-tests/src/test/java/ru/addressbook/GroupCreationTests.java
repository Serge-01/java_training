package ru.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    goToAddNewContact();
    fillContactForm(new ContactData("John", "Smith", "Apple", "650-960-1500", "smith.m@apple.com"));
    submitContactCreation();
    returnToHomePage();
  }


  @Test
  public void testGroupCreation(){
    goToGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("test1", "test2", "test3"));
    submitGroupCreation();
    returnToGroupPage();

  }

}
