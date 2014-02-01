package core;

import core.exceptions.BDDException;
import core.exceptions.CreateUserException;

public class CreateUserCore {
	
	public static void createUser (String prenom, String nom, String login, String password, String email) throws CreateUserException, BDDException {
		
		/* Appel à la base de données, etc etc... */
			throw new CreateUserException(301);
	}
}
