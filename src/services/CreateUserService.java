package services;

import org.json.JSONObject;

import core.CreateUserCore;
import core.exceptions.BDDException;
import core.exceptions.CreateUserException;

public class CreateUserService {
	

	public static JSONObject createUserJSON (String prenom, String nom, String login, String password, String email) {
		
		try {
			CreateUserCore.createUser(prenom,nom,login,password,email);
		}
		catch (BDDException e)
		{
			
			return( ServiceTools.error("Erreur dans la base de données blabla blabla toto ",500));
		}
		catch(CreateUserException e)
		{
			if (e.getCode() == 301) 	
				ServiceTools.error("Erreur : le login existe déjà", e.getCode());
		}
		return ServiceTools.ok();
		
	}
}
