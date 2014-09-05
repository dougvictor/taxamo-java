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


import java.math.BigDecimal;
import java.util.*;
import com.taxamo.client.model.AdditionalCurrencies;
import com.taxamo.client.model.TransactionLines;
import com.taxamo.client.model.Evidence;
import com.taxamo.client.model.CustomFields;
import com.taxamo.client.model.InvoiceAddress;
import com.taxamo.client.model.Countries;
public class Transaction {
  /* Invoice date of issue. */
  private String invoiceDate = null;
  /* Invoice address. */
  private InvoiceAddress invoiceAddress = null;
  /* Is the transaction created manually - using private token. */
  private Boolean manual = null;
  /* Buyer's credit card prefix. */
  private String buyerCreditCardPrefix = null;
  /* Custom fields, stored as key-value pairs. This property is not processed and used mostly with Taxamo-built helpers. */
  private List<CustomFields> customFields = new ArrayList<CustomFields>();
  /* Additional currency information - can be used to receive additional information about invoice in another currency. */
  private AdditionalCurrencies additionalCurrencies = null;
  /*  Buyer's tax number - EU VAT number for example. */
  private String buyerTaxNumber = null;
  /* Custom identifier provided upon transaction creation. */
  private String customId = null;
  /* How much tax has been deducted. */
  private BigDecimal deductedTaxAmount = null;
  /* Two-letter ISO country code, e.g. FR. This code applies to detected/set country for transaction, but can be set using manual mode. */
  private String taxCountryCode = null;
  /* Two-letter ISO country code, e.g. FR. Use it to force country code for tax calculation. */
  private String forceCountryCode = null;
  /* Tax amount of transaction. */
  private BigDecimal taxAmount = null;
  /* Timezone name for tax transaction. */
  private String taxTimezone = null;
  /* Use data and evidence from original transaction. Tax will be re-calculated, but evidence won't be re-checked. */
  private String originalTransactionKey = null;
  /* Was this transaction created in test mode? */
  private Boolean test = null;
  /* Transaction status. */
  private String status = null;
  /* Date and time of transaction creation. */
  private String createTimestamp = null;
  /* Total amount of transaction. */
  private BigDecimal totalAmount = null;
  /* To which entity is the tax due. */
  private String taxEntityName = null;
  /* IP address of the buyer in dotted decimal (IPv4) or text format (IPv6). */
  private String buyerIp = null;
  /* Refunded tax amount. */
  private BigDecimal refundedTaxAmount = null;
  /* Map of countries calculated from evidence provided. This value is not stored and is available only upon tax calculation. */
  private Countries countries = null;
  /* Invoice place of issue. */
  private String invoicePlace = null;
  /* Verification token */
  private String verificationToken = null;
  /* True if the transaction deducted from tax and no tax is applied. Either set automatically when VAT number validates with VIES correctly, but can also be provided in manual mode. */
  private Boolean taxDeducted = null;
  /* Buyer's name - first name and last name or company name. */
  private String buyerName = null;
  /* Date and time of transaction confirmation. */
  private String confirmTimestamp = null;
  /* Tax country of residence evidence. */
  private Evidence evidence = null;
  /* Amount of transaction without tax. */
  private BigDecimal amount = null;
  /* Custom data related to transaction. */
  private String customData = null;
  /* Billing two letter ISO country code. */
  private String billingCountryCode = null;
  /* Is tax calculation supported for a detected tax location? */
  private Boolean taxSupported = null;
  /* Invoice number. */
  private String invoiceNumber = null;
  /* Currency code for transaction - e.g. EUR. */
  private String currencyCode = null;
  /* Total amount refunde (including tax). */
  private BigDecimal refundedTotalAmount = null;
  /* Transaction description. */
  private String description = null;
  /* Supply date in yyyy-MM-dd format. */
  private String supplyDate = null;
  /* Transaction lines. */
  private List<TransactionLines> transactionLines = new ArrayList<TransactionLines>();
  /* Order date in yyyy-MM-dd format. */
  private String orderDate = null;
  /* Id generated by taxamo. */
  private String key = null;
  public String getInvoiceDate() {
    return invoiceDate;
  }
  public Transaction setInvoiceDate(String invoiceDate) {
    this.invoiceDate = invoiceDate;
    return this;
  }

  public InvoiceAddress getInvoiceAddress() {
    return invoiceAddress;
  }
  public Transaction setInvoiceAddress(InvoiceAddress invoiceAddress) {
    this.invoiceAddress = invoiceAddress;
    return this;
  }

  public Boolean getManual() {
    return manual;
  }
  public Transaction setManual(Boolean manual) {
    this.manual = manual;
    return this;
  }

  public String getBuyerCreditCardPrefix() {
    return buyerCreditCardPrefix;
  }
  public Transaction setBuyerCreditCardPrefix(String buyerCreditCardPrefix) {
    this.buyerCreditCardPrefix = buyerCreditCardPrefix;
    return this;
  }

  public List<CustomFields> getCustomFields() {
    return customFields;
  }
  public Transaction setCustomFields(List<CustomFields> customFields) {
    this.customFields = customFields;
    return this;
  }

  public AdditionalCurrencies getAdditionalCurrencies() {
    return additionalCurrencies;
  }
  public Transaction setAdditionalCurrencies(AdditionalCurrencies additionalCurrencies) {
    this.additionalCurrencies = additionalCurrencies;
    return this;
  }

  public String getBuyerTaxNumber() {
    return buyerTaxNumber;
  }
  public Transaction setBuyerTaxNumber(String buyerTaxNumber) {
    this.buyerTaxNumber = buyerTaxNumber;
    return this;
  }

  public String getCustomId() {
    return customId;
  }
  public Transaction setCustomId(String customId) {
    this.customId = customId;
    return this;
  }

  public BigDecimal getDeductedTaxAmount() {
    return deductedTaxAmount;
  }
  public Transaction setDeductedTaxAmount(BigDecimal deductedTaxAmount) {
    this.deductedTaxAmount = deductedTaxAmount;
    return this;
  }

  public String getTaxCountryCode() {
    return taxCountryCode;
  }
  public Transaction setTaxCountryCode(String taxCountryCode) {
    this.taxCountryCode = taxCountryCode;
    return this;
  }

  public String getForceCountryCode() {
    return forceCountryCode;
  }
  public Transaction setForceCountryCode(String forceCountryCode) {
    this.forceCountryCode = forceCountryCode;
    return this;
  }

  public BigDecimal getTaxAmount() {
    return taxAmount;
  }
  public Transaction setTaxAmount(BigDecimal taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

  public String getTaxTimezone() {
    return taxTimezone;
  }
  public Transaction setTaxTimezone(String taxTimezone) {
    this.taxTimezone = taxTimezone;
    return this;
  }

  public String getOriginalTransactionKey() {
    return originalTransactionKey;
  }
  public Transaction setOriginalTransactionKey(String originalTransactionKey) {
    this.originalTransactionKey = originalTransactionKey;
    return this;
  }

  public Boolean getTest() {
    return test;
  }
  public Transaction setTest(Boolean test) {
    this.test = test;
    return this;
  }

  public String getStatus() {
    return status;
  }
  public Transaction setStatus(String status) {
    this.status = status;
    return this;
  }

  public String getCreateTimestamp() {
    return createTimestamp;
  }
  public Transaction setCreateTimestamp(String createTimestamp) {
    this.createTimestamp = createTimestamp;
    return this;
  }

  public BigDecimal getTotalAmount() {
    return totalAmount;
  }
  public Transaction setTotalAmount(BigDecimal totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

  public String getTaxEntityName() {
    return taxEntityName;
  }
  public Transaction setTaxEntityName(String taxEntityName) {
    this.taxEntityName = taxEntityName;
    return this;
  }

  public String getBuyerIp() {
    return buyerIp;
  }
  public Transaction setBuyerIp(String buyerIp) {
    this.buyerIp = buyerIp;
    return this;
  }

  public BigDecimal getRefundedTaxAmount() {
    return refundedTaxAmount;
  }
  public Transaction setRefundedTaxAmount(BigDecimal refundedTaxAmount) {
    this.refundedTaxAmount = refundedTaxAmount;
    return this;
  }

  public Countries getCountries() {
    return countries;
  }
  public Transaction setCountries(Countries countries) {
    this.countries = countries;
    return this;
  }

  public String getInvoicePlace() {
    return invoicePlace;
  }
  public Transaction setInvoicePlace(String invoicePlace) {
    this.invoicePlace = invoicePlace;
    return this;
  }

  public String getVerificationToken() {
    return verificationToken;
  }
  public Transaction setVerificationToken(String verificationToken) {
    this.verificationToken = verificationToken;
    return this;
  }

  public Boolean getTaxDeducted() {
    return taxDeducted;
  }
  public Transaction setTaxDeducted(Boolean taxDeducted) {
    this.taxDeducted = taxDeducted;
    return this;
  }

  public String getBuyerName() {
    return buyerName;
  }
  public Transaction setBuyerName(String buyerName) {
    this.buyerName = buyerName;
    return this;
  }

  public String getConfirmTimestamp() {
    return confirmTimestamp;
  }
  public Transaction setConfirmTimestamp(String confirmTimestamp) {
    this.confirmTimestamp = confirmTimestamp;
    return this;
  }

  public Evidence getEvidence() {
    return evidence;
  }
  public Transaction setEvidence(Evidence evidence) {
    this.evidence = evidence;
    return this;
  }

  public BigDecimal getAmount() {
    return amount;
  }
  public Transaction setAmount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  public String getCustomData() {
    return customData;
  }
  public Transaction setCustomData(String customData) {
    this.customData = customData;
    return this;
  }

  public String getBillingCountryCode() {
    return billingCountryCode;
  }
  public Transaction setBillingCountryCode(String billingCountryCode) {
    this.billingCountryCode = billingCountryCode;
    return this;
  }

  public Boolean getTaxSupported() {
    return taxSupported;
  }
  public Transaction setTaxSupported(Boolean taxSupported) {
    this.taxSupported = taxSupported;
    return this;
  }

  public String getInvoiceNumber() {
    return invoiceNumber;
  }
  public Transaction setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

  public String getCurrencyCode() {
    return currencyCode;
  }
  public Transaction setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  public BigDecimal getRefundedTotalAmount() {
    return refundedTotalAmount;
  }
  public Transaction setRefundedTotalAmount(BigDecimal refundedTotalAmount) {
    this.refundedTotalAmount = refundedTotalAmount;
    return this;
  }

  public String getDescription() {
    return description;
  }
  public Transaction setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getSupplyDate() {
    return supplyDate;
  }
  public Transaction setSupplyDate(String supplyDate) {
    this.supplyDate = supplyDate;
    return this;
  }

  public List<TransactionLines> getTransactionLines() {
    return transactionLines;
  }
  public Transaction setTransactionLines(List<TransactionLines> transactionLines) {
    this.transactionLines = transactionLines;
    return this;
  }

  public String getOrderDate() {
    return orderDate;
  }
  public Transaction setOrderDate(String orderDate) {
    this.orderDate = orderDate;
    return this;
  }

  public String getKey() {
    return key;
  }
  public Transaction setKey(String key) {
    this.key = key;
    return this;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    sb.append("  invoiceDate: ").append(invoiceDate).append("\n");
    sb.append("  invoiceAddress: ").append(invoiceAddress).append("\n");
    sb.append("  manual: ").append(manual).append("\n");
    sb.append("  buyerCreditCardPrefix: ").append(buyerCreditCardPrefix).append("\n");
    sb.append("  customFields: ").append(customFields).append("\n");
    sb.append("  additionalCurrencies: ").append(additionalCurrencies).append("\n");
    sb.append("  buyerTaxNumber: ").append(buyerTaxNumber).append("\n");
    sb.append("  customId: ").append(customId).append("\n");
    sb.append("  deductedTaxAmount: ").append(deductedTaxAmount).append("\n");
    sb.append("  taxCountryCode: ").append(taxCountryCode).append("\n");
    sb.append("  forceCountryCode: ").append(forceCountryCode).append("\n");
    sb.append("  taxAmount: ").append(taxAmount).append("\n");
    sb.append("  taxTimezone: ").append(taxTimezone).append("\n");
    sb.append("  originalTransactionKey: ").append(originalTransactionKey).append("\n");
    sb.append("  test: ").append(test).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  createTimestamp: ").append(createTimestamp).append("\n");
    sb.append("  totalAmount: ").append(totalAmount).append("\n");
    sb.append("  taxEntityName: ").append(taxEntityName).append("\n");
    sb.append("  buyerIp: ").append(buyerIp).append("\n");
    sb.append("  refundedTaxAmount: ").append(refundedTaxAmount).append("\n");
    sb.append("  countries: ").append(countries).append("\n");
    sb.append("  invoicePlace: ").append(invoicePlace).append("\n");
    sb.append("  verificationToken: ").append(verificationToken).append("\n");
    sb.append("  taxDeducted: ").append(taxDeducted).append("\n");
    sb.append("  buyerName: ").append(buyerName).append("\n");
    sb.append("  confirmTimestamp: ").append(confirmTimestamp).append("\n");
    sb.append("  evidence: ").append(evidence).append("\n");
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  customData: ").append(customData).append("\n");
    sb.append("  billingCountryCode: ").append(billingCountryCode).append("\n");
    sb.append("  taxSupported: ").append(taxSupported).append("\n");
    sb.append("  invoiceNumber: ").append(invoiceNumber).append("\n");
    sb.append("  currencyCode: ").append(currencyCode).append("\n");
    sb.append("  refundedTotalAmount: ").append(refundedTotalAmount).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  supplyDate: ").append(supplyDate).append("\n");
    sb.append("  transactionLines: ").append(transactionLines).append("\n");
    sb.append("  orderDate: ").append(orderDate).append("\n");
    sb.append("  key: ").append(key).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
