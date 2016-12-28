package com.ems.Entity.ems;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by Apurbo on 11/18/2016.
 */
@Entity
@Table(name = "PERSONALINFORMATION")
public class PersonalInformationEntity {
   @Id
   @Column(name = "PERSONAL_ID_NUMBR")
   String personalIdNumber;
   @Column(name = "FIRSTNAME")
   String firstName;
   @Column(name = "MIDDLENAME")
   String middleName;
   @Column(name = "LASTNAME")
   String lastName;

   @DateTimeFormat
   @Column(name = "DATEOFBIRTH",columnDefinition="Date")
   Date dateOfBirth;
   @Column(name = "CELLPHONE")
   String cellPhone;
   @Column(name = "HOMEPHONE")
   String homePhone;
   @Column(name = "EMAIL")
   String email;
   @Column(name = "ADDRESS")
   String address;
   @Column(name = "CITY")
   String city;
   @Column(name = "POSTALCODE")
   String postalCode;
   @Column(name = "GENDER")
   Character gender;
   @Column(name = "MARITALSTATUS")
   Integer maritalStatus;
   @Column(name = "SETDATE",columnDefinition="Date")
   Date setDate;
   @Column(name = "USERNAME")
   String userName;
   @Column(name = "APPROVEDBY")
    String approvedBy;

   public String getPersonalIdNumber() {
      return personalIdNumber;
   }

   public void setPersonalIdNumber(String personalIdNumber) {
      this.personalIdNumber = personalIdNumber;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getMiddleName() {
      return middleName;
   }

   public void setMiddleName(String middleName) {
      this.middleName = middleName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public Date getDateOfBirth() {
      return dateOfBirth;
   }

   public void setDateOfBirth(Date dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
   }

   public String getCellPhone() {
      return cellPhone;
   }

   public void setCellPhone(String cellPhone) {
      this.cellPhone = cellPhone;
   }

   public String getHomePhone() {
      return homePhone;
   }

   public void setHomePhone(String homePhone) {
      this.homePhone = homePhone;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public String getCity() {
      return city;
   }

   public void setCity(String city) {
      this.city = city;
   }

   public String getPostalCode() {
      return postalCode;
   }

   public void setPostalCode(String postalCode) {
      this.postalCode = postalCode;
   }

   public Character getGender() {
      return gender;
   }

   public void setGender(Character gender) {
      this.gender = gender;
   }

   public Integer getMaritalStatus() {
      return maritalStatus;
   }

   public void setMaritalStatus(Integer maritalStatus) {
      this.maritalStatus = maritalStatus;
   }

   public Date getSetDate() {
      return setDate;
   }

   public void setSetDate(Date setDate) {
      this.setDate = setDate;
   }

   public String getUserName() {
      return userName;
   }

   public void setUserName(String userName) {
      this.userName = userName;
   }

   public String getApprovedBy() {
      return approvedBy;
   }

   public void setApprovedBy(String approvedBy) {
      this.approvedBy = approvedBy;
   }
}
