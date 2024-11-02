package pe.edu.upc.aaw.tf_finanzas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.tf_finanzas.entities.Documentos;

@Repository
public interface IDocumentosRepository extends JpaRepository<Documentos, Integer> {
}
