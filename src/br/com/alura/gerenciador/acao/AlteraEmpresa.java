package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class AlteraEmpresa implements Acao {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idEmpresa = request.getParameter("id");
		String nomeEmpresa = request.getParameter("nome");
        String paramDataEmpresa = request.getParameter("data");
        
        Integer id = Integer.valueOf(idEmpresa);        
        Date dataAbertura = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            dataAbertura = sdf.parse(paramDataEmpresa);
        } catch (ParseException e) {
            throw new ServletException(e);
        }
        
        Banco banco = new Banco();
        Empresa empresa = banco.buscaEmpresaPorId(id);
        
        empresa.setId(id);
        empresa.setNome(nomeEmpresa);
        
        return "redirect:entrada?acao=ListaEmpresas";
	}
}
