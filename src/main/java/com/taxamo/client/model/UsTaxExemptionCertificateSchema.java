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

import com.taxamo.client.model.UsTaxExemptionCertificateDetailsSchema;
public class UsTaxExemptionCertificateSchema {
  /* The exemption certificate number. */
  @JsonProperty("certificate_id")
  private String certificateId = null;
  /* US tax exemption ertificate detail. */
  @JsonProperty("detail")
  private UsTaxExemptionCertificateDetailsSchema detail = null;
  @JsonProperty("certificate_id")
  public String getCertificateId() {
    return certificateId;
  }

  @JsonProperty("certificate_id")
  public UsTaxExemptionCertificateSchema setCertificateId(String certificateId) {
    this.certificateId = certificateId;
    return this;
  }

  @JsonProperty("detail")
  public UsTaxExemptionCertificateDetailsSchema getDetail() {
    return detail;
  }

  @JsonProperty("detail")
  public UsTaxExemptionCertificateSchema setDetail(UsTaxExemptionCertificateDetailsSchema detail) {
    this.detail = detail;
    return this;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsTaxExemptionCertificateSchema {\n");
    sb.append("  certificateId: ").append(certificateId).append("\n");
    sb.append("  detail: ").append(detail).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
