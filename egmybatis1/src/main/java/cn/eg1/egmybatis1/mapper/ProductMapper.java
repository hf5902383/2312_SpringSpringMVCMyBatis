package cn.eg1.egmybatis1.mapper;

import cn.eg1.egmybatis1.pojo.entity.Product;
import cn.eg1.egmybatis1.pojo.vo.ProductVo1;
import cn.eg1.egmybatis1.pojo.vo.ProductVo2;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProductMapper {
    @Insert("INSERT INTO product(title, price,stock) VALUES(#{title},#{price},#{stock})")
    int insertProduct(Product product);

    @Select("SELECT title, price FROM product WHERE id=#{id}")
    ProductVo1 selectSingleProduct(int id);

    @Delete("DELETE FROM product WHERE id=#{id}")
    int deleteById(int id);

    @Select("SELECT id, title, price, stock FROM product")
    List<ProductVo2> selectManyProduct();
}
