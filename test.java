import java.util.*;
import java.io.*;
import java.lang.*;


class test{
	static int factorial(int n){
		if (n<=1) {
			return 1;
		}
		else{
			return n*factorial(n-1);
		}
	}

	static int permutation(int n, int r){
		return factorial(n)/factorial(n-r);
	}

	

	// count the arranagament(note: without repeatation)
	static int count(int N,int M){
		// logic : total words - arrangement of word (n^m-npm)
		return (int)Math.pow(N,M)-permutation(N,M);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Number of characters:");
		int x=s.nextInt();
		System.out.println("Word length:");
		int y=s.nextInt();

		int z=count(x,y);

		System.out.print(z);
	}


}
