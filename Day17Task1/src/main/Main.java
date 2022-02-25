package main;

import java.util.ArrayList;

import buffers.Buffer;
import buffers.LifoBuffer;

public class Main {
	public static void main(String[] args) {
		Buffer<Integer> lifo= new LifoBuffer<>(new ArrayList<>());

		lifo.add(0);
		lifo.add(1);
		lifo.add(2);

		System.out.println(lifo.remove());
		System.out.println(lifo.remove());
		System.out.println(lifo.remove());
	
	}
}
