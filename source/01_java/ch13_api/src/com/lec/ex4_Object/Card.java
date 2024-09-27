package com.lec.ex4_Object;
// Card c1 = new Card("◆", 7)
// Card c2 = new Card("◆", 7)
// c1.equals(c2) => true
// sysout(c1) => 카드 다아이몬드 7 입니다.
public class Card {
	private String kind; // ♥,♣,◆,♠
	private int num;
	
	public Card(String kind, int num) {
		super();
		this.kind = kind;
		this.num = num;
	}
		@Override
		public boolean equals(Object obj) {
			if (obj !=null && obj instanceof Card) { //인스탄스오브 : Card와 obj가 같은 클래스인지 확인
				Card other = (Card)obj; // 형변환
				boolean kindchk = kind.equals(other.kind);
				boolean numchk = num == other.num;
				return kindchk && numchk;
			}
			return false;
		}
		@Override
		public String toString() {
			return "Card모양은 "+ kind +"의"+ num + "입니다";
		}
}

