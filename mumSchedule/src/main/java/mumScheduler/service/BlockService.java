package mumScheduler.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import mumSchedule.domain.*;


import org.springframework.stereotype.Service;

@Service
public class BlockService {
	List<Block> blockList = new ArrayList<>(Arrays.asList(
			new Block("Feb", LocalDate.of(2017, 12, 12), LocalDate.of(2017, 12, 12)),
			new Block("June", LocalDate.of(2017, 11, 12), LocalDate.of(2017, 11, 12)),
			new Block("September", LocalDate.of(2017, 10, 12), LocalDate.of(2017, 10, 12))
	));
	public List<Block> getAllBlocks(){
		return blockList;
	}
	
	public Block getBlock(String blockName) {
		System.out.println(blockName);
		//System.out.println(blockList.stream().filter(block -> block.getBlockName().equals(id)).findFirst().get());
		return blockList.stream().filter(block -> block.getBlockName().equals(blockName)).findFirst().get();
	}
	public void deleteBlock(String blockName) {
		for(int i=0; i<blockList.size();i++) {
			if(blockList.get(i).getBlockName().equals(blockName)) {
				blockList.remove(i);
			}
		}
	}
	
}
