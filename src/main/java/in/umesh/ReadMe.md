Just for quick Recall

#BACK TRACKING

- BackTracking is eventually a Brute Force approach which finds ALL the 
    possible solutions and selects desired solution per given the constraints.
- Difference between Backtracking and Dynamic Programming is , DP also uses Brute Force approach 
   but to find the OPTIMUM solution, either maximum or minimum by using storage in some intermediate result.
- Back tracking can be done in recursive and non recursive solution.    
- Backtracking Solutions are represented by State-Space Tree.
- The constrained applied to find the solution is called "Bounding function".
- Backtracking follows Depth-First Search method.
- Branch and Bound is also a Brute Force approach, which uses Breadth-First Search method.

Careful 
- Back Tracking is not For finding optimal solution 

Explanation: 
1. Find a Path in MAZE backtracking
 Define MAZE :     Array with number and at each pint has its conencted point 
 2d array can full fil this 
 
 One has to keep list of visited point and also current path 
    
  =

#NP-Hard and NP Complete 

There are polynomial Algorithm like  Liner search(n) ,Insertion Sort (n pow(2)), Merge sort(nLogn) etc
There Exponential Time Algorithm also like  Traveling SP 2pow(n), Sum of Subset 2pow(n)... 
There is no sure shot solution to improve and run exponential time algorithm in polynomial time. But 
there are some guideline set to follow the path to improve the algorithms and that are called 
 - NP-Hard
 - NP-Complete

NP - Non Deterministic Polynomial Time Algorithms 
P - Algorithms with polynomial Time 
 
P - right now it is subset of NP. 
P is a complexity class that represents the set of all decision problems that can be solved 
in polynomial time.

NP
NP is a complexity class that represents the set of all `decision problems` for 
which the instances where the answer is "yes" have proofs that can be verified in polynomial time. 
      

NP-Complete
NP-Complete is a complexity class which represents the set of all problems X in NP for
 which it is possible to reduce any other NP problem Y to X in polynomial time.
Intuitively this means that we can solve Y quickly if we know how to solve X quickly.

NP-hard
Note that NP-hard problems do not have to be in NP, and they do not have to be decision problems.
The precise definition here is that a problem X is NP-hard, if there is an NP-complete problem Y,
such that Y is reducible to X in polynomial time.

But since any NP-complete problem can be reduced to any other NP-complete problem in polynomial time,
 all NP-complete problems can be reduced to any NP-hard problem in polynomial time. 
 Then, if there is a solution to one NP-hard problem in polynomial time, there is a solution to 
 all NP problems in polynomial time.
