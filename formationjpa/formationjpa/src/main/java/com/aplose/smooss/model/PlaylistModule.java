package com.aplose.smooss.model;

import java.util.List;


/**
 * Class PlaylistModule that will manage the playlist for an event
 * @author tomas
 *
 */

import javax.persistence.*;

@Entity

public class PlaylistModule extends Module {
	
	@
	private List<Playlist> playlists;

	public List<Playlist> getPlaylists() {
		return playlists;
	}
	
}
