package com.taxamo.client.model;

/*
*  Copyright 2014 Taxamo, Ltd.
*
*  Licensed under the Apache License, Version 2.0 (the "License");
*  you may not use this file except in compliance with the License.
*  You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software
*  distributed under the License is distributed on an "AS IS" BASIS,
*  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*  See the License for the specific language governing permissions and
*  limitations under the License.
*/

/*
* NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
*/


public class InvoiceAddress {
  /* Building number. */
  private String buildingNumber = null;
  /*  Street name. */
  private String streetName = null;
  /* Address details - for example apartament number. */
  private String addressDetail = null;
  /* City name. */
  private String city = null;
  /* Postal code. */
  private String postalCode = null;
  /* Region. */
  private String region = null;
  /* 2-letter ISO country code. */
  private String country = null;
  public String getBuildingNumber() {
    return buildingNumber;
  }
  public InvoiceAddress setBuildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
    return this;
  }

  public String getStreetName() {
    return streetName;
  }
  public InvoiceAddress setStreetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

  public String getAddressDetail() {
    return addressDetail;
  }
  public InvoiceAddress setAddressDetail(String addressDetail) {
    this.addressDetail = addressDetail;
    return this;
  }

  public String getCity() {
    return city;
  }
  public InvoiceAddress setCity(String city) {
    this.city = city;
    return this;
  }

  public String getPostalCode() {
    return postalCode;
  }
  public InvoiceAddress setPostalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  public String getRegion() {
    return region;
  }
  public InvoiceAddress setRegion(String region) {
    this.region = region;
    return this;
  }

  public String getCountry() {
    return country;
  }
  public InvoiceAddress setCountry(String country) {
    this.country = country;
    return this;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceAddress {\n");
    sb.append("  buildingNumber: ").append(buildingNumber).append("\n");
    sb.append("  streetName: ").append(streetName).append("\n");
    sb.append("  addressDetail: ").append(addressDetail).append("\n");
    sb.append("  city: ").append(city).append("\n");
    sb.append("  postalCode: ").append(postalCode).append("\n");
    sb.append("  region: ").append(region).append("\n");
    sb.append("  country: ").append(country).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
