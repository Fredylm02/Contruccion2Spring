package tdea.construccion2.app.dto;

import tdea.construccion2.app.models.Session;

public class SessionDto {
	private long id;
	private String userName;
	private String userRoll;
	
	public SessionDto(Session SessionDto) {
		this.id=SessionDto.getId();
		this.userName=SessionDto.getUserName();
		this.userRoll=SessionDto.getUserRoll();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserRoll() {
		return userRoll;
	}

	public void setUserRoll(String userRoll) {
		this.userRoll = userRoll;
	}

}
