// Do singly linked lists (headA aur headB) ka intersection node dhoondhna hai (agar exist karta hai). Agar intersection nahi milta, toh null return karna hai. Lists ka structure waise ka waise rehna chahiye.

// Chaliye, Hinglish me samjhaata hoon step-by-step:

// 1. Problem Samjhaani
// Aapke paas do linked lists hain: headA aur headB.
// In dono me kuch nodes aage jaa ke common (intersecting) ho sakte hain—matlab ek hi node dono lists me aa sakta hai (reference se, value se nahi).
// Aapko woh node return karna hai jahan se dono lists intersect karti hain.
// Agar kabhi intersection nahi hota, toh null return karna hai.

// 2. Constraints
// Lists me koi bhi cycle nahi hai (no loops).
// Aapko lists ka original structure bilkul nahi bigaadna.
// Input judge se kuch parameters milenge jaise:
// intersectVal: jo value pe intersection hai (agar hai toh)
// listA aur listB: dono lists ke elements
// skipA aur skipB: kitne nodes skip karne ke baad intersection start hota hai
// Aapka solution O(m + n) time me ho aur O(1) extra memory use kare (yani koi extra array ya hash nahi banana).

// 3. Approach
// Is problem ko solve karne ke liye hum 3 approaches use kar sakte hain
// 3. Optimal Approach (Two Pointer Technique)
// Kaise kaam karta hai:
// Do pointers lo: pA (headA pe) aur pB (headB pe).
// Dono ko ek-ek step badhaate jao.
// Jab koi pointer list ke end pe pahunch jaaye, usse dusri list ke head pe le jao.
// Aise karte hue, agar intersection hua toh dono pointers ek hi node pe mil jaayenge.
// Agar intersection nahi hua, toh dono null pe mil jaayenge.
// Yeh isliye kaam karta hai kyunki:

// Dono pointers lagbhag same distance cover karte hain (m + n steps), toh ya toh intersecting node pe milenge ya phir null pe.

// 4. Code Implementation
public class Leetcode160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }
        return a;
    }
}

