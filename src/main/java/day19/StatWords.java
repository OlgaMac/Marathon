package day19;

public class StatWords {
        private String word;
        private int count = 1;

        public StatWords(String word) {
            this.word = word;
        }

        public int getCount() {
            return count;
        }

        public String getWord() {
            return word;
        }
         public void incrementCount(){
            count ++;
         }

        @Override
        public String toString() {
            return word + ":" + count;
        }
    }
