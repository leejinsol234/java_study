package exam02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex02 {
    public static void main(String[] args) {
        Set<Book> books = new HashSet<>();
        books.add(new Book("책1","저자1","출판사1"));
        books.add(new Book("책2","저자2","출판사2"));
        books.add(new Book("책2","저자2","출판사2"));
        books.add(new Book("책3","저자3","출판사3"));
        books.add(new Book("책4","저자4","출판사4"));
        books.add(new Book("책5","저자5","출판사5"));

//        for(Book book : books){
//            System.out.println(book);
//        }
        /*
        Book{title='책1', author='저자1', publisher='출판사1'}
        Book{title='책4', author='저자4', publisher='출판사4'}
        Book{title='책2', author='저자2', publisher='출판사2'}
        Book{title='책2', author='저자2', publisher='출판사2'}
        Book{title='책3', author='저자3', publisher='출판사3'}
        Book{title='책5', author='저자5', publisher='출판사5'}
        */

        //equals,hashcode로 동등성 비교 후
        /*
        Book{title='책1', author='저자1', publisher='출판사1'}
        Book{title='책4', author='저자4', publisher='출판사4'}
        Book{title='책5', author='저자5', publisher='출판사5'}
        Book{title='책2', author='저자2', publisher='출판사2'}
        Book{title='책3', author='저자3', publisher='출판사3'}
        */

        //Iterator
        Iterator<Book> iter = books.iterator();
        while (iter.hasNext()){
            Book book = iter.next();
            System.out.println(book);
        }

        while (iter.hasNext()){ //커서가 한 번 끝까지 이동하면 더이상 읽을 수 없다.(1회성)
            Book book = iter.next();
            System.out.println(book);
        }

        iter = books.iterator(); //iterator를 새로 만들면 다시 사용 가능
        while (iter.hasNext()){
            Book book = iter.next();
            System.out.println(book);
        }
    }
}
