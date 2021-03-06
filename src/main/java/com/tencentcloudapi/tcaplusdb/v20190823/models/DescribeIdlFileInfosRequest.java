/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIdlFileInfosRequest extends AbstractModel{

    /**
    * 文件所属应用实例ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 文件所属大区ID
    */
    @SerializedName("LogicZoneIds")
    @Expose
    private String [] LogicZoneIds;

    /**
    * 指定文件ID
    */
    @SerializedName("IdlFileIds")
    @Expose
    private String [] IdlFileIds;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 文件列表大小
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 文件所属应用实例ID 
     * @return ApplicationId 文件所属应用实例ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 文件所属应用实例ID
     * @param ApplicationId 文件所属应用实例ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 文件所属大区ID 
     * @return LogicZoneIds 文件所属大区ID
     */
    public String [] getLogicZoneIds() {
        return this.LogicZoneIds;
    }

    /**
     * Set 文件所属大区ID
     * @param LogicZoneIds 文件所属大区ID
     */
    public void setLogicZoneIds(String [] LogicZoneIds) {
        this.LogicZoneIds = LogicZoneIds;
    }

    /**
     * Get 指定文件ID 
     * @return IdlFileIds 指定文件ID
     */
    public String [] getIdlFileIds() {
        return this.IdlFileIds;
    }

    /**
     * Set 指定文件ID
     * @param IdlFileIds 指定文件ID
     */
    public void setIdlFileIds(String [] IdlFileIds) {
        this.IdlFileIds = IdlFileIds;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 文件列表大小 
     * @return Limit 文件列表大小
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 文件列表大小
     * @param Limit 文件列表大小
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamArraySimple(map, prefix + "LogicZoneIds.", this.LogicZoneIds);
        this.setParamArraySimple(map, prefix + "IdlFileIds.", this.IdlFileIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

