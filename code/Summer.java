public class Summer {

  public static int calcSum(int [] nums) {
    int sum = 0;
    for(int num : nums) sum += num;
    return sum;
  }

  public static int[] convertInput(String arg) {
    String[] numStrings = arg.split(",");
    int[] numInts = new int[numStrings.length];
    for(int i = 0; i < numStrings.length; i++) {
      numInts[i] = Integer.parseInt(numStrings[i]);
    }
    return numInts;
  }

  public static void main (String [] args) {
    if(args.length > 0) {
      System.out.println(calcSum(convertInput(args[0])));
    } else {
      System.out.println("Please provide a list of integers in the format 1,2,3");
    }
  }
}
