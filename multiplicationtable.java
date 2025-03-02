class multiplicationtable{
    public static void main(String[] args) {
        int n=8;
        multiplicationtable(n);

    }
    public static void multiplicationtable(int n){
        
        for(int i=1;i<=12;i++){
            
            System.out.println(n+"*"+i+"="+(n*i));    
        }
    }
}