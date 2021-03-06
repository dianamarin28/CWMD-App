package edu.ubb.cwmdEjb.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.eclipse.persistence.annotations.Cache;
import org.eclipse.persistence.annotations.CacheType;

@Entity
@Table(name = "document")
@Cache(type = CacheType.NONE)
public class Document extends BaseEntity {

	private static final long serialVersionUID = -1890325912962553432L;

	@Column(name = "name", nullable = false)
	private String name;

	@JoinColumn(name = "authorId")
	@ManyToOne
	private User author;

	@JoinColumn(name = "templateId")
	@ManyToOne(fetch = FetchType.EAGER)
	private Template template;

	@OneToMany(mappedBy = "document")
	private List<Version> version;

	@Column(name = "creationDate", nullable = false)
	private LocalDate creationDate;

	@Column(name = "lastModificationDate", nullable = false)
	private LocalDate lastModficationDate;

	@Column(name = "abstract", nullable = false)
	private String docAbstract;

	@Column(name = "keywords", nullable = false)
	private String keywords;

	@Column(name = "deletionDate")
	private LocalDate deletionDate;

	public Document() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public Template getTemplate() {
		return template;
	}

	public void setTemplate(Template template) {
		this.template = template;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public LocalDate getLastModficationDate() {
		return lastModficationDate;
	}

	public void setLastModficationDate(LocalDate lastModficationDate) {
		this.lastModficationDate = lastModficationDate;
	}

	public String getDocAbstract() {
		return docAbstract;
	}

	public void setDocAbstract(String docAbstract) {
		this.docAbstract = docAbstract;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public List<Version> getVersions() {
		return version;
	}

	public void setVersions(List<Version> version) {
		this.version = version;
	}

	public LocalDate getDeletionDate() {
		return deletionDate;
	}

	public void setDeletionDate(LocalDate deletionDate) {
		this.deletionDate = deletionDate;
	}

}