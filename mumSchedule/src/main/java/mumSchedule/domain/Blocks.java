package mumSchedule.domain;

import java.time.LocalDate;

public class Blocks {
	private LocalDate beginDate;
	private LocalDate endDate;
	
	
	
	public Blocks(LocalDate beginDate, LocalDate endDate) {
		super();
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
	

}
