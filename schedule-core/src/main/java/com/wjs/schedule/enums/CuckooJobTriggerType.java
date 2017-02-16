package com.wjs.schedule.enums;

public enum CuckooJobTriggerType {
	
 
	
	CRON("CRON", "Cron任务")/*任务由Cron触发*/, 
	JOB("JOB", "普通任务")/*任务由父任务触发*/; 
	
	private final String value;
	
	private final String description;
	
	CuckooJobTriggerType(String value, String description) {

		this.value = value;
		this.description = description;
	}
	

	public String getValue() {
		return value;
	}



	public String getDescription() {
		return description;
	}

	public static CuckooJobTriggerType fromName(String input) {

		for (CuckooJobTriggerType item : CuckooJobTriggerType.values()) {
			if (item.name().equalsIgnoreCase(input))
				return item;
		}
		
		return null;
	}	

}

