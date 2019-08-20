package hangmanPackage;

	public class Players {
		String pName;
        char currGuess;
        
	    Players(){
	        this.pName = "Player";
	        this.currGuess = '\u0000';
	    }
	    
	    Players(String s){
	    	this.pName = s;
	    	this.currGuess = '\u0000';
	    }
	    
	    Players(String s, char b){
	    	this.pName = s;
	    	this.currGuess = b;
	    }
	    
	    Players(char b){
	    	 this.pName = "Player";
		     this.currGuess = b;
	    }
	    
	    
		public String getpName() {
			return pName;
		}
		public void setpName(String pName) {
			this.pName = pName;
		}
		public char getCurrGuess() {
			return currGuess;
		}
		public void setCurrGuess(char currGuess) {
			this.currGuess = currGuess;
		}
		

	    
	}