/*A java program to print the following pattern:

*     *
 *   *
   *
 *   *
*     *

*/

import java.util.*;
import java.io.*;

class Session2Prg2
{
	public static void main(String a[])
	{

		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				int sum = i + j;
				if (i==j)
				{
				System.out.print("*");
				}
				else if (sum == 6)
				{
				System.out.print("*");
				}
				else
				{
				System.out.print(" "); //To print space
				}
			}
			System.out.println(""); //Next line
		}
	}
}