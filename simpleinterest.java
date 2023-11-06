 class simpleinterest {
    double deposit;
    public simpleinterest(double d){
        deposit=d;
        
    }
    public double Amount( double rate, int time){
        return deposit*rate*time;
    }
    

        public static void main(String[] args) {

            simpleinterest myInterest= new simpleinterest(100000);
            double SAmount=myInterest.Amount( 0.05, 5);
            System.out.println("the interest is: " + SAmount);

            
        }
    }

