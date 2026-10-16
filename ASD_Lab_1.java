/*Задача 16.
Даны две непустые очереди, которые содержат одинаковое количество элементов.
Объединить очереди в одну, в которой элементы исходных очередей чередуются.*/

class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

public class ASD_Lab_1 {
    public static Node addToQueue(Node head, String data) {
        Node newNode = new Node(data);
        if (head == null) {
            return newNode;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

    public static void main(String[] args) {
        Node ochered1 = null;
        ochered1 = addToQueue(ochered1, "Поставьте");
        ochered1 = addToQueue(ochered1, "пожалуйста");
        ochered1 = addToQueue(ochered1, "2");

        Node ochered2 = null;
        ochered2 = addToQueue(ochered2, "5,");
        ochered2 = addToQueue(ochered2, "не");
        ochered2 = addToQueue(ochered2, "надо");

        System.out.print("Первая очередь: ");
        Node curr1 = ochered1;
        while (curr1 != null) {
            System.out.print(curr1.data + " ");
            curr1 = curr1.next;
        }
        System.out.println();

        System.out.print("Вторая очередь: ");
        Node curr2 = ochered2;
        while (curr2 != null) {
            System.out.print(curr2.data + " ");
            curr2 = curr2.next;
        }
        System.out.println();

        Node res = null;

        // Объединияем очереди
        while (ochered1 != null) {
            String val1 = ochered1.data;
            ochered1 = ochered1.next;
            res = addToQueue(res, val1);

            String val2 = ochered2.data;
            ochered2 = ochered2.next;
            res = addToQueue(res, val2);
        }

        System.out.print("Объединенная очередь: ");
        Node current = res;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();

    }
}
