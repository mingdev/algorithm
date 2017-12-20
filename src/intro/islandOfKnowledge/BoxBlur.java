package intro.islandOfKnowledge;

public class BoxBlur {

  public static int[][] boxBlur(int[][] image) {
    int N = image.length - 2;
    int M = image[0].length - 2;

    int[][] resultImg = new int[N][M];

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        int sum = 0;
        for (int k = 0; k < 3; k++) {
          sum += image[k + i][j] + image[k + i][j + 1] + image[k + i][j + 2];
        }
        sum /= 9;
        resultImg[i][j] = sum;
      }
    }

    return resultImg;
  }

  public static void main(String[] args) {
    int[][] image = {
        {7, 4, 0, 1},
        {5, 6, 2, 2},
        {6, 10, 7, 8},
        {1, 4, 2, 0}
    };

  }
}
