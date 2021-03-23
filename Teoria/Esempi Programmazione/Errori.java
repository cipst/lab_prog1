class Errori{
	//& --> congiunzione che valuta entrambi gli elementi
	//&& --> congiunzione lazy --> valuta solo il primo elemento --> se falso allora restituisce subito false 
	//| --> disgiunzione che valuta entrambi gli elementi
	//|| --> disgiunzione lazy --> valuta solo il primo elemento --> se true allora restituisce subito true
	public static void main(String[] args){
		System.out.println("true && (true && 5/0 == 0):  " + (true && (false && 5/0==0)));
	}
}