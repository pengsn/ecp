package ecp.base;

public class BaseObject {
	
	private ILog log;
	
	private SessionStore session;

	public ILog getLog() {
		return log;
	}

	public void setLog(ILog log) {
		this.log = log;
	}

	public SessionStore getSession() {
		return session;
	}

	public void setSession(SessionStore session) {
		this.session = session;
	}
	
}
