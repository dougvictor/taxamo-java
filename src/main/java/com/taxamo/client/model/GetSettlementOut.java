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
import com.taxamo.client.model.Report;
public class GetSettlementOut {
  /* Settlement report. */
  private List<Report> report = new ArrayList<Report>();
  /* Quarter start date in yyyy-MM-dd'T'hh:mm:ss'Z' format. */
  private String startDate = null;
  /* Quarter end date in yyyy-MM-dd'T'hh:mm:ss'Z' format. */
  private String endDate = null;
  /* If the quarter isn't closed yet, tax amount is indicative, as we cannot determine FX rate or all transactions yet. */
  private Boolean indicative = null;
  /* Date of ECB FX rate used for conversions in yyyy-MM-dd'T'hh:mm:ss'Z' format. */
  private String fxRateDate = null;
  public List<Report> getReport() {
    return report;
  }
  public GetSettlementOut setReport(List<Report> report) {
    this.report = report;
    return this;
  }

  public String getStartDate() {
    return startDate;
  }
  public GetSettlementOut setStartDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  public String getEndDate() {
    return endDate;
  }
  public GetSettlementOut setEndDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  public Boolean getIndicative() {
    return indicative;
  }
  public GetSettlementOut setIndicative(Boolean indicative) {
    this.indicative = indicative;
    return this;
  }

  public String getFxRateDate() {
    return fxRateDate;
  }
  public GetSettlementOut setFxRateDate(String fxRateDate) {
    this.fxRateDate = fxRateDate;
    return this;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSettlementOut {\n");
    sb.append("  report: ").append(report).append("\n");
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("  endDate: ").append(endDate).append("\n");
    sb.append("  indicative: ").append(indicative).append("\n");
    sb.append("  fxRateDate: ").append(fxRateDate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

