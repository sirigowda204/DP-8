// Time Complexity : O(mn)
// Space Complexity : O(1)

class Solution {
  public int minimumTotal(List<List<Integer>> triangle) {
    int m = triangle.size();
    for(int i = m-2; i>=0; i--) {
      for(int j = 0; j<triangle.get(i).size(); j++) {
        triangle.get(i).set(j, triangle.get(i).get(j) + Math.min(triangle.get(i+1).get(j), triangle.get(i+1).get(j+1)));
      }
    }
    return triangle.get(0).get(0);
  }
}