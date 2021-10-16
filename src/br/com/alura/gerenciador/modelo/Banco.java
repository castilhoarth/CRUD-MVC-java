package br.com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	private static List<Usuario> listaUsuario = new ArrayList<Usuario>();
	
	static {
		Empresa empresa = new Empresa();
		empresa.setId(Banco.chaveSequencial++);
		empresa.setNome("Alura");
		
		Empresa empresa2 = new Empresa();
		empresa2.setId(Banco.chaveSequencial++);
		empresa2.setNome("Caelum");
		
		lista.add(empresa);
		lista.add(empresa2);
		
		Usuario u1 = new Usuario();
		u1.setLogin("Arthur");
		u1.setSenha("22052001");
		
		Usuario u2 = new Usuario();
		u2.setLogin("Ana");
		u2.setSenha("15121976");
		
		listaUsuario.add(u1);
		listaUsuario.add(u2);
	}

	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		lista.add(empresa);
	}
	
	public void removeEmpresa(Integer id) {
		
		Iterator<Empresa> it = lista.iterator();
		
		while(it.hasNext()) {
			Empresa emp = it.next();
			
			if(emp.getId() == id) {
				it.remove();
			}
		}
		
	}
	
	public Usuario existeUsuario(String login, String senha) {
		for (Usuario usuario : listaUsuario) {
			if(usuario.ehIgual(login, senha)) {
				return usuario;
			}
		}
		return null;
	}
	
	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}

	public Empresa buscaEmpresaPorId(Integer id) {
		for (Empresa empresa : lista) {
			if(empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}
}
