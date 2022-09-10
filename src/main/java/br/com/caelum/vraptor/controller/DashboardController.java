package br.com.caelum.vraptor.controller;



import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.dao.UsuarioDAO;
import br.com.caelum.vraptor.model.Usuario;
@Path("dashboard")
@Controller
public class DashboardController {
	
	
	@Inject EntityManager eManager;
	@Inject Result result;
	@Inject UsuarioDAO usuarioDao;
		
		@Get("")
		public void dashboard() {
		}
			
			@Post("salvausuario")
			public void salvaUsuario(Usuario usuario) {
			//validar usuario
				//salvar no banco
				usuarioDao.insertOrUpdate(usuario);
				//direcionar para o dashboard
				result.redirectTo(DashboardController.class).dashboard();;
			}
			
		

}
