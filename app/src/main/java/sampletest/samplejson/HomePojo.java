package sampletest.samplejson;

public class HomePojo {

	// Banner
	String banner_title, banner_description, banner_image_url;

	public HomePojo(String banner_title, String banner_description,
			String banner_image_url) {
		super();
		this.banner_title = banner_title;
		this.banner_description = banner_description;
		this.banner_image_url = banner_image_url;
		setBanner_description(this.banner_description);
		setBanner_image_url(this.banner_image_url);
		setBanner_title(this.banner_title);
	}

	public String getBanner_title() {
		return banner_title;
	}

	public void setBanner_title(String banner_title) {
		this.banner_title = banner_title;
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

	// Healines
	String latest_headaline_title, latest_headaline_short_description,
			latest_headaline_created, latest_headaline_detail_txt,
			latest_headaline_xl_image_url, latest_headaline_image_url,
			latest_headaline_news_url;

	public HomePojo(String latest_headaline_title,
			String latest_headaline_short_description,
			String latest_headaline_created,
			String latest_headaline_detail_txt,
			String latest_headaline_xl_image_url,
			String latest_headaline_image_url, String latest_headaline_news_url) {
		super();
		this.latest_headaline_title = latest_headaline_title;
		this.latest_headaline_short_description = latest_headaline_short_description;
		this.latest_headaline_created = latest_headaline_created;
		this.latest_headaline_detail_txt = latest_headaline_detail_txt;
		this.latest_headaline_xl_image_url = latest_headaline_xl_image_url;
		this.latest_headaline_image_url = latest_headaline_image_url;
		this.latest_headaline_news_url = latest_headaline_news_url;
		setLatest_headaline_created(this.latest_headaline_created);
		setLatest_headaline_detail_txt(this.latest_headaline_detail_txt);
		setLatest_headaline_image_url(this.latest_headaline_image_url);
		setLatest_headaline_news_url(this.latest_headaline_news_url);
		setLatest_headaline_short_description(this.latest_headaline_short_description);
		setLatest_headaline_title(this.latest_headaline_title);
		setLatest_headaline_xl_image_url(this.latest_headaline_xl_image_url);
	}

	public String getLatest_headaline_title() {
		return latest_headaline_title;
	}

	public void setLatest_headaline_title(String latest_headaline_title) {
		this.latest_headaline_title = latest_headaline_title;
	}

	public String getLatest_headaline_short_description() {
		return latest_headaline_short_description;
	}

	public void setLatest_headaline_short_description(
			String latest_headaline_short_description) {
		this.latest_headaline_short_description = latest_headaline_short_description;
	}

	public String getLatest_headaline_created() {
		return latest_headaline_created;
	}

	public void setLatest_headaline_created(String latest_headaline_created) {
		this.latest_headaline_created = latest_headaline_created;
	}

	public String getLatest_headaline_detail_txt() {
		return latest_headaline_detail_txt;
	}

	public void setLatest_headaline_detail_txt(
			String latest_headaline_detail_txt) {
		this.latest_headaline_detail_txt = latest_headaline_detail_txt;
	}

	public String getLatest_headaline_xl_image_url() {
		return latest_headaline_xl_image_url;
	}

	public void setLatest_headaline_xl_image_url(
			String latest_headaline_xl_image_url) {
		this.latest_headaline_xl_image_url = latest_headaline_xl_image_url;
	}

	public String getLatest_headaline_image_url() {
		return latest_headaline_image_url;
	}

	public void setLatest_headaline_image_url(String latest_headaline_image_url) {
		this.latest_headaline_image_url = latest_headaline_image_url;
	}

	public String getLatest_headaline_news_url() {
		return latest_headaline_news_url;
	}

	public void setLatest_headaline_news_url(String latest_headaline_news_url) {
		this.latest_headaline_news_url = latest_headaline_news_url;
	}

	// Now Playing
	String now_playing_movie_id, now_playing_movie_name,
			now_playing_movie_rating, now_playing_image_url,
			now_playing_movie_url;

	public HomePojo(String now_playing_movie_id, String now_playing_movie_name,
			String now_playing_movie_rating, String now_playing_image_url,
			String now_playing_movie_url) {
		super();
		this.now_playing_movie_id = now_playing_movie_id;
		this.now_playing_movie_name = now_playing_movie_name;
		this.now_playing_movie_rating = now_playing_movie_rating;
		this.now_playing_image_url = now_playing_image_url;
		this.now_playing_movie_url = now_playing_movie_url;
		setNow_playing_image_url(this.now_playing_image_url);
		setNow_playing_movie_id(this.now_playing_movie_id);
		setNow_playing_movie_name(this.now_playing_movie_name);
		setNow_playing_movie_rating(this.now_playing_movie_rating);
		setNow_playing_movie_url(this.now_playing_movie_url);
	}

	public String getNow_playing_movie_id() {
		return now_playing_movie_id;
	}

	public void setNow_playing_movie_id(String now_playing_movie_id) {
		this.now_playing_movie_id = now_playing_movie_id;
	}

	public String getNow_playing_movie_name() {
		return now_playing_movie_name;
	}

	public void setNow_playing_movie_name(String now_playing_movie_name) {
		this.now_playing_movie_name = now_playing_movie_name;
	}

	public String getNow_playing_movie_rating() {
		return now_playing_movie_rating;
	}

	public void setNow_playing_movie_rating(String now_playing_movie_rating) {
		this.now_playing_movie_rating = now_playing_movie_rating;
	}

	public String getNow_playing_image_url() {
		return now_playing_image_url;
	}

	public void setNow_playing_image_url(String now_playing_image_url) {
		this.now_playing_image_url = now_playing_image_url;
	}

	public String getNow_playing_movie_url() {
		return now_playing_movie_url;
	}

	public void setNow_playing_movie_url(String now_playing_movie_url) {
		this.now_playing_movie_url = now_playing_movie_url;
	}

	// Gallery
	String gallery_name, gallery_category, gallery_url, gallery_image;

	public HomePojo(String gallery_name, String gallery_category,
			String gallery_url, String gallery_image) {
		super();
		this.gallery_name = gallery_name;
		this.gallery_category = gallery_category;
		this.gallery_url = gallery_url;
		this.gallery_image = gallery_image;
		setGallery_category(this.gallery_category);
		setGallery_image(this.gallery_image);
		setGallery_name(this.gallery_name);
		setGallery_url(this.gallery_url);

	}

	public String getGallery_name() {
		return gallery_name;
	}

	public void setGallery_name(String gallery_name) {
		this.gallery_name = gallery_name;
	}

	public String getGallery_category() {
		return gallery_category;
	}

	public void setGallery_category(String gallery_category) {
		this.gallery_category = gallery_category;
	}

	public String getGallery_url() {
		return gallery_url;
	}

	public void setGallery_url(String gallery_url) {
		this.gallery_url = gallery_url;
	}

	public String getGallery_image() {
		return gallery_image;
	}

	public void setGallery_image(String gallery_image) {
		this.gallery_image = gallery_image;
	}

	// Latest Trailers
	String latest_trailers_videoid, latest_trailers_movie_id,
			latest_trailers_image_url, latest_trailers_video_url,
			latest_trailers_video_name, latest_trailers_video_description;

	public HomePojo(String latest_trailers_videoid,
			String latest_trailers_movie_id, String latest_trailers_image_url,
			String latest_trailers_video_url,
			String latest_trailers_video_name,
			String latest_trailers_video_description) {
		super();
		this.latest_trailers_videoid = latest_trailers_videoid;
		this.latest_trailers_movie_id = latest_trailers_movie_id;
		this.latest_trailers_image_url = latest_trailers_image_url;
		this.latest_trailers_video_url = latest_trailers_video_url;
		this.latest_trailers_video_name = latest_trailers_video_name;
		this.latest_trailers_video_description = latest_trailers_video_description;
		setLatest_trailers_image_url(this.latest_trailers_image_url);
		setLatest_trailers_movie_id(this.latest_trailers_movie_id);
		setLatest_trailers_video_description(this.latest_trailers_video_description);
		setLatest_trailers_video_name(this.latest_trailers_video_name);
		setLatest_trailers_video_url(this.latest_trailers_video_url);
		setLatest_trailers_videoid(this.latest_trailers_videoid);
	}

	public String getLatest_trailers_videoid() {
		return latest_trailers_videoid;
	}

	public void setLatest_trailers_videoid(String latest_trailers_videoid) {
		this.latest_trailers_videoid = latest_trailers_videoid;
	}

	public String getLatest_trailers_movie_id() {
		return latest_trailers_movie_id;
	}

	public void setLatest_trailers_movie_id(String latest_trailers_movie_id) {
		this.latest_trailers_movie_id = latest_trailers_movie_id;
	}

	public String getLatest_trailers_image_url() {
		return latest_trailers_image_url;
	}

	public void setLatest_trailers_image_url(String latest_trailers_image_url) {
		this.latest_trailers_image_url = latest_trailers_image_url;
	}

	public String getLatest_trailers_video_url() {
		return latest_trailers_video_url;
	}

	public void setLatest_trailers_video_url(String latest_trailers_video_url) {
		this.latest_trailers_video_url = latest_trailers_video_url;
	}

	public String getLatest_trailers_video_name() {
		return latest_trailers_video_name;
	}

	public void setLatest_trailers_video_name(String latest_trailers_video_name) {
		this.latest_trailers_video_name = latest_trailers_video_name;
	}

	public String getLatest_trailers_video_description() {
		return latest_trailers_video_description;
	}

	public void setLatest_trailers_video_description(
			String latest_trailers_video_description) {
		this.latest_trailers_video_description = latest_trailers_video_description;
	}
	

}
