package mx.com.innovating.resources;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;
import io.quarkus.rest.data.panache.MethodProperties;
import mx.com.innovating.entities.PozoTipo;

public interface PozoTipoResource extends PanacheEntityResource<PozoTipo, Long> {

    @Override
    @MethodProperties(exposed = false)
    PozoTipo add(PozoTipo pozoTipo);

    @Override
    @MethodProperties(exposed = false)
    PozoTipo update(Long id, PozoTipo pozoTipo);

    @Override
    @MethodProperties(exposed = false)
    boolean delete(Long id);
}
