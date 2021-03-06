package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String firstName;
  private final String lastName;
  private final String address;
  private final String phoneHome;
  private final String phoneMobile;
  private final String email;

  public ContactData(String firstName, String lastName, String phoneHome, String address, String phoneMobile, String email) {
    this.firstName = firstName;

    this.lastName = lastName;
    this.address = address;
    this.phoneHome = phoneHome;
    this.phoneMobile = phoneMobile;
    this.email = email;

  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }
  public String getPhoneHome() {
    return phoneHome;
  }
  public String getAddress() {
    return address;
  }
  public String getPhoneMobile() {
    return phoneMobile;
  }
  public String getEmail() {
    return email;
  }

}
