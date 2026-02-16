
/*
 * IT-2660 - Lab 1
<<<<<<< HEAD
 * //Student Name: Keira Cucinotta
=======
 * Student Name: Keira Cucinotta

 */

public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");

    Lab1 lab = new Lab1();
    System.out.println(lab.increment(1));

    int[] nums = {5,9, 3, 12, 7, 3, 11, 5};

    int i = 0;
    while (i < nums.length) {
      System.out.print(nums[i] + " ");
      i++;
    }
    System.out.println();

    for (int j = nums.length - 1; j >= 0; j--) {
      System.out.print(nums[j] + " ");
    }
    System.out.println();

    System.out.println("First value: " + nums[0]);
    System.out.println("Last value: " + nums[nums.length - 1]);
    
    System.out.println("Max (3, 12): " + lab.max(3, 12));
    System.out.println("Min (3, 12): " + lab.min(3, 12));
    System.out.println("Sum of nums: " + lab.sum(nums));
    System.out.println("Avg of nums: " + lab.avg(nums));
    System.out.println("Max in array: " + lab.maxInArray(nums));
    System.out.println("Min in array: " + lab.minInArray(nums));
    
  }
}

// Add all of the methods here
class Lab1 {
  public int increment(int num) {
    return ++num;
  }
  public int max(int a, int b) {
    return Math.max(a, b);
  }
  public int min(int a, int b) {
    return Math.min(a, b);
  }
  public int sum(int[] nums) {
    int total = 0;
    for (int num : nums) {
      total += num;
    }
    return total;
  }
  public double avg(int[] nums) {
    return (double) sum(nums) / nums.length;
  }
  public int maxInArray(int[] nums) {
    int max = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > max) {
        max = nums[i];
      }
    }
    return max;
  }
  public int minInArray(int[] nums) {
    int min = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] < min) {
        min = nums[i];
      }
    }
    return min;
  }
}
