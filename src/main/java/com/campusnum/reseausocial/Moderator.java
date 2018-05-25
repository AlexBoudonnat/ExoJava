package com.campusnum.reseausocial;

public class Moderator extends User {
	
	private int ModeratingLevel;

	public Moderator() {
		super();
		this.setModeratingLevel(1);
	}

	public Moderator(String pPrenom, String pNom, String pVille, String pAge) throws NomException, PrenomException, VilleException, AgeException {
		super(pPrenom, pNom, pVille, pAge);
		this.setModeratingLevel(1);
	}
	
	/* (non-Javadoc)
	 * @see com.campusnum.reseausocial.User#getModeratingLevel()
	 */
	public int getModeratingLevel() {
		return ModeratingLevel;
	}

	/**
	 * @param moderatingLevel
	 */
	public void setModeratingLevel(int moderatingLevel) {
		ModeratingLevel = moderatingLevel;
	}
	
	/**
	 * @param userId
	 * @param msgId
	 */
	public void deleteMsg(int userId, int msgId) {
		//permet de supprimer le msg qui a pour id msgId d'un utilisateur qui a id userId
	}
	
	/**
	 * @param userId
	 */
	public void deleteUser (int userId) {
		//permet de supprimer l'utilisateur qui a pour id userId
	}
	
	/**
	 * @return
	 */
	public String getFunction() {
		return " (modérateur de niveau ";
	}

}
