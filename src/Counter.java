public class Counter {
    int count;

        public Counter(){
        this.count = 0;
        }

        public int increment(){
            count++;
        return count;
        }

        public int decrement(){
            count--;
        return count;
        }

        public void reset(){
            count = 0;
        }

}
