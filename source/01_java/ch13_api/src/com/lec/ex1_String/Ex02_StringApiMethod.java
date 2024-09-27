package com.lec.ex1_String;
public class Ex02_StringApiMethod {
	public static void main(String[] args) {
			String str1 = "abcXabc";
			String str2 = "AbCXabc";
			String str3 = " ja va ";
			System.out.println("1. " + str1.concat(str2)); // 1. abcXAbcXabc
			System.out.println("2. " + str1.substring(3)); // 2. Xabc
			System.out.println("3. " + str1.substring(3, 5)); // 3. Xa: 3번째부터 5번째까지
			System.out.println("4. " + str1.length()); // 4.7: 문자열 길이
			System.out.println("5. " + str1.toUpperCase()); // 5. ABCXABC : 모두 대문자로
			System.out.println("6. " + str1.toLowerCase()); // 6.abcxabc
			System.out.println("7. " + str1.charAt(3)); // 7.X: 3번째인덱스 글자
			System.out.println("8. " + str1.indexOf("bc")); // 8.1 : 해당문자가 처음오는 인덱스
			String str4 = "abcXabcXabc";
			System.out.println("9. " + str4.indexOf("bc", 2)); //9.5 : 해당문자를 2번째부터 검색
			System.out.println("10. " + str4.lastIndexOf("bc")); // 10.9 : 마지막부터 해당문자열을 검색
			System.out.println("11. " + str4.indexOf("@")); // 11.-1 : 없는 문자는 -1 변환
			System.out.println("12. " + str1.equals(str2)); // 12.false
			System.out.println("13. " + str1.equalsIgnoreCase(str2)); // 13.true: 대소문자구별없이 비교
			System.out.println("14. " + str3.trim()); // 14. ja va : 앞뒤space 제거);
			// 문자열.replace(oldStr, newStr)
			// 문자열.replaceAll(oldStr정규표현식, newStr)
			// [0-9] 숫자
			System.out.println("15. " + str1.replace("abc", "바꿔")); // 15. 바꿔X바꿔
			String str5 = "반가워요. ㅋㅋ 또 봐요 ㅎㅎ zz";
			System.out.println("16. " + str5.replaceAll("[ㄱ~ㅎz]", " ")); // 해당정규표현식 문자 삭제
			
			System.out.println("str1 = " + str1);
			System.out.println("str2 = " + str2);
	}

}
