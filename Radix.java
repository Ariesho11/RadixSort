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

}
