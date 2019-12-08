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
