package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTest extends TestBase{

  @Test
  public void testContactCreation() {
    app.getNavigationHelper().gotoGroupPage();
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactCreation(new ContactData("Oleg", "Sr", "Nyus", "Big"));
  }
}
