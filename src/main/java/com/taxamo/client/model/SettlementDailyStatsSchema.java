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


import java.lang.Integer;
public class SettlementDailyStatsSchema {
  /* B2C transaction count. */
  private Integer b2c = null;
  /* Untaxed transaction count. */
  private Integer untaxed = null;
  /* Total EU Taxed transaction count. */
  private Integer euTaxed = null;
  /* Total EU B2B transaction count. */
  private Integer euB2b = null;
  /* Total transaction count. */
  private Integer count = null;
  /* Total EU transaction count. */
  private Integer euTotal = null;
  /* Date for stats in yyyy-MM-dd'T'hh:mm:ss'Z' format. */
  private String dayRaw = null;
  /* B2B transaction count. */
  private Integer b2b = null;
  /* Date for stats in yyyy-MM-dd format. */
  private String day = null;
  public Integer getB2c() {
    return b2c;
  }
  public SettlementDailyStatsSchema setB2c(Integer b2c) {
    this.b2c = b2c;
    return this;
  }

  public Integer getUntaxed() {
    return untaxed;
  }
  public SettlementDailyStatsSchema setUntaxed(Integer untaxed) {
    this.untaxed = untaxed;
    return this;
  }

  public Integer getEuTaxed() {
    return euTaxed;
  }
  public SettlementDailyStatsSchema setEuTaxed(Integer euTaxed) {
    this.euTaxed = euTaxed;
    return this;
  }

  public Integer getEuB2b() {
    return euB2b;
  }
  public SettlementDailyStatsSchema setEuB2b(Integer euB2b) {
    this.euB2b = euB2b;
    return this;
  }

  public Integer getCount() {
    return count;
  }
  public SettlementDailyStatsSchema setCount(Integer count) {
    this.count = count;
    return this;
  }

  public Integer getEuTotal() {
    return euTotal;
  }
  public SettlementDailyStatsSchema setEuTotal(Integer euTotal) {
    this.euTotal = euTotal;
    return this;
  }

  public String getDayRaw() {
    return dayRaw;
  }
  public SettlementDailyStatsSchema setDayRaw(String dayRaw) {
    this.dayRaw = dayRaw;
    return this;
  }

  public Integer getB2b() {
    return b2b;
  }
  public SettlementDailyStatsSchema setB2b(Integer b2b) {
    this.b2b = b2b;
    return this;
  }

  public String getDay() {
    return day;
  }
  public SettlementDailyStatsSchema setDay(String day) {
    this.day = day;
    return this;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettlementDailyStatsSchema {\n");
    sb.append("  b2c: ").append(b2c).append("\n");
    sb.append("  untaxed: ").append(untaxed).append("\n");
    sb.append("  euTaxed: ").append(euTaxed).append("\n");
    sb.append("  euB2b: ").append(euB2b).append("\n");
    sb.append("  count: ").append(count).append("\n");
    sb.append("  euTotal: ").append(euTotal).append("\n");
    sb.append("  dayRaw: ").append(dayRaw).append("\n");
    sb.append("  b2b: ").append(b2b).append("\n");
    sb.append("  day: ").append(day).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

