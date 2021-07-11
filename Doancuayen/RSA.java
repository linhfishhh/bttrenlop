package Doancuayen;
import java.math.*;
import java.util.Random;
public class RSA {
	//Khai bao version cua thuat toan RSA la 1024
	public static final int VERSIONRSA=1024;
	// chon so e bang 2^16+1;
	public static final BigInteger E = new BigInteger("65537");
	// khai bao p,q,phiN,d
	private BigInteger p;
	private BigInteger q;
	private BigInteger n;
	private BigInteger phiN;
	private BigInteger d;
	//generate key
	public void generateKey() {
		//chon p va q la 2 so nguyen to ngau nhien
		p=BigInteger.probablePrime(VERSIONRSA / 2, new Random());
		q=BigInteger.probablePrime(VERSIONRSA / 2, new Random());
		n=p.multiply(q);
		phiN=p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
		d=E.modInverse(phiN);
	}
	//ma hoa
	public BigInteger Encrypt(BigInteger mess, BigInteger key) {
		return mess.modPow(E, key);
	}
	//giai ma
	public BigInteger Decrypt(BigInteger CipherText) {
		return  CipherText.modPow(d, n);
	}
	// chuyen String thanh binary
	 public String convertByteArraysToBinary(byte[] input) {

	        StringBuilder result = new StringBuilder();
	        for (byte b : input) {
	            int val = b;
	            for (int i = 0; i < 8; i++) {
	                result.append((val & 128) == 0 ? 0 : 1);      // 128 = 1000 0000
	                val <<= 1;
	            }
	        }
	        return result.toString();

	 }
	// chuyen binary xang String
	
}
