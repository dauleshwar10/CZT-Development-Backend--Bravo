/**
 * 
 */
package com.czt.bean;

import java.security.Timestamp;

/**
 * 
 */
public class Slot {
	private int slotId;
	private String slotName;
	private String slotDescription;
	private Timestamp slotTime;
	private String slotSession;

	/**
	 * @return the slotId
	 */
	public int getSlotId() {
		return slotId;
	}

	/**
	 * @param slotId the slotId to set
	 */
	public void setSlotId(int slotId) {
		this.slotId = slotId;
	}

	/**
	 * @return the slotName
	 */
	public String getSlotName() {
		return slotName;
	}

	/**
	 * @param slotName the slotName to set
	 */
	public void setSlotName(String slotName) {
		this.slotName = slotName;
	}

	/**
	 * @return the slotDescription
	 */
	public String getSlotDescription() {
		return slotDescription;
	}

	/**
	 * @param slotDescription the slotDescription to set
	 */
	public void setSlotDescription(String slotDescription) {
		this.slotDescription = slotDescription;
	}

	/**
	 * @return the slotTime
	 */
	public Timestamp getSlotTime() {
		return slotTime;
	}

	/**
	 * @param slotTime the slotTime to set
	 */
	public void setSlotTime(Timestamp slotTime) {
		this.slotTime = slotTime;
	}

	/**
	 * @return the slotSession
	 */
	public String getSlotSession() {
		return slotSession;
	}

	/**
	 * @param slotSession the slotSession to set
	 */
	public void setSlotSession(String slotSession) {
		this.slotSession = slotSession;
	}

}
