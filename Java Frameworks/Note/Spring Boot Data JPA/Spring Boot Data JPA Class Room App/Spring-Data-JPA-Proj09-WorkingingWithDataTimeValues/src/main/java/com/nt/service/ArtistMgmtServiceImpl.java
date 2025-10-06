package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Artist;
import com.nt.repository.IArtistRepository;

@Service
public class ArtistMgmtServiceImpl implements IArtistMgmtService {
	@Autowired
	private IArtistRepository artistRepo;

	@Override
	public String registerArtist(Artist artist) {
		// save the object
		int idVal = artistRepo.save(artist).getJsid();
		return "Artist object is saved with  id value::" + idVal;
	}

	@Override
	public Iterable<Artist> showAllArtists() {
		return artistRepo.findAll();
	}

	@Override
	public Artist showArtistById(int id) {
		return artistRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid Id"));
	}

	@Override
	public double showArtistAgeById(int id) {
		// use repo
		return artistRepo.getArtistAgeById(id);
	}

	@Override
	public String showArtirstExperienceById(int id) {
		// use repo
		return artistRepo.getArtistExperienceById(id);
	}

}
