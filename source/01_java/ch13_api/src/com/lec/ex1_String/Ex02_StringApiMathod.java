package com.lec.ex1_String;

public class Ex02_StringApiMathod {
	public static void main(String[] args) {
		String str1 = "abcXabc";
		String str2 = "AbCXabc";
		String str3 = "   ja va   ";
		System.out.println("1."  + str1.concat(str2)); 				// 1.abcXabcAbCXabc str1+str2
		System.out.println("2. " + str1.substring(3)); 				// 2. Xabc 3번째 부터 출력
		System.out.println("3. " + str1.substring(3, 5));			// 3. Xa 3번째 부터 5번째 앞까지 (3번째하고 4번째 출력)
		System.out.println("4. " + str1.length()); 					// 4. 7 문자열 길이 
		System.out.println("5. " + str1.toUpperCase()); 			// 5. ABCXABC 모두 대문자로 
		System.out.println("6. " + str1.toLowerCase()); 			// 6. abcxbac 모두 소문자로
		System.out.println("7. " + str1.charAt(3)); 				// 7. x 3번째 인덱스 글자
		System.out.println("8. " + str1.indexOf("bc")); 			// 8. 1 해당 문자가 처음 오는 인덱스를 반환
		String str4 = "abcXabcXabc";
		System.out.println("9. " + str4.indexOf("bc", 2));			// 9. 5 해당 문자를 2번째부터 인덱스를 반환
		System.out.println("10. " + str4.lastIndexOf("bc"));		// 10. 9 마지막 부터 해당 인덱스를 반환
		System.out.println("11. " + str4.indexOf("@"));	    		// 11. -1 없는문자는 -1로 반환
		System.out.println("12. " + str1.equals(str2));				// 12. false 대소문자 구분하고 비교
		System.out.println("13. " + str1.equalsIgnoreCase(str2));	// 13. true 대소문자 구분없이 비교
		System.out.println("14. " + str3.trim()); 					// 14. ja va  앞 뒤 스페이스 제거
		// 문자열.replace("oldStr","newStr")
		// 문자열.replaceAll("oldStr정규표현식, newStr)
		// [0-9] 숫자 정규표현식 대괄호 안에 넣어 사용
		System.out.println("15. " + str1.replace("abc", "바꿔")); 	// 15. 바꿔x바꿔 앞에 문자열을 뒤에있는 문자열로 변경 출력
		String str5 = "반가워요. ㅋㅋ 또 봐요 ㅎㅎ zz";
		System.out.println("16. " + str5.replaceAll("[ㄱ-ㅎz]", " "));	// 16. 바꿔x바꿔 해당 정규표현식 문자 삭제 변경 출력

		System.out.println("str1 =" + str1);
		System.out.println("str2 =" + str2);
	}

}
