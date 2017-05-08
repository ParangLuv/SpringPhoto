package com.parangluv.domain;

import java.io.File;

public class PhotoVO {

	private Long photoId;
	private String photoName;
	private File photoFile;
	
	public Long getPhotoId() {
		return photoId;
	}
	public void setPhotoId(Long photoId) {
		this.photoId = photoId;
	}
	public String getPhotoName() {
		return photoName;
	}
	public void setPhotoName(String photoName) {
		this.photoName = photoName;
	}
	public File getPhotoFile() {
		return photoFile;
	}
	public void setPhotoFile(File photoFile) {
		this.photoFile = photoFile;
	}
	
	@Override
	public String toString() {
		return "PhotoVO [photoId=" + photoId + ", photoName=" + photoName + ", photoFile=" + photoFile + "]";
	}
	
	
	
	
}
