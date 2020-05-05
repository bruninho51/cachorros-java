package br.com.usoftware.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.com.usoftware.enums.Porte;
import br.com.usoftware.enums.Sexo;
import br.com.usoftware.model.CachorroModel;

@Repository
public class CachorroRepository {
	
	private static Map<Long, CachorroModel> cachorros = new HashMap<Long, CachorroModel>();
	
	public CachorroRepository() {
		cachorros.put(1L, 
			new CachorroModel(
				1L,
				"Doguete",
				"Pastor alemão",
				Porte.G,
				6,
				"Marrom", 
				30.0, 
				Sexo.M)
		);
		cachorros.put(2L, 
			new CachorroModel(
				2L, 
				"Linguiça",
				"Salsicha",
				Porte.P,
				2,
				"Marrom", 
				9.0, 
				Sexo.M)
		);
		cachorros.put(3L, 
			new CachorroModel(
				3L, 
				"Bolacha",
				"Poodle",
				Porte.M,
				3,
				"Branco", 
				9.0, 
				Sexo.F)
		);	
	}
	
	public Map<Long, CachorroModel> findAll() {
		
		return cachorros;
	}
	
	public CachorroModel findById(Long id) {
		
		return cachorros.get(id);
	}
	
	public void save(CachorroModel cachorro) {
		cachorros.put(cachorro.getId(), cachorro);
	}
	
	public void update(CachorroModel cachorro) {
		cachorros.put(cachorro.getId(), cachorro);
	}
	
	public void deleteById(Long id) {
		cachorros.remove(id);
	}
	
	public int getMax() {
		return cachorros.size();
	}
}
