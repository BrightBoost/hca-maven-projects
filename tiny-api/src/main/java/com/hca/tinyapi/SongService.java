package com.hca.tinyapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SongService {
	
	private SongRepository songRepository;
	
	@Autowired
	public SongService(SongRepository songRepository) {
		super();
		this.songRepository = songRepository;
	}



	public List<Song> getAllSongs() {
		return songRepository.findAll();
	}
	
	public Song addSong(Song song) {
		return songRepository.save(song);
	}

}
