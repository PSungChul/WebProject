// 전역 상수
const btn_calc = document.getElementsClassName("btn_calc"); // class로 한번에 묶어서 생성
const result = document.getElementById("result");
// 더하기
btn_calc[0].addEventListener("click", function() {
	// 지역 상수
	const num_1 = parseInt(document.getElementById("num_1").value);
	const num_2 = parseInt(document.getElementById("num_2").value);
	result.innerText = (num_1 + num_2);
});
// 빼기
btn_calc[1].addEventListener("click", function() {
	const num_1 = parseInt(document.getElementById("num_1").value);
	const num_2 = parseInt(document.getElementById("num_2").value);
	result.innerText = (num_1 - num_2);
});
// 곱하기
btn_calc[2].addEventListener("click", function() {
	const num_1 = parseInt(document.getElementById("num_1").value);
	const num_2 = parseInt(document.getElementById("num_2").value);
	result.innerText = (num_1 * num_2);
});
// 나누기
btn_calc[3].addEventListener("click", function() {
	const num_1 = parseInt(document.getElementById("num_1").value);
	const num_2 = parseInt(document.getElementById("num_2").value);
	// 숫자2에 0이 들어갈 경우
	if (num_2 == 0) {
		result.innerText = "0으로 나눌 수 없습니다.";
	} else {
		result.innerText = (num_1 / num_2);
	}
});
