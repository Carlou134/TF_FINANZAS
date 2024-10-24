package pe.edu.upc.aaw.tf_finanzas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.aaw.tf_finanzas.entities.Facturas;

public interface IFacturasRepository extends JpaRepository<Facturas, Integer> {
}
