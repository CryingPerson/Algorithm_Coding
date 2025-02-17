
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        HashMap<Character, Node> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char par = kb.next().charAt(0);
            char left = kb.next().charAt(0);
            char right = kb.next().charAt(0);

            map.putIfAbsent(par, new Node(par));
            Node parNode = map.get(par);

            if(left != '.'){
                map.putIfAbsent(left, new Node(left));
                parNode.left = map.get(left);
            }
             if(right != '.'){
                map.putIfAbsent(right, new Node(right));
                parNode.right = map.get(right);
            }
        }
        Node root = map.get('A');
        pre(root);
        System.out.println();
        in(root);
        System.out.println();
        la(root);
    }

    public static void pre(Node node) {
        if(node == null) return;
        System.out.print(node.data);
        pre(node.left);
        pre(node.right);
    }

    public static void in(Node node) {
        if(node == null) return;
        in(node.left);
        System.out.print(node.data );
        in(node.right);
    }


    public static void la(Node node) {
        if(node == null) return;
        la(node.left);
        la(node.right);
        System.out.print(node.data);
    }
}
class Node{
    char data;
    Node left,right;
    public Node(char data) {
        this.data = data;
    }
}
