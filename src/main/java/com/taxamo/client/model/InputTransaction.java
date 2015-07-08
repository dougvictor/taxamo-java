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


import java.util.*;
import com.taxamo.client.model.InputTransactionLine;
import com.taxamo.client.model.AdditionalCurrencies;
import com.taxamo.client.model.Evidence;
import com.taxamo.client.model.CustomFields;
import com.taxamo.client.model.InvoiceAddress;
public class InputTransaction {
  /* Buyer's credit card prefix. */
  private String buyerCreditCardPrefix = null;
  /* Custom data related to transaction. */
  private String customData = null;
  /* Buyer's name - first name and last name or company name. */
  private String buyerName = null;
  /* Invoice date of issue. */
  private String invoiceDate = null;
  /* Currency code for transaction - e.g. EUR. */
  private String currencyCode = null;
  /* Supply date in yyyy-MM-dd format. */
  private String supplyDate = null;
  /* Invoice address. */
  private InvoiceAddress invoiceAddress = null;
  /* Verification token */
  private String verificationToken = null;
  /* Transaction lines. */
  private List<InputTransactionLine> transactionLines = new ArrayList<InputTransactionLine>();
  /*  Buyer's tax number - EU VAT number for example. If using EU VAT number, it is possible to provide country code in it (e.g. IE1234567X) or simply use billing_country_code field for that. In the first case, if billing_country_code value was provided, it will be overwritten with country code value extracted from VAT number - but only if the VAT has been verified properly. */
  private String buyerTaxNumber = null;
  /* Custom fields, stored as key-value pairs. This property is not processed and used mostly with Taxamo-built helpers. */
  private List<CustomFields> customFields = new ArrayList<CustomFields>();
  /* Two-letter ISO country code, e.g. FR. Use it to force country code for tax calculation. */
  private String forceCountryCode = null;
  /* Invoice number. */
  private String invoiceNumber = null;
  /* Order date in yyyy-MM-dd format, in merchant's timezone. If provided by the API caller, no timezone conversion is performed. Default value is current date and time. When using public token, the default value is used. */
  private String orderDate = null;
  /* IP address of the buyer in dotted decimal (IPv4) or text format (IPv6). */
  private String buyerIp = null;
  /* Buyer's declared email address. */
  private String buyerEmail = null;
  /* Use data and evidence from original transaction. Tax will be re-calculated, but evidence won't be re-checked. This parameter is taken into account only when 'manual' flag is raised. */
  private String originalTransactionKey = null;
  /* Billing two letter ISO country code. */
  private String billingCountryCode = null;
  /* Custom identifier provided upon transaction creation. */
  private String customId = null;
  /* Additional currency information - can be used to receive additional information about invoice in another currency. */
  private AdditionalCurrencies additionalCurrencies = null;
  /* Invoice place of issue. */
  private String invoicePlace = null;
  /* Tax country of residence evidence. */
  private Evidence evidence = null;
  /* Transaction description. */
  private String description = null;
  /* True if the transaction deducted from tax and no tax is applied. Either set automatically when VAT number validates with VIES correctly, but can also be provided in manual mode. */
  private Boolean taxDeducted = null;
  /* Two-letter ISO country code, e.g. FR. This code applies to detected/set country for transaction, but can be set using manual mode. */
  private String taxCountryCode = null;
  public String getBuyerCreditCardPrefix() {
    return buyerCreditCardPrefix;
  }
  public InputTransaction setBuyerCreditCardPrefix(String buyerCreditCardPrefix) {
    this.buyerCreditCardPrefix = buyerCreditCardPrefix;
    return this;
  }

  public String getCustomData() {
    return customData;
  }
  public InputTransaction setCustomData(String customData) {
    this.customData = customData;
    return this;
  }

  public String getBuyerName() {
    return buyerName;
  }
  public InputTransaction setBuyerName(String buyerName) {
    this.buyerName = buyerName;
    return this;
  }

  public String getInvoiceDate() {
    return invoiceDate;
  }
  public InputTransaction setInvoiceDate(String invoiceDate) {
    this.invoiceDate = invoiceDate;
    return this;
  }

  public String getCurrencyCode() {
    return currencyCode;
  }
  public InputTransaction setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  public String getSupplyDate() {
    return supplyDate;
  }
  public InputTransaction setSupplyDate(String supplyDate) {
    this.supplyDate = supplyDate;
    return this;
  }

  public InvoiceAddress getInvoiceAddress() {
    return invoiceAddress;
  }
  public InputTransaction setInvoiceAddress(InvoiceAddress invoiceAddress) {
    this.invoiceAddress = invoiceAddress;
    return this;
  }

  public String getVerificationToken() {
    return verificationToken;
  }
  public InputTransaction setVerificationToken(String verificationToken) {
    this.verificationToken = verificationToken;
    return this;
  }

  public List<InputTransactionLine> getTransactionLines() {
    return transactionLines;
  }
  public InputTransaction setTransactionLines(List<InputTransactionLine> transactionLines) {
    this.transactionLines = transactionLines;
    return this;
  }

  public String getBuyerTaxNumber() {
    return buyerTaxNumber;
  }
  public InputTransaction setBuyerTaxNumber(String buyerTaxNumber) {
    this.buyerTaxNumber = buyerTaxNumber;
    return this;
  }

  public List<CustomFields> getCustomFields() {
    return customFields;
  }
  public InputTransaction setCustomFields(List<CustomFields> customFields) {
    this.customFields = customFields;
    return this;
  }

  public String getForceCountryCode() {
    return forceCountryCode;
  }
  public InputTransaction setForceCountryCode(String forceCountryCode) {
    this.forceCountryCode = forceCountryCode;
    return this;
  }

  public String getInvoiceNumber() {
    return invoiceNumber;
  }
  public InputTransaction setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

  public String getOrderDate() {
    return orderDate;
  }
  public InputTransaction setOrderDate(String orderDate) {
    this.orderDate = orderDate;
    return this;
  }

  public String getBuyerIp() {
    return buyerIp;
  }
  public InputTransaction setBuyerIp(String buyerIp) {
    this.buyerIp = buyerIp;
    return this;
  }

  public String getBuyerEmail() {
    return buyerEmail;
  }
  public InputTransaction setBuyerEmail(String buyerEmail) {
    this.buyerEmail = buyerEmail;
    return this;
  }

  public String getOriginalTransactionKey() {
    return originalTransactionKey;
  }
  public InputTransaction setOriginalTransactionKey(String originalTransactionKey) {
    this.originalTransactionKey = originalTransactionKey;
    return this;
  }

  public String getBillingCountryCode() {
    return billingCountryCode;
  }
  public InputTransaction setBillingCountryCode(String billingCountryCode) {
    this.billingCountryCode = billingCountryCode;
    return this;
  }

  public String getCustomId() {
    return customId;
  }
  public InputTransaction setCustomId(String customId) {
    this.customId = customId;
    return this;
  }

  public AdditionalCurrencies getAdditionalCurrencies() {
    return additionalCurrencies;
  }
  public InputTransaction setAdditionalCurrencies(AdditionalCurrencies additionalCurrencies) {
    this.additionalCurrencies = additionalCurrencies;
    return this;
  }

  public String getInvoicePlace() {
    return invoicePlace;
  }
  public InputTransaction setInvoicePlace(String invoicePlace) {
    this.invoicePlace = invoicePlace;
    return this;
  }

  public Evidence getEvidence() {
    return evidence;
  }
  public InputTransaction setEvidence(Evidence evidence) {
    this.evidence = evidence;
    return this;
  }

  public String getDescription() {
    return description;
  }
  public InputTransaction setDescription(String description) {
    this.description = description;
    return this;
  }

  public Boolean getTaxDeducted() {
    return taxDeducted;
  }
  public InputTransaction setTaxDeducted(Boolean taxDeducted) {
    this.taxDeducted = taxDeducted;
    return this;
  }

  public String getTaxCountryCode() {
    return taxCountryCode;
  }
  public InputTransaction setTaxCountryCode(String taxCountryCode) {
    this.taxCountryCode = taxCountryCode;
    return this;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputTransaction {\n");
    sb.append("  buyerCreditCardPrefix: ").append(buyerCreditCardPrefix).append("\n");
    sb.append("  customData: ").append(customData).append("\n");
    sb.append("  buyerName: ").append(buyerName).append("\n");
    sb.append("  invoiceDate: ").append(invoiceDate).append("\n");
    sb.append("  currencyCode: ").append(currencyCode).append("\n");
    sb.append("  supplyDate: ").append(supplyDate).append("\n");
    sb.append("  invoiceAddress: ").append(invoiceAddress).append("\n");
    sb.append("  verificationToken: ").append(verificationToken).append("\n");
    sb.append("  transactionLines: ").append(transactionLines).append("\n");
    sb.append("  buyerTaxNumber: ").append(buyerTaxNumber).append("\n");
    sb.append("  customFields: ").append(customFields).append("\n");
    sb.append("  forceCountryCode: ").append(forceCountryCode).append("\n");
    sb.append("  invoiceNumber: ").append(invoiceNumber).append("\n");
    sb.append("  orderDate: ").append(orderDate).append("\n");
    sb.append("  buyerIp: ").append(buyerIp).append("\n");
    sb.append("  buyerEmail: ").append(buyerEmail).append("\n");
    sb.append("  originalTransactionKey: ").append(originalTransactionKey).append("\n");
    sb.append("  billingCountryCode: ").append(billingCountryCode).append("\n");
    sb.append("  customId: ").append(customId).append("\n");
    sb.append("  additionalCurrencies: ").append(additionalCurrencies).append("\n");
    sb.append("  invoicePlace: ").append(invoicePlace).append("\n");
    sb.append("  evidence: ").append(evidence).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  taxDeducted: ").append(taxDeducted).append("\n");
    sb.append("  taxCountryCode: ").append(taxCountryCode).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

