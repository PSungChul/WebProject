package factory;

public class Product {
	// 제품 정보
	// 보안을 위해 private로 생성
	private int productId;
	private String productName;
	private String productDesc;
	// 생성자 오버로딩
	// 값을 받는 용도
	public Product(int productId, String productName, String productDesc) {
		this.productId = productId;
		this.productName = productName;
		this.productDesc = productDesc;
	}
	
	// getter
	// 값의 출력 용도
	int getProductId() {
		return productId;
	}
	String getProductName() {
		return productName;
	}
	String getProuductDesc() {
		return productDesc;
	}
}
