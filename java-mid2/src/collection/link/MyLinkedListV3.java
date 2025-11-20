package collection.link;

public class MyLinkedListV3<E> {

    private Node<E> first;
    private int size = 0;

    //
    public void add(E e) {
        Node<E> newNode = new Node<>(e);

        if (first == null) {
            first = newNode;
        } else {
            Node<E> lastNode = getLastNode();
            lastNode.next = newNode; //마지막 노드의 다음에 add한 newNode를 넣는다
        }
        size++;
    }

    //마지막 노드 찾기
    private Node<E> getLastNode() {
        Node<E> x = first;

        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    //코드 추가
    public void add(int index, E e) {
        Node<E> newNode = new Node<>(e);
        if (index == 0) {
            newNode.next = first;
            first = newNode;
        } else {
            Node<E> prev = getNode(index - 1); //직전 노드 찾기
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }


    //값 변경해주는
    public E set(int index, E element) {
        Node<E> x = getNode(index); //현재 노드를 꺼내놓음
        E oldValue = x.item; //꺼내놓은 노드에서 item을 찾아 저장시켜둠
        x.item = element;
        return oldValue;
    }

    public E remove(int index) {
        Node<E> removeNode = getNode(index);
        E removeItem = removeNode.item;
        if (index == 0) {
            first = removeNode.next;
        } else {
            Node<E> prev = getNode(index - 1); //직전 노드 찾기
            prev.next = removeNode.next;
        }
        removeNode.item = null;
        removeNode.next = null;
        size--;
        return removeItem;
    }

    //찾고자하는 index에 해당하는 item 값 반환
    public E get(int index) {
        Node<E> node = getNode(index);
        return node.item;
    }

    //index에 해당하는 node를 반환
    private Node<E> getNode(int index) {
        Node<E> x = first; //x를 첫 노드로 연결시키고
        //x를 처음부터 넘어온 값 index 만큼 돌면 찾고자하는 노드 값을 얻을 수 있음
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    //인덱스 값을 찾아주는 메서드
    public int indexOf(E o) {
        int index = 0;
        Node<E> x = first;

        while (x != null) {
            x = x.next;
            index++;
            if (x.item.equals(o)) {
                return index;
            }
        }
        return -1;
    }

    //현재 사이즈 반환
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }

    private static class Node<E> {

        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node<E> x = this;

            sb.append("[");
            while (x != null) {
                sb.append(x.item);
                if (x.next != null) {
                    sb.append("->");
                }
                x = x.next;
            }
            sb.append("]");
            return sb.toString();
        }
    }
}
