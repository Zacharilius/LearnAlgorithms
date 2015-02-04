package testPackage;

import static org.junit.Assert.*;
import interviewQuestions.*;

import java.util.Random;

import org.junit.Test;

import codingPractice.CalcAngBetMinHourHands;
import codingPractice.FindStartCircularArray;
import dataStructures.SLList;

public class TestCase {

	//Test uniqueCharsString_1_1
	@Test
	public void test_1_1() {
		assertEquals("'abba' is false", false, UniqueCharsString_1_1.uniqueCharString("abba"));
		assertEquals("'ab' is true", true, UniqueCharsString_1_1.uniqueCharString("ab"));
		assertEquals("'ABCDEfghijk' is true", true, UniqueCharsString_1_1.uniqueCharString("ABCDEfghijk"));
		assertEquals("'Rasst' is false", false, UniqueCharsString_1_1.uniqueCharString("Rasst"));
		assertEquals("'Poople' is false", false, UniqueCharsString_1_1.uniqueCharString("Poople"));
	}
	
	//Test ArrayAnagramPermutation_1_3
	@Test
	public void test_1_3(){
		assertEquals("'abba' and 'baab' are true", true, ArrayAnagramPermutation_1_3.stringsPermutation("abba", "baab"));
		assertEquals("'abba' and 'boob' are true", false, ArrayAnagramPermutation_1_3.stringsPermutation("abba", "boob"));
		assertEquals("'abcdefg' and 'gfedcba' are true", true, ArrayAnagramPermutation_1_3.stringsPermutation("abcdefg", "gfedcba"));
	}
	
	//Test ReplaceSpaces_1_4
	@Test
	public void test_1_4(){
		assertEquals("Double double toil and trouble", "Double%20double%20toil%20and%20trouble", 
				ReplaceSpaces_1_4.replaceSpaces("Double double toil and trouble"));
	}

	//Test StringCompression_1_5
	@Test
	public void test_1_5(){
		assertEquals("'aaabbcddd' is a3b2c1d3", "a3b2c1d3", StringCompression_1_5.compressString("aaabbcddd"));
		assertEquals("'aabcccccaaa' is a2b1c5a3.", "a2b1c5a3", StringCompression_1_5.compressString("aabcccccaaa"));
		assertEquals("'abcdefg' is abcdefg.", "abcdefg", StringCompression_1_5.compressString("abcdefg"));

	}
	
	//Tests the angle between the hour and minute hands
	@Test
	public void testTimeAngles(){
		assertEquals("'12', '30' is 165", 165, CalcAngBetMinHourHands.calculate(12, 30), .1);
		assertEquals("'1', '30' is 180", 135, CalcAngBetMinHourHands.calculate(1, 30), .1);
		assertEquals("'2', '30' is 195", 105, CalcAngBetMinHourHands.calculate(2, 30), .1);
		assertEquals("'5', '37' is 53.5", 53.5, CalcAngBetMinHourHands.calculate(5, 37), .1);
	}
	
	//Test to make sure the modified binary search finds the lowest value.
	@Test
	public void testFindStartCircularArray(){
		int[] sortedArray =  {0,0,1,2,3,4,5,6,7,8,9,10,11,12,12,13,13,14,16,17};
		Random r = new Random(System.currentTimeMillis());
		
		int i = 0;
		while(i < 1000){
			int[] testArr = new int[sortedArray.length];
			int  randPos = r.nextInt(sortedArray.length);
			for(int j = 0; j < sortedArray.length; j++){
				testArr[j] = sortedArray[(randPos + j) % sortedArray.length];
			}
			assertEquals("Position XXX", (sortedArray.length - randPos) % sortedArray.length, FindStartCircularArray.findSmallestInt(testArr), 0);
			i++;
		}
	}
	// Test to remove duplicates from a linked list 
	@Test
	public void testRemoveDuplicatesLinkedList_2_1(){
		SLList list = new SLList();
		list.append(5);
		list.append(22);
		list.append(21);
		list.append(0);
		list.append(5);
		list.append(22);
		list.append(21);
		list.append(0);
		
		
		
	}
}
