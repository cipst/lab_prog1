class Esempio2{
	public static void main(String[] args){
		int v1,v2,v3;
		v1=1;
		v2=2;
		v3=3;
		System.out.println("Prima: v1="+v1+", v2="+v2+", v3="+v3);
		
		int u;
		u=v3;
		v3=v2;
		v2=v1;
		v1=u;
		
		/*
			oppure senza utilizzare la variabile u:
			v1 = v1+v2+v3;
			v2 = v1+(v2+v3); //v2 ha il valore iniziale di v1
			v3 = v1-(v2+v3); //v3 ha il valore iniziale di v2
			v1 = v1-(v2+v3); //v1 ha il valore iniziale di v3
		*/
		
		System.out.println("Dopo: v1="+v1+", v2="+v2+", v3="+v3);
	}
}