package lists.classes;

public class Book {

        private int isbnid;

        private String bookName;

        private String authorName;



        public void setIsbnid(int in){
            this.isbnid=in;
        }


        public void setBookName(String n){
            this.bookName=n;
        }
        public  void setAuthorName(String n){
            this.authorName=n;
        }
        public String getBookName(){
            return this.bookName;
        }
        public String getAuthorName(){
            return this.authorName;
        }

        public int getIsbnid(){
            return  isbnid;
        }

        @Override
        /**
         * This toString method in Jave is an in-built method that we don't need to call. We are just overriding it over here so
         * that way we dont have to use the get method in the main class of the test book.
         */
        public String toString(){
            return "These is Saad's book store with following book"+this.getIsbnid()+"with Book name "+this.getBookName()+"" +
                    "with Author Name "+this.getAuthorName();
        }

    }

