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
        Nesting nesting = new Nesting();
        Dominator dominator  = new Dominator();
        MaxProfit maxProfit = new MaxProfit();
        MaxSliceSum maxSliceSum = new MaxSliceSum();
        MaxDoubleSliceSum maxDoubleSliceSum = new MaxDoubleSliceSum();
        CountFactors countFactors = new CountFactors();
        MinPerimeterRectangle minPerimeterRectangle = new MinPerimeterRectangle();
        CountSemiprimes countSemiprimes = new CountSemiprimes();
        CountNonDivisible countNonDivisible = new CountNonDivisible();
        ChocolatesByNumbers chocolatesByNumbers = new ChocolatesByNumbers();
        CommonPrimeDivisors commonPrimeDivisors = new CommonPrimeDivisors();
        NailingPlanks nailingPlanks = new NailingPlanks();
        MinMaxDivision minMaxDivision = new MinMaxDivision();
        MaxProfitS maxProfitS = new MaxProfitS();
        Prime719 prime719 = new Prime719();
        CountDistinctSlices countDistinctSlices =  new CountDistinctSlices();
        AbsDistinct absDistinct = new AbsDistinct();
        CountTriangles countTriangles = new CountTriangles();
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
            
            System.out.println("49: Prime719 NOT Working");
            
            System.out.println("50: MaxProfitS");
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
            System.out.println("76: Nesting");
            
            System.out.println("78: Dominator");
            
            System.out.println("80: MaxProfit");
            System.out.println("81: MaxSliceSum");
            System.out.println("82: MaxDoubleSliceSum");
            System.out.println("83: CountFactors");
            System.out.println("84: MinPerimeterRectangle");
            
            
            System.out.println("87: CountSemiprimes");
            System.out.println("88: CountNonDivisible");
            System.out.println("89: ChocolatesByNumbers");
            System.out.println("90: CommonPrimeDivisors");
            
            System.out.println("93: NailingPlanks! !! I AM NOT SURE !!" );
            System.out.println("94: MinMaxDivision" );
            System.out.println("95: CountDistinctSlices" );
            System.out.println("96: AbsDistinct" );
            System.out.println("97: CountTriangles" );
            
            
            
            
          
            
            
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
                        case 49:
                            prime719.solution();
                            //prime719.findKerekPrim(719);
                            //prime719.checkPNumber(749);
                            //prime719.isItKerekPrim(111);
                            prime719.kiir();
                            break;
                        case 50:
                            int[] maxProfitSN = new int[]{5,11,3,50,60,90};
                            int maxProfitSK = 2;
                            maxProfitS.solution(maxProfitSN,maxProfitSK);
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
                        case 76:
                            String nestingS = "(()(())())";
                            //String nestingS = "(()(";
                            //String nestingS = "";
                            nesting.solution(nestingS);
                            break;
                        case 78:
                            //int[] dominatorN = {3,4,3,2,3,-1,3,3};
                            int[] dominatorN = {4,4,4,4,2,-1,3,1};
                            dominator.solution(dominatorN);
                            break;
                        case 80:
                            int[] maxProfitN = {23171,21011,21123,21366,21013,21367};
                            maxProfit.solution(maxProfitN);
                            break;  
                        case 81:
                            int[] maxSliceSumN = {3,2,-6,4,0};
                            //int[] maxSliceSumN = {3,2,6,4,0,6,1};
                            maxSliceSum.solution(maxSliceSumN);
                            break; 
                         case 82:
                            // the function should return 17, because no double slice of array A has a sum of greater than 17.
                            int[] maxDoubleSliceSumN = {3,2,6,-1,4,5,-1,2};
                            //int[] maxDoubleSliceSumN = {5,1,3,-2,5,-1,6,2};
                            maxDoubleSliceSum.solution(maxDoubleSliceSumN);
                            break;    
                        case 83:
                            // For example, given N = 24, the function should return 8, because 24 has 8 factors, namely 1, 2, 3, 4, 6, 8, 12, 24. There are no other factors of 24.
                            int countFactorsN = 24;
                            //int countFactorsN = 132;
                            countFactors.solution(countFactorsN);
                            break; 
                        case 84:
                            int minPerimeterRectangleN = 30;
                            //int minPerimeterRectangleN = 132;
                            minPerimeterRectangle.solution(minPerimeterRectangleN);
                            break;
                        case 87:
                            int CountSemiprimesN = 26;
                            int[] CountSemiprimesP = {1,4,16};
                            int[] CountSemiprimesQ = {26,10,20};
                            countSemiprimes.solution(CountSemiprimesN,CountSemiprimesP,CountSemiprimesQ);
                            break;
                        case 88:
                            int[] CountNonDivisibleN = {3,1,2,3,6};
                            //int[] CountNonDivisibleN = {4,1,2,3,6};
                            countNonDivisible.solution(CountNonDivisibleN);
                            break;
                        case 89:
                            //int chocolatesByNumbersN = 10;
                            //int chocolatesByNumbersM = 4;
                            int chocolatesByNumbersN = 7;
                            int chocolatesByNumbersM = 5;
                            chocolatesByNumbers.solution(chocolatesByNumbersN,chocolatesByNumbersM);
                            break;
                         case 90:
                            int[] commonPrimeDivisorsA = {15,10,3};
                            int[] commonPrimeDivisorsB = {75,30,5};
                            commonPrimeDivisors.solution(commonPrimeDivisorsA,commonPrimeDivisorsB);
                            break;
                        case 93:
                            int[] nailingPlanksA = {1,4,5,8};
                            int[] nailingPlanksB = {4,5,9,10};
                            int[] nailingPlanksC= {4,6,7,10,2};
                            //int[] nailingPlanksA = {28, 18, 43, 15, 26, 18, 21, 49, 6, 23, 12, 18, 50, 17, 31,21, 37, 23, 9, 22, 21, 40, 29, 10, 34, 15, 26, 11, 21, 40, 26,  38, 38, 30, 33, 20, 31, 39, 5, 47, 19, 7, 8, 18, 4, 20, 21, 33,24, 47, 33, 17, 44, 35, 49, 37, 49, 11, 14, 49, 2, 47, 6, 7,8, 46, 48, 44, 37, 38, 16, 1, 32, 45, 48, 26, 1, 9, 23, 12, 2,10, 25, 7, 6, 9, 2, 40, 44, 11, 32, 44, 13, 17, 45, 39, 32, 40,29, 16};
                            //int[] nailingPlanksB = { 55, 32, 44, 48, 36, 31, 41, 81, 56, 46, 62, 68, 62, 20,39, 63, 67, 69, 58, 55, 48, 43, 30, 51, 68, 53, 54, 45, 53, 85,  31, 63, 53, 72, 77, 32, 35, 51, 21, 86, 39, 45, 23, 44, 13, 52,47, 76, 72, 73, 36, 64, 92, 59, 73, 84, 61, 24, 49, 83, 36, 89, 72, 28, 19, 56, 66, 66, 74, 69, 42, 20, 63, 64, 88, 58, 36, 28,  49, 48, 50, 36, 41, 42, 12, 26, 3, 68, 56, 30, 72, 76, 14, 39,45, 80, 57, 83, 42, 57};
                            //int[] nailingPlanksC= {4,6,7,10,2};
                            nailingPlanks.solution(nailingPlanksA,nailingPlanksB,nailingPlanksC);
                            break;
                        case 94:
                            int[] MainMaxDivisionA = {2,1,5,1,2,2,2};
                            int MinMaxDivisionK = 3;
                            int MinMaxDivisionM = 5;
                            minMaxDivision.solution(MinMaxDivisionK,MinMaxDivisionM,MainMaxDivisionA);
                            break;
                        case 95:
                            int countDistinctSlicesM = 6;
                            int[] countDistinctSlicesA = {3,4,5,5,2};
                            countDistinctSlices.solution(countDistinctSlicesM, countDistinctSlicesA);
                            break;
                        case 96:
                            //int[] AbsDistinctA = {-5,-3,-1,0,3,6};
                            int[] AbsDistinctA = {3,-3,0,-1,-5,6};
                            absDistinct.solution(AbsDistinctA);
                            break;
                        case 97:
                            int[] CountTrianglesN ={10,2,5,1,8,12};
                            countTriangles.solution(CountTrianglesN);
                            break;
                        case 666:
                            String helpS = "o";
                            String helpT = "odd";
                            help.solution(helpS,helpT);
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
