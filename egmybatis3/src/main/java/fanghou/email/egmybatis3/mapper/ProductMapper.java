package fanghou.email.egmybatis3.mapper;

import fanghou.email.egmybatis3.pojo.entity.Product;
import fanghou.email.egmybatis3.pojo.vo.ProductVo1;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {

    int insertProduct(Product product);

    ProductVo1 selectSingleProduct(int id);

    int deleteProduct(int id);

    int deleteProduct1(List<Integer> id);

    int dynamicUpdate(Product product);

    int selectCount();
}
