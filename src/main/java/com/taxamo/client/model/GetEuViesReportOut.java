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
import com.taxamo.client.model.Report;
public class GetEuViesReportOut {
  /* Settlement report. */
  @JsonProperty("report")
  private List<Report> report = new ArrayList<Report>();
  /* Three-letter ISO currency code. */
  @JsonProperty("currency_code")
  private String currencyCode = null;
  /* Period start date in yyyy-MM-dd'T'hh:mm:ss'Z' format. */
  @JsonProperty("start_date")
  private String startDate = null;
  /* Period end date in yyyy-MM-dd'T'hh:mm:ss'Z' format. */
  @JsonProperty("end_date")
  private String endDate = null;
  @JsonProperty("report")
  public List<Report> getReport() {
    return report;
  }

  @JsonProperty("report")
  public GetEuViesReportOut setReport(List<Report> report) {
    this.report = report;
    return this;
  }

  @JsonProperty("currency_code")
  public String getCurrencyCode() {
    return currencyCode;
  }

  @JsonProperty("currency_code")
  public GetEuViesReportOut setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  @JsonProperty("start_date")
  public String getStartDate() {
    return startDate;
  }

  @JsonProperty("start_date")
  public GetEuViesReportOut setStartDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  @JsonProperty("end_date")
  public String getEndDate() {
    return endDate;
  }

  @JsonProperty("end_date")
  public GetEuViesReportOut setEndDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEuViesReportOut {\n");
    sb.append("  report: ").append(report).append("\n");
    sb.append("  currencyCode: ").append(currencyCode).append("\n");
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("  endDate: ").append(endDate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
