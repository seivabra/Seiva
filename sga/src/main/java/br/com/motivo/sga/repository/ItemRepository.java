/**
 * 
 */
package br.com.motivo.sga.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.motivo.sga.model.Item;

/**
 * @author ferrete
 *
 */
public interface ItemRepository extends JpaRepository<Item, Long>{
	
	@Query(value=":cod or ")
	public Item findItemByQueryParam(@Param("cod") String cod);

}
