class CLArguments {
    public static void main(String[] args) { // String[] args, here we can pass string of CL arguments at runtime to the main function

        boolean flagDescending = false;

        for(String arg : args){
            if("-descending".equals(arg)) flagDescending = true;
        }

        if(flagDescending == true) System.out.println("Descending");
        else System.out.println("Ascending");
    }    
}
