package mx.com.innovating.entities;

import io.agroal.api.AgroalDataSource;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.math.BigDecimal;


@Accessors(chain = true)
@Entity(name = "pozo_tipo")
@Getter
@Setter
@Table(schema = "front")
public class PozoTipo extends PanacheEntity {
    public Integer anio;
    public Integer mes;
    @Column(name = "produccion_mbpce")
    public BigDecimal produccionMbpce;
    public BigDecimal aceite;
    public BigDecimal gas;
    public BigDecimal condensado;
    public BigDecimal total;
    public BigDecimal fijos;
    public BigDecimal variables;
    @Column(name = "total_variables")
    public BigDecimal totalVariables;
    public BigDecimal egresos;








}
