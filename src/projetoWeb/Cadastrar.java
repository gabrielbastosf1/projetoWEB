package projetoWeb;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class Cadastrar {
	
	private Cliente cliente = new Cliente();
	private List<Cliente> lista = new ArrayList<Cliente>();
	
	public List<Cliente> getLista() {
		return lista;
	}

	public void setLista(List<Cliente> lista) {
		this.lista = lista;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void exibir() throws UnsupportedEncodingException, IOException {
		if (!lista.contains(cliente)){
			lista.add(cliente);
			  String local = "C:\\Users\\biels\\Desktop\\results.txt";
	            try (PrintWriter arquivo = new PrintWriter(new FileWriter(local, true))) {
	                arquivo.println();
	                arquivo.println("id="+cliente.getId());
	                arquivo.println("Nome="+cliente.getNome());
	                arquivo.println("Sobrenome="+cliente.getSobrenome());
	                arquivo.println("E-mail="+cliente.getEmail());
	            }
		}	
		cliente.setEditar(false);
		cliente = new Cliente();
	}
	
	public void editar() {
		cliente.setEditar(true);	
	}
}
