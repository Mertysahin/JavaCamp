package HRMS.homework6hrms.entities.concretes;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data

@Entity
@Table(name="jobs")
public class Jobs
{
	
	@Id
	@Column(name="id")
	private int jobsid;
	
	@Column(name="category_id")
	private int categoryId;
	
	@Column(name="work_position")
	private String workPosition;
	
	@Column(name="description")
	private String description;
	
	public Jobs()
	{
		
	}
	public Jobs(int categoryId, int jobsid, String workPosition, String description) {
		
		this.categoryId=categoryId;
		this.jobsid = jobsid;
		this.workPosition = workPosition;
		this.description = description;
	}
	
	
}

