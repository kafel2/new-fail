package class13;



	public class Dog {
		public String breed;
		public String color;
		public String size;
		public int age;
		
		
		public void bark()  {
			System.out.println("ruff ruff");
		}
		
		public void sleep() {
			System.out.println("ZZZZZZZZZZZZZZZZZZZZZZ....."); 
		}
			public void eat() {
				for(int i=0; i<5; i++)
				System.out.println("Omnomnmo");
				for(int i=0; i<5; i++)  {
					
				}
			}
		public void look() {
			System.out.println("Hi i am a dog my color is "+color);
		}
		public static void main(String[] args) {
			
			Dog bullDog= new Dog();
			bullDog.age=5;
			bullDog.breed="American Bulldog";
			bullDog.size="Large";
			bullDog.color="Pink";
			bullDog.bark();
			bullDog.eat();
			bullDog.sleep();
			bullDog.look();
			
			
			Dog beagle= new Dog();
			beagle.age=8;
			beagle.breed="beagle";
			beagle.size="Large";
			beagle.color="Light grey";
			beagle.look();
		}
				}	

