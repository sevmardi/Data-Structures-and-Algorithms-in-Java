package HuffmanCoding_v1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Comparator;
import java.util.Map;

/**
 * Huffman encoding obeys the huffman algorithm.
 * It compresses the input sentence and serializes the "huffman code"
 * and the "tree" used to generate  the huffman code
 * Both the serialized files are intended to be sent to client.
 * 
 * http://algs4.cs.princeton.edu/55compression/Huffman.java.html
 * http://codereview.stackexchange.com/questions/44473/huffman-code-implementation
 * 
 */
public  class Huffman 
{
	private Huffman(){};
	
	private static class HuffmanNode()
	{
		private char ch;
		private int freq;
		private final HuffmanNode left;
		private final HuffmanNode right;
		
		HuffmanNode(char ch, int freq, HuffmanNode left, HuffmanNode right)
		{
		    this.ch = ch;
            this.freq = freq;
            this.left = left;
            this.right = right;
		}
	}
	
	private static class HuffManComparator implements Comparator<HuffmanNode>
	{
		 @Override
		public int compare(HuffmanNode node1, HuffmanNode node2)
		{
			 return node1.freq - node2.freq;
		}
	}
	  /**
     * Compresses the string using huffman algorithm.
     * The huffman tree and the huffman code are serialized to disk
     * 
     * @param sentence                  The sentence to be serialized
     * @throws FileNotFoundException    If file is not found
     * @throws IOException              If IO exception occurs.
     */ 
	
	public static void compress(String sentence) throws FileNotFoundException, IOException
	{
		if(sentence == null)
		{
			throw new NullPointerException("Input sentence cannot be null ");
			
		}
		if(sentence.length() == 0)
		{
			throw new IllegalArgumentException("The string should atleast have 1 character.");
		}
		final Map<Character, Integer> charFreq = getCharFrequency(sentence);
		final HuffmanNode root = buildTree(charFreq);
		final Map<Character, String> charCode = generateCodes(CharFreq.keySet(), root);
		final String encodedMessage = encodeMessage(CharCode, sentence);
		serializeTree(root);
		serializeMessage(encodedMessage);
			
	}
	
	private static Map<Character , Integer> getCharFrequency(String sentence)
	{
		
	}

}