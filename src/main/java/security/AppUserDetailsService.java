package security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.faces.context.FacesContext;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Grupo;
import model.Usuario;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class AppUserDetailsService implements UserDetailsService {

	private List<Grupo> grupos;
	private Grupo gp;

	private SessionFactory sessionFactory;

	public AppUserDetailsService() {

	}

	public UserDetails loadUserByUsername(String email)
			throws UsernameNotFoundException {

		Usuario usuario = new Usuario();

		try {
			usuario = findEmail(email);

		} catch (Exception e) {
			System.out.println("erro ao achar email " + e.getMessage());
		}

//		try {
//			gp = new Grupo();
//			gp.setId(1L);
//			gp.setDescricao("ADMINISTRADOR");
//			gp.setNome("ADMINISTRADOR");
//
//		}
//
//		catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//
//		grupos = new ArrayList<Grupo>();
//		grupos.add(0, gp);
//		usuario.setGrupos(grupos);
//
		UsuarioSistema user = null;

		if (usuario != null) {
			user = new UsuarioSistema(usuario, getGrupos(usuario));
		}

		return user;
	}

	private Collection<? extends GrantedAuthority> getGrupos(Usuario usuario) {
		List<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();

		for (Grupo grupo : usuario.getGrupos()) {
			// System.out.println(" nome grupo "+grupo.getNome().toUpperCase());
			authorities.add(new SimpleGrantedAuthority(grupo.getNome()
					.toUpperCase()));
		}

		return authorities;
	}

	public Usuario findEmail(String email) {

		int um;
		int dois;

		String username = (String) FacesContext.getCurrentInstance()
				.getExternalContext().getSessionMap().get("username");
		String Schema2 = (String) FacesContext.getCurrentInstance()
				.getExternalContext().getSessionMap().get(username);
		System.out.println("=========>>>>" + Schema2);

		// um = email.indexOf(";");
		// System.out.println(email.substring(um + 1, email.length()).trim());
		// System.out.println(email.substring(0, email.indexOf(";")));

		// String schema =
		// (String)FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("schema");
		// System.out.println("esquema recuperado " + schema);

		// email.substring(um + 1, email.length()).trim()

		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("SafiraPU");
		sessionFactory = factory.unwrap(SessionFactory.class);

		Session session = sessionFactory.withOptions()
				.tenantIdentifier(Schema2).openSession();

		System.out.println(" connectado " + session.isConnected());

		System.out.println("findEmail com criteria " + email);

		// email.substring(0, email.indexOf(";"))

		Usuario emp = new Usuario();
		Criteria crit = session.createCriteria(Usuario.class)
				.add(Restrictions.eq("email", username)).setMaxResults(1);
		emp = (Usuario) crit.uniqueResult();
		
		System.out.println("=========>" + emp.getNome());

		return emp;
	}

	// public Empregador findEmail2(String email) {
	//
	// Connection conn;
	// Empregador emp = new Empregador();
	// System.out.println(" find email 1");
	// try {
	// conn = ConectaPostgre.obtemConexao();
	// // Execute SQL query
	// String query = "select * from empregador where email = ?";
	// PreparedStatement prepStmt = conn.prepareStatement(query);
	// prepStmt.setString(1, email);
	// ResultSet rs = prepStmt.executeQuery();
	//
	// if (rs.next()) {
	// System.out.println(" find email 2");
	// emp.setId((long) rs.getInt("Id"));
	// emp.setNome(rs.getString("nome"));
	// emp.setEmail(rs.getString("email"));
	// emp.setSenha(rs.getString("senha"));
	//
	//
	// }
	// rs.close();
	// prepStmt.close();
	// conn.close();
	//
	// } catch (SQLException e) {
	// e.printStackTrace();
	// }

	// return emp;
	// }

}