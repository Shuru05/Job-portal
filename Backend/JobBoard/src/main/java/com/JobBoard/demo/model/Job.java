package com.JobBoard.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Job {
	@Id
	@GeneratedValue
		private int jid;
		private String email;
		private String title;
		private String location;
		private String region;
		private String type;
		private String cname;
		private String tagline;
		private String website;
		public int getJid() {
			return jid;
		}
		public void setJid(int jid) {
			this.jid = jid;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public String getRegion() {
			return region;
		}
		public void setRegion(String region) {
			this.region = region;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getCname() {
			return cname;
		}
		public void setCname(String cname) {
			this.cname = cname;
		}
		public String getTagline() {
			return tagline;
		}
		public void setTagline(String tagline) {
			this.tagline = tagline;
		}
		public String getWebsite() {
			return website;
		}
		public void setWebsite(String website) {
			this.website = website;
		}
}
