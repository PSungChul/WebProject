package factory;

import java.util.List;

public class ProductController {
	// 생성자 매개변수로 'PlayerRepository' 가져오기
	ProductRepository productRepository;
	public ProductController(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	// 데이터를 생성한뒤 DB에 저장
	void creat(Product product) {
		productRepository.save(product);
	}
	// 데이터를 모두 조회(출력)
	void findAll() {
		List<Product> res = productRepository.findAll();
		
		for ( int i = 0; i < res.size(); i++ ) {
			System.out.println(
					res.get(i).getProductId() + " "
					+ res.get(i).getProductName() + " "
					+ res.get(i).getProuductDesc());
		}
	}
	// 지정 ID데이터만 조회(출력)
	void findById(int n) {
		List<Product> resId = productRepository.findById();
		
		for ( int i = 0; i < resId.size(); i++ ) {
			if ( n == resId.get(i).getProductId() ) {
				System.out.println(
						resId.get(i).getProductId() + " "
						+ resId.get(i).getProductName() + " "
						+ resId.get(i).getProuductDesc());
			}
		}
	}
}
