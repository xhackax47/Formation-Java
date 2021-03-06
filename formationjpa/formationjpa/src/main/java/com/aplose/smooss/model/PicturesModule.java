package com.aplose.smooss.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity

public class PicturesModule extends Module {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	private List<PicturesModule> picture;

	public List<PicturesModule> asList(PicturesModule[] picture) {

		List<PicturesModule> result = new ArrayList<PicturesModule>();
		for (PicturesModule pict : result) {

			result.add(pict);

		}
		return result;

	}

		public List<PicturesModule> getPicture() {
			return picture;
		}

//		public void setPicture(List<PicturesModule> picture) {
//			this.picture = picture;
//		}

}
