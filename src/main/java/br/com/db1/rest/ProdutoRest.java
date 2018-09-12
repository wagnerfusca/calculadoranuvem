package br.com.db1.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import br.com.db1.model.Produto;

@Path("/produto")
public class ProdutoRest {

	@GET
	@Path("/get")
	@Produces("application/json")
	public Produto getProdutoJSON() {

		Produto produto = new Produto();
		produto.setNome("Moto X - Android");
		produto.setQuantidade(10);

		return produto;
	}

	@POST
	@Path("/post")
	@Consumes("application/json")
	public Response criarProdutoJSON(Produto produto) {
		String result = "Product created 123: " + produto;
		return Response.status(201).entity(result).build();

	}

}
