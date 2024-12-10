package telran.daily.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import telran.daily.dao.DailyRepository;
import telran.daily.dto.TaskDto;

@Service
@RequiredArgsConstructor
public class DailyServiceImpl implements DailyService{

	final DailyRepository dailyRepository;
	
	@Override
	public Boolean createTask(TaskDto taskDto) {
		return null;
	}

}
