package tp_server.services;

public class GroupManager {
	private static GroupManager instance = null;

	public static GroupManager getManager(){
		if (instance == null) {
			instance = new GroupManager();
		}
		return instance;
	}
	

}
