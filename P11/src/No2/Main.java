/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No2;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        SingleLinkedList singLL = new SingleLinkedList();
        singLL.print();
        singLL.addFirst('a');
        singLL.print();
        singLL.addLast('e');
        singLL.print();
        singLL.insertAfter('a', 'd');
        singLL.print();
        singLL.insertBefore('d', 'c');
        singLL.print();
        singLL.insertAt(1, 'b');
        singLL.print();
    }
}
