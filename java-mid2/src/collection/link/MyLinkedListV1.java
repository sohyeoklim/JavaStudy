package collection.link;

public class MyLinkedListV1 {

    private Node first;
    private int size = 0;

    //
    public void add(Object e) {
        Node newNode = new Node(e);

        if (first == null) {
            first = newNode;
        } else {
            Node lastNode = getLastNode();
            lastNode.next = newNode; //마지막 노드의 다음에 add한 newNode를 넣는다
        }
        size++;
    }

    //마지막 노드 찾기
    private Node getLastNode() {
        Node x = first;

        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    //값 변경해주는
    public Object set(int index, Object element) {
        Node x = getNode(index); //현재 노드를 꺼내놓음
        Object oldValue = x.item; //꺼내놓은 노드에서 item을 찾아 저장시켜둠
        x.item = element;
        return oldValue;
    }

    //찾고자하는 index에 해당하는 item 값 반환
    public Object get(int index) {
        Node node = getNode(index);
        return node.item;
    }

    //index에 해당하는 node를 반환
    private Node getNode(int index) {
        Node x = first; //x를 첫 노드로 연결시키고
        //x를 처음부터 넘어온 값 index 만큼 돌면 찾고자하는 노드 값을 얻을 수 있음
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    //인덱스 값을 찾아주는 메서드
    public int indexOf(Object o) {
        int index = 0;
        Node x = first;

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
}
