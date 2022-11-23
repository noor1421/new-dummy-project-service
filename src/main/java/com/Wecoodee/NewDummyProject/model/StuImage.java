package com.Wecoodee.NewDummyProject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "IMAGE")
public class StuImage {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long imageId;

	private String imageType;

	private String imageData;

	private String fileName;

	public Long getImageId() {
		return imageId;
	}

	public void setImageId(Long imageId) {
		this.imageId = imageId;
	}

	public String getImageType() {
		return imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

	public String getImageData() {
		return imageData;
	}

	public void setImageData(String imageData) {
		this.imageData = imageData;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public String toString() {
		return "StuImage [imageId=" + imageId + ", imageType=" + imageType + ", imageData=" + imageData + ", fileName="
				+ fileName + "]";
	}

}
