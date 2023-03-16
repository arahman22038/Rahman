package set_fourth;

import java.util.PriorityQueue;

public class RopeWithMinimalCost {
	public static int coonnetRope(int[] ropes){
		
		PriorityQueue<Integer>minHeap=new PriorityQueue<Integer>();
		
	for(int i=0;i<ropes.length;i++){
		minHeap.offer(ropes[i]);
	}
	int cost=0;
	while(minHeap.size()>1){
		int a=minHeap.poll();
		int b=minHeap.poll();
		int c=a+b;
		cost+=c;
		minHeap.offer(c);
	}
		return cost;
		
	}

	public static void main(String[] args) {
		int ropes[]={5, 4, 2, 8};
		int cost=coonnetRope(ropes);
		System.out.println("The minimum cost is "+cost);

	}

}
