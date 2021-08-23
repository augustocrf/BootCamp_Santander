package br.com.acrf.pontonline.repository;


import br.com.acrf.pontonline.model.TipoData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDataRepository extends JpaRepository<TipoData, Long>  {
}
