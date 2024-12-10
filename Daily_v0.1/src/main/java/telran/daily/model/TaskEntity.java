package telran.daily.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import telran.daily.dto.TaskDto;
import telran.daily.service.DailyService;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode(of = "id")
public class TaskEntity implements DailyService{
	
	Long id;
	String title;
	String description;
	LocalDateTime completedDate;
	LocalDateTime createdDateTime;
	LocalDateTime updatedDateTime;
	
	@Override
	public Boolean createTask(TaskDto taskDto) {
		TaskEntity task = new TaskEntity();
		return null;
	}
}
