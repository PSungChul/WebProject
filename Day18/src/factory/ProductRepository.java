package factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository {
	// 가짜 DB Map<key, value>
	Map<Integer, Product> db = new HashMap<Integer, Product>();
	// DB에 데이터 저장
	void save(Product product) {
		db.put(product.getProductId(), product);
		System.out.println(product.getProductName() + " 생산 완료"); // 확인용 메세지
	}
	// DB에 데이터 전체 조회
	List<Product> findAll() {
		List<Product> result = new ArrayList<Product>();
		
		// 순서가 없을때 = foreach문 / while문
		// for (each:덩어리)
		for ( Integer key:db.keySet() ) { // db.keySet - DB의 key값을 모두 가져온다.
			result.add(db.get(key)); // key값에 해당하는 value값
		}
		
		return result;
	}
	// DB에 지정한 ID값에 해당하는 데이터 조회
	List<Product> findById() {
		List<Product> result = new ArrayList<Product>();
		
		for( Integer key:db.keySet() ) {
			result.add(db.get(key));
		}
		
		return result;
	}
}
