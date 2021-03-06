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
public class N {
  /* Date for stats in yyyy-MM-dd'T'hh:mm:ss'Z' format. */
  @JsonProperty("day_raw")
  private String dayRaw = null;
  /* Transaction count. */
  @JsonProperty("value")
  private BigDecimal value = null;
  /* Transaction status (C or N). */
  @JsonProperty("status")
  private String status = null;
  /* Date for stats in yyyy-MM-dd format. */
  @JsonProperty("day")
  private String day = null;
  @JsonProperty("day_raw")
  public String getDayRaw() {
    return dayRaw;
  }

  @JsonProperty("day_raw")
  public N setDayRaw(String dayRaw) {
    this.dayRaw = dayRaw;
    return this;
  }

  @JsonProperty("value")
  public BigDecimal getValue() {
    return value;
  }

  @JsonProperty("value")
  public N setValue(BigDecimal value) {
    this.value = value;
    return this;
  }

  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  @JsonProperty("status")
  public N setStatus(String status) {
    this.status = status;
    return this;
  }

  @JsonProperty("day")
  public String getDay() {
    return day;
  }

  @JsonProperty("day")
  public N setDay(String day) {
    this.day = day;
    return this;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class N {\n");
    sb.append("  dayRaw: ").append(dayRaw).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  day: ").append(day).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

