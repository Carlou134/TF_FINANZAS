package pe.edu.upc.aaw.tf_finanzas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.aaw.tf_finanzas.entities.Reporte;

public interface IReporteRepository extends JpaRepository<Reporte, Integer> {
}
