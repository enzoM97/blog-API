package beans;

public class Photo extends BaseBean {

	private static final long serialVersionUID = 1L;
	private String title;
	private String url;
	private String thumbnailUrl;
	private Integer albumId;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getThumbnailUrl() {
		return thumbnailUrl;
	}
	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}
	
	public Integer getAlbumId() {
		return albumId;
	}
	
	public void setAlbumId(Integer albumId) {
		this.albumId = albumId;
	}
	
}
