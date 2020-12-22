package ex03;

import java.util.*;
import java.util.Map.Entry;

public class MapEx {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
	    map.put("blue", 96);
	    map.put("hong", 86);
	    map.put("white", 92);


	   String name = null; //최고점수를 받은 아이디 저장 변수
	   int maxScore = 0;  //최고 점수 저장 변수
	   int totalScore = 0; //점수 합계 지정 변수
	   
	   //출력문
	   //평균 : 91
	   //최고 : 96
	   //최고점수 아이디 : blue
	   
	   //전체 Map.Entry 자료얻기
	   Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
	   
	   for(Map.Entry<String, Integer> entry : entrySet) {
		   System.out.println(entry.getValue()+"값~~");
		   if(entry.getValue()>maxScore) {
			   maxScore = entry.getValue();	//최고점수 구하기
			   name = entry.getKey();	//최고점수로 받은 사람 아이디를 넣기
		   }
		   //평균을 구하기 위해서 각 점수를 누적한다.
		   totalScore += entry.getValue();
	   }//end for
	   System.out.println("평균 점수 : "+(totalScore/map.size()));
	   System.out.println("최고 점수 : "+maxScore);
	   System.out.println("최고점수를 받은 아이디 : "+name);
	   
	}

}
