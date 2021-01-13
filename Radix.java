public class Radix{
  public static int nth(int n, int col){
    int num = (int)(n/Math.pow(10, col));
    //if (col == 0) num = 10;
    return Math.abs(num%10);
  }
  // get nth digit of an int, where 0 is the ones column, 1 is the tens column etc.
  // nth(123,1) -> 2
  // nth(-123,1) -> 2
  // nth(123,2) -> 1
  // nth(-123,2) -> 1

  public static int length(int n){
    return (int)Math.log(Math.abs(n))-1;
  }
  // return the number of digits in n.
  // length(0) -> 1
  // length(15) -> 2
  // length(-10) -> 2
  // length(5112) -> 4

  public static void merge(SortableLinkedList original,SortableLinkedList[]buckets){
    for(int i = 0; i < buckets.length; i++){
      original.extend(buckets[i]);
    }
  }
  // Merge all of the linked lists in the bucket array into your original
  // linked list. The original may have elements, and those should be kept.
  // This is O(buckets.length) which should be 10 when we use this later.
  // The bucket[0] list will be merged first, then the bucket[1] etc.
  // Write and thoroughly test these methods!
  //Hint: Try to calculate the largest number on your least significant digit pass.
  // This tells your method how many passes are needed.
//REMOVE 0 UNTIL NO MORE

  public static void radixSortSimple(SortableLinkedList data){
    SortableLinkedList[] buckets = new SortableLinkedList[10];
    for(int j = 0; j < 10; j++){
      SortableLinkedList temp = new SortableLinkedList();
      buckets[j] = new SortableLinkedList();
    }
    for(int i = 0; i < Findmax(data); i++){
      while(data.size() > 0){
        int value = data.remove(0);
        buckets[nth(value, i)].add(value);
      }
        merge(data, buckets);
      }
      System.out.println(data);
  }

  public static int Findmax(SortableLinkedList data){
    int max = 0;
    for(int i = 0; i < data.size(); i++){
      if (Math.abs(data.get(i)) > max) max = (Math.abs(data.get(i)));
    }
    return length(max);
  }

  public static void radixSort(SortableLinkedList data){
    SortableLinkedList[] buckets = new SortableLinkedList[10];
    for(int j = 0; j < 10; j++){
      SortableLinkedList temp = new SortableLinkedList();
      buckets[j] = new SortableLinkedList();
    }
    for(int i = 0; i < Findmax(data); i++){
      for(int j = 0; j < 10; j++){
          if(nth(data.get(0), j) == 0) buckets[0].add(data.remove(0));
          if(nth(data.get(0), j) == 1) buckets[1].add(data.remove(0));
          if(nth(data.get(0), j) == 2) buckets[2].add(data.remove(0));
          if(nth(data.get(0), j) == 3) buckets[3].add(data.remove(0));
          if(nth(data.get(0), j) == 4) buckets[4].add(data.remove(0));
          if(nth(data.get(0), j) == 5) buckets[5].add(data.remove(0));
          if(nth(data.get(0), j) == 6) buckets[6].add(data.remove(0));
          if(nth(data.get(0), j) == 7) buckets[7].add(data.remove(0));
          if(nth(data.get(0), j) == 8) buckets[8].add(data.remove(0));
          if(nth(data.get(0), j) == 9) buckets[9].add(data.remove(0));
        }
        merge(data, buckets);
      }
  }
  // Write a method that sorts non-negative integer values: [This part is the most
  // important part, and I expect every student can complete it!]
  // Assume there are no negative values.
  // Use the algorithm described in class/class notes

}
