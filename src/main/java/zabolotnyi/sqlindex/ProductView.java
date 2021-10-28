package zabolotnyi.sqlindex;

import javax.persistence.criteria.CriteriaBuilder.In;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductView {
    private String name;
    private Integer price;
    private Integer quantity;
    private Integer supplierCode;
}

