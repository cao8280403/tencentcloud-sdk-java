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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePublicConfigsRequest extends AbstractModel{

    /**
    * 配置项ID，不传入时查询全量，高优先级
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * 偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页条数，默认为20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 配置项ID列表，不传入时查询全量，低优先级
    */
    @SerializedName("ConfigIdList")
    @Expose
    private String [] ConfigIdList;

    /**
    * 配置项名称，精确查询，不传入时查询全量
    */
    @SerializedName("ConfigName")
    @Expose
    private String ConfigName;

    /**
     * Get 配置项ID，不传入时查询全量，高优先级 
     * @return ConfigId 配置项ID，不传入时查询全量，高优先级
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set 配置项ID，不传入时查询全量，高优先级
     * @param ConfigId 配置项ID，不传入时查询全量，高优先级
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get 偏移量，默认为0 
     * @return Offset 偏移量，默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0
     * @param Offset 偏移量，默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页条数，默认为20 
     * @return Limit 每页条数，默认为20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页条数，默认为20
     * @param Limit 每页条数，默认为20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 配置项ID列表，不传入时查询全量，低优先级 
     * @return ConfigIdList 配置项ID列表，不传入时查询全量，低优先级
     */
    public String [] getConfigIdList() {
        return this.ConfigIdList;
    }

    /**
     * Set 配置项ID列表，不传入时查询全量，低优先级
     * @param ConfigIdList 配置项ID列表，不传入时查询全量，低优先级
     */
    public void setConfigIdList(String [] ConfigIdList) {
        this.ConfigIdList = ConfigIdList;
    }

    /**
     * Get 配置项名称，精确查询，不传入时查询全量 
     * @return ConfigName 配置项名称，精确查询，不传入时查询全量
     */
    public String getConfigName() {
        return this.ConfigName;
    }

    /**
     * Set 配置项名称，精确查询，不传入时查询全量
     * @param ConfigName 配置项名称，精确查询，不传入时查询全量
     */
    public void setConfigName(String ConfigName) {
        this.ConfigName = ConfigName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "ConfigIdList.", this.ConfigIdList);
        this.setParamSimple(map, prefix + "ConfigName", this.ConfigName);

    }
}

