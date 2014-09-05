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
import com.taxamo.client.model.SettlementReportEntry;
public class GetSettlementReportOut {
  /* Quarter start date in yyyy-MM-dd'T'hh:mm:ss'Z' format. */
  private String startDate = null;
  /* Quarter end date in yyyy-MM-dd'T'hh:mm:ss'Z' format. */
  private String endDate = null;
  /* Settlement report. */
  private List<SettlementReportEntry> report = new ArrayList<SettlementReportEntry>();
  public String getStartDate() {
    return startDate;
  }
  public GetSettlementReportOut setStartDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  public String getEndDate() {
    return endDate;
  }
  public GetSettlementReportOut setEndDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  public List<SettlementReportEntry> getReport() {
    return report;
  }
  public GetSettlementReportOut setReport(List<SettlementReportEntry> report) {
    this.report = report;
    return this;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSettlementReportOut {\n");
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("  endDate: ").append(endDate).append("\n");
    sb.append("  report: ").append(report).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
