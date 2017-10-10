package mumScheduler.service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import mumSchedule.domain.Blocks;

@Service
public class BlockService {
	public List<Blocks> getAllBlocks(){
		return Arrays.asList(
				new Blocks(LocalDate.of(2017, 12, 12), LocalDate.of(2017, 12, 12)),
				new Blocks(LocalDate.of(2017, 11, 12), LocalDate.of(2017, 11, 12)),
				new Blocks(LocalDate.of(2017, 10, 12), LocalDate.of(2017, 10, 12))
		);
	}
}
