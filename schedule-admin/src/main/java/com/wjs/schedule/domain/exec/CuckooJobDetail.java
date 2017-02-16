package com.wjs.schedule.domain.exec;

import java.io.Serializable;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CuckooJobDetail implements Serializable {
    /**
     * 标准ID -- cuckoo_job_detail.id
     * 
     */
    private Long id;

    /**
     * 分组ID -- cuckoo_job_detail.group_id
     * 
     */
    private Long groupId;

    /**
     * 任务名称 -- cuckoo_job_detail.job_name
     * 
     */
    private String jobName;

    /**
     * 作业执行应用名 -- cuckoo_job_detail.job_class_application
     * 
     */
    private String jobClassApplication;

    /**
     * 任务描述 -- cuckoo_job_detail.job_desc
     * 
     */
    private String jobDesc;

    /**
     * 触发类型 -- cuckoo_job_detail.trigger_type
     * 
     */
    private String triggerType;

    /**
     * cron任务表达式 -- cuckoo_job_detail.cron_expression
     * 
     */
    private String cronExpression;

    /**
     * 是否为日切任务 -- cuckoo_job_detail.type_daily
     * 
     */
    private String typeDaily;

    /**
     * 偏移量 -- cuckoo_job_detail.offset
     * 
     */
    private Integer offset;

    /**
     * 任务状态 -- cuckoo_job_detail.job_status
     * 
     */
    private String jobStatus;

    /**
     * 并发/集群任务参数 -- cuckoo_job_detail.cuckoo_parallel_job_args
     * 
     */
    private String cuckooParallelJobArgs;

    /**
     * 执行状态 -- cuckoo_job_detail.exec_job_status
     * 
     */
    private String execJobStatus;

    /**
     * 任务执行业务日期 -- cuckoo_job_detail.tx_date
     * 
     */
    private Integer txDate;

    /**
     * 流式任务上一次时间参数 -- cuckoo_job_detail.flow_last_time
     * 
     */
    private Long flowLastTime;

    /**
     * 流式任务当前时间参数 -- cuckoo_job_detail.flow_cur_time
     * 
     */
    private Long flowCurTime;

    /**
     * 是否触发下级任务 -- cuckoo_job_detail.need_triggle_next
     * 
     */
    private Boolean needTriggleNext;

    /**
     * cuckoo_job_detail表的操作属性:serialVersionUID
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 数据字段 cuckoo_job_detail.id的get方法 
     * 
     */
    public Long getId() {
        return id;
    }

    /**
     * 数据字段 cuckoo_job_detail.id的set方法
     * 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 数据字段 cuckoo_job_detail.group_id的get方法 
     * 
     */
    public Long getGroupId() {
        return groupId;
    }

    /**
     * 数据字段 cuckoo_job_detail.group_id的set方法
     * 
     */
    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    /**
     * 数据字段 cuckoo_job_detail.job_name的get方法 
     * 
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * 数据字段 cuckoo_job_detail.job_name的set方法
     * 
     */
    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    /**
     * 数据字段 cuckoo_job_detail.job_class_application的get方法 
     * 
     */
    public String getJobClassApplication() {
        return jobClassApplication;
    }

    /**
     * 数据字段 cuckoo_job_detail.job_class_application的set方法
     * 
     */
    public void setJobClassApplication(String jobClassApplication) {
        this.jobClassApplication = jobClassApplication == null ? null : jobClassApplication.trim();
    }

    /**
     * 数据字段 cuckoo_job_detail.job_desc的get方法 
     * 
     */
    public String getJobDesc() {
        return jobDesc;
    }

    /**
     * 数据字段 cuckoo_job_detail.job_desc的set方法
     * 
     */
    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc == null ? null : jobDesc.trim();
    }

    /**
     * 数据字段 cuckoo_job_detail.trigger_type的get方法 
     * 
     */
    public String getTriggerType() {
        return triggerType;
    }

    /**
     * 数据字段 cuckoo_job_detail.trigger_type的set方法
     * 
     */
    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType == null ? null : triggerType.trim();
    }

    /**
     * 数据字段 cuckoo_job_detail.cron_expression的get方法 
     * 
     */
    public String getCronExpression() {
        return cronExpression;
    }

    /**
     * 数据字段 cuckoo_job_detail.cron_expression的set方法
     * 
     */
    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression == null ? null : cronExpression.trim();
    }

    /**
     * 数据字段 cuckoo_job_detail.type_daily的get方法 
     * 
     */
    public String getTypeDaily() {
        return typeDaily;
    }

    /**
     * 数据字段 cuckoo_job_detail.type_daily的set方法
     * 
     */
    public void setTypeDaily(String typeDaily) {
        this.typeDaily = typeDaily == null ? null : typeDaily.trim();
    }

    /**
     * 数据字段 cuckoo_job_detail.offset的get方法 
     * 
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * 数据字段 cuckoo_job_detail.offset的set方法
     * 
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * 数据字段 cuckoo_job_detail.job_status的get方法 
     * 
     */
    public String getJobStatus() {
        return jobStatus;
    }

    /**
     * 数据字段 cuckoo_job_detail.job_status的set方法
     * 
     */
    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus == null ? null : jobStatus.trim();
    }

    /**
     * 数据字段 cuckoo_job_detail.cuckoo_parallel_job_args的get方法 
     * 
     */
    public String getCuckooParallelJobArgs() {
        return cuckooParallelJobArgs;
    }

    /**
     * 数据字段 cuckoo_job_detail.cuckoo_parallel_job_args的set方法
     * 
     */
    public void setCuckooParallelJobArgs(String cuckooParallelJobArgs) {
        this.cuckooParallelJobArgs = cuckooParallelJobArgs == null ? null : cuckooParallelJobArgs.trim();
    }

    /**
     * 数据字段 cuckoo_job_detail.exec_job_status的get方法 
     * 
     */
    public String getExecJobStatus() {
        return execJobStatus;
    }

    /**
     * 数据字段 cuckoo_job_detail.exec_job_status的set方法
     * 
     */
    public void setExecJobStatus(String execJobStatus) {
        this.execJobStatus = execJobStatus == null ? null : execJobStatus.trim();
    }

    /**
     * 数据字段 cuckoo_job_detail.tx_date的get方法 
     * 
     */
    public Integer getTxDate() {
        return txDate;
    }

    /**
     * 数据字段 cuckoo_job_detail.tx_date的set方法
     * 
     */
    public void setTxDate(Integer txDate) {
        this.txDate = txDate;
    }

    /**
     * 数据字段 cuckoo_job_detail.flow_last_time的get方法 
     * 
     */
    public Long getFlowLastTime() {
        return flowLastTime;
    }

    /**
     * 数据字段 cuckoo_job_detail.flow_last_time的set方法
     * 
     */
    public void setFlowLastTime(Long flowLastTime) {
        this.flowLastTime = flowLastTime;
    }

    /**
     * 数据字段 cuckoo_job_detail.flow_cur_time的get方法 
     * 
     */
    public Long getFlowCurTime() {
        return flowCurTime;
    }

    /**
     * 数据字段 cuckoo_job_detail.flow_cur_time的set方法
     * 
     */
    public void setFlowCurTime(Long flowCurTime) {
        this.flowCurTime = flowCurTime;
    }

    /**
     * 数据字段 cuckoo_job_detail.need_triggle_next的get方法 
     * 
     */
    public Boolean getNeedTriggleNext() {
        return needTriggleNext;
    }

    /**
     * 数据字段 cuckoo_job_detail.need_triggle_next的set方法
     * 
     */
    public void setNeedTriggleNext(Boolean needTriggleNext) {
        this.needTriggleNext = needTriggleNext;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}