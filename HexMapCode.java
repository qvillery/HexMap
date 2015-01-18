import java.util.Scanner;

public class Hex8x8 
{
	String HexCode;
	String [] BinCode;
	
	public void GetCode()
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("This program converts 8 hex values into a 8x8 map");
		System.out.println("Please enter 8 hex values to get an 8x8 map");
		HexCode = scan.nextLine();
		scan.close();
	}
	
	public void ConvertToBinary()
	{	
		String [] ArrHtoB = HexCode.split(" ");
		for(int i=0; i < ArrHtoB.length; i++)
		{
			if(ArrHtoB[i] != null)
			{
				String binAddr = Integer.toBinaryString(Integer.parseInt(ArrHtoB[i], 16));
				binAddr = String.format("%08d", new Integer(binAddr));
				BinCode = binAddr.split("");
				for (int j=0; j < BinCode.length; j++)
				{
					if (BinCode[j].equals("0"))
					{
						System.out.print(" ");
					}
					
					else if (BinCode[j].equals("1"))
					{
						System.out.print("x");
					}
				}
				System.out.println("");
			}
		}
	}
	public static void main(String[] args) 
	{
		Hex8x8 hex = new Hex8x8();
		hex.GetCode();
		hex.ConvertToBinary();
	}
}
