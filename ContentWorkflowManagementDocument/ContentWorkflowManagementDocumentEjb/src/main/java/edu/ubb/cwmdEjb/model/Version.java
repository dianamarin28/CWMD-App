package edu.ubb.cwmdEjb.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "version")
public class Version extends BaseEntity {

	private static final long serialVersionUID = 3666141490596605648L;

	@JoinColumn(name = "documentId", nullable = false)
	@ManyToOne
	private Document document;

	@Column(name = "number", nullable = false)
	private Double number;

	@Column(name = "fileName", nullable = false)
	private String fileName;

	@Lob
	@Column(name = "fileContent", nullable = false)
	private byte[] fileContent;

	public Version() {
		super();
	}

	public Double getNumber() {
		return number;
	}

	public void setNumber(Double number) {
		this.number = number;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public byte[] getFileContent() {
		return fileContent;
	}

	public void setFileContent(byte[] fileContent) {
		this.fileContent = fileContent;
	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

}