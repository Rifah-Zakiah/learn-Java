public class Patterns {
    public static void main(String args[]){
        int n = 4, m = 5;
        //soild rectangle:
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------------");
        //hollow rectangle:
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(i == 1 || j == 1|| i == n || j == m)
                    System.out.print("*");
                else
                   System.out.print(" "); 
            }
            System.out.println();
        }
        System.out.println("-------------------");
        //half pyramid:
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------------");
        //inverted half pyramid:
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------------");
        //left half pyramid: have to add an extra inner loop for space
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------------");
        //half pyramid with numbers:
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("-------------------");
        //inverted half pyramid with numbers:
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("-------------------");
        //left half pyramid with numbers:
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
         System.out.println("-------------------");
        //half pyramid with numbers:
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
         System.out.println("-------------------");
        //floyd's triangle:
        int num = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
         System.out.println("-------------------");
        //0-1 triangle:
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if((i+j)%2 == 0)
                    System.out.print(1+" ");
                else
                    System.out.print(0+" ");
            }
            System.out.println();
        }
    }
}
