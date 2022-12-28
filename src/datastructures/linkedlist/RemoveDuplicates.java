package datastructures.linkedlist;

public class RemoveDuplicates {
    static NodeEntitySLL head;

    public static void main(String[] args) {
        head = SinglyLinkedListImpl.sampleList();
        RemoveDuplicates duplicates = new RemoveDuplicates();
        duplicates.deleteDuplicates(head);
        SinglyLinkedListImpl.printNodes(head);
    }

        public NodeEntitySLL deleteDuplicates(NodeEntitySLL head) {
            NodeEntitySLL current = head;
            NodeEntitySLL nextN = current.node;

            while(nextN.node != null ){
                if(current.data == nextN.data) {
                    current.node = nextN.node;
                    current = current.node;
                    nextN = nextN.node.node;
                } else {
                    current = current.node;
                    nextN = nextN.node;
                }
            }
            current.node = null;

            return head;
        }

}
