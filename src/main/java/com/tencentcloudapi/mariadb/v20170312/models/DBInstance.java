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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DBInstance extends AbstractModel{

    /**
    * 实例 Id，唯一标识一个 TDSQL 实例
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称，用户可修改
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例所属应用 Id
    */
    @SerializedName("AppId")
    @Expose
    private Integer AppId;

    /**
    * 实例所属项目 Id
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
    * 实例所在地域名称，如 ap-shanghai
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 实例所在可用区名称，如 ap-shanghai-1
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 私有网络 Id，基础网络时为 0
    */
    @SerializedName("VpcId")
    @Expose
    private Integer VpcId;

    /**
    * 子网 Id，基础网络时为 0
    */
    @SerializedName("SubnetId")
    @Expose
    private Integer SubnetId;

    /**
    * 实例状态：0 创建中，1 流程处理中， 2 运行中，3 实例未初始化，-1 实例已隔离，-2 实例已删除
    */
    @SerializedName("Status")
    @Expose
    private Integer Status;

    /**
    * 内网 IP 地址
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 内网端口
    */
    @SerializedName("Vport")
    @Expose
    private Integer Vport;

    /**
    * 外网访问的域名，公网可解析
    */
    @SerializedName("WanDomain")
    @Expose
    private String WanDomain;

    /**
    * 外网 IP 地址，公网可访问
    */
    @SerializedName("WanVip")
    @Expose
    private String WanVip;

    /**
    * 外网端口
    */
    @SerializedName("WanPort")
    @Expose
    private Integer WanPort;

    /**
    * 实例创建时间，格式为 2006-01-02 15:04:05
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 实例最后更新时间，格式为 2006-01-02 15:04:05
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 自动续费标志：0 否，1 是
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Integer AutoRenewFlag;

    /**
    * 实例到期时间，格式为 2006-01-02 15:04:05
    */
    @SerializedName("PeriodEndTime")
    @Expose
    private String PeriodEndTime;

    /**
    * 实例所属账号
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * TDSQL 版本信息
    */
    @SerializedName("TdsqlVersion")
    @Expose
    private String TdsqlVersion;

    /**
    * 实例内存大小，单位 GB
    */
    @SerializedName("Memory")
    @Expose
    private Integer Memory;

    /**
    * 实例存储大小，单位 GB
    */
    @SerializedName("Storage")
    @Expose
    private Integer Storage;

    /**
    * 字符串型的私有网络Id
    */
    @SerializedName("UniqueVpcId")
    @Expose
    private String UniqueVpcId;

    /**
    * 字符串型的私有网络子网Id
    */
    @SerializedName("UniqueSubnetId")
    @Expose
    private String UniqueSubnetId;

    /**
    * 原始实例ID（过时字段，请勿依赖该值）
    */
    @SerializedName("OriginSerialId")
    @Expose
    private String OriginSerialId;

    /**
    * 节点数，2为一主一从，3为一主二从
    */
    @SerializedName("NodeCount")
    @Expose
    private Integer NodeCount;

    /**
    * 是否临时实例，0为否，非0为是
    */
    @SerializedName("IsTmp")
    @Expose
    private Integer IsTmp;

    /**
    * 独享集群Id，为空表示为普通实例
    */
    @SerializedName("ExclusterId")
    @Expose
    private String ExclusterId;

    /**
    * 数字实例Id（过时字段，请勿依赖该值）
    */
    @SerializedName("Id")
    @Expose
    private Integer Id;

    /**
    * 产品类型 Id
    */
    @SerializedName("Pid")
    @Expose
    private Integer Pid;

    /**
    * 最大 Qps 值
    */
    @SerializedName("Qps")
    @Expose
    private Integer Qps;

    /**
    * 付费模式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Paymode")
    @Expose
    private String Paymode;

    /**
    * 实例处于异步任务时的异步任务流程ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Locker")
    @Expose
    private Integer Locker;

    /**
    * 实例目前运行状态描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * 外网状态，0-未开通；1-已开通；2-关闭；3-开通中
    */
    @SerializedName("WanStatus")
    @Expose
    private Integer WanStatus;

    /**
    * 该实例是否支持审计。1-支持；0-不支持
    */
    @SerializedName("IsAuditSupported")
    @Expose
    private Integer IsAuditSupported;

    /**
    * 机器型号
    */
    @SerializedName("Machine")
    @Expose
    private String Machine;

    /**
    * 是否支持数据加密。1-支持；0-不支持
    */
    @SerializedName("IsEncryptSupported")
    @Expose
    private Integer IsEncryptSupported;

    /**
     * Get 实例 Id，唯一标识一个 TDSQL 实例 
     * @return InstanceId 实例 Id，唯一标识一个 TDSQL 实例
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 Id，唯一标识一个 TDSQL 实例
     * @param InstanceId 实例 Id，唯一标识一个 TDSQL 实例
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称，用户可修改 
     * @return InstanceName 实例名称，用户可修改
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称，用户可修改
     * @param InstanceName 实例名称，用户可修改
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例所属应用 Id 
     * @return AppId 实例所属应用 Id
     */
    public Integer getAppId() {
        return this.AppId;
    }

    /**
     * Set 实例所属应用 Id
     * @param AppId 实例所属应用 Id
     */
    public void setAppId(Integer AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 实例所属项目 Id 
     * @return ProjectId 实例所属项目 Id
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 实例所属项目 Id
     * @param ProjectId 实例所属项目 Id
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 实例所在地域名称，如 ap-shanghai 
     * @return Region 实例所在地域名称，如 ap-shanghai
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 实例所在地域名称，如 ap-shanghai
     * @param Region 实例所在地域名称，如 ap-shanghai
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 实例所在可用区名称，如 ap-shanghai-1 
     * @return Zone 实例所在可用区名称，如 ap-shanghai-1
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 实例所在可用区名称，如 ap-shanghai-1
     * @param Zone 实例所在可用区名称，如 ap-shanghai-1
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 私有网络 Id，基础网络时为 0 
     * @return VpcId 私有网络 Id，基础网络时为 0
     */
    public Integer getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络 Id，基础网络时为 0
     * @param VpcId 私有网络 Id，基础网络时为 0
     */
    public void setVpcId(Integer VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网 Id，基础网络时为 0 
     * @return SubnetId 子网 Id，基础网络时为 0
     */
    public Integer getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网 Id，基础网络时为 0
     * @param SubnetId 子网 Id，基础网络时为 0
     */
    public void setSubnetId(Integer SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 实例状态：0 创建中，1 流程处理中， 2 运行中，3 实例未初始化，-1 实例已隔离，-2 实例已删除 
     * @return Status 实例状态：0 创建中，1 流程处理中， 2 运行中，3 实例未初始化，-1 实例已隔离，-2 实例已删除
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态：0 创建中，1 流程处理中， 2 运行中，3 实例未初始化，-1 实例已隔离，-2 实例已删除
     * @param Status 实例状态：0 创建中，1 流程处理中， 2 运行中，3 实例未初始化，-1 实例已隔离，-2 实例已删除
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * Get 内网 IP 地址 
     * @return Vip 内网 IP 地址
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 内网 IP 地址
     * @param Vip 内网 IP 地址
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 内网端口 
     * @return Vport 内网端口
     */
    public Integer getVport() {
        return this.Vport;
    }

    /**
     * Set 内网端口
     * @param Vport 内网端口
     */
    public void setVport(Integer Vport) {
        this.Vport = Vport;
    }

    /**
     * Get 外网访问的域名，公网可解析 
     * @return WanDomain 外网访问的域名，公网可解析
     */
    public String getWanDomain() {
        return this.WanDomain;
    }

    /**
     * Set 外网访问的域名，公网可解析
     * @param WanDomain 外网访问的域名，公网可解析
     */
    public void setWanDomain(String WanDomain) {
        this.WanDomain = WanDomain;
    }

    /**
     * Get 外网 IP 地址，公网可访问 
     * @return WanVip 外网 IP 地址，公网可访问
     */
    public String getWanVip() {
        return this.WanVip;
    }

    /**
     * Set 外网 IP 地址，公网可访问
     * @param WanVip 外网 IP 地址，公网可访问
     */
    public void setWanVip(String WanVip) {
        this.WanVip = WanVip;
    }

    /**
     * Get 外网端口 
     * @return WanPort 外网端口
     */
    public Integer getWanPort() {
        return this.WanPort;
    }

    /**
     * Set 外网端口
     * @param WanPort 外网端口
     */
    public void setWanPort(Integer WanPort) {
        this.WanPort = WanPort;
    }

    /**
     * Get 实例创建时间，格式为 2006-01-02 15:04:05 
     * @return CreateTime 实例创建时间，格式为 2006-01-02 15:04:05
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 实例创建时间，格式为 2006-01-02 15:04:05
     * @param CreateTime 实例创建时间，格式为 2006-01-02 15:04:05
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 实例最后更新时间，格式为 2006-01-02 15:04:05 
     * @return UpdateTime 实例最后更新时间，格式为 2006-01-02 15:04:05
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 实例最后更新时间，格式为 2006-01-02 15:04:05
     * @param UpdateTime 实例最后更新时间，格式为 2006-01-02 15:04:05
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 自动续费标志：0 否，1 是 
     * @return AutoRenewFlag 自动续费标志：0 否，1 是
     */
    public Integer getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 自动续费标志：0 否，1 是
     * @param AutoRenewFlag 自动续费标志：0 否，1 是
     */
    public void setAutoRenewFlag(Integer AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 实例到期时间，格式为 2006-01-02 15:04:05 
     * @return PeriodEndTime 实例到期时间，格式为 2006-01-02 15:04:05
     */
    public String getPeriodEndTime() {
        return this.PeriodEndTime;
    }

    /**
     * Set 实例到期时间，格式为 2006-01-02 15:04:05
     * @param PeriodEndTime 实例到期时间，格式为 2006-01-02 15:04:05
     */
    public void setPeriodEndTime(String PeriodEndTime) {
        this.PeriodEndTime = PeriodEndTime;
    }

    /**
     * Get 实例所属账号 
     * @return Uin 实例所属账号
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 实例所属账号
     * @param Uin 实例所属账号
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get TDSQL 版本信息 
     * @return TdsqlVersion TDSQL 版本信息
     */
    public String getTdsqlVersion() {
        return this.TdsqlVersion;
    }

    /**
     * Set TDSQL 版本信息
     * @param TdsqlVersion TDSQL 版本信息
     */
    public void setTdsqlVersion(String TdsqlVersion) {
        this.TdsqlVersion = TdsqlVersion;
    }

    /**
     * Get 实例内存大小，单位 GB 
     * @return Memory 实例内存大小，单位 GB
     */
    public Integer getMemory() {
        return this.Memory;
    }

    /**
     * Set 实例内存大小，单位 GB
     * @param Memory 实例内存大小，单位 GB
     */
    public void setMemory(Integer Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 实例存储大小，单位 GB 
     * @return Storage 实例存储大小，单位 GB
     */
    public Integer getStorage() {
        return this.Storage;
    }

    /**
     * Set 实例存储大小，单位 GB
     * @param Storage 实例存储大小，单位 GB
     */
    public void setStorage(Integer Storage) {
        this.Storage = Storage;
    }

    /**
     * Get 字符串型的私有网络Id 
     * @return UniqueVpcId 字符串型的私有网络Id
     */
    public String getUniqueVpcId() {
        return this.UniqueVpcId;
    }

    /**
     * Set 字符串型的私有网络Id
     * @param UniqueVpcId 字符串型的私有网络Id
     */
    public void setUniqueVpcId(String UniqueVpcId) {
        this.UniqueVpcId = UniqueVpcId;
    }

    /**
     * Get 字符串型的私有网络子网Id 
     * @return UniqueSubnetId 字符串型的私有网络子网Id
     */
    public String getUniqueSubnetId() {
        return this.UniqueSubnetId;
    }

    /**
     * Set 字符串型的私有网络子网Id
     * @param UniqueSubnetId 字符串型的私有网络子网Id
     */
    public void setUniqueSubnetId(String UniqueSubnetId) {
        this.UniqueSubnetId = UniqueSubnetId;
    }

    /**
     * Get 原始实例ID（过时字段，请勿依赖该值） 
     * @return OriginSerialId 原始实例ID（过时字段，请勿依赖该值）
     */
    public String getOriginSerialId() {
        return this.OriginSerialId;
    }

    /**
     * Set 原始实例ID（过时字段，请勿依赖该值）
     * @param OriginSerialId 原始实例ID（过时字段，请勿依赖该值）
     */
    public void setOriginSerialId(String OriginSerialId) {
        this.OriginSerialId = OriginSerialId;
    }

    /**
     * Get 节点数，2为一主一从，3为一主二从 
     * @return NodeCount 节点数，2为一主一从，3为一主二从
     */
    public Integer getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set 节点数，2为一主一从，3为一主二从
     * @param NodeCount 节点数，2为一主一从，3为一主二从
     */
    public void setNodeCount(Integer NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get 是否临时实例，0为否，非0为是 
     * @return IsTmp 是否临时实例，0为否，非0为是
     */
    public Integer getIsTmp() {
        return this.IsTmp;
    }

    /**
     * Set 是否临时实例，0为否，非0为是
     * @param IsTmp 是否临时实例，0为否，非0为是
     */
    public void setIsTmp(Integer IsTmp) {
        this.IsTmp = IsTmp;
    }

    /**
     * Get 独享集群Id，为空表示为普通实例 
     * @return ExclusterId 独享集群Id，为空表示为普通实例
     */
    public String getExclusterId() {
        return this.ExclusterId;
    }

    /**
     * Set 独享集群Id，为空表示为普通实例
     * @param ExclusterId 独享集群Id，为空表示为普通实例
     */
    public void setExclusterId(String ExclusterId) {
        this.ExclusterId = ExclusterId;
    }

    /**
     * Get 数字实例Id（过时字段，请勿依赖该值） 
     * @return Id 数字实例Id（过时字段，请勿依赖该值）
     */
    public Integer getId() {
        return this.Id;
    }

    /**
     * Set 数字实例Id（过时字段，请勿依赖该值）
     * @param Id 数字实例Id（过时字段，请勿依赖该值）
     */
    public void setId(Integer Id) {
        this.Id = Id;
    }

    /**
     * Get 产品类型 Id 
     * @return Pid 产品类型 Id
     */
    public Integer getPid() {
        return this.Pid;
    }

    /**
     * Set 产品类型 Id
     * @param Pid 产品类型 Id
     */
    public void setPid(Integer Pid) {
        this.Pid = Pid;
    }

    /**
     * Get 最大 Qps 值 
     * @return Qps 最大 Qps 值
     */
    public Integer getQps() {
        return this.Qps;
    }

    /**
     * Set 最大 Qps 值
     * @param Qps 最大 Qps 值
     */
    public void setQps(Integer Qps) {
        this.Qps = Qps;
    }

    /**
     * Get 付费模式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Paymode 付费模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPaymode() {
        return this.Paymode;
    }

    /**
     * Set 付费模式
注意：此字段可能返回 null，表示取不到有效值。
     * @param Paymode 付费模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaymode(String Paymode) {
        this.Paymode = Paymode;
    }

    /**
     * Get 实例处于异步任务时的异步任务流程ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Locker 实例处于异步任务时的异步任务流程ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getLocker() {
        return this.Locker;
    }

    /**
     * Set 实例处于异步任务时的异步任务流程ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Locker 实例处于异步任务时的异步任务流程ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocker(Integer Locker) {
        this.Locker = Locker;
    }

    /**
     * Get 实例目前运行状态描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusDesc 实例目前运行状态描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set 实例目前运行状态描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusDesc 实例目前运行状态描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get 外网状态，0-未开通；1-已开通；2-关闭；3-开通中 
     * @return WanStatus 外网状态，0-未开通；1-已开通；2-关闭；3-开通中
     */
    public Integer getWanStatus() {
        return this.WanStatus;
    }

    /**
     * Set 外网状态，0-未开通；1-已开通；2-关闭；3-开通中
     * @param WanStatus 外网状态，0-未开通；1-已开通；2-关闭；3-开通中
     */
    public void setWanStatus(Integer WanStatus) {
        this.WanStatus = WanStatus;
    }

    /**
     * Get 该实例是否支持审计。1-支持；0-不支持 
     * @return IsAuditSupported 该实例是否支持审计。1-支持；0-不支持
     */
    public Integer getIsAuditSupported() {
        return this.IsAuditSupported;
    }

    /**
     * Set 该实例是否支持审计。1-支持；0-不支持
     * @param IsAuditSupported 该实例是否支持审计。1-支持；0-不支持
     */
    public void setIsAuditSupported(Integer IsAuditSupported) {
        this.IsAuditSupported = IsAuditSupported;
    }

    /**
     * Get 机器型号 
     * @return Machine 机器型号
     */
    public String getMachine() {
        return this.Machine;
    }

    /**
     * Set 机器型号
     * @param Machine 机器型号
     */
    public void setMachine(String Machine) {
        this.Machine = Machine;
    }

    /**
     * Get 是否支持数据加密。1-支持；0-不支持 
     * @return IsEncryptSupported 是否支持数据加密。1-支持；0-不支持
     */
    public Integer getIsEncryptSupported() {
        return this.IsEncryptSupported;
    }

    /**
     * Set 是否支持数据加密。1-支持；0-不支持
     * @param IsEncryptSupported 是否支持数据加密。1-支持；0-不支持
     */
    public void setIsEncryptSupported(Integer IsEncryptSupported) {
        this.IsEncryptSupported = IsEncryptSupported;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "WanDomain", this.WanDomain);
        this.setParamSimple(map, prefix + "WanVip", this.WanVip);
        this.setParamSimple(map, prefix + "WanPort", this.WanPort);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "PeriodEndTime", this.PeriodEndTime);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "TdsqlVersion", this.TdsqlVersion);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "UniqueVpcId", this.UniqueVpcId);
        this.setParamSimple(map, prefix + "UniqueSubnetId", this.UniqueSubnetId);
        this.setParamSimple(map, prefix + "OriginSerialId", this.OriginSerialId);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "IsTmp", this.IsTmp);
        this.setParamSimple(map, prefix + "ExclusterId", this.ExclusterId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "Qps", this.Qps);
        this.setParamSimple(map, prefix + "Paymode", this.Paymode);
        this.setParamSimple(map, prefix + "Locker", this.Locker);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "WanStatus", this.WanStatus);
        this.setParamSimple(map, prefix + "IsAuditSupported", this.IsAuditSupported);
        this.setParamSimple(map, prefix + "Machine", this.Machine);
        this.setParamSimple(map, prefix + "IsEncryptSupported", this.IsEncryptSupported);

    }
}

