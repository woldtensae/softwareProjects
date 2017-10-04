package mumScheduler.controllers;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mumSchedule.domain.Blocks;

@RestController
public class BlocksController {
	
	@RequestMapping("/blocks")
	public List<Blocks> readBlocks() {
		return Arrays.asList(
				new Blocks(LocalDate.of(2017, 12, 12), LocalDate.of(2017, 12, 12)),
				new Blocks(LocalDate.of(2017, 11, 12), LocalDate.of(2017, 11, 12)),
				new Blocks(LocalDate.of(2017, 10, 12), LocalDate.of(2017, 10, 12))
		);
				
	}
}
