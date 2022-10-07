// 전역 상수
const btn_calc = document.getElementsByClassName("btn_calc"); // class로 한번에 묶어서 생성
const result = document.getElementById("result"); // 결과값 입력용
for (let i = 0; i < btn_calc.length; i++) {
	btn_calc[i].addEventListener("click", function(event) {
		// 지역 상수
		const num_1 = parseInt(document.getElementById("num_1").value); // 숫자1 입력값
		const num_2 = parseInt(document.getElementById("num_2").value); // 숫자2 입력값
		for (let j = 0; j < btn_calc.length; j++) { // 버튼이 클릭되면 
			btn_calc[j].style.backgroundColor = "white"; // 모든 버튼 하얀색
		} // inner for 버튼색 초기화용
		if (event.target.value == "+") { // 클릭된 버튼의 value 값
			event.target.style.backgroundColor = "red"; // 클릭된 버튼 빨간색
			result.innerText = (num_1 + num_2); // 연산값 작성
		} else if (event.target.value == "-") {
			event.target.style.backgroundColor = "red";
			result.innerText = (num_1 - num_2);
		} else if (event.target.value == "*") {
			event.target.style.backgroundColor = "red";
			result.innerText = (num_1 * num_2);
		} else if (event.target.value == "/") {
			event.target.style.backgroundColor = "red";
			if (num_2 == 0) { // 숫자2에 0이 들어간 경우
				result.innerText = ("0으로 나눌 수 없습니다.");
			} else {
				result.innerText = (num_1 / num_2);
			}
		} // if 클릭된 버튼의 연산 찾기용
	});
} // outer for 클릭된 버튼 찾기용

