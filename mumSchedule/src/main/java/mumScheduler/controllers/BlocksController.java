package mumScheduler.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mumSchedule.domain.Blocks;
import mumScheduler.service.BlockService;

@RestController
public class BlocksController {
	@Autowired
	private BlockService blockService;
	@RequestMapping("/blocks")
	public List<Blocks> readBlocks() {
		return blockService.getAllBlocks();
	}
}
