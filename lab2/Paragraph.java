public class Paragraph{
		private String text;
		
		public Paragraph(String text){
			this.text = text;
		}

		public String toString() {
			return this.text;
		}

		public void print(){
		      System.out.println(text);
		    }
	}