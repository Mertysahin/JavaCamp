package HRMS.homework6hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity

@Table(name="jobs_category")
public class JobsCategory 
{
	@Id
	@Column(name="id")
	private int categoryId;
	@Column(name="catagory_namme")
	private String CategoryName;
	
	public JobsCategory(int categoryId, String categoryName) {
		super();
		this.categoryId = categoryId;
		CategoryName = categoryName;
	}
}
