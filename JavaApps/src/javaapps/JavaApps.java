/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapps;

import java.util.Scanner;

/**
 *
 * @author barcz
 */
public class JavaApps {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int menuNumber;
        Fibonacci fibonacci = new Fibonacci();
        Primenumber primenumber = new Primenumber();
        Palindrome palindrome = new Palindrome();
        Armstrong armstrong = new Armstrong();
        Avoidingdeadlock avoidingdeadlock = new Avoidingdeadlock();
        SmallestPositiveInteger  smallestpositiveinteger = new SmallestPositiveInteger();
        BinaryGap binaryGap = new BinaryGap();
        OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();
        CyclicRotation cyclicRotation =  new CyclicRotation();
        FrogJmp frogJmp = new FrogJmp();
        PermCheck permCheck = new PermCheck();
        PassingCars passingCars = new PassingCars();
        MaxProductOfThree maxProductOfThree = new MaxProductOfThree();
        Distinct distinct = new Distinct();
        Triangle triangle = new Triangle();
        NumberOfDiscIntersections numberOfDiscIntersections = new NumberOfDiscIntersections();
        Brackets brackets = new Brackets();
        Fish fish = new Fish();
        Help help = new Help();
        
        
        
        
        
        do {
            System.out.println("\n Please choose which program would you like to run :");
            System.out.println("666: Help test menu");
            System.out.println("1: Fibonacci series");    
            System.out.println("2: A prime number");
            System.out.println("3: Palindrome");
            System.out.println("4: Integer Palindrome");
            System.out.println("5: Armstrong number");
            System.out.println("6: Avoiding deadlock");
            System.out.println("51: Smallest Positive Integer");
            System.out.println("52: BinaryGap");
            System.out.println("53: OddOccurrencesInArray");
            System.out.println("54: CyclicRotation");
            System.out.println("55: FrogJump");
            System.out.println("58: permCheck");
            
            System.out.println("65: PassingCars");
            
            System.out.println("70: maxProductOfThree");
            System.out.println("71: Distinct");
            System.out.println("72: Triangle");
            System.out.println("73: NumberOfDiscIntersections");
            System.out.println("74: Brackets");
            System.out.println("75: Fish");
            
            
             
            
            
            System.out.println("0: EXIT");
                Scanner input =  new Scanner(System.in);
                if (input.hasNextInt()) {
                    menuNumber = input.nextInt();
                    
                    switch (menuNumber) {
                        case 1:
                            fibonacci.runF();
                            break;
                        case 2:
                            primenumber.run();
                            break;
                        case 3:
                            palindrome.run();
                            break;
                        case 4:
                            palindrome.run();
                            break;
                        case 5:
                            armstrong.run();
                            break;
                        case 6:
                            avoidingdeadlock.run();
                            break;
                        case 51:
                            int[] A = new int[]{1, 3, 6, 4, 1, 2};
                            //int[] B = new int[]{1, 2, 3};
                            //int[] C = new int[]{-1, -3};
                            //int[] D = new int[]{-1, -3, 2, 4, 1, 2,5,7,8,11,14,13};
                            smallestpositiveinteger.solution(A);
                            //smallestpositiveinteger.solution(B);
                            //smallestpositiveinteger.solution(C);
                            //smallestpositiveinteger.solution(D);
                            //smallestpositiveinteger.sort();
                            break;
                        case 52:
                            System.out.println("Please give a integer number:");
                            Scanner s = new Scanner(System.in);
                            int number = s.nextInt();
                            binaryGap.solution(number);
                            break;
                        case 53:
                            int[] oia = new int[]{9, 3, 9, 3, 9, 7, 9};
                            //int[] oia = new int[]{3, 4, 4, 7, 9, 7, 9};
                            oddOccurrencesInArray.solution(oia);;
                            break;
                        case 54:
                            int[] cr1 = new int[]{3, 8, 9, 7, 6};
                            int  k = 3;
                            //int[] cr1 = new int[]{1, 2, 3, 4};
                            //int  k = 4;
                            cyclicRotation.solution(cr1,k);;
                            break;
                        case 55:
                            int jumpX = 10;
                            int jumpY = 85;
                            int jumpD = 30;
                            frogJmp.solution(jumpX, jumpY, jumpD);
                            break;
                        case 58:
                            //int[] permC = new int[]{4, 1, 3, 2};
                            //int[] permC = new int[]{4, 1, 3};
                            int[] permC = new int[]{9,8,7,6,4,3,2};
                            //int[] permC = new int[]{43, 17, 13, 22};
                            permCheck.solution(permC);
                            break;
                            
                        case 65:
                            int[] passingCarsN = new int[]{0,1,0,1,1};
                            passingCars.solution(passingCarsN);
                            break;
                        case 70:
                            int[] maxProductOfThreeN = new int[]{-3,1,2,-2,5,6};
                            maxProductOfThree.solution(maxProductOfThreeN);
                            break;
                        case 71:
                            //2 2 1 2 3 1
                            int[] distinctA = new int[]{2,2,1,2,3,1};
                            //int[] distinctA = new int[]{7,16,16,3,80,3};
                            distinct.solution(distinctA);
                            break;
                        case 72:
                            //int[] triangleT = new int[]{10,2,5,1,8,20};
                            int[] triangleT = new int[]{10,50,5,1};
                            triangle.solution(triangleT);
                            break;
                        case 73:
                            int[] numberOfDiscIntersectionsN = new int[]{1,5,2,1,4};
                            //int[] numberOfDiscIntersectionsN = new int[]{1,5,2,1,4,0};
                            numberOfDiscIntersections.solution(numberOfDiscIntersectionsN);
                            break;
                         case 74:
                            //String bracketsS ="()]()[][";
                            //String bracketsS ="()]()][][";
                            //String bracketsS = "([)()]";
                            //String bracketsS = "{[()()]}";
                            String bracketsS = "{[()()]{}}}{{(()({}}}";
                            brackets.solution(bracketsS);
                            break;
                         case 75:
                            //int[] fishA = new int[]{4,3,2,1,5};
                            //int[] fishB = new int[]{0,1,0,0,0};
                            int[] fishA = new int[]{3,2,5,4,1};
                            int[] fishB = new int[]{1,0,0,1,1};
                            fish.solution(fishA,fishB);
                            break;
                        case 666:
                            //help.run();
                           // help.solution(268);
                            //help.solution(1,6,2);
                            break;
                        default:
                            System.exit(0);
                    }
                     
                     
                } else {
                    break;
                }
                
        } while (menuNumber!=0);
        
       
                
    }
    
}
