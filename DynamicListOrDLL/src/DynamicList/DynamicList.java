package DynamicList;

public class DynamicList {
    public Node head;
    private Node tail;
    private int count;

    public DynamicList() {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }

    public class Node {
        Object element;
        Node next;

        Node(Object element, Node prevNode) {
            this.element = element;
            prevNode.next = this;
        }

        Node(Object element) {
            this.element = element;
            next = null;
        }
    }

    public void add(Object item) {
        if (head == null) {
            // We have empty list
            head = new Node(item);
            tail = head;
        } else {
            // We have non-empty list
            tail = new Node(item, tail);
        }
        count++;
    }

    public Object remove(int index) {
        if (index >= count || index < 0) {
            throw new IndexOutOfBoundsException(
                    "Invalid index: " + index);
        }
        // Find the element at the specified index
        int currentIndex = 0;
        Node currentNode = head;
        Node prevNode = null;
        while (currentIndex < index) {
            prevNode = currentNode;
            currentNode = currentNode.next;
            currentIndex++;
        }
        // Remove the element
        count--;
        if (count == 0) {
            head = null;
            tail = null;
        } else if (prevNode == null) {
            head = currentNode.next;
        } else {
            prevNode.next = currentNode.next;
        }
        return currentNode.element;
    }

    @Override
    public String toString() {
        return "DynamicList{" +
                "head=" + head +
                ", tail=" + tail +
                ", count=" + count +
                '}';
    }
    public int remove(Object item){
        // Find the element containing searched item
        int currentIndex = 0;
        Node currentNode = head;
        Node prevNode = null;
        while (currentNode != null) {
            if ((currentNode.element!=null &&
                    currentNode.element.equals(item)) ||
                    (currentNode.element==null) && (item==null)){
                break;
            }
            prevNode = currentNode;
            currentNode = currentNode.next;
            currentIndex++;
        }

        if (currentNode != null) {
            // Element is found in the list. Remove it
            count--;
            if (count==0) {
                head = null;
                tail = null;
            } else if (prevNode == null) {
                head = currentNode.next;
            } else {
                prevNode.next = currentNode.next;
            }
            return currentIndex;
        } else {
            // Element is not found in the list
            return -1;
        }
    }

    public int indexOf(Object item) {
        int index = 0;
        Node current = head;
        while (current != null) {
            if ((current.element!=null && current.element.equals(item))
                    ||    (current.element==null) && (item==null)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    /**
     * Check if the specified element exist in the list
     * @param item - the item you are searching for
     * @return true if the element exist or false otherwise
     */
    public boolean contains(Object item) {
        int index = indexOf(item);
        boolean found = (index != -1);
        return found;
    }

    public Object elementAt(int index) {
        if (index>=count || index<0) {
            throw new IndexOutOfBoundsException(
                    "Invalid index: " + index);
        }
        Node currentNode = this.head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.element;
    }

    public int getLength() {
        return count;
    }
}
