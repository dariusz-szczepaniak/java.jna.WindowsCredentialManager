package learning.jna.credenumerate;

import java.util.HashMap;
import java.util.Map;

enum CredentialType {
	CRED_TYPE_GENERIC(1),
	CRED_TYPE_DOMAIN_PASSWORD(2),
	CRED_TYPE_DOMAIN_CERTIFICATE(3),
	CRED_TYPE_DOMAIN_VISIBLE_PASSWORD(4),
	CRED_TYPE_GENERIC_CERTIFICATE(5),
	CRED_TYPE_DOMAIN_EXTENDED(6),
	CRED_TYPE_MAXIMUM(7);

	private int code;
	private static Map<Integer, CredentialType> map = new HashMap<Integer, CredentialType>();
		
	static {
		for (CredentialType c : CredentialType.values()) {
			map.put(c.code, c);
		}
	}
	
	private CredentialType(int code) {
		this.code = code;
	}
	
	public static CredentialType valueOf(int n) {
		if (n > 7) throw new RuntimeException("unknown CredentialType");
		return map.get(n);
	}
	
}
