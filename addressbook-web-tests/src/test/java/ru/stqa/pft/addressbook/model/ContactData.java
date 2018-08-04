package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String firstName;
  private final String middleName;
  private final String lastName;
  private final String nickName;
  private final String title;
  private final String company;
  private final String address;
  private final String phoneHome;
  private final String phoneMobile;

  public ContactData(String firstName, String middleName, String lastName, String nickName, String title, String company, String phoneHome, String address, String phoneMobile) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.nickName = nickName;
    this.title = title;
    this.company = company;
    this.address = address;
    this.phoneHome = phoneHome;
    this.phoneMobile = phoneMobile;

  }

  public String getFirstName() {
    return firstName;
  }
  public String getMiddleName() {
    return middleName;
  }
  public String getLastName() {
    return lastName;
  }
  public String getNickName() {
    return nickName;
  }
  public String getTitle() {
    return title;
  }
  public String getCompany() {
    return company;
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

}
