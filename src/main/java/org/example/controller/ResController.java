package org.example.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.example.model.Apprenants;
import org.example.model.Reservation;
import org.example.service.AgendaService;
import org.example.service.ApprenantsService;
import org.example.service.FabriqueService;
import org.example.service.ReservationService;

@Controller
public class ResController {
	@Autowired
	public FabriqueService Fab;
	@Autowired
	public AgendaService Age;
	@Autowired
	public ApprenantsService App;
	@Autowired
	   public ReservationService Res;
	@RequestMapping(value= "/List-Reservation")
	public String Reservation(Model model) {
        
		model.addAttribute("ListRes",Res.getAllReservation());
		return "Admin-Reservation";
		
		
	}
	@RequestMapping(value="/AccepteRes")
	public String AccepteRes(Model model ,@RequestParam(value="Accepte") Long id) {
		Reservation p1= Res.getReservationById(id);
		Reservation p2=new Reservation();
		p2.setAgenda(p1.getAgenda());
		p2.setApprenants(p1.getApprenants());
		p2.setFabrique(p1.getFabrique());
		p2.setActive_reservation(true);
	    Res.updateReservation(p2, id);
	    
		return Reservation(model);
	}
	
	@RequestMapping(value="/RefuseRes")
	public String RefuseRes(Model model ,@RequestParam(value="Refuse") Long id) {
		Res.deletReservations(id);
		return Reservation(model);
	}
	@RequestMapping(value = "demandesAcces" ,method = RequestMethod.POST)
	public String demandesAcces(Model model,@RequestParam Long id_date
			                                 ,@RequestParam Long id_fabrique,HttpSession session,HttpServletRequest request) {
		Apprenants user = (Apprenants)session.getAttribute("logged");
		Reservation reserve=new Reservation();
		Long id=user.getId_user();
		System.out.print(id);
		reserve.setActive_reservation(false);
		reserve.setApprenants(user);
		reserve.setAgenda(Age.getAgendaById(id_date));
		reserve.setFabrique(Fab.getFabriqueById(id_fabrique));
	    System.out.print(reserve);
		Res.addReservation(reserve);
		return null;
	}
	
	
}
