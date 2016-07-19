public class queue{

	public static void main(String[] args) {
		
		ArrayQueue();
		showQueue();
		isFULL();
		isEmpty();
		enqueue();
		dequeue();
		rearrangeQueue();
		peekFront();
		peeRear();		
	}

	public class ArrayQueue{

		int QSIZE;
		private int [] queue;
		private int nItems;
	}

	public void showQueue(){

		for (int i=0;i<this.QSIZE;i++ ) {
			System.out.printf("QUEUE[" + i + "]=" + this.queue[i] + "\n");

		}
	}

	public boolean isFULL(){

		if (this.nItems == this.QUEUE) {
			System.out.prinln("QUEUE is FULL");
		}
		else{
			return false;	
		}
	}
	public boolean isEmpty(){
		if (this.nItems == this.QSIZE) {
			System.out.println("QUEUE is Empty");
		}
		else{
			return false;
		}
	}

	public boolean enqueue(int num){
		System.out.println("trying to enqueue" + num + "...");
		if (this.isFULL) {
			this.queue[nItems] = num;
			System.out.println("\t" + "Added" + num);
			this.nItems++;
			return true;
		}
		else{
			System.out.println("Failed to enqueue" + num);
			return false;
		}
	}

	public int dequeue(){
		System.out.println("Trying to dequeue" + num + "...");
		if (!this.isEmpty()) {
			this.queue[nItems-1]=num;
			System.out.println("\t" + "Deleted" + num);
		}
	}

	private void rearrangeQueue(){
		boolean number = true;
		int temp;
		while (number) {
			number=false;
			for (int j=0; j<num.length-1 ;j++ ) {
				if (num[j] < num[j+1]) {
					temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				number = true;
				}
				
			}
		}
	}

	public int peekFront(){
		return this.queue[0];
	}

	public int peeRear(){
		return this.queue(this.nItems-1);
	}
}