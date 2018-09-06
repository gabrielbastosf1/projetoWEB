package projetoWeb;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
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
			
			//Adicionando o Cliente no TXT!
			FileReader file = new FileReader("C:\\Users\\biels\\Desktop\\results.txt");
			
			try (Writer writer = new BufferedWriter(new OutputStreamWriter(
		              new FileOutputStream("C:\\Users\\biels\\Desktop\\results.txt"), "utf-8"))) {
		   writer.write(""+cliente+"");
			}
		}	
		cliente.setEditar(false);
		cliente = new Cliente();
	}
	
	public void editar() {
		cliente.setEditar(true);	
	}
	
	public void txt() throws IOException {
	
	}
}
