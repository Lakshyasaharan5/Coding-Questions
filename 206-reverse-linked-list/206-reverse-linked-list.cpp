/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        if(head == NULL) return NULL;
        if(head->next == NULL) return head;
        ListNode *left=NULL, *curr=head, *right=head->next;
        while(curr->next){
            curr->next = left;
            left = curr;
            curr = right;
            right = right->next;
        }
        
        curr->next = left;
        
        return curr;
    }
};



