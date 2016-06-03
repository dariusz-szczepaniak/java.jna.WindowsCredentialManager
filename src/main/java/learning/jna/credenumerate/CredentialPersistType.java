package learning.jna.credenumerate;

import java.util.HashMap;
import java.util.Map;

enum CredentialPersistType {
	CRED_PERSIST_SESSION(1),
	CRED_PERSIST_LOCAL_MACHINE(2),
	CRED_PERSIST_ENTERPRISE(3);
	
	private int code;
	private static Map<Integer, CredentialPersistType> map = new HashMap<Integer, CredentialPersistType>();
		
	static {
		for (CredentialPersistType c : CredentialPersistType.values()) {
			map.put(c.code, c);
		}
	}
	
	private CredentialPersistType(int code) {
		this.code = code;
	}
	
	public static CredentialPersistType valueOf(int n) {
		if (n > 3) throw new RuntimeException("unknown CredentialPersistType");
		return map.get(n);
	}  
}
