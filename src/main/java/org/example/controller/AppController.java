package org.example.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.example.model.Agenda;
import org.example.model.Apprenants;
import org.example.model.Fabrique;
import org.example.model.Reservation;
import org.example.service.AgendaService;
import org.example.service.ApprenantsService;
import org.example.service.FabriqueService;
import org.example.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {
	@Autowired
	public FabriqueService Fab;
	@Autowired
   public ApprenantsService App;
	@Autowired
	public AgendaService Age;
	@Autowired
	public ReservationService Res;

	
	@RequestMapping(value= "/inscreption")
	public String insc() {
		
        return "inscreption";
		
	}
	@RequestMapping(value="/login")
	public String login() {
		return "login";
	}
	@RequestMapping(value="/")
	public String login2() {
		return "login";
	}
	@RequestMapping(value="/Admin")
	  public String Admin(Model model) {
		model.addAttribute("listApp",App.getByAction(false));
		return "Admin-Apprenants";
	}
	@RequestMapping(value="/RefuseApp")
	public String RefuseApp(Model model ,@RequestParam(value="Refuse") Long id) {
		App.deletApprenants(id);
		return Admin(model);
	}
	@RequestMapping(value="/AccepteApp")
	public String AccepteApp(Model model ,@RequestParam(value="Accepte") Long id) {
		Apprenants p1= App.getApprenantsById(id);
		Apprenants p2=new Apprenants();
		p2.setId_user(p1.getId_user());
		p2.setEmail_user(p1.getEmail_user());
		p2.setNom_user(p1.getNom_user());
		p2.setRole(p1.isRole());
		p2.setActive(true);
	    App.updateApprenants(p2, id);	
		return Admin(model);
		//err
	}
	@RequestMapping(value="/AddApp")
	public String Insc(Model model ,@RequestParam String name,
			                        @RequestParam String email,
			                        @RequestParam String pass1,
			                        @RequestParam String pass2){
		List<Apprenants> ListApp= App.getAllApprenants();
		Boolean test=false;
		for(Apprenants p:ListApp) {
			if(p.getEmail_user().equals(email)){
			 test=true;
			 break;
			}
		}
		if(test){
			model.addAttribute("msg","Cette Compte Existe Déja");
			return "inscreption";
		 }
		else {
			if(!pass1.equals(pass2)){
			model.addAttribute("msg","Les Deux Password Pas Meme");
			return "inscreption";
		    }
			else {
			Apprenants a=new Apprenants(name,email,pass1,false,false);
			App.addApprenants(a);
			model.addAttribute("msg","Votre Inscreption Succef");
			return "login";
		    }
		}
		
	}
	
	
	@RequestMapping(value="/loginForm",method = RequestMethod.POST)
	public String login(Model model ,@RequestParam String email,
			                         @RequestParam String pass1,
			                         HttpSession httpSession){
	 List<Apprenants> ListApp= App.getAllApprenants();
	 Boolean test=false;
	 Apprenants ap=new Apprenants();
		for(Apprenants p:ListApp) {
			if(p.getEmail_user().equals(email)){
			 test=true;
			 ap=p;
			}
		}
		if(test) {
			if(!ap.getPass_user().equals(pass1)) {
				model.addAttribute("msg","Votre Password Incorrect");
				return "login";
			}
			else {
				if(ap.isActive()==false && ap.isRole()==false ) {
					model.addAttribute("msg","Votre Compte N'est Pas Accepter");
					return "login";
				}
				else if(ap.isActive()==true && ap.isRole()==true) {
					httpSession.setAttribute("logged", ap);
					//httpSession.invalidate();
					Apprenants user = (Apprenants)httpSession.getAttribute("logged");
 					return Admin(model);				}
				else {
					httpSession.setAttribute("logged", ap);
					//httpSession.invalidate();
					Apprenants user = (Apprenants)httpSession.getAttribute("logged");
					List<Agenda> ListAgenda =Age.getAllAgenda();
					model.addAttribute("ListAgenda", ListAgenda);
					List<Fabrique> ListFabrique=Fab.getAllFabrique();
					model.addAttribute("ListFabrique",ListFabrique);
					List<Reservation> res=Res.getReservationByUser(user.getId_user());
					model.addAttribute("ListResByUser", res);
					return "list-apprenants";
				}
				
			}
		}
		else {
			model.addAttribute("msg","Votre Email Incorrect");
			return "login";
		}
		
		
		
		
	}
	@RequestMapping(value = "/List-Apprenant")
	public String List_Apprenant(Model model) {
		return Admin(model);
	}
	@RequestMapping(value = "/deconnect")
	public String dec(HttpSession httpSession) {
		httpSession.invalidate();
		return "login";
	}
	
	

	
	
}
