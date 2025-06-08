public class Product<T , U>
{
    T item ;
    U price ;
    Product(T item  , U price)
    {
        this.item = item ; 
        this.price = price ; 
    }
    
    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setPrice(U price) {
        this.price = price;
    }

    public U getPrice() {
        return price;
    }
}