public class Wherethefizzizz {
		public static void main(String[] args) {
			for(int i = 20; i<= 200; i++){
				if(i%4==0 && i%5 ==0){
					System.out.println("Fizzbuzz");
				} else if(i%4==0){
					System.out.println("Fizz");
				} else if(i%5==0){
					System.out.println("buzz");
				} else {
					System.out.println(i);
				}
			}
		}
}
