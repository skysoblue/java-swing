package lotto;

import java.util.Arrays;

/**
 * @file_name : Lotto.java 
 * @author    : coolbeat@naver.com
 * @date      : 2015. 10. 22.
 * @story     : 로또 알고리즘
 */
public class Lotto {
	
	int[] lotto = new int[6]; // SBS 에서는 단 하나의 로또 번호만 출력
	public Lotto() {
		this.setLotto();
	}
	public int[] getLotto() {
		return lotto;
	}
	public void setLotto() {
		// 0으로 초기화가 이미 되었으므로.
		for (int i = 0; i < lotto.length; i++) {
			int randomNum = (int) (Math.random()*45+1);
			boolean exist = false; 
			for (int j = 0; j < lotto.length; j++) {
				if (randomNum == lotto[j]) {
					exist = true; // 이미 존재함
					break;
				}
			}
			if (exist) {
				i--; // 중복된 값이 출력되면 카운트 숫자를 줄여준다.
				continue;
			}else{
				// if 문을 타지 않은 경우
				lotto[i] = randomNum;
			}
		}
		Arrays.sort(lotto); // 오름차순 정렬
	}
	
}
