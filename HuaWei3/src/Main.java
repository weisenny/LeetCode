// 本题为考试多行输入输出规范示例，无需提交，不计分。

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static int res=0;
    static int [][] map;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
         map=new int [n+2][m+2];
        for (int i = 0; i < n+2; i++) {
            for (int j = 0; j < m+2; j++) {
                map[i][j]=0;
            }
        }


        int ans = 0, x;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                map[i][j] = sc.nextInt();
                //ans += x;
            }
        }

        int beginx = sc.nextInt()+1;
        int beginy = sc.nextInt()+1;
        int endx = sc.nextInt()+1;
        int endy = sc.nextInt()+1;

        find(n,m,beginx,beginy,endx,endy);
        System.out.println(res%1000000000);
    }
    public static void find (int n,int m,int beginx,int beginy,int endx,int endy){
        if(beginx<=m&&beginx>=1&&beginy<=n&&beginy>=1
                &&endx<=m&&endx>=1 &&endy<=n&&endy>=1)
        {

            if(beginx==endx&&beginy==endy)
            {
                res=res+1;
                return;
            }

            int temp=map[beginx][beginy];
            map[beginx][beginy]=-1;
            if(map[beginx+1][beginy]>temp)
                find(n,m,beginx+1,beginy,endx,endy);
            if(map[beginx][beginy+1]>temp)
                find(n,m,beginx,beginy+1,endx,endy);
            if(map[beginx-1][beginy]>temp)
                find(n,m,beginx-1,beginy,endx,endy);
            if(map[beginx][beginy-1]>temp)
                find(n,m,beginx,beginy-1,endx,endy);

            map[beginx][beginy]=temp;
        }
        return;
    }
}