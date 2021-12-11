public class Paragraph implements Element{
		public String text;
		AlignStrategy x;
		
		public Paragraph(String text){
			this.text = text;
		}

		public String toString() {
			return this.text;
		}
		
		public void setAlignStrategy(AlignStrategy strat){
	        this.x=strat;
	    }

		public void print(){
			if(x==null) {
	            System.out.println(this.text);
	        }else{
	            x.render(new Paragraph(this.text));
	        }
		    }
	}