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


import com.taxamo.client.model.InputTransaction;
public class CreateTransactionIn {
  /* Use manual mode, bypassing country detection. Only allowed with private token. */
  private Boolean manualMode = null;
  /* Transaction. */
  private InputTransaction transaction = null;
  public Boolean getManualMode() {
    return manualMode;
  }
  public CreateTransactionIn setManualMode(Boolean manualMode) {
    this.manualMode = manualMode;
    return this;
  }

  public InputTransaction getTransaction() {
    return transaction;
  }
  public CreateTransactionIn setTransaction(InputTransaction transaction) {
    this.transaction = transaction;
    return this;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTransactionIn {\n");
    sb.append("  manualMode: ").append(manualMode).append("\n");
    sb.append("  transaction: ").append(transaction).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
