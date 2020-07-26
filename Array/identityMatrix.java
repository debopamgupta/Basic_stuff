// import java.util.*;

// class Saturday {

//   public static void main(String args[]) {
//     int r, c, rs, cs, A[][];

//     Scanner sc = new Scanner(System.in);
//     System.out.print("ENTER THE ROW SIZE");
//     rs = sc.nextInt();
//     System.out.print("ENTER THE COLUMN SIZE");
//     cs = sc.nextInt();
//     A = new int[rs][cs];

//     for (r = 0; r < rs; r++) {
//       for (c = 0; c < cs; c++) {
//         System.out.print("ENTER the value of A");
//         A[r][c] = sc.nextInt();
//       }
//     }
//     System.out.println("Printing the value of A");
//     for (r = 0; r < rs; r++) {
//       for (c = 0; c < cs; c++) {
//         System.out.print(A[r][c] + " ");
//       }
//       System.out.println();
//     }
//     if (rs != cs)
//       System.out.println("ITS NOT A SQUARE MATRIX & NOT A IDENTITY MATRIX");
//     else {
//       boolean flag = true;
//       for (r = 0; r < rs; r++) {
//         for (c = 0; c < cs; c++) {
//           if ((r == c && A[r][c] != 1) || (r != c && A[r][c] != 0)) {
//             flag = false;
//             break;
//           }
//         }
//       }

//       if (flag == true) {
//         System.out.println("IDENTITY MATRIX");
//       } else
//         System.out.println("NOT A IDENTITY MATRIX");
//     }
//   }
// }

import java.util.*;

class IdentityMatrix {

  public static void main(String args[]) {
    int r, c, rs, cs, A[][];

    Scanner sc = new Scanner(System.in);
    System.out.print("ENTER THE ROW SIZE");
    rs = sc.nextInt();
    System.out.print("ENTER THE COLUMN SIZE");
    cs = sc.nextInt();
    A = new int[rs][cs];

    for (r = 0; r < rs; r++) {
      for (c = 0; c < cs; c++) {
        System.out.print("ENTER the value of A");
        A[r][c] = sc.nextInt();
      }
    }
    System.out.println("Printing the value of A");
    for (r = 0; r < rs; r++) {
      for (c = 0; c < cs; c++) {
        System.out.print(A[r][c] + " ");
      }
      System.out.println();
    }
    if (rs != cs)
      System.out.println("ITS NOT A SQUARE MATRIX & NOT A IDENTITY MATRIX");
    else {
      boolean flag = true;
      for (r = 0; r < rs; r++) {
        for (c = 0; c < cs; c++) {
          if ((r == c && A[r][c] == 1) || (r != c && A[r][c] == 0)) {
            flag = true;

          } else {
            flag = false;
            break;
          }
        }

      }
      if (flag == true) {
        System.out.println("IDENTITY MATRIX");
      } else
        System.out.println("NOT A IDENTITY MATRIX");
    }
  }
}