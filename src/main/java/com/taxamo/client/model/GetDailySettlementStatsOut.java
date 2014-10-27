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
import com.taxamo.client.model.SettlementDailyStatsSchema;
public class GetDailySettlementStatsOut {
  /* Daily settlement stats */
  private List<SettlementDailyStatsSchema> settlementDaily = new ArrayList<SettlementDailyStatsSchema>();
  public List<SettlementDailyStatsSchema> getSettlementDaily() {
    return settlementDaily;
  }
  public GetDailySettlementStatsOut setSettlementDaily(List<SettlementDailyStatsSchema> settlementDaily) {
    this.settlementDaily = settlementDaily;
    return this;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDailySettlementStatsOut {\n");
    sb.append("  settlementDaily: ").append(settlementDaily).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

