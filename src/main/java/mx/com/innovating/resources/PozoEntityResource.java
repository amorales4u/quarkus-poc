package mx.com.innovating.resources;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;
import mx.com.innovating.entities.PozoTipo;

public interface PozoEntityResource extends PanacheEntityResource<PozoTipo, Long> {
}
