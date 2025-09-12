package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.entity.JobSeekers;
import com.nt.repository.IJobSeekersRepository;

@Service
public class JobSeekersMangementIMPL implements IJobServiceMangement {

	@Autowired
	private IJobSeekersRepository repo;

	@Override
	public String saveAllJobSeeker(List<JobSeekers> list) {
		List<JobSeekers> saveAll = repo.saveAll(list);
		return "Data added successfully!";
	}

	@Override
	public Iterable<JobSeekers> showJobSeekerAsSorted(boolean ascorder, String... pros) {
		Sort sort = Sort.by(ascorder ? Sort.Direction.ASC : Sort.Direction.DESC, pros);
		return repo.findAll(sort);
	}

	@Override
	public Page<JobSeekers> showJsDetailsByPagination(int pageNo, int pageSize) {
		Pageable pageable = PageRequest.of(pageNo, pageSize); // create pageble object
		Page<JobSeekers> page = repo.findAll(pageable); // get the requested page record
		return page;
	}

	@Override
	public Page<JobSeekers> showJsDetailsByPaginationAndSorting(int pageNo, int pageSize, boolean ascorder,
			String... pros) {
		Sort sort = Sort.by(ascorder ? Sort.Direction.ASC : Sort.Direction.DESC, pros);
		Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
		Page<JobSeekers> all = repo.findAll(pageable);
		return all;
	}

	@Override
	public void showAllPagesData(int pageSize) {
		// 1. Get the total number of records in the JobSeekers table
		long count = repo.count();

		// 2. Calculate how many pages we need (without remainder)
		long totPageCount = count / pageSize;

		// 3. If there are leftover records (not fitting into full pages),
		// add 1 more page to cover them
		if (count % pageSize != 0) {
			totPageCount++;
		}

		// 4. Loop through each page index (0-based index)
		for (int i = 0; i < totPageCount; i++) {

			// 5. Create a Pageable object for the current page
			// `i` → current page index (starts from 0)
			// `pageSize` → number of records per page
			Pageable pageable = PageRequest.of(i, pageSize);

			// 6. Use repository to fetch a Page<JobSeekers> object
			// This contains content + pagination info
			Page<JobSeekers> page = repo.findAll(pageable);

			// 7. Print which page we are displaying (human-readable, starts from 1)
			System.out.println("Record of " + (i + 1) + "/" + page.getTotalPages());

			// 8. Print all JobSeekers records of the current page
			page.getContent().forEach(System.out::println);
			System.out.println("------");
		}
	}

}
