/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.consent.mgt.core.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ReceiptServiceInput {

    private String service;
    private String tenantDomain;
    @SerializedName("serviceDisplayName")
    private String spDisplayName;
    @SerializedName("serviceDescription")
    private String spDescription;
    private List<ReceiptPurposeInput> purposes;
    private int tenantId;

    public String getService() {

        return service;
    }

    public void setService(String service) {

        this.service = service;
    }

    public String getTenantDomain() {

        return tenantDomain;
    }

    public void setTenantDomain(String tenantDomain) {

        this.tenantDomain = tenantDomain;
    }

    public List<ReceiptPurposeInput> getPurposes() {

        return purposes;
    }

    public void setPurposes(List<ReceiptPurposeInput> purposes) {

        this.purposes = purposes;
    }

    public int getTenantId() {

        return tenantId;
    }

    public void setTenantId(int tenantId) {

        this.tenantId = tenantId;
    }

    public String getSpDisplayName() {

        return spDisplayName;
    }

    public void setSpDisplayName(String spDisplayName) {

        this.spDisplayName = spDisplayName;
    }

    public String getSpDescription() {

        return spDescription;
    }

    public void setSpDescription(String spDescription) {

        this.spDescription = spDescription;
    }
}
