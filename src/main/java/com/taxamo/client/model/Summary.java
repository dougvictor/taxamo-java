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
public class Summary {
  /* Quarter that this summary applies to. */
  private String quarter = null;
  /* Tax amount due in this quarter. */
  private BigDecimal taxAmount = null;
  /* In which currency code the settlement was calculated. */
  private String currencyCode = null;
  /* If the quarter isn't closed yet, tax amount is indicative, as we cannot determine FX rate or all transactions yet. */
  private Boolean indicative = null;
  /* Date of ECB FX rate used for conversions in yyyy-MM-dd'T'hh:mm:ss'Z' format. */
  private String fxRateDate = null;
  /* Tax entity that the tax is due. */
  private String taxEntityName = null;
  public String getQuarter() {
    return quarter;
  }
  public Summary setQuarter(String quarter) {
    this.quarter = quarter;
    return this;
  }

  public BigDecimal getTaxAmount() {
    return taxAmount;
  }
  public Summary setTaxAmount(BigDecimal taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

  public String getCurrencyCode() {
    return currencyCode;
  }
  public Summary setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  public Boolean getIndicative() {
    return indicative;
  }
  public Summary setIndicative(Boolean indicative) {
    this.indicative = indicative;
    return this;
  }

  public String getFxRateDate() {
    return fxRateDate;
  }
  public Summary setFxRateDate(String fxRateDate) {
    this.fxRateDate = fxRateDate;
    return this;
  }

  public String getTaxEntityName() {
    return taxEntityName;
  }
  public Summary setTaxEntityName(String taxEntityName) {
    this.taxEntityName = taxEntityName;
    return this;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Summary {\n");
    sb.append("  quarter: ").append(quarter).append("\n");
    sb.append("  taxAmount: ").append(taxAmount).append("\n");
    sb.append("  currencyCode: ").append(currencyCode).append("\n");
    sb.append("  indicative: ").append(indicative).append("\n");
    sb.append("  fxRateDate: ").append(fxRateDate).append("\n");
    sb.append("  taxEntityName: ").append(taxEntityName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
