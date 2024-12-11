package telran.daily.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.ZoneId;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode(of = "id")
@Table(name = "tasks")
@Entity
public class TaskEntity implements Serializable {

	@Id
	Long id;
	String title;
	String description;
	LocalDateTime completedDate;
	LocalDateTime createdDate;
	LocalDateTime updatedDate;

	public TaskEntity(String title, String description, LocalDateTime completedDate) {
		super();
		this.title = title;
		this.description = description;
		this.completedDate = completedDate;
//		Instant nowUtc = Instant.now();
//		createdDateTime = LocalDateTime.ofInstant(nowUtc, ZoneId.of("UTC"));
		createdDate = LocalDateTime.now(ZoneId.of("UTC"));
		updatedDate = LocalDateTime.now(ZoneId.of("UTC"));
	}

}
