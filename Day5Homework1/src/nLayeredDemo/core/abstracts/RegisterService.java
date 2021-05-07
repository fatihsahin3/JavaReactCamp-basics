package nLayeredDemo.core.abstracts;

import nLayeredDemo.entities.concretes.User;

public interface RegisterService {
	User register(String email, String password);
}
