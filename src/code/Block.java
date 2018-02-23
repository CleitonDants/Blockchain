package code;

import java.util.Arrays;

public class Block {
	private int hashPreviousBlock;
	private String[] transactions;
	
	private int hashblock;
	
	public Block(int hashPreviousBlock, String[] transactions){
		this.hashPreviousBlock = hashPreviousBlock;
		this.transactions = transactions;
		
		Object[] content = {Arrays.hashCode(transactions), hashPreviousBlock};
		this.hashblock = (Arrays.hashCode(content));
	}
	
	public int getPreviousBlock(){
		return hashPreviousBlock;
	}
	
	public String[] getTransactions(){
		return transactions;
	}
	
	public int getHashblock(){
		return hashblock;
	}
}
