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
