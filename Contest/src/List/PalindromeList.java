/**
 * 
 */
package List;

import Tree.NodeList;

/**
 * This class is used to
 * 
 * @author Sumit 24-Aug-2013
 * 
 */
public class PalindromeList {
	static NodeList head = null;
	static NodeList middle = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NodeList n1 = new NodeList(1, null);
		NodeList n11 = new NodeList(2, n1);
		NodeList n2 = new NodeList(3, n11);
		NodeList n31 = new NodeList(4, n2);
		NodeList n3 = new NodeList(3, n31);
		NodeList n4 = new NodeList(2, n3);
		NodeList n5 = new NodeList(1, n4);
		head = n5;
		System.out.println(isPalindrome(n5, true, 0));
		NodeList root = isPalin(n5, n5);
		System.out.println(root != null);

	}

	@SuppressWarnings("null")
	public static boolean isPalindrome(NodeList tails, boolean isPalindrome,
			int index) {
		if (tails == null) {
			return isPalindrome;
		}

		if ((tails != null) && (tails.getNext() != null)) {
			if (index == 1) {
				if (middle == null) {
					middle = tails.getNext();
				} else {
					middle = middle.getNext();
				}
				index = 0;
			} else {
				index = 1;
			}

			isPalindrome = isPalindrome(tails.getNext(), isPalindrome, index);
		}

		if (head == middle) {
			return isPalindrome;
		}
		if ((isPalindrome) && (head.getData() == tails.getData())) {
			head = head.getNext();
		} else {
			isPalindrome = false;
		}

		return isPalindrome;
	}

	public static NodeList isPalin(NodeList list1, NodeList list2) {
		if ((list2 == null) || (list1 == null)) {
			return list1;
		}
		list1 = isPalin(list1, list2.getNext());
		if (list1 != null) {
			if (list1.getData() == list2.getData()) {
				if (list1.getNext() != null) {
					list1 = list1.getNext();
				}
			} else {
				list1 = null;
			}
		}
		return list1;
	}
}
