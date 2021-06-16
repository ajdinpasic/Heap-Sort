package heapsort;


public class HeapSort {
	
	
	public static void sort(IPADRRESS[] ipArray) {
		BinaryHeap<IPADRRESS> heap = new BinaryHeap<IPADRRESS>();	
		

		for (int i = 0; i < ipArray.length; i++) {				
			heap.insert(ipArray[i]);							
		}
		
		for (int i = ipArray.length - 1; i >= 0; i--) {		
			ipArray[i] = heap.delMax();						
		}
	}

	
}
