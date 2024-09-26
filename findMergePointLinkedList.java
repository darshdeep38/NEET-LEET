static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        
        SinglyLinkedListNode a = head1;
        SinglyLinkedListNode b = head2;
        
        while(a != b){
            if(a.next!= null) a= a.next;
            else{
                a = head2;
            }
            
            if(b.next != null) b= b.next;
            else{
                b= head1;
            }
        }
        
        return a.data;

*      }
