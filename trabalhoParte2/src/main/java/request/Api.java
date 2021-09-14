package request;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import dados.Atores;
import dados.Filmes;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import kong.unirest.json.JSONArray;
import kong.unirest.json.JSONObject;

public class Api {

	private static Api instance = null;

	public static Api getInstance() {
		if (instance == null) {
			instance = new Api();
		}
		return instance;
	}
	
	public Filmes procuraFilme(String nome) throws MalformedURLException {
		
		List<Atores> atores = new LinkedList<Atores>();
		Filmes filme = new Filmes();
		String titulo = nome;
		HttpResponse<JsonNode> response = Unirest.get("https://imdb8.p.rapidapi.com/auto-complete?q={name}")
				.routeParam("name", titulo)
				.header("x-rapidapi-key", "ecc3b6665emsh52614fc24f45b60p1e768fjsn400dcdc5ad6f")
				.header("x-rapidapi-host", "imdb8.p.rapidapi.com").asJson();
		JSONObject j = response.getBody().getArray().getJSONObject(0).getJSONArray("d").getJSONObject(0);
		String idApi = j.getString("id");
		String title = j.getString("l");
		String rank = j.getString("rank");
		String ano = j.getString("y");
		filme.setIdApi(idApi);
		filme.setTitulo(title);
		filme.setRank(Integer.parseInt(rank));
		filme.setAno(ano);
		HttpResponse<JsonNode> response1 = Unirest.get("https://imdb8.p.rapidapi.com/title/find?q={name}")
				.routeParam("name", titulo)
				.header("x-rapidapi-key", "ecc3b6665emsh52614fc24f45b60p1e768fjsn400dcdc5ad6f")
				.header("x-rapidapi-host", "imdb8.p.rapidapi.com").asJson();
		String j4 = response1.getBody().getArray().getJSONObject(0).getJSONArray("results").getJSONObject(0).getJSONObject("image").getString("url");
		URL url = new URL(j4);
		filme.setUrl(url);
		JSONArray j2 = response1.getBody().getArray().getJSONObject(0).getJSONArray("results").getJSONObject(0)
				.getJSONArray("principals");
		for (int i = 0; i < j2.length(); i++) {
			Atores ator = new Atores();
			String temp = j2.getJSONObject(i).getString("id");
			temp = temp.replaceAll("/name/", "");
			temp = temp.replace("/", "");
			HttpResponse<JsonNode> response2 = Unirest.get("https://imdb8.p.rapidapi.com/actors/get-bio?nconst={name}")
					.routeParam("name", temp)
					.header("x-rapidapi-key", "ecc3b6665emsh52614fc24f45b60p1e768fjsn400dcdc5ad6f")
					.header("x-rapidapi-host", "imdb8.p.rapidapi.com").asJson();

			JSONObject j3 = response2.getBody().getObject();
			URL url2 = new URL(j3.getJSONObject("image").getString("url"));
			String idApiAtor = temp;
			String nomeAtor = j3.getString("name");
			String dataDeNascimento = j3.getString("birthDate");
			String sexo = j3.getString("gender");
			String miniBiografia = j3.getJSONArray("miniBios").getJSONObject(0).getString("text");
			ator.setUrl(url2);
			ator.setIdApi(idApiAtor);
			ator.setNome(nomeAtor);
			ator.setDataDeNascimento(dataDeNascimento);
			ator.setSexo(sexo);
			ator.setMiniBiografia(miniBiografia);
			atores.add(ator);
		}

		filme.setElenco(atores);
		return filme;

	}
}