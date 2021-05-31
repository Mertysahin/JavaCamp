package HRMS.homework6hrms.dataAcces.abtracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMS.homework6hrms.entities.concretes.JobsCategory;

public interface JobsCategoryDao extends JpaRepository<JobsCategory,Integer>
{

}
