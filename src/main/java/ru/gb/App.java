package ru.gb;


/**
 * Необходимо реализовать метод разворота связного списка (двухсвязного или односвязного на выбор).
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException 
    {
        Nodelist list = new Nodelist();
        System.out.println("Создать двузный список длиной 15 элементов");
        for  (int i = 0; i < 15; i++) {
            int r = (int) (Math.random() * 100);
            Node node = new Node(r);
            if (i == 0) {
                list.head = node;
            } else {
                list.head.append(node);
            }
            list.last = node;
        }

        //Исходный список
        System.out.println(list.toString());

        //Развернутый список
        System.out.println(list.reverse());
        
    }
}
