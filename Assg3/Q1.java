import java.util.Scanner;

class Node {
    char data;
    Node next;

    public Node(char data) {
        this.data = data;
        this.next = null;
    }
}

public class Q1 {

      public static void printLinkedList(Node head) {
        Node curr= head;

        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null) {
                System.out.print("->");
            }
            curr = curr.next;
        }

        System.out.println();
    }

    public static Node createLinkedList(int n, Scanner sc) {
        if (n <= 0) {
            return null;
        }

        Node head = null;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter the data in Node " + i + ": ");
            char data = sc.nextLine().charAt(0);

            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of nodes: ");
        Integer n = sc.nextInt();
        sc.nextLine();

        Node head = createLinkedList(n, sc);

        System.out.println("The reversed list is:");
        printLinkedList(head);

        sc.close();
    }

    
  
}
