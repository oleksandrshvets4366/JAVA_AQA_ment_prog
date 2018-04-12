package JavaMentorProgram;

public class SinglyLinkedList {
    public static void main(String[] args) {
        LinkList newList = new LinkList();
        newList.insertFirst(12, 30.99);
        newList.insertFirst(10, 30.99);
        newList.insertFirst(33, 345.34);
        newList.insertFirst(12, 23.78);
        newList.insertFirst(44, 12.59);

        newList.displayList();

        Link f = newList.find(10);
        System.out.println("Found element: " +f.iData);
    }
}

class Link {
    public  int iData;
    public double dData;
    public Link next;                        // link to the next element

    public Link(int iData, double dData) {
        this.iData = iData;
        this.dData = dData;
    }

    public void displayLink() {
        System.out.print(" {" + iData + ", " + dData + "}");

    }
}

class LinkList {
    Link first;

    public LinkList() {
        first = null;
    }

    public void insertFirst(int iD, double dD) {
        Link newLink = new Link(iD, dD);        //creation of new list element
        newLink.next = first;                   //an old first element became the first
        first = newLink;                        // created new element as first
    }

    public Link delete(int key) {               //removing element by key
        Link current = first;
        Link previous = first;

        while (current.next != null) {
            if (current.next == null) {
                return null;
            } else {
                previous = current;
                current = current.next;
            }

            if (current == first) {
                first = first.next;
            } else {
                previous.next = current.next;
            }
        }
        return current;
    }

    public Link find(int key) {                 // search element by key
        Link current = first;                   // search from the 1st element
        while (current.iData != key) {
            if (current.next == null) {
                return null;
            } else {
                current = current.next;
            }
        }
        return current;
    }

    public void displayList() {
        Link current = first;
        System.out.print("List (first --> last): ");

        while(current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}