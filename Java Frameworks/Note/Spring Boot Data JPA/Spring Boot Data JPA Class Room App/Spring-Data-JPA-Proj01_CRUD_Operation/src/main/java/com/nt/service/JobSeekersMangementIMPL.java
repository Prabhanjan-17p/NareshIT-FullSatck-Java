package com.nt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.JobSeekers;
import com.nt.repository.IJobSeekersRepository;

@Service
public class JobSeekersMangementIMPL implements IJobServiceMangement {

    @Autowired
    private IJobSeekersRepository repo;

    // --- CREATE ---
    @Override
    public String registerJobSeeker(JobSeekers seeker) {
        JobSeekers save = repo.save(seeker);
        return "JobSeeker registered with ID: " + save.getId();
    }

    @Override
    public String registerAllJobSeeker(List<JobSeekers> list) {
        List<Integer> ids = new ArrayList<>();
        Iterable<JobSeekers> savedEntities = repo.saveAll(list);
        savedEntities.forEach(js -> ids.add(js.getId()));
        return "JobSeekers registered with IDs: " + ids;
    }

    // --- READ ---
    @Override
    public JobSeekers findById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Optional<JobSeekers> findByIdOptional(Integer id) {
        return repo.findById(id);
    }

    @Override
    public String findByIdStatus(Integer id) {
        return repo.findById(id)
                   .map(js -> "Found JobSeeker: " + js.getName())
                   .orElse("No JobSeeker found with ID: " + id);
    }

    @Override
    public boolean existsById(Integer id) {
        return repo.existsById(id);
    }

    @Override
    public List<JobSeekers> findAll() {
    	List<JobSeekers> addList = new ArrayList<JobSeekers>();
    	Iterable<JobSeekers> all = repo.findAll();
    	all.forEach(seekers -> addList.add(seekers));
        return addList;
    }

    // --- UPDATE ---
    @Override
    public JobSeekers updateJobSeeker(JobSeekers seeker) {
        if (repo.existsById(seeker.getId())) {
            return repo.save(seeker);
        }
        return null;
    }

    @Override
    public String updateJobSeekerStatus(JobSeekers seeker) {
        if (repo.existsById(seeker.getId())) {
            repo.save(seeker);
            return "JobSeeker with ID " + seeker.getId() + " updated successfully.";
        }
        return "JobSeeker not found with ID: " + seeker.getId();
    }

    // --- DELETE ---
    @Override
    public String deleteById(Integer id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return "JobSeeker with ID " + id + " deleted.";
        }
        return "JobSeeker not found with ID: " + id;
    }

    @Override
    public boolean deleteByIdBoolean(Integer id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public void deleteAll() {
        repo.deleteAll();
    }
}
