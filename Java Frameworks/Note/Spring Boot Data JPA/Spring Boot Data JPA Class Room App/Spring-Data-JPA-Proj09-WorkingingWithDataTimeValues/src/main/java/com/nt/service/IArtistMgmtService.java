package com.nt.service;

import com.nt.entity.Artist;

public interface IArtistMgmtService {
   public  String   registerArtist(Artist  artist);
   public  Artist   showArtistById(int id);
   public  Iterable<Artist> showAllArtists();
   public  double showArtistAgeById(int id);
   public  String   showArtirstExperienceById(int id);
}
