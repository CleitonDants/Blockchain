package code;

import java.util.ArrayList;

public class Main {
	
	static ArrayList<Block> blockchain = new ArrayList<>();

	public static void main(String[] args) {
		
		//The first transaction with the first block of the blockchain, called Genesis.
		String[] genesisTransactions = {"Satoshi sent 10 bitcoins to Hal Finney","Hal Finney sent 10 bitcoins to Cleiton"};
		Block genesisBlock = new Block(0, genesisTransactions);

		System.out.println("Genesis block hash:");
		System.out.println(genesisBlock.getHashblock());
		
		blockchain.add(genesisBlock);
		int lastIndex = blockchain.size() - 1;//to get the last(index) block of the chain
		
		//All of the new blocks are added to final of the chain
		String[] newTransactions = {"Cleiton sent 5 bitcoins to his mom"};
		Block newBlock = new Block(blockchain.get(lastIndex).getHashblock(), newTransactions);		

		blockchain.add(newBlock);
		lastIndex = blockchain.size() - 1;
		
		System.out.println("New block hash:");
		System.out.println(blockchain.get(lastIndex).getHashblock());
	}

}
