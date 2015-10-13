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

import com.owlike.genson.annotation.JsonProperty;

import java.util.*;
import com.taxamo.client.model.UsTaxExemptState;
import com.taxamo.client.model.UsTaxId;
public class UsTaxExemptionCertificateDetailsSchema {
  /* Purchase/order identifier for single purchase. */
  @JsonProperty("single_purchase_order_identifier")
  private String singlePurchaseOrderIdentifier = null;
  /* Purchaser business type. */
  @JsonProperty("purchaser_business_type")
  private String purchaserBusinessType = null;
  /* The value of exemption reason. */
  @JsonProperty("purchaser_exemption_reason_value")
  private String purchaserExemptionReasonValue = null;
  /* Purchaser's state. */
  @JsonProperty("purchaser_state")
  private String purchaserState = null;
  /* Purchaser's zip code. */
  @JsonProperty("purchaser_zip")
  private String purchaserZip = null;
  /* Purchaser's city. */
  @JsonProperty("purchaser_city")
  private String purchaserCity = null;
  /* Purchaser's last name. */
  @JsonProperty("purchaser_last_name")
  private String purchaserLastName = null;
  /* The reason for exemption reason. */
  @JsonProperty("purchaser_exemption_reason")
  private String purchaserExemptionReason = null;
  /* Set to true if this certificate is valid for single purchase only. */
  @JsonProperty("single_purchase")
  private Boolean singlePurchase = null;
  /* Purchaser's TAX ID. */
  @JsonProperty("purchaser_tax_id")
  private UsTaxId purchaserTaxId = null;
  /* Purchaser's second address line. */
  @JsonProperty("purchaser_address2")
  private String purchaserAddress2 = null;
  /* Purchaser's first address line. */
  @JsonProperty("purchaser_address1")
  private String purchaserAddress1 = null;
  /* If business type is other, a short description must be provided. */
  @JsonProperty("purchaser_business_type_other_value")
  private String purchaserBusinessTypeOtherValue = null;
  /* Purchaser's first name. */
  @JsonProperty("purchaser_first_name")
  private String purchaserFirstName = null;
  /* List of states where the certificate is valid. */
  @JsonProperty("exempt_states")
  private List<UsTaxExemptState> exemptStates = new ArrayList<UsTaxExemptState>();
  /* Purchaser's title. */
  @JsonProperty("purchaser_title")
  private String purchaserTitle = null;
  @JsonProperty("single_purchase_order_identifier")
  public String getSinglePurchaseOrderIdentifier() {
    return singlePurchaseOrderIdentifier;
  }

  @JsonProperty("single_purchase_order_identifier")
  public UsTaxExemptionCertificateDetailsSchema setSinglePurchaseOrderIdentifier(String singlePurchaseOrderIdentifier) {
    this.singlePurchaseOrderIdentifier = singlePurchaseOrderIdentifier;
    return this;
  }

  @JsonProperty("purchaser_business_type")
  public String getPurchaserBusinessType() {
    return purchaserBusinessType;
  }

  @JsonProperty("purchaser_business_type")
  public UsTaxExemptionCertificateDetailsSchema setPurchaserBusinessType(String purchaserBusinessType) {
    this.purchaserBusinessType = purchaserBusinessType;
    return this;
  }

  @JsonProperty("purchaser_exemption_reason_value")
  public String getPurchaserExemptionReasonValue() {
    return purchaserExemptionReasonValue;
  }

  @JsonProperty("purchaser_exemption_reason_value")
  public UsTaxExemptionCertificateDetailsSchema setPurchaserExemptionReasonValue(String purchaserExemptionReasonValue) {
    this.purchaserExemptionReasonValue = purchaserExemptionReasonValue;
    return this;
  }

  @JsonProperty("purchaser_state")
  public String getPurchaserState() {
    return purchaserState;
  }

  @JsonProperty("purchaser_state")
  public UsTaxExemptionCertificateDetailsSchema setPurchaserState(String purchaserState) {
    this.purchaserState = purchaserState;
    return this;
  }

  @JsonProperty("purchaser_zip")
  public String getPurchaserZip() {
    return purchaserZip;
  }

  @JsonProperty("purchaser_zip")
  public UsTaxExemptionCertificateDetailsSchema setPurchaserZip(String purchaserZip) {
    this.purchaserZip = purchaserZip;
    return this;
  }

  @JsonProperty("purchaser_city")
  public String getPurchaserCity() {
    return purchaserCity;
  }

  @JsonProperty("purchaser_city")
  public UsTaxExemptionCertificateDetailsSchema setPurchaserCity(String purchaserCity) {
    this.purchaserCity = purchaserCity;
    return this;
  }

  @JsonProperty("purchaser_last_name")
  public String getPurchaserLastName() {
    return purchaserLastName;
  }

  @JsonProperty("purchaser_last_name")
  public UsTaxExemptionCertificateDetailsSchema setPurchaserLastName(String purchaserLastName) {
    this.purchaserLastName = purchaserLastName;
    return this;
  }

  @JsonProperty("purchaser_exemption_reason")
  public String getPurchaserExemptionReason() {
    return purchaserExemptionReason;
  }

  @JsonProperty("purchaser_exemption_reason")
  public UsTaxExemptionCertificateDetailsSchema setPurchaserExemptionReason(String purchaserExemptionReason) {
    this.purchaserExemptionReason = purchaserExemptionReason;
    return this;
  }

  @JsonProperty("single_purchase")
  public Boolean getSinglePurchase() {
    return singlePurchase;
  }

  @JsonProperty("single_purchase")
  public UsTaxExemptionCertificateDetailsSchema setSinglePurchase(Boolean singlePurchase) {
    this.singlePurchase = singlePurchase;
    return this;
  }

  @JsonProperty("purchaser_tax_id")
  public UsTaxId getPurchaserTaxId() {
    return purchaserTaxId;
  }

  @JsonProperty("purchaser_tax_id")
  public UsTaxExemptionCertificateDetailsSchema setPurchaserTaxId(UsTaxId purchaserTaxId) {
    this.purchaserTaxId = purchaserTaxId;
    return this;
  }

  @JsonProperty("purchaser_address2")
  public String getPurchaserAddress2() {
    return purchaserAddress2;
  }

  @JsonProperty("purchaser_address2")
  public UsTaxExemptionCertificateDetailsSchema setPurchaserAddress2(String purchaserAddress2) {
    this.purchaserAddress2 = purchaserAddress2;
    return this;
  }

  @JsonProperty("purchaser_address1")
  public String getPurchaserAddress1() {
    return purchaserAddress1;
  }

  @JsonProperty("purchaser_address1")
  public UsTaxExemptionCertificateDetailsSchema setPurchaserAddress1(String purchaserAddress1) {
    this.purchaserAddress1 = purchaserAddress1;
    return this;
  }

  @JsonProperty("purchaser_business_type_other_value")
  public String getPurchaserBusinessTypeOtherValue() {
    return purchaserBusinessTypeOtherValue;
  }

  @JsonProperty("purchaser_business_type_other_value")
  public UsTaxExemptionCertificateDetailsSchema setPurchaserBusinessTypeOtherValue(String purchaserBusinessTypeOtherValue) {
    this.purchaserBusinessTypeOtherValue = purchaserBusinessTypeOtherValue;
    return this;
  }

  @JsonProperty("purchaser_first_name")
  public String getPurchaserFirstName() {
    return purchaserFirstName;
  }

  @JsonProperty("purchaser_first_name")
  public UsTaxExemptionCertificateDetailsSchema setPurchaserFirstName(String purchaserFirstName) {
    this.purchaserFirstName = purchaserFirstName;
    return this;
  }

  @JsonProperty("exempt_states")
  public List<UsTaxExemptState> getExemptStates() {
    return exemptStates;
  }

  @JsonProperty("exempt_states")
  public UsTaxExemptionCertificateDetailsSchema setExemptStates(List<UsTaxExemptState> exemptStates) {
    this.exemptStates = exemptStates;
    return this;
  }

  @JsonProperty("purchaser_title")
  public String getPurchaserTitle() {
    return purchaserTitle;
  }

  @JsonProperty("purchaser_title")
  public UsTaxExemptionCertificateDetailsSchema setPurchaserTitle(String purchaserTitle) {
    this.purchaserTitle = purchaserTitle;
    return this;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsTaxExemptionCertificateDetailsSchema {\n");
    sb.append("  singlePurchaseOrderIdentifier: ").append(singlePurchaseOrderIdentifier).append("\n");
    sb.append("  purchaserBusinessType: ").append(purchaserBusinessType).append("\n");
    sb.append("  purchaserExemptionReasonValue: ").append(purchaserExemptionReasonValue).append("\n");
    sb.append("  purchaserState: ").append(purchaserState).append("\n");
    sb.append("  purchaserZip: ").append(purchaserZip).append("\n");
    sb.append("  purchaserCity: ").append(purchaserCity).append("\n");
    sb.append("  purchaserLastName: ").append(purchaserLastName).append("\n");
    sb.append("  purchaserExemptionReason: ").append(purchaserExemptionReason).append("\n");
    sb.append("  singlePurchase: ").append(singlePurchase).append("\n");
    sb.append("  purchaserTaxId: ").append(purchaserTaxId).append("\n");
    sb.append("  purchaserAddress2: ").append(purchaserAddress2).append("\n");
    sb.append("  purchaserAddress1: ").append(purchaserAddress1).append("\n");
    sb.append("  purchaserBusinessTypeOtherValue: ").append(purchaserBusinessTypeOtherValue).append("\n");
    sb.append("  purchaserFirstName: ").append(purchaserFirstName).append("\n");
    sb.append("  exemptStates: ").append(exemptStates).append("\n");
    sb.append("  purchaserTitle: ").append(purchaserTitle).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
