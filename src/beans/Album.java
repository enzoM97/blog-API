package beans;

public class Album extends BaseBean {
	
	private static final long serialVersionUID = 1L;
	private String title;
	private Integer userId;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Integer getUserId() {
		return userId;
	}
	
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
}
