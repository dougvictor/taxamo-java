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

import java.math.BigDecimal;
public class GetDomesticSummaryReportOut {
  /* Period end date in yyyy-MM-dd'T'hh:mm:ss'Z' format. */
  @JsonProperty("end_date")
  private String endDate = null;
  /* Domestic sales refunds amount. */
  @JsonProperty("domestic_refunds_amount")
  private BigDecimal domesticRefundsAmount = null;
  /* Three-letter ISO currency code. */
  @JsonProperty("currency_code")
  private String currencyCode = null;
  /* Global sales refunds amount. This includes refunds from domestic country too. */
  @JsonProperty("global_refunds_tax_amount")
  private BigDecimal globalRefundsTaxAmount = null;
  /* Domestic sales refunds tax amout. */
  @JsonProperty("domestic_refunds_tax_amount")
  private BigDecimal domesticRefundsTaxAmount = null;
  /* EU deducted tax sales. */
  @JsonProperty("eu_tax_deducted_refunds")
  private BigDecimal euTaxDeductedRefunds = null;
  /* Global sales amount. This includes sales from domestic country too. */
  @JsonProperty("global_sales_amount")
  private BigDecimal globalSalesAmount = null;
  /* Global sales refunds amount. This includes refunds from domestic country too. */
  @JsonProperty("global_refunds_amount")
  private BigDecimal globalRefundsAmount = null;
  /* Global sales amount. This includes sales from domestic country too. */
  @JsonProperty("global_sales_tax_amount")
  private BigDecimal globalSalesTaxAmount = null;
  /* EU deducted tax sales. */
  @JsonProperty("eu_tax_deducted_sales")
  private BigDecimal euTaxDeductedSales = null;
  /* Period start date in yyyy-MM-dd'T'hh:mm:ss'Z' format. */
  @JsonProperty("start_date")
  private String startDate = null;
  /* Domestic sales tax amout. */
  @JsonProperty("domestic_tax_amount")
  private BigDecimal domesticTaxAmount = null;
  /* Domestic sales amount. */
  @JsonProperty("domestic_sales_amount")
  private BigDecimal domesticSalesAmount = null;
  @JsonProperty("end_date")
  public String getEndDate() {
    return endDate;
  }

  @JsonProperty("end_date")
  public GetDomesticSummaryReportOut setEndDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  @JsonProperty("domestic_refunds_amount")
  public BigDecimal getDomesticRefundsAmount() {
    return domesticRefundsAmount;
  }

  @JsonProperty("domestic_refunds_amount")
  public GetDomesticSummaryReportOut setDomesticRefundsAmount(BigDecimal domesticRefundsAmount) {
    this.domesticRefundsAmount = domesticRefundsAmount;
    return this;
  }

  @JsonProperty("currency_code")
  public String getCurrencyCode() {
    return currencyCode;
  }

  @JsonProperty("currency_code")
  public GetDomesticSummaryReportOut setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  @JsonProperty("global_refunds_tax_amount")
  public BigDecimal getGlobalRefundsTaxAmount() {
    return globalRefundsTaxAmount;
  }

  @JsonProperty("global_refunds_tax_amount")
  public GetDomesticSummaryReportOut setGlobalRefundsTaxAmount(BigDecimal globalRefundsTaxAmount) {
    this.globalRefundsTaxAmount = globalRefundsTaxAmount;
    return this;
  }

  @JsonProperty("domestic_refunds_tax_amount")
  public BigDecimal getDomesticRefundsTaxAmount() {
    return domesticRefundsTaxAmount;
  }

  @JsonProperty("domestic_refunds_tax_amount")
  public GetDomesticSummaryReportOut setDomesticRefundsTaxAmount(BigDecimal domesticRefundsTaxAmount) {
    this.domesticRefundsTaxAmount = domesticRefundsTaxAmount;
    return this;
  }

  @JsonProperty("eu_tax_deducted_refunds")
  public BigDecimal getEuTaxDeductedRefunds() {
    return euTaxDeductedRefunds;
  }

  @JsonProperty("eu_tax_deducted_refunds")
  public GetDomesticSummaryReportOut setEuTaxDeductedRefunds(BigDecimal euTaxDeductedRefunds) {
    this.euTaxDeductedRefunds = euTaxDeductedRefunds;
    return this;
  }

  @JsonProperty("global_sales_amount")
  public BigDecimal getGlobalSalesAmount() {
    return globalSalesAmount;
  }

  @JsonProperty("global_sales_amount")
  public GetDomesticSummaryReportOut setGlobalSalesAmount(BigDecimal globalSalesAmount) {
    this.globalSalesAmount = globalSalesAmount;
    return this;
  }

  @JsonProperty("global_refunds_amount")
  public BigDecimal getGlobalRefundsAmount() {
    return globalRefundsAmount;
  }

  @JsonProperty("global_refunds_amount")
  public GetDomesticSummaryReportOut setGlobalRefundsAmount(BigDecimal globalRefundsAmount) {
    this.globalRefundsAmount = globalRefundsAmount;
    return this;
  }

  @JsonProperty("global_sales_tax_amount")
  public BigDecimal getGlobalSalesTaxAmount() {
    return globalSalesTaxAmount;
  }

  @JsonProperty("global_sales_tax_amount")
  public GetDomesticSummaryReportOut setGlobalSalesTaxAmount(BigDecimal globalSalesTaxAmount) {
    this.globalSalesTaxAmount = globalSalesTaxAmount;
    return this;
  }

  @JsonProperty("eu_tax_deducted_sales")
  public BigDecimal getEuTaxDeductedSales() {
    return euTaxDeductedSales;
  }

  @JsonProperty("eu_tax_deducted_sales")
  public GetDomesticSummaryReportOut setEuTaxDeductedSales(BigDecimal euTaxDeductedSales) {
    this.euTaxDeductedSales = euTaxDeductedSales;
    return this;
  }

  @JsonProperty("start_date")
  public String getStartDate() {
    return startDate;
  }

  @JsonProperty("start_date")
  public GetDomesticSummaryReportOut setStartDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  @JsonProperty("domestic_tax_amount")
  public BigDecimal getDomesticTaxAmount() {
    return domesticTaxAmount;
  }

  @JsonProperty("domestic_tax_amount")
  public GetDomesticSummaryReportOut setDomesticTaxAmount(BigDecimal domesticTaxAmount) {
    this.domesticTaxAmount = domesticTaxAmount;
    return this;
  }

  @JsonProperty("domestic_sales_amount")
  public BigDecimal getDomesticSalesAmount() {
    return domesticSalesAmount;
  }

  @JsonProperty("domestic_sales_amount")
  public GetDomesticSummaryReportOut setDomesticSalesAmount(BigDecimal domesticSalesAmount) {
    this.domesticSalesAmount = domesticSalesAmount;
    return this;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDomesticSummaryReportOut {\n");
    sb.append("  endDate: ").append(endDate).append("\n");
    sb.append("  domesticRefundsAmount: ").append(domesticRefundsAmount).append("\n");
    sb.append("  currencyCode: ").append(currencyCode).append("\n");
    sb.append("  globalRefundsTaxAmount: ").append(globalRefundsTaxAmount).append("\n");
    sb.append("  domesticRefundsTaxAmount: ").append(domesticRefundsTaxAmount).append("\n");
    sb.append("  euTaxDeductedRefunds: ").append(euTaxDeductedRefunds).append("\n");
    sb.append("  globalSalesAmount: ").append(globalSalesAmount).append("\n");
    sb.append("  globalRefundsAmount: ").append(globalRefundsAmount).append("\n");
    sb.append("  globalSalesTaxAmount: ").append(globalSalesTaxAmount).append("\n");
    sb.append("  euTaxDeductedSales: ").append(euTaxDeductedSales).append("\n");
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("  domesticTaxAmount: ").append(domesticTaxAmount).append("\n");
    sb.append("  domesticSalesAmount: ").append(domesticSalesAmount).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

