/**
 * 
 */
package br.com.motivo.sga.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.motivo.sga.model.Institution;

/**
 * @author ferrete
 * 
 */
public interface InstitutionRepository extends JpaRepository<Institution, Integer> {

	/**
	 * Exemplo de criação de query com parametros de busca
	 * 
	 * @param cod
	 * @param name
	 * @return
	 */
	@Query("select i from Institution i where i.name = :name or i.cod = :cod")
	Institution findByQueryParam(@Param("cod") String cod,
			@Param("name") String name);

}
