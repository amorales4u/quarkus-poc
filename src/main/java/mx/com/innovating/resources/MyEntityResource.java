package mx.com.innovating.resources;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;
import io.quarkus.rest.data.panache.MethodProperties;
import mx.com.innovating.entities.MyEntity;

public interface MyEntityResource  extends PanacheEntityResource<MyEntity, Long> {
    @Override
    @MethodProperties(exposed = false)
    boolean delete(Long id);
}
