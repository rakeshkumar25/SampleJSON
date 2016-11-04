package sampletest.samplejson;

import java.io.Serializable;

public class ParsingPojo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6847364183889277909L;

	private String id, cid, uid, created_date, title_en, short_desc_en,
			detail_text, xl_image_url, image_url, news_url;

	public ParsingPojo(String id, String cid, String uid, String created_date,
			String title_en, String short_desc_en, String detail_text,
			String xl_image_url, String image_url, String news_url) {
		super();
		this.id = id;
		this.cid = cid;
		this.uid = uid;
		this.created_date = created_date;
		this.title_en = title_en;
		this.short_desc_en = short_desc_en;
		this.detail_text = detail_text;
		this.xl_image_url = xl_image_url;
		this.image_url = image_url;
		this.news_url = news_url;
		setId(this.uid);
		setId(this.id);
		setCid(this.cid);
		setCreated_date(this.created_date);
		setTitle_en(this.title_en);
		setShort_desc_en(this.short_desc_en);
		setDetail_text(this.detail_text);
		setXl_image_url(this.xl_image_url);
		setImage_url(this.image_url);
		setNews_url(this.news_url);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getCreated_date() {
		return created_date;
	}

	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}

	public String getTitle_en() {
		return title_en;
	}

	public void setTitle_en(String title_en) {
		this.title_en = title_en;
	}

	public String getShort_desc_en() {
		return short_desc_en;
	}

	public void setShort_desc_en(String short_desc_en) {
		this.short_desc_en = short_desc_en;
	}

	public String getDetail_text() {
		return detail_text;
	}

	public void setDetail_text(String detail_text) {
		this.detail_text = detail_text;
	}

	public String getXl_image_url() {
		return xl_image_url;
	}

	public void setXl_image_url(String xl_image_url) {
		this.xl_image_url = xl_image_url;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

	public String getNews_url() {
		return news_url;
	}

	public void setNews_url(String news_url) {
		this.news_url = news_url;
	}

	String video_id, movie_id, image_url1, video_url, video_name,
			video_description;

	String name, image_url2, folder_name;

	public String getVideo_id() {
		return video_id;
	}

	public void setVideo_id(String video_id) {
		this.video_id = video_id;
	}

	public String getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(String movie_id) {
		this.movie_id = movie_id;
	}

	public String getImage_url1() {
		return image_url1;
	}

	public void setImage_url1(String image_url1) {
		this.image_url1 = image_url1;
	}

	public String getVideo_url() {
		return video_url;
	}

	public void setVideo_url(String video_url) {
		this.video_url = video_url;
	}

	public String getVideo_name() {
		return video_name;
	}

	public void setVideo_name(String video_name) {
		this.video_name = video_name;
	}

	public String getVideo_description() {
		return video_description;
	}

	public void setVideo_description(String video_description) {
		this.video_description = video_description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage_url2() {
		return image_url2;
	}

	public void setImage_url2(String image_url2) {
		this.image_url2 = image_url2;
	}

	public String getFolder_name() {
		return folder_name;
	}

	public void setFolder_name(String folder_name) {
		this.folder_name = folder_name;
	}

	public ParsingPojo(String video_id, String movie_id, String image_url1,
			String video_url, String video_name, String video_description) {
		// TODO Auto-generated constructor stub

		this.video_id = video_id;
		this.movie_id = movie_id;
		this.image_url1 = image_url1;
		this.video_url = video_url;
		this.video_name = video_name;
		this.video_description = video_description;
	}

	public ParsingPojo(String name, String image_url2, String folder_name) {
		// TODO Auto-generated constructor stub

		this.name = name;
		this.image_url2 = image_url2;
		this.folder_name = folder_name;
	}
}
