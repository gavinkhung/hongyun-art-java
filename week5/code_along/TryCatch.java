public class TryCatch {

	public static void main(String[] args){

        //int i = 1/0;
        
        try {
            int j = 1/0;
        } catch(Exception e){
            System.out.println(e.getStackTrace());
        }
	}
    
}
