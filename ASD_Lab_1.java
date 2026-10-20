/*Задача 16.
Даны две непустые очереди, которые содержат одинаковое количество элементов.
Объединить очереди в одну, в которой элементы исходных очередей чередуются.*/

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ASD_Lab_1 {
    public static void main(String[] args) {

        Node ochered1 = new Node(1);
        ochered1.next = new Node(3);
        ochered1.next.next = new Node(5);

        Node ochered2 = new Node(2);
        ochered2.next = new Node(4);
        ochered2.next.next = new Node(6);

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
        //Объединяем очереди
        Node nachalo = null;
        Node konec = null;

        Node el1 = ochered1;
        Node el2 = ochered2;

        while (el1 != null) {
            // Добавляем элемент из первой очереди
            if (nachalo == null) {
                nachalo = el1;
                konec = nachalo;
            } else {
                konec.next = el1;
                konec = konec.next;
            }
            el1 = el1.next;

            // Добавляем элемент из второй очереди
            konec.next = el2;
            konec = konec.next;
            el2 = el2.next;
        }

        konec.next = null;

        System.out.print("Объединенная очередь: ");
        Node current = nachalo;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
