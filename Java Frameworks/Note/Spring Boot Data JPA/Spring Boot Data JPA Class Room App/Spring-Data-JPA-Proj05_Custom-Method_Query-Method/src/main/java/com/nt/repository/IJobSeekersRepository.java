package com.nt.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nt.entity.JobSeekers;

public interface IJobSeekersRepository extends JpaRepository<JobSeekers, Integer> {
//	@Query("from JobSeekers where course in(?1,?2,?3) order by course")
//	public List<JobSeekers> showJsByCourse(String course1, String course2, String course3);
	
//	@Query("from JobSeekers where course in(:C1,:C2,:C3)order by course")
//	public List<JobSeekers> showJsByCourse(@Param("C1") String course1, @Param("C2") String course2, @Param("C3") String course3);
	
//	@Query("from JobSeekers where course in (:course1,:course2,:course3) order by course")
//	public List<JobSeekers> showJsByCourse(String course1, String course2, String course3);
	
	
	//Bluk Entity Query 
	
//	@Query("from JobSeekers where salary>= :start and salary<= :end order by salary desc")
//	public List<JobSeekers> showJsBySalaryRange(double start, double end);
	
	//Bulk scalar query giving specific multiple col values
//	@Query("select name from JobSeekers where salary>= :start and salary<= :end ")
//	@Query("select name,salary from JobSeekers where salary>= :start and salary<= :end ")
//	public List<Object[]> showJsBySalaryRange(double start, double end);
	
	//Bulk scalar query giving specific single col values
//	@Query("select name from JobSeekers where salary>= :start and salary<= :end")
//	public List<String> showJsBySalaryRange(double start, double end);
	
	
	//Single row entity query
//	@Query("from JobSeekers where email =:mail")
//	public Optional<JobSeekers> showJsByEmail(String mail);
	
	//Single row Scalary Query selecting specific multiple col value
//	@Query("select name, email, salary, course from JobSeekers where email=:mail")
//	public Optional<Object[]> showJsByEmail(String mail);
	
	// Single row Scalar Query selecting specific single col value
//	@Query("select name from JobSeekers where email =:mail")
//	public Optional<String> showJsByEmail(String mail);
	
	
	// Working with aggregate functions
//	@Query("select distinct count(name) from JobSeekers")
//	public long getJsUnitCount();
	
	@Query("select distinct count(name), max(salary), min(salary), avg(salary) from JobSeekers ")
	public Object[] getJsAggregateData();

}
