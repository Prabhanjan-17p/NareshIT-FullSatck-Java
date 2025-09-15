package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.JobSeekers;

public interface IJobSeekersRepository extends JpaRepository<JobSeekers, Integer> {
	public List<JobSeekers> findByCourseEquals(String course);
	public List<JobSeekers> readByCourseIs(String course);
	public List<JobSeekers> getByCourse(String course);
	public List<JobSeekers> findBySalaryBetween(double st, double end);
	public List<JobSeekers> findBySalaryGreaterThanEqualAndSalaryLessThanEqual(double st, double end);
	public List<JobSeekers> findByCourseInOrderBySalaryDesc(List<String> cities);
	public List<JobSeekers> findByCourseInOrderBySalaryAsc(List<String> cities);
	public List<JobSeekers> findByNameStartingWith(String initChar);
	public List<JobSeekers> findByNameEndingWith(String endChar);
	public List<JobSeekers> findByNameContaining(String chars);
	public List<JobSeekers> findByNameEqualsIgnoreCase(String chars);
	public List<JobSeekers> findByCourseLikeAndYearIn(String chars,List<Integer> yrs);
	public List<JobSeekers> findByCourseNotInAndYearNotIn(List<String> courses, List<Integer> years);
}
