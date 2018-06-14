package com.offer;

/**
 * t3.在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，
 * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数
 */

/**
 * 思路：从右上角开始，若小，向下走，删除一行，若大，向左走，删除一列
 */
public class solution {
    public static boolean Find(int [][] array,int target){
        int row=0;
        int col=array[0].length-1;
        while (row<=array.length-1&&col>=0){
            if (target==array[row][col])
                return true;
            else if (target>array[row][col])
                row++;
            else
                col--;
        }
        return false;
    }

    //测试find函数
    public static void main(String[] args) {
        /*
         * 1  2  8  9
         * 2  4  9  12
         * 4  7  10 13
         * 6  8  11 15
         */
        int array[][]=new int[4][4];
        array[0][0]=1;
        array[0][1]=2;
        array[0][2]=8;
        array[0][3]=9;
        array[1][0]=2;
        array[1][1]=4;
        array[1][2]=9;
        array[1][3]=12;
        array[2][0]=4;
        array[2][1]=7;
        array[2][2]=10;
        array[2][3]=13;
        array[3][0]=6;
        array[3][1]=8;
        array[3][2]=11;
        array[3][3]=15;
        System.out.println(Find(array, 7));
        System.out.println(Find(array, 5));
    }

}
