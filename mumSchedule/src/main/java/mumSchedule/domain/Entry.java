package mumSchedule.domain;

import java.time.LocalDate;
import java.util.List;

public class Entry {
	private int numberOfMPPEntry;
	private int numberOfFPPEntry;
	private List<Blocks> blocks;
	private LocalDate entryDate;
	
	
	
	public Entry(int numberOfMPPEntry, int numberOfFPPEntry, List<Blocks> blocks, LocalDate entryDate) {
		super();
		this.numberOfMPPEntry = numberOfMPPEntry;
		this.numberOfFPPEntry = numberOfFPPEntry;
		this.blocks = blocks;
		this.entryDate = entryDate;
	}
	public int getNumberOfMPPEntry() {
		return numberOfMPPEntry;
	}
	public void setNumberOfMPPEntry(int numberOfMPPEntry) {
		this.numberOfMPPEntry = numberOfMPPEntry;
	}
	public int getNumberOfFPPEntry() {
		return numberOfFPPEntry;
	}
	public void setNumberOfFPPEntry(int numberOfFPPEntry) {
		this.numberOfFPPEntry = numberOfFPPEntry;
	}
	public List<Blocks> getBlocks() {
		return blocks;
	}
	public void setBlocks(List<Blocks> blocks) {
		this.blocks = blocks;
	}
	public LocalDate getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(LocalDate entryDate) {
		this.entryDate = entryDate;
	}
	
	
	
	
}
