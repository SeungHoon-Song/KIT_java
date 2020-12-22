package p01;

public class RankEx {

	public static void main(String[] args) {
		int []total = {250,150,300,220};
		int [] rank = {0,0,0,0};
		for(int i=0;i<4;i++) {
			int rank_cnt=1;
			for(int j=0;j<4;j++) {
			if(total[i]<total[j]) {
				rank_cnt++;
			}
			}
			rank[i] = rank_cnt;
		}
		for(int i=0;i<4;i++) {
			System.out.print(rank[i]+"\t");
		}
	}

}
