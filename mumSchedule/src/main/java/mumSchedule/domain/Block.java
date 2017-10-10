package mumSchedule.domain;

import java.time.LocalDate;

public class Block {
	private String blockName;
	private LocalDate beginDate;
	private LocalDate endDate;
	
	
	
	public Block(String blockName, LocalDate beginDate, LocalDate endDate) {
		super();
		this.blockName = blockName;
		this.beginDate = beginDate;
		this.endDate = endDate;
	}
	public LocalDate getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(LocalDate beginDate) {
		this.beginDate = beginDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}
	public String getBlockName() {
		return this.blockName;
	}

}
