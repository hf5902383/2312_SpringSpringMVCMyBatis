package fanghou.emal.egmybatis2.mapper;

import fanghou.emal.egmybatis2.pojo.entity.Product;
import fanghou.emal.egmybatis2.pojo.vo.ProductVo1;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Mapper
public interface ProductMapper {

    int insertProduct(Product product);

    ProductVo1 selectSingleProduct(Integer id);

    int deleteById(Integer id);
}
