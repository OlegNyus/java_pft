package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTest extends TestBase{

  @Test
  public void testContactCreation() {
    app.getNavigationHelper().gotoGroupPage();
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactCreation(new ContactData("Oleg", "Nyus11111", "3332221144", "Home Address", "3212221122", "oleg@test.test"));
    app.getContactHelper().submitContactCreation();
  }
}
