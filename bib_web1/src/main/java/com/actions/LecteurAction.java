package com.actions;

import org.apache.struts2.convention.annotation.Action;

import org.apache.struts2.convention.annotation.Result;

import com.app.business.bo.Lecteur;
import com.app.business.service.LecteurService;



public class LecteurAction extends BaseAction {

	private Lecteur lecteur;

	private LecteurService lecteurService;
	@Action(value = "addLecteur", results = { @Result(name = "success",type="redirect", location = "listAction") })
	public String addLecteur() {

		// TODO: Traitement applicatif à faire

		lecteurService.addLecteur(lecteur);

		// TODO: Traitement applicatif à faire

		return SUCCESS;
	}

	public Lecteur getLecteur() {
		return lecteur;
	}

	public void setLecteur(Lecteur lecteur) {
		this.lecteur = lecteur;
	}

	public LecteurService getLecteurService() {
		return lecteurService;
	}

	public void setLecteurService(LecteurService lecteurService) {
		this.lecteurService = lecteurService;
	}

}
