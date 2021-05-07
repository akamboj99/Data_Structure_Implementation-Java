
public class HashTable {
	private HashNode[] buckets;
	private int numofbuckets;
	private int size;
	
	public HashTable(int capacity)
	{
		this.numofbuckets = capacity;
		buckets = new HashNode[capacity];
		this.size = 0;
	}
	
	private class HashNode{
		private Integer key;
		private String value;
		private HashNode next;
		
		public HashNode(int key, String value)
		{
			this.key = key;
			this.value = value;
		}
	}
	
	public int size()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return size == 0;
	}
	
	public void put(Integer key, String value)
	{
		if(key==null || value==null)
		{
			System.out.println("NULL VSLUES DETECTED!!");
		}
		
		int bucketIndex = getBucketIndex(key);
		HashNode head = buckets[bucketIndex];
		
		while(head != null)
		{
			if(head.key.equals(key))
			{
				head.value = value;
				return;
			}
			head = head.next;
		}
		
		size++;
		head=buckets[bucketIndex];
		HashNode node = new HashNode(key, value);
		node.next = head;
		buckets[bucketIndex] = node;
	}
	
	//HASH FUNCTION
	private int getBucketIndex(Integer key) {
		return key%numofbuckets;
	}

	public String get(Integer key)
	{
		if(key == null)
		{
			System.out.println("Key Value is NULL");
		}
		
		int bucketIndex = getBucketIndex(key);
		HashNode head = buckets[bucketIndex];
		
		while(head != null)
		{
			if(head.key.equals(key))
			{
				return head.value;
			}
			head=head.next;
		}
		
		return null;
	}
	
	public static void main(String args[])
	{
		HashTable table = new HashTable(10);
		table.put(105,  "TOM");
		table.put(29,  "HARRY");
		table.put(89,  "SANA");
		System.out.println("Sizeof table is: " +table.size());
		String name = table.get(29);
		System.out.println("Value with key 29 is: " +name);
		
		String name1 = table.get(89);
		System.out.println("Value with key 89 is: " +name1);
	}
}
