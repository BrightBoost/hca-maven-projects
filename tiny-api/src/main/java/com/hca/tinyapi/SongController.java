package com.hca.tinyapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("song")
public class SongController {

	private SongService songService;
	
	@Autowired
	public SongController(SongService songService) {
		super();
		this.songService = songService;
	}

	@GetMapping
	public List<Song> getAllSongs() {
		return songService.getAllSongs();
	}
	
	@PostMapping
	public Song addSong(@RequestBody Song song) {
		SongController s = new SongController(); // this is not a bean, i made this
		return songService.addSong(song);
	}
	
}
