package sampletest.samplejson;

public class BannerPojo {

	// Banner
	String banner_id, banner_description, banner_image_url, banner_video_url,
			banner_title_en;

	public BannerPojo(String banner_id, String banner_description,
			String banner_image_url, String banner_video_url,
			String banner_title_en) {
		super();
		this.banner_id = banner_id;
		this.banner_description = banner_description;
		this.banner_image_url = banner_image_url;
		this.banner_video_url = banner_video_url;
		this.banner_title_en = banner_title_en;
		setBanner_description(this.banner_description);
		setBanner_id(this.banner_id);
		setBanner_image_url(this.banner_image_url);
		setBanner_title_en(this.banner_title_en);
		setBanner_video_url(this.banner_video_url);
	}

	public String getBanner_id() {
		return banner_id;
	}

	public void setBanner_id(String banner_id) {
		this.banner_id = banner_id;
	}

	public String getBanner_description() {
		return banner_description;
	}

	public void setBanner_description(String banner_description) {
		this.banner_description = banner_description;
	}

	public String getBanner_image_url() {
		return banner_image_url;
	}

	public void setBanner_image_url(String banner_image_url) {
		this.banner_image_url = banner_image_url;
	}

	public String getBanner_video_url() {
		return banner_video_url;
	}

	public void setBanner_video_url(String banner_video_url) {
		this.banner_video_url = banner_video_url;
	}

	public String getBanner_title_en() {
		return banner_title_en;
	}

	public void setBanner_title_en(String banner_title_en) {
		this.banner_title_en = banner_title_en;
	}

}