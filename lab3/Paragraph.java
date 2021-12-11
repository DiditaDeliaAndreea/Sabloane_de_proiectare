public class Paragraph extends Element{
		private String text;
		
		public Paragraph(String text){
			this.text = text;
		}

		public String toString() {
			return this.text;
		}

		public void print(){
		      System.out.println("Paragraph: "+text);
		    }
	}