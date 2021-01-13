public class Radix{
  public static int nth(int n, int col){
    int num = (int)Math.pow(10, col);
    if (col == 0) num = 10;
    return Math.abs((int)((n%num)/(num/10)));
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
    for(int i = 0; i < 10; i++){
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


  public static void radixSortSimple(SortableLinkedList data){
    SortableLinkedList[] buckets = new SortableLinkedList[10];
    for(int i = 0; i < Findmax(data); i++){
      for(int j = 0; j < 10; j++){
        for(int a = 0; a < data.size(); a++){
          if(nth(data.get(a), j) == 0) buckets[0].add(data.get(a));
          if(nth(data.get(a), j) == 1) buckets[1].add(data.get(a));
          if(nth(data.get(a), j) == 2) buckets[2].add(data.get(a));
          if(nth(data.get(a), j) == 3) buckets[3].add(data.get(a));
          if(nth(data.get(a), j) == 4) buckets[4].add(data.get(a));
          if(nth(data.get(a), j) == 5) buckets[5].add(data.get(a));
          if(nth(data.get(a), j) == 6) buckets[6].add(data.get(a));
          if(nth(data.get(a), j) == 7) buckets[7].add(data.get(a));
          if(nth(data.get(a), j) == 8) buckets[8].add(data.get(a));
          if(nth(data.get(a), j) == 9) buckets[9].add(data.get(a));
        }
        merge(data, buckets);
      }
    }
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
    for(int i = 0; i < Findmax(data); i++){
      for(int j = 0; j < 10; j++){
        for(int a = 0; a < data.size(); a++){
          if(nth(data.get(a), j) == 0) buckets[0].add(data.get(a));
          if(nth(data.get(a), j) == 1) buckets[1].add(data.get(a));
          if(nth(data.get(a), j) == 2) buckets[2].add(data.get(a));
          if(nth(data.get(a), j) == 3) buckets[3].add(data.get(a));
          if(nth(data.get(a), j) == 4) buckets[4].add(data.get(a));
          if(nth(data.get(a), j) == 5) buckets[5].add(data.get(a));
          if(nth(data.get(a), j) == 6) buckets[6].add(data.get(a));
          if(nth(data.get(a), j) == 7) buckets[7].add(data.get(a));
          if(nth(data.get(a), j) == 8) buckets[8].add(data.get(a));
          if(nth(data.get(a), j) == 9) buckets[9].add(data.get(a));
        }
        merge(data, buckets);
      }
    }
  }
  // Write a method that sorts non-negative integer values: [This part is the most
  // important part, and I expect every student can complete it!]
  // Assume there are no negative values.
  // Use the algorithm described in class/class notes

}
