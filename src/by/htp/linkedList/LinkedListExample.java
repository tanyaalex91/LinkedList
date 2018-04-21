package by.htp.linkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListExample {

	public static void main(String[] args) {
		String[] StudentGroup111 = { "Nasta Krasovskaya", "Lena Butyskaya", "Vasilii Pupkin", "Alex Mitrofanov" };
		List<String> list1 = new LinkedList<String>();
		for (String str : StudentGroup111) {
			list1.add(str);
		}

		String[] StudentGroup112 = { "Alena Vaskina", "Egor Bogatyrev", "Alexey Ivanov", "Mariya Levlovich" };
		List<String> list2 = new LinkedList<String>();
		for (String str1 : StudentGroup112) {
			list2.add(str1);

			list1.addAll(list2);
			list2.removeAll(list2);

		}
		printList(list1);
		removeElement(list1, 1, 3);
		reverseList(list1);

	}

	private static void printList(List<String> lst) {
		for (String s : lst) {
			System.out.println(s);

		}
	}

	private static void removeElement(List<String> lst, int start, int end) {
		lst.subList(start, end).clear();
		System.out.println(lst);
	}

	private static void reverseList(List<String> lst) {
		ListIterator<String> listiterator = lst.listIterator(lst.size());
		while (listiterator.hasPrevious()) {
			System.out.println(listiterator.previous());
		}
		System.out.println("==========");
		System.out.println(lst.get(3));
		System.out.println(lst.contains("Tanya Alex"));
		

	}
}
