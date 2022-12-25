package lab8;
import acm.program.ConsoleProgram;

public class lab8_7 extends ConsoleProgram{
	    private boolean isYesorNo(String prompt) {
        while(true){
        String hariu=readLine (prompt);
        if (hariu.equals("yes"))
        	return true;
        else if (hariu.equals("no"))
        	return false;	
        else{
        		println("yes yumuu no gej hariulna uu");
        }
    }
}
	public void run(){
		if( isYesorNo ("Would you like to instruction?"))
            println("Lesgooo");
		else
            println("okay , maybe next time");
	}
	public static void main(String[] args) {
		new lab8_7().start();
	}
}


