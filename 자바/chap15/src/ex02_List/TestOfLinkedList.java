package ex02_List;

import java.util.LinkedList;
import java.util.*;

// LinkedList는 stack과 queue구현을 용이하게 지원
public class TestOfLinkedList {

	public static void main(String[] args) {
		
		// stack구현 => LIFO구조 (last info first out)
		LinkedList<String> stack = new LinkedList<>();
		stack.push("500");
		stack.push("100");
		stack.push("50");
		stack.push("10");
		stack.pop();	// 10나옴
		System.out.println(stack.pop());	// 50나옴
		
		// queue구현 => FIFO구조 (흉관구조, first info)
		LinkedList<String> queue = new LinkedList<>();
		queue.offer("철수");
		queue.offer("영희");
		queue.offer("바둑이");
		queue.poll();	// 철수 나옴
		System.out.println(queue.poll());	// 영희 나옴
		
		
	}
}
