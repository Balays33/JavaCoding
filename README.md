# JavaCoding
 Java Programs from Coding Interviews


https://javarevisited.blogspot.com/2017/07/top-50-java-programs-from-coding-Interviews.html

1. Fibonacci series (solution)
Write a simple Java program which will print Fibonacci series, e.g. 1 1 2 3 5 8 13 ... . up to a given number. We prepare for cross questions like using iteration over recursion and how to optimize the solution using caching and memoization.

2. A prime number (solution)
Write a Java program to check if a given number is prime or not. Remember, a prime number is a number which is not divisible by any other number, e.g. 3, 5, 7, 11, 13, 17, etc. Be prepared for cross, e.g. checking till the square root of a number, etc.

3. String Palindrome (solution)
You need to write a simple Java program to check if a given String is palindrome or not. A Palindrome is a String which is equal to the reverse of itself, e.g., "Bob" is a palindrome because of the reverse of "Bob" is also "Bob."  Though be prepared with both recursive and iterative solution of this problem. The interviewer may ask you to solve without using any library method, e.g. indexOf() or subString() so be prepared for that.

4. Integer Palindrome (solution)
This is generally asked as follow-up or alternative of the previous program. This time you need to check if given Integer is palindrome or not. An integer is called palindrome if it's equal to its reverse, e.g. 1001 is a palindrome, but 1234 is not because the reverse of 1234 is 4321 which is not equal to 1234. You can use divide by 10 to reduce the number and modulus 10 to get the last digit. This trick is used to solve this problem.

5. Armstrong number (solution)
A number is called an Armstrong number if it is equal to the cube of its every digit. For example, 153 is an Armstrong number because of 153= 1+ 125+27, which is equal to 1^3+5^3+3^3. You need to write a program to check if the given number is Armstrong number or not.

6. Avoiding deadlock in Java (solution)
This is one of the interesting programs from Java Interviews, mostly asked to 2 to 3 years of experienced programmers or higher. The interviewer simply asked you to write code where a resource is accessed by multiple threads. You need to write code in such a way that no deadlock should occur. The trick to solving this problem is acquiring resources in order and release them in reverse order, e.g. first acquire resource R1 and only if you have got R1 to go for R2. This way, you can avoid deadlock.


49.

Kerek prím keresés. Kerek prímnek nevezzük az olyan prímet, mely számjegyeinek összes "forgatásából" adódó szám is prím. Például: 719 --> 197 --> 971 --> 719 (körbeértünk), tehát 719 összes forgatása: 197, 971, amik szintén prímek, tehát 719 kerek prím. Feladat: Hány kerek prím van 1 millió alatt? Amit várunk: egy kész implementáció, mely kiszámolja és kiírja az 1 millió alatti kerek prímek számát.


50.
https://www.algoexpert.io/product


Question: 
Max Profit With KTransactions You are given an array of integers representing the prices of a single stock on varlous days (each index in the array represent different day). You arealso given an integer k, which represents the number of transactions you are allowed to make One tr consistsof buying thestock on agiven day and selling it on another, later day. Write a function that returns the maxámum pr you can make buying and selling the stock, given k transactions. Note that you can only hold 1 share of the stockatatime; in words you cannot buy more than 1 share of the stock on any given day, and you cannot buy a share of the stockif you another share. Note that you also don't need to use all k transactions that you're allowed.
Sample input [5,11,3,50,60,90],2
Sample output: 93 (Buy.5,Sell: 11; Buy. 3, Sell: 90)



https://app.codility.com/programmers/lessons/1-iterations/

Lesson 1
Iterations

51. Smallest Positive Integer

       Write a function:
       class Solution { public int solution(int[] A); }
       that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
       For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
       Given A = [1, 2, 3], the function should return 4.
       Given A = [−1, −3], the function should return 1.
       Write an efficient algorithm for the following assumptions:
       N is an integer within the range [1..100,000];
       each element of array A is an integer within the range [−1,000,000..1,000,000].
       
52. binaryGap

       A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded 
       by ones at both ends in the binary representation of N.

       For example, number 9 has binary representation 1001 and contains a binary gap of length 2. 
       The number 529 has binary  representation 1000010001 and contains two binary gaps: one of length 4 and one of length 
       3. The number 20 has binary representation 10100 and contains one binary gap of length 1.
       The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 
       100000 and has no binary gaps.

       Write a function:

       class Solution { public int solution(int N); }

       that, given a positive integer N, returns the length of its longest binary gap.
       The function should return 0 if N doesn't contain a binary gap.

       For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and 
       so its longest binary gap is of length 5. Given N = 32 the function should return 0, 
       because N has binary representation '100000' and thus no binary gaps.

       Write an efficient algorithm for the following assumptions:

       N is an integer within the range [1..2,147,483,647].
 
Lesson 2
Arrays

53. oddOccurrencesInArray
  
      A non-empty array A consisting of N integers is given. The array contains an odd number of elements, 
      and each element of the array can be paired with another element that has the same value,
      except for one element that is left unpaired.

        For example, in array A such that:

          A[0] = 9  A[1] = 3  A[2] = 9
          A[3] = 3  A[4] = 9  A[5] = 7
          A[6] = 9
        the elements at indexes 0 and 2 have value 9,
        the elements at indexes 1 and 3 have value 3,
        the elements at indexes 4 and 6 have value 9,
        the element at index 5 has value 7 and is unpaired.
        Write a function:

        class Solution { public int solution(int[] A); }

        that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.

        For example, given array A such that:

          A[0] = 9  A[1] = 3  A[2] = 9
          A[3] = 3  A[4] = 9  A[5] = 7
          A[6] = 9
        the function should return 7, as explained in the example above.

        Write an efficient algorithm for the following assumptions:

        N is an odd integer within the range [1..1,000,000];
        each element of array A is an integer within the range [1..1,000,000,000];
        all but one of the values in A occur an even number of times.

54. CyclicRotation

      An array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, 
      and the last element of the array is moved to the first place. For example, 
      the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] 
      (elements are shifted right by one index and 6 is moved to the first place).

         The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.

         Write a function:

         class Solution { public int[] solution(int[] A, int K); }

         that, given an array A consisting of N integers and an integer K, returns the array A rotated K times.

         For example, given

             A = [3, 8, 9, 7, 6]
             K = 3
         the function should return [9, 7, 6, 3, 8]. Three rotations were made:

             [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
             [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
             [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
         For another example, given

             A = [0, 0, 0]
             K = 1
         the function should return [0, 0, 0]

         Given

             A = [1, 2, 3, 4]
             K = 4
         the function should return [1, 2, 3, 4]

         Assume that:

         N and K are integers within the range [0..100];
         each element of array A is an integer within the range [−1,000..1,000].
         In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
         
Lesson 3
Time Complexity

55. FrogJmp

      A small frog wants to get to the other side of the road. 
      The frog is currently located at position X and wants to get to a position greater than or equal to Y.
      The small frog always jumps a fixed distance, D.

      Count the minimal number of jumps that the small frog must perform to reach its target.

      Write a function:

      class Solution { public int solution(int X, int Y, int D); }

      that, given three integers X, Y and D, returns the minimal number of jumps from position X to a position equal
      to or greater than Y.

      For example, given:

        X = 10
        Y = 85
        D = 30
      the function should return 3, because the frog will be positioned as follows:

      after the first jump, at position 10 + 30 = 40
      after the second jump, at position 10 + 30 + 30 = 70
      after the third jump, at position 10 + 30 + 30 + 30 = 100
      Write an efficient algorithm for the following assumptions:

      X, Y and D are integers within the range [1..1,000,000,000];
      X ≤ Y.
 
56.
57.
      
Lesson 4
Counting Elements

58. PermCheck

       A non-empty array A consisting of N integers is given.

       A permutation is a sequence containing each element from 1 to N once, and only once.

       For example, array A such that:

           A[0] = 4
           A[1] = 1
           A[2] = 3
           A[3] = 2
       is a permutation, but array A such that:

           A[0] = 4
           A[1] = 1
           A[2] = 3
       is not a permutation, because value 2 is missing.

       The goal is to check whether array A is a permutation.

       Write a function:

       class Solution { public int solution(int[] A); }

       that, given an array A, returns 1 if array A is a permutation and 0 if it is not.

       For example, given array A such that:

           A[0] = 4
           A[1] = 1
           A[2] = 3
           A[3] = 2
       the function should return 1.

       Given array A such that:

           A[0] = 4
           A[1] = 1
           A[2] = 3
       the function should return 0.

       Write an efficient algorithm for the following assumptions:

       N is an integer within the range [1..100,000];
       each element of array A is an integer within the range [1..1,000,000,000].
 
59.
60.
61.

Lesson 5
Prefix Sums

62.
63.

64. MaxCounters

       You are given N counters, initially set to 0, and you have two possible operations on them:

       increase(X) − counter X is increased by 1,
       max counter − all counters are set to the maximum value of any counter.
       A non-empty array A of M integers is given. This array represents consecutive operations:

       if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X),
       if A[K] = N + 1 then operation K is max counter.
       For example, given integer N = 5 and array A such that:

           A[0] = 3
           A[1] = 4
           A[2] = 4
           A[3] = 6
           A[4] = 1
           A[5] = 4
           A[6] = 4
       the values of the counters after each consecutive operation will be:

           (0, 0, 1, 0, 0)
           (0, 0, 1, 1, 0)
           (0, 0, 1, 2, 0)
           (2, 2, 2, 2, 2)
           (3, 2, 2, 2, 2)
           (3, 2, 2, 3, 2)
           (3, 2, 2, 4, 2)
       The goal is to calculate the value of every counter after all operations.

       Write a function:

       class Solution { public int[] solution(int N, int[] A); }

       that, given an integer N and a non-empty array A consisting of M integers, returns a sequence of integers representing 
       the values of the counters.

       Result array should be returned as an array of integers.

       For example, given:

           A[0] = 3
           A[1] = 4
           A[2] = 4
           A[3] = 6
           A[4] = 1
           A[5] = 4
           A[6] = 4
       the function should return [3, 2, 2, 4, 2], as explained above.

       Write an efficient algorithm for the following assumptions:

       N and M are integers within the range [1..100,000];
       each element of array A is an integer within the range [1..N + 1].

51.
       
Lesson 5
Prefix Sums

65. PassingCars

          !!!!  PLEASE CHECK THE PICTURE   CK2TN.jpg  !!!!!

          A non-empty array A consisting of N integers is given. The consecutive elements of array
          A represent consecutive cars on a road.

          Array A contains only 0s and/or 1s:

          0 represents a car traveling east,
          1 represents a car traveling west.
          The goal is to count passing cars. We say that a pair of cars (P, Q), where 0 ≤ P < Q < N, 
          is passing when P is traveling to the east and Q is traveling to the west.

          For example, consider array A such that:

            A[0] = 0
            A[1] = 1
            A[2] = 0
            A[3] = 1
            A[4] = 1
          We have five pairs of passing cars: (0, 1), (0, 3), (0, 4), (2, 3), (2, 4).

          Write a function:

          class Solution { public int solution(int[] A); }

          that, given a non-empty array A of N integers, returns the number of pairs of passing cars.

          The function should return −1 if the number of pairs of passing cars exceeds 1,000,000,000.

          For example, given:

            A[0] = 0
            A[1] = 1
            A[2] = 0
            A[3] = 1
            A[4] = 1
          the function should return 5, as explained above.

          Write an efficient algorithm for the following assumptions:

          N is an integer within the range [1..100,000];
          each element of array A is an integer that can have one of the following values: 0, 1.
          
Lesson 6
Sorting

70. MaxProductOfThree

       A non-empty array A consisting of N integers is given. The product of triplet (P, Q, R) 
       equates to A[P] * A[Q] * A[R] (0 ≤ P < Q < R < N).

       For example, array A such that:

         A[0] = -3
         A[1] = 1
         A[2] = 2
         A[3] = -2
         A[4] = 5
         A[5] = 6
       contains the following example triplets:

       (0, 1, 2), product is −3 * 1 * 2 = −6
       (1, 2, 4), product is 1 * 2 * 5 = 10
       (2, 4, 5), product is 2 * 5 * 6 = 60
       Your goal is to find the maximal product of any triplet.

       Write a function:

       class Solution { public int solution(int[] A); }

       that, given a non-empty array A, returns the value of the maximal product of any triplet.

       For example, given array A such that:

         A[0] = -3
         A[1] = 1
         A[2] = 2
         A[3] = -2
         A[4] = 5
         A[5] = 6
       the function should return 60, as the product of triplet (2, 4, 5) is maximal.

       Write an efficient algorithm for the following assumptions:

       N is an integer within the range [3..100,000];
       each element of array A is an integer within the range [−1,000..1,000].
       
71. Distinct

        Write a function

        class Solution { public int solution(int[] A); }

        that, given an array A consisting of N integers, returns the number of distinct values in array A.

        For example, given array A consisting of six elements such that:

         A[0] = 2    A[1] = 1    A[2] = 1
         A[3] = 2    A[4] = 3    A[5] = 1
        the function should return 3, because there are 3 distinct values appearing in array A, namely 1, 2 and 3.

        Write an efficient algorithm for the following assumptions:

        N is an integer within the range [0..100,000];
        each element of array A is an integer within the range [−1,000,000..1,000,000].
        
72. Triangle

         An array A consisting of N integers is given. A triplet (P, Q, R) is triangular if 0 ≤ P < Q < R < N and:

         A[P] + A[Q] > A[R],
         A[Q] + A[R] > A[P],
         A[R] + A[P] > A[Q].
         For example, consider array A such that:

           A[0] = 10    A[1] = 2    A[2] = 5
           A[3] = 1     A[4] = 8    A[5] = 20
         Triplet (0, 2, 4) is triangular.

         Write a function:

         class Solution { public int solution(int[] A); }

         that, given an array A consisting of N integers, returns 1 if there exists a triangular 
         triplet for this array and returns 0 otherwise.

         For example, given array A such that:

           A[0] = 10    A[1] = 2    A[2] = 5
           A[3] = 1     A[4] = 8    A[5] = 20
         the function should return 1, as explained above. Given array A such that:

           A[0] = 10    A[1] = 50    A[2] = 5
           A[3] = 1
         the function should return 0.

         Write an efficient algorithm for the following assumptions:

         N is an integer within the range [0..100,000];
         each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].

73. NumberOfDiscIntersections

        We draw N discs on a plane. The discs are numbered from 0 to N − 1. An array A of N non-negative integers, 
        specifying the radiuses of the discs, is given. The J-th disc is drawn with its center at (J, 0) and radius A[J].

        We say that the J-th disc and K-th disc intersect if J ≠ K and the J-th and K-th discs have at least one common 
        point (assuming that the discs contain their borders).

        The figure below shows discs drawn for N = 6 and A as follows:

          A[0] = 1
          A[1] = 5
          A[2] = 2
          A[3] = 1
          A[4] = 4
          A[5] = 0


        There are eleven (unordered) pairs of discs that intersect, namely:

        discs 1 and 4 intersect, and both intersect with all the other discs;
        disc 2 also intersects with discs 0 and 3.
        Write a function:

        class Solution { public int solution(int[] A); }

        that, given an array A describing N discs as explained above, returns the number of 
        (unordered) pairs of intersecting discs. The function should return −1 if the number of intersecting pairs exceeds 10,000,000.

        Given array A shown above, the function should return 11, as explained above.

        Write an efficient algorithm for the following assumptions:

        N is an integer within the range [0..100,000];
        each element of array A is an integer within the range [0..2,147,483,647].
    
Lesson 7
Stacks and Queues

74. Brackets

      Determine whether a given string of parentheses (multiple types) is properly nested.

      A string S consisting of N characters is considered to be properly nested if any of the following conditions is true:

      S is empty;
      S has the form "(U)" or "[U]" or "{U}" where U is a properly nested string;
      S has the form "VW" where V and W are properly nested strings.
      For example, the string "{[()()]}" is properly nested but "([)()]" is not.

      Write a function:

      class Solution { public int solution(String S); }

      that, given a string S consisting of N characters, returns 1 if S is properly nested and 0 otherwise.

      For example, given S = "{[()()]}", the function should return 1 and given S = "([)()]", the function should return 0, as explained above.

      Write an efficient algorithm for the following assumptions:

      N is an integer within the range [0..200,000];
      string S consists only of the following characters: "(", "{", "[", "]", "}" and/or ")".
      
75. Fish

      N voracious fish are moving along a river. Calculate how many fish are alive.

      You are given two non-empty arrays A and B consisting of N integers. Arrays A and B represent N voracious fish in a river, ordered downstream along the flow of the river.

      The fish are numbered from 0 to N − 1. If P and Q are two fish and P < Q, then fish P is initially upstream of fish Q. Initially, each fish has a unique position.

      Fish number P is represented by A[P] and B[P]. Array A contains the sizes of the fish. All its elements are unique. Array B contains the directions of the fish. It contains only 0s and/or 1s, where:

      0 represents a fish flowing upstream,
      1 represents a fish flowing downstream.
      If two fish move in opposite directions and there are no other (living) fish between them, they will eventually meet each other. Then only one fish can stay alive − the larger fish eats the smaller one. More precisely, we say that two fish P and Q meet each other when P < Q, B[P] = 1 and B[Q] = 0, and there are no living fish between them. After they meet:

      If A[P] > A[Q] then P eats Q, and P will still be flowing downstream,
      If A[Q] > A[P] then Q eats P, and Q will still be flowing upstream.
      We assume that all the fish are flowing at the same speed. That is, fish moving in the same direction never meet. The goal is to calculate the number of fish that will stay alive.

      For example, consider arrays A and B such that:

        A[0] = 4    B[0] = 0
        A[1] = 3    B[1] = 1
        A[2] = 2    B[2] = 0
        A[3] = 1    B[3] = 0
        A[4] = 5    B[4] = 0
      Initially all the fish are alive and all except fish number 1 are moving upstream. Fish number 1 meets fish number 2 and eats it, then it meets fish number 3 and eats it too. Finally, it meets fish number 4 and is eaten by it. The remaining two fish, number 0 and 4, never meet and therefore stay alive.

      Write a function:

      class Solution { public int solution(int[] A, int[] B); }

      that, given two non-empty arrays A and B consisting of N integers, returns the number of fish that will stay alive.

      For example, given the arrays shown above, the function should return 2, as explained above.

      Write an efficient algorithm for the following assumptions:

      N is an integer within the range [1..100,000];
      each element of array A is an integer within the range [0..1,000,000,000];
      each element of array B is an integer that can have one of the following values: 0, 1;
      the elements of A are all distinct.

76. Nesting

    Determine whether a given string of parentheses (single type) is properly nested.

    A string S consisting of N characters is called properly nested if:

    S is empty;
    S has the form "(U)" where U is a properly nested string;
    S has the form "VW" where V and W are properly nested strings.
    For example, string "(()(())())" is properly nested but string "())" isn't.

    Write a function:

    class Solution { public int solution(String S); }

    that, given a string S consisting of N characters, returns 1 if string S is properly nested and 0 otherwise.

    For example, given S = "(()(())())", the function should return 1 and given S = "())", the function should return 0, as explained above.

    Write an efficient algorithm for the following assumptions:

    N is an integer within the range [0..1,000,000];
    string S consists only of the characters "(" and/or ")".
    
 77. StoneWall
 
Lesson 8
   Leader
   
78. Dominator

     Find an index of an array such that its value occurs at more than half of indices in the array.
     An array A consisting of N integers is given. The dominator of array A is the value that occurs in more than half of the elements of A.

    For example, consider array A such that

     A[0] = 3    A[1] = 4    A[2] =  3
     A[3] = 2    A[4] = 3    A[5] = -1
     A[6] = 3    A[7] = 3
    The dominator of A is 3 because it occurs in 5 out of 8 elements of A (namely in those with indices 0, 2, 4, 6 and 7) and 5 is more than a half of 8.

    Write a function

    class Solution { public int solution(int[] A); }

    that, given an array A consisting of N integers, returns index of any element of array A in which the dominator of A occurs. The function should return −1 if array A does not have a dominator.

    For example, given array A such that

     A[0] = 3    A[1] = 4    A[2] =  3
     A[3] = 2    A[4] = 3    A[5] = -1
     A[6] = 3    A[7] = 3
    the function may return 0, 2, 4, 6 or 7, as explained above.

    Write an efficient algorithm for the following assumptions:

    N is an integer within the range [0..100,000];
    each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
    
 79.
 
Lesson 9
 Maximum slice problem
 
80. MaxProfit

     Given a log of stock prices compute the maximum possible earning. 

     An array A consisting of N integers is given. It contains daily prices of a stock share for a period of N consecutive days. If a single share was bought on day P and sold on day Q, where 0 ≤ P ≤ Q < N, then the profit of such transaction is equal to A[Q] − A[P], provided that A[Q] ≥ A[P]. Otherwise, the transaction brings loss of A[P] − A[Q].

     For example, consider the following array A consisting of six elements such that:

       A[0] = 23171
       A[1] = 21011
       A[2] = 21123
       A[3] = 21366
       A[4] = 21013
       A[5] = 21367
     If a share was bought on day 0 and sold on day 2, a loss of 2048 would occur because A[2] − A[0] = 21123 − 23171 = −2048. If a share was bought on day 4 and sold on day 5, a profit of 354 would occur because A[5] − A[4] = 21367 − 21013 = 354. Maximum possible profit was 356. It would occur if a share was bought on day 1 and sold on day 5.

     Write a function,

     class Solution { public int solution(int[] A); }

     that, given an array A consisting of N integers containing daily prices of a stock share for a period of N consecutive days, returns the maximum possible profit from one transaction during this period. The function should return 0 if it was impossible to gain any profit.

     For example, given array A consisting of six elements such that:

       A[0] = 23171
       A[1] = 21011
       A[2] = 21123
       A[3] = 21366
       A[4] = 21013
       A[5] = 21367
     the function should return 356, as explained above.

     Write an efficient algorithm for the following assumptions:

     N is an integer within the range [0..400,000];
     each element of array A is an integer within the range [0..200,000].
     
81. MaxSliceSum

      Find a maximum sum of a compact subsequence of array elements. 

      A non-empty array A consisting of N integers is given. A pair of integers (P, Q), such that 0 ≤ P ≤ Q < N, is called a slice of array A. The sum of a slice (P, Q) is the total of A[P] + A[P+1] + ... + A[Q].

      Write a function:

      class Solution { public int solution(int[] A); }

      that, given an array A consisting of N integers, returns the maximum sum of any slice of A.

      For example, given array A such that:

      A[0] = 3  A[1] = 2  A[2] = -6
      A[3] = 4  A[4] = 0
      the function should return 5 because:

      (3, 4) is a slice of A that has sum 4,
      (2, 2) is a slice of A that has sum −6,
      (0, 1) is a slice of A that has sum 5,
      no other slice of A has sum greater than (0, 1).
      Write an efficient algorithm for the following assumptions:

      N is an integer within the range [1..1,000,000];
      each element of array A is an integer within the range [−1,000,000..1,000,000];
      the result will be an integer within the range [−2,147,483,648..2,147,483,647].
      
82. MaxDoubleSliceSum

    Find the maximal sum of any double slice. 

    A non-empty array A consisting of N integers is given.

    A triplet (X, Y, Z), such that 0 ≤ X < Y < Z < N, is called a double slice.

    The sum of double slice (X, Y, Z) is the total of A[X + 1] + A[X + 2] + ... + A[Y − 1] + A[Y + 1] + A[Y + 2] + ... + A[Z − 1].

    For example, array A such that:

        A[0] = 3
        A[1] = 2
        A[2] = 6
        A[3] = -1
        A[4] = 4
        A[5] = 5
        A[6] = -1
        A[7] = 2
    contains the following example double slices:

    double slice (0, 3, 6), sum is 2 + 6 + 4 + 5 = 17,
    double slice (0, 3, 7), sum is 2 + 6 + 4 + 5 − 1 = 16,
    double slice (3, 4, 5), sum is 0.
    The goal is to find the maximal sum of any double slice.

    Write a function:

    class Solution { public int solution(int[] A); }

    that, given a non-empty array A consisting of N integers, returns the maximal sum of any double slice.

    For example, given:

        A[0] = 3
        A[1] = 2
        A[2] = 6
        A[3] = -1
        A[4] = 4
        A[5] = 5
        A[6] = -1
        A[7] = 2
    the function should return 17, because no double slice of array A has a sum of greater than 17.

    Write an efficient algorithm for the following assumptions:

    N is an integer within the range [3..100,000];
    each element of array A is an integer within the range [−10,000..10,000].
  
Lesson 10
Prime and composite numbers

83. CountFactors

     Count factors of given number n.

     A positive integer D is a factor of a positive integer N if there exists an integer M such that N = D * M.

     For example, 6 is a factor of 24, because M = 4 satisfies the above condition (24 = 6 * 4).

     Write a function:

     class Solution { public int solution(int N); }

     that, given a positive integer N, returns the number of its factors.

     For example, given N = 24, the function should return 8, because 24 has 8 factors, namely 1, 2, 3, 4, 6, 8, 12, 24. There are no other factors of 24.

     Write an efficient algorithm for the following assumptions:

     N is an integer within the range [1..2,147,483,647].
    
84.MinPerimeterRectangle

      Find the minimal perimeter of any rectangle whose area equals N.

      An integer N is given, representing the area of some rectangle.

      The area of a rectangle whose sides are of length A and B is A * B, and the perimeter is 2 * (A + B).

      The goal is to find the minimal perimeter of any rectangle whose area equals N. The sides of this rectangle should be only integers.

      For example, given integer N = 30, rectangles of area 30 are:

      (1, 30), with a perimeter of 62,
      (2, 15), with a perimeter of 34,
      (3, 10), with a perimeter of 26,
      (5, 6), with a perimeter of 22.
      Write a function:

      class Solution { public int solution(int N); }

      that, given an integer N, returns the minimal perimeter of any rectangle whose area is exactly equal to N.

      For example, given an integer N = 30, the function should return 22, as explained above.

      Write an efficient algorithm for the following assumptions:

      N is an integer within the range [1..1,000,000,000].
      
85. Peaks

86.

Lesson 11
Sieve of Eratosthenes

87. CountSemiprimes

      Count the semiprime numbers in the given range [a..b]
      A prime is a positive integer X that has exactly two distinct divisors: 1 and X. The first few prime integers are 2, 3, 5, 7, 11 and 13.

      A semiprime is a natural number that is the product of two (not necessarily distinct) prime numbers. The first few semiprimes are 4, 6, 9, 10, 14, 15, 21, 22, 25, 26.

      You are given two non-empty arrays P and Q, each consisting of M integers. These arrays represent queries about the number of semiprimes within specified ranges.

      Query K requires you to find the number of semiprimes within the range (P[K], Q[K]), where 1 ≤ P[K] ≤ Q[K] ≤ N.

      For example, consider an integer N = 26 and arrays P, Q such that:

          P[0] = 1    Q[0] = 26
          P[1] = 4    Q[1] = 10
          P[2] = 16   Q[2] = 20
      The number of semiprimes within each of these ranges is as follows:

      (1, 26) is 10,
      (4, 10) is 4,
      (16, 20) is 0.
      Write a function:

      class Solution { public int[] solution(int N, int[] P, int[] Q); }

      that, given an integer N and two non-empty arrays P and Q consisting of M integers, returns an array consisting of M elements specifying the consecutive answers to all the queries.

      For example, given an integer N = 26 and arrays P, Q such that:

          P[0] = 1    Q[0] = 26
          P[1] = 4    Q[1] = 10
          P[2] = 16   Q[2] = 20
      the function should return the values [10, 4, 0], as explained above.

      Write an efficient algorithm for the following assumptions:

      N is an integer within the range [1..50,000];
      M is an integer within the range [1..30,000];
      each element of arrays P, Q is an integer within the range [1..N];
      P[i] ≤ Q[i].
      
88. CountNonDivisible

      Calculate the number of elements of an array that are not divisors of each element.

      You are given an array A consisting of N integers.

      For each number A[i] such that 0 ≤ i < N, we want to count the number of elements of the array that are not the divisors of A[i]. We say that these elements are non-divisors.

      For example, consider integer N = 5 and array A such that:

          A[0] = 3
          A[1] = 1
          A[2] = 2
          A[3] = 3
          A[4] = 6
      For the following elements:

      A[0] = 3, the non-divisors are: 2, 6,
      A[1] = 1, the non-divisors are: 3, 2, 3, 6,
      A[2] = 2, the non-divisors are: 3, 3, 6,
      A[3] = 3, the non-divisors are: 2, 6,
      A[4] = 6, there aren't any non-divisors.
      Write a function:

      class Solution { public int[] solution(int[] A); }

      that, given an array A consisting of N integers, returns a sequence of integers representing the amount of non-divisors.

      Result array should be returned as an array of integers.

      For example, given:

          A[0] = 3
          A[1] = 1
          A[2] = 2
          A[3] = 3
          A[4] = 6
      the function should return [2, 4, 3, 2, 0], as explained above.

      Write an efficient algorithm for the following assumptions:

      N is an integer within the range [1..50,000];
      each element of array A is an integer within the range [1..2 * N].
      
Lesson 12
Euclidean algorithm

89.  ChocolatesByNumbers

    There are N chocolates in a circle. Count the number of chocolates you will eat.

    Two positive integers N and M are given. Integer N represents the number of chocolates arranged in a circle, numbered from 0 to N − 1.

    You start to eat the chocolates. After eating a chocolate you leave only a wrapper.

    You begin with eating chocolate number 0. Then you omit the next M − 1 chocolates or wrappers on the circle, and eat the following one.

    More precisely, if you ate chocolate number X, then you will next eat the chocolate with number (X + M) modulo N (remainder of division).

    You stop eating when you encounter an empty wrapper.

    For example, given integers N = 10 and M = 4. You will eat the following chocolates: 0, 4, 8, 2, 6.

    The goal is to count the number of chocolates that you will eat, following the above rules.

    Write a function:

    class Solution { public int solution(int N, int M); }

    that, given two positive integers N and M, returns the number of chocolates that you will eat.

    For example, given integers N = 10 and M = 4. the function should return 5, as explained above.

    Write an efficient algorithm for the following assumptions:

    N and M are integers within the range [1..1,000,000,000].
    
90. CommonPrimeDivisors

      Check whether two numbers have the same prime divisors.

      A prime is a positive integer X that has exactly two distinct divisors: 1 and X. The first few prime integers are 2, 3, 5, 7, 11 and 13.

      A prime D is called a prime divisor of a positive integer P if there exists a positive integer K such that D * K = P. For example, 2 and 5 are prime divisors of 20.

      You are given two positive integers N and M. The goal is to check whether the sets of prime divisors of integers N and M are exactly the same.

      For example, given:

      N = 15 and M = 75, the prime divisors are the same: {3, 5};
      N = 10 and M = 30, the prime divisors aren't the same: {2, 5} is not equal to {2, 3, 5};
      N = 9 and M = 5, the prime divisors aren't the same: {3} is not equal to {5}.
      Write a function:

      class Solution { public int solution(int[] A, int[] B); }

      that, given two non-empty arrays A and B of Z integers, returns the number of positions K for which the prime divisors of A[K] and B[K] are exactly the same.

      For example, given:

          A[0] = 15   B[0] = 75
          A[1] = 10   B[1] = 30
          A[2] = 3    B[2] = 5
      the function should return 1, because only one pair (15, 75) has the same set of prime divisors.

      Write an efficient algorithm for the following assumptions:

      Z is an integer within the range [1..6,000];
      each element of arrays A, B is an integer within the range [1..2,147,483,647].
  
Lesson 13
Fibonacci numbers

91. Ladder

   Count the number of different ways of climbing to the top of a ladder.

   You have to climb up a ladder. The ladder has exactly N rungs, numbered from 1 to N. With each step, you can ascend by one or two rungs. More precisely:

   with your first step you can stand on rung 1 or 2,
   if you are on rung K, you can move to rungs K + 1 or K + 2,
   finally you have to stand on rung N.
   Your task is to count the number of different ways of climbing to the top of the ladder.

   For example, given N = 4, you have five different ways of climbing, ascending by:

   1, 1, 1 and 1 rung,
   1, 1 and 2 rungs,
   1, 2 and 1 rung,
   2, 1 and 1 rungs, and
   2 and 2 rungs.
   Given N = 5, you have eight different ways of climbing, ascending by:

   1, 1, 1, 1 and 1 rung,
   1, 1, 1 and 2 rungs,
   1, 1, 2 and 1 rung,
   1, 2, 1 and 1 rung,
   1, 2 and 2 rungs,
   2, 1, 1 and 1 rungs,
   2, 1 and 2 rungs, and
   2, 2 and 1 rung.
   The number of different ways can be very large, so it is sufficient to return the result modulo 2P, for a given integer P.

   Write a function:

   class Solution { public int[] solution(int[] A, int[] B); }

   that, given two non-empty arrays A and B of L integers, returns an array consisting of L integers specifying the consecutive answers; position I should contain the number of different ways of climbing the ladder with A[I] rungs modulo 2B[I].

   For example, given L = 5 and:

       A[0] = 4   B[0] = 3
       A[1] = 4   B[1] = 2
       A[2] = 5   B[2] = 4
       A[3] = 5   B[3] = 3
       A[4] = 1   B[4] = 1
   the function should return the sequence [5, 1, 8, 0, 1], as explained above.

   Write an efficient algorithm for the following assumptions:

   L is an integer within the range [1..50,000];
   each element of array A is an integer within the range [1..L];
   each element of array B is an integer within the range [1..30].
  
92. FibFrog

Lesson 14
Binary search algorithm

93. NailingPlanks    !!! I AM NOT SURE ABOUT THE CONCEPT !!!
    https://github.com/ZRonchy/Codility/blob/master/Lesson12/NailingPlanks.java

   Count the minimum number of nails that allow a series of planks to be nailed.

   You are given two non-empty arrays A and B consisting of N integers. These arrays represent N planks. More precisely, A[K] is the start and B[K] the end of the K−th plank.

   Next, you are given a non-empty array C consisting of M integers. This array represents M nails. More precisely, C[I] is the position where you can hammer in the I−th nail.

   We say that a plank (A[K], B[K]) is nailed if there exists a nail C[I] such that A[K] ≤ C[I] ≤ B[K].

   The goal is to find the minimum number of nails that must be used until all the planks are nailed. In other words, you should find a value J such that all planks will be nailed after using only the first J nails. More precisely, for every plank (A[K], B[K]) such that 0 ≤ K < N, there should exist a nail C[I] such that I < J and A[K] ≤ C[I] ≤ B[K].

   For example, given arrays A, B such that:

       A[0] = 1    B[0] = 4
       A[1] = 4    B[1] = 5
       A[2] = 5    B[2] = 9
       A[3] = 8    B[3] = 10
   four planks are represented: [1, 4], [4, 5], [5, 9] and [8, 10].

   Given array C such that:

       C[0] = 4
       C[1] = 6
       C[2] = 7
       C[3] = 10
       C[4] = 2
   if we use the following nails:

   0, then planks [1, 4] and [4, 5] will both be nailed.
   0, 1, then planks [1, 4], [4, 5] and [5, 9] will be nailed.
   0, 1, 2, then planks [1, 4], [4, 5] and [5, 9] will be nailed.
   0, 1, 2, 3, then all the planks will be nailed.
   Thus, four is the minimum number of nails that, used sequentially, allow all the planks to be nailed.

   Write a function:

   class Solution { public int solution(int[] A, int[] B, int[] C); }

   that, given two non-empty arrays A and B consisting of N integers and a non-empty array C consisting of M integers, returns the minimum number of nails that, used sequentially, allow all the planks to be nailed.

   If it is not possible to nail all the planks, the function should return −1.

   For example, given arrays A, B, C such that:

       A[0] = 1    B[0] = 4
       A[1] = 4    B[1] = 5
       A[2] = 5    B[2] = 9
       A[3] = 8    B[3] = 10

       C[0] = 4
       C[1] = 6
       C[2] = 7
       C[3] = 10
       C[4] = 2
   the function should return 4, as explained above.

   Write an efficient algorithm for the following assumptions:

   N and M are integers within the range [1..30,000];
   each element of arrays A, B, C is an integer within the range [1..2*M];
   A[K] ≤ B[K].

Lesson 15
Caterpillar method

95. CountDistinctSlices

    Count the number of distinct slices (containing only unique numbers).

    An integer M and a non-empty array A consisting of N non-negative integers are given. All integers in array A are less than or equal to M.

    A pair of integers (P, Q), such that 0 ≤ P ≤ Q < N, is called a slice of array A. The slice consists of the elements A[P], A[P + 1], ..., A[Q]. A distinct slice is a slice consisting of only unique numbers. That is, no individual number occurs more than once in the slice.

    For example, consider integer M = 6 and array A such that:

        A[0] = 3
        A[1] = 4
        A[2] = 5
        A[3] = 5
        A[4] = 2
    There are exactly nine distinct slices: (0, 0), (0, 1), (0, 2), (1, 1), (1, 2), (2, 2), (3, 3), (3, 4) and (4, 4).

    The goal is to calculate the number of distinct slices.

    Write a function:

    class Solution { public int solution(int M, int[] A); }

    that, given an integer M and a non-empty array A consisting of N integers, returns the number of distinct slices.

    If the number of distinct slices is greater than 1,000,000,000, the function should return 1,000,000,000.

    For example, given integer M = 6 and array A such that:

        A[0] = 3
        A[1] = 4
        A[2] = 5
        A[3] = 5
        A[4] = 2
    the function should return 9, as explained above.

    Write an efficient algorithm for the following assumptions:

    N is an integer within the range [1..100,000];
    M is an integer within the range [0..100,000];
    each element of array A is an integer within the range [0..M].
    
96. AbsDistinct

    Compute number of distinct absolute values of sorted array elements.

    A non-empty array A consisting of N numbers is given. The array is sorted in non-decreasing order. The absolute distinct count of this array is the number of distinct absolute values among the elements of the array.

    For example, consider array A such that:

      A[0] = -5
      A[1] = -3
      A[2] = -1
      A[3] =  0
      A[4] =  3
      A[5] =  6
    The absolute distinct count of this array is 5, because there are 5 distinct absolute values among the elements of this array, namely 0, 1, 3, 5 and 6.

    Write a function:

    class Solution { public int solution(int[] A); }

    that, given a non-empty array A consisting of N numbers, returns absolute distinct count of array A.

    For example, given array A such that:

      A[0] = -5
      A[1] = -3
      A[2] = -1
      A[3] =  0
      A[4] =  3
      A[5] =  6
    the function should return 5, as explained above.

    Write an efficient algorithm for the following assumptions:

    N is an integer within the range [1..100,000];
    each element of array A is an integer within the range [−2,147,483,648..2,147,483,647];
    array A is sorted in non-decreasing order.
    
97. CountTriangles

  Count the number of triangles that can be built from a given set of edges.

  An array A consisting of N integers is given. A triplet (P, Q, R) is triangular if it is possible to build a triangle with sides of lengths A[P], A[Q] and A[R]. In other words, triplet (P, Q, R) is triangular if 0 ≤ P < Q < R < N and:

  A[P] + A[Q] > A[R],
  A[Q] + A[R] > A[P],
  A[R] + A[P] > A[Q].
  For example, consider array A such that:

    A[0] = 10    A[1] = 2    A[2] = 5
    A[3] = 1     A[4] = 8    A[5] = 12
  There are four triangular triplets that can be constructed from elements of this array, namely (0, 2, 4), (0, 2, 5), (0, 4, 5), and (2, 4, 5).

  Write a function:

  class Solution { public int solution(int[] A); }

  that, given an array A consisting of N integers, returns the number of triangular triplets in this array.

  For example, given array A such that:

    A[0] = 10    A[1] = 2    A[2] = 5
    A[3] = 1     A[4] = 8    A[5] = 12
  the function should return 4, as explained above.

  Write an efficient algorithm for the following assumptions:

  N is an integer within the range [0..1,000];
  each element of array A is an integer within the range [1..1,000,000,000].
  
98. MinAbsSumOfTwo

   Find the minimal absolute value of a sum of two elements.

   Let A be a non-empty array consisting of N integers.

   The abs sum of two for a pair of indices (P, Q) is the absolute value |A[P] + A[Q]|, for 0 ≤ P ≤ Q < N.

   For example, the following array A:

     A[0] =  1
     A[1] =  4
     A[2] = -3
   has pairs of indices (0, 0), (0, 1), (0, 2), (1, 1), (1, 2), (2, 2).
   The abs sum of two for the pair (0, 0) is A[0] + A[0] = |1 + 1| = 2.
   The abs sum of two for the pair (0, 1) is A[0] + A[1] = |1 + 4| = 5.
   The abs sum of two for the pair (0, 2) is A[0] + A[2] = |1 + (−3)| = 2.
   The abs sum of two for the pair (1, 1) is A[1] + A[1] = |4 + 4| = 8.
   The abs sum of two for the pair (1, 2) is A[1] + A[2] = |4 + (−3)| = 1.
   The abs sum of two for the pair (2, 2) is A[2] + A[2] = |(−3) + (−3)| = 6.
   Write a function:

   class Solution { public int solution(int[] A); }

   that, given a non-empty array A consisting of N integers, returns the minimal abs sum of two for any pair of indices in this array.

   For example, given the following array A:

     A[0] =  1
     A[1] =  4
     A[2] = -3
   the function should return 1, as explained above.

   Given array A:

     A[0] = -8
     A[1] =  4
     A[2] =  5
     A[3] =-10
     A[4] =  3
   the function should return |(−8) + 5| = 3.

   Write an efficient algorithm for the following assumptions:

   N is an integer within the range [1..100,000];
   each element of array A is an integer within the range [−1,000,000,000..1,000,000,000].

Lesson 16
Greedy algorithms

99. MaxNonoverlappingSegments

   Find a maximal set of non-overlapping segments.

   Located on a line are N segments, numbered from 0 to N − 1, whose positions are given in arrays A and B. For each I (0 ≤ I < N) the position of segment I is from A[I] to B[I] (inclusive). The segments are sorted by their ends, which means that B[K] ≤ B[K + 1] for K such that 0 ≤ K < N − 1.

   Two segments I and J, such that I ≠ J, are overlapping if they share at least one common point. In other words, A[I] ≤ A[J] ≤ B[I] or A[J] ≤ A[I] ≤ B[J].

   We say that the set of segments is non-overlapping if it contains no two overlapping segments. The goal is to find the size of a non-overlapping set containing the maximal number of segments.

   For example, consider arrays A, B such that:

       A[0] = 1    B[0] = 5
       A[1] = 3    B[1] = 6
       A[2] = 7    B[2] = 8
       A[3] = 9    B[3] = 9
       A[4] = 9    B[4] = 10
   The segments are shown in the figure below.



   The size of a non-overlapping set containing a maximal number of segments is 3. For example, possible sets are {0, 2, 3}, {0, 2, 4}, {1, 2, 3} or {1, 2, 4}. There is no non-overlapping set with four segments.

   Write a function:

   class Solution { public int solution(int[] A, int[] B); }

   that, given two arrays A and B consisting of N integers, returns the size of a non-overlapping set containing a maximal number of segments.

   For example, given arrays A, B shown above, the function should return 3, as explained above.

   Write an efficient algorithm for the following assumptions:

   N is an integer within the range [0..30,000];
   each element of arrays A, B is an integer within the range [0..1,000,000,000];
   A[I] ≤ B[I], for each I (0 ≤ I < N);
   B[K] ≤ B[K + 1], for each K (0 ≤ K < N − 1).
