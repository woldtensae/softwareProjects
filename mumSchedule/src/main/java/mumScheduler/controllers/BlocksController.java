package mumScheduler.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlocksController {
	
	@RequestMapping("/blocks")
	public String readBlocks() {
		return "this are the list of blocks for this entery";
	}
}
