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
import com.taxamo.client.model.CustomFields;
public class InputTransactionLine {
  /* Product type, according to dictionary /dictionaries/product_types.  */
  private String productType = null;
  /* Date of supply in yyyy-MM-dd format. */
  private String supplyDate = null;
  /* Unit price. */
  private BigDecimal unitPrice = null;
  /* Unit of measure. */
  private String unitOfMeasure = null;
  /* Quantity Defaults to 1. */
  private BigDecimal quantity = null;
  /* Custom fields, stored as key-value pairs. This property is not processed and used mostly with Taxamo-built helpers. */
  private List<CustomFields> customFields = new ArrayList<CustomFields>();
  /* Generated line key. */
  private String lineKey = null;
  /* Tax name, calculated by taxamo.  Can be overwritten when informative field is true. */
  private String taxName = null;
  /* Internal product code, used for invoicing for example. */
  private String productCode = null;
  /* Amount. Required if total amount is not provided. */
  private BigDecimal amount = null;
  /* Custom id, provided by ecommerce software. */
  private String customId = null;
  /* If the line is provided for informative purposes. Such line must have :tax-rate and optionally :tax-name - if not, API validation will fail for this line. */
  private Boolean informative = null;
  /* Tax rate, calculated by taxamo. Must be provided when informative field is true. */
  private BigDecimal taxRate = null;
  /* Total amount. Required if amount is not provided. */
  private BigDecimal totalAmount = null;
  /* Line contents description. */
  private String description = null;
  public String getProductType() {
    return productType;
  }
  public InputTransactionLine setProductType(String productType) {
    this.productType = productType;
    return this;
  }

  public String getSupplyDate() {
    return supplyDate;
  }
  public InputTransactionLine setSupplyDate(String supplyDate) {
    this.supplyDate = supplyDate;
    return this;
  }

  public BigDecimal getUnitPrice() {
    return unitPrice;
  }
  public InputTransactionLine setUnitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

  public String getUnitOfMeasure() {
    return unitOfMeasure;
  }
  public InputTransactionLine setUnitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }

  public BigDecimal getQuantity() {
    return quantity;
  }
  public InputTransactionLine setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
    return this;
  }

  public List<CustomFields> getCustomFields() {
    return customFields;
  }
  public InputTransactionLine setCustomFields(List<CustomFields> customFields) {
    this.customFields = customFields;
    return this;
  }

  public String getLineKey() {
    return lineKey;
  }
  public InputTransactionLine setLineKey(String lineKey) {
    this.lineKey = lineKey;
    return this;
  }

  public String getTaxName() {
    return taxName;
  }
  public InputTransactionLine setTaxName(String taxName) {
    this.taxName = taxName;
    return this;
  }

  public String getProductCode() {
    return productCode;
  }
  public InputTransactionLine setProductCode(String productCode) {
    this.productCode = productCode;
    return this;
  }

  public BigDecimal getAmount() {
    return amount;
  }
  public InputTransactionLine setAmount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  public String getCustomId() {
    return customId;
  }
  public InputTransactionLine setCustomId(String customId) {
    this.customId = customId;
    return this;
  }

  public Boolean getInformative() {
    return informative;
  }
  public InputTransactionLine setInformative(Boolean informative) {
    this.informative = informative;
    return this;
  }

  public BigDecimal getTaxRate() {
    return taxRate;
  }
  public InputTransactionLine setTaxRate(BigDecimal taxRate) {
    this.taxRate = taxRate;
    return this;
  }

  public BigDecimal getTotalAmount() {
    return totalAmount;
  }
  public InputTransactionLine setTotalAmount(BigDecimal totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

  public String getDescription() {
    return description;
  }
  public InputTransactionLine setDescription(String description) {
    this.description = description;
    return this;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputTransactionLine {\n");
    sb.append("  productType: ").append(productType).append("\n");
    sb.append("  supplyDate: ").append(supplyDate).append("\n");
    sb.append("  unitPrice: ").append(unitPrice).append("\n");
    sb.append("  unitOfMeasure: ").append(unitOfMeasure).append("\n");
    sb.append("  quantity: ").append(quantity).append("\n");
    sb.append("  customFields: ").append(customFields).append("\n");
    sb.append("  lineKey: ").append(lineKey).append("\n");
    sb.append("  taxName: ").append(taxName).append("\n");
    sb.append("  productCode: ").append(productCode).append("\n");
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  customId: ").append(customId).append("\n");
    sb.append("  informative: ").append(informative).append("\n");
    sb.append("  taxRate: ").append(taxRate).append("\n");
    sb.append("  totalAmount: ").append(totalAmount).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

