// 전역 상수
const btn_1 = document.getElementById("btn_1");
const btn_2 = document.getElementById("btn_2");
const btn_3 = document.getElementById("btn_3");
const btn_4 = document.getElementById("btn_4");
const result = document.getElementById("result");
// 더하기
btn_1.addEventListener("click", function() {
	// 지역 상수
	const num_1 = parseInt(document.getElementById("num_1").value);
	const num_2 = parseInt(document.getElementById("num_2").value);
	if(num_1 == float(num_1) || num_2 == float(num_2)) {
		result.innerText("소수값은 입력 될 수 없습니다.")
	} else {
		result.innerText = (num_1+num_2);	
	}
})
// 빼기
btn_2.addEventListener("click", function() {
	const num_1 = parseInt(document.getElementById("num_1").value);
	const num_2 = parseInt(document.getElementById("num_2").value);
	result.innerText = (num_1-num_2);
});
// 곱하기
btn_3.addEventListener("click", function() {
	const num_1 = parseInt(document.getElementById("num_1").value);
	const num_2 = parseInt(document.getElementById("num_2").value);
	result.innerText = (num_1*num_2);
});
// 나누기
btn_4.addEventListener("click", function() {
	const num_1 = parseInt(document.getElementById("num_1").value);
	const num_2 = parseInt(document.getElementById("num_2").value);
	// 숫자2에 0이 들어갈 경우
	if(num_2 == 0) {
		result.innerText = "0으로 나눌 수 없습니다.";
	} else {
		result.innerText = (num_1/num_2);
	}
});

