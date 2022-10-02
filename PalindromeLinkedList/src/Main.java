public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public static int sizeOfList(ListNode head) {
            ListNode list = head;
            int size = 0;
            while (list != null) {
                size++;
                list = list.next;
            }
            return size;
        }

        public boolean isPalindrome(ListNode head) {
            int size = sizeOfList(head);
            if (size == 1) return true;
            ListNode list = head;
            int[] arr = new int[size / 2];
            for (int i = 0; i < size / 2; i++) {
                arr[i] = list.val;
                list = list.next;
            }
            if (size % 2 != 0) {
                list = list.next;
            }
            for (int j = size / 2 - 1; j >= 0; j--) {
                if (arr[j] != list.val){
//                    list = list.next;
                    return false;
                }
                list = list.next;
            }

            return true;
        }
    }
}