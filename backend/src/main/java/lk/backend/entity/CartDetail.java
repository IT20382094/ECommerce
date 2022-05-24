package lk.backend.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
public class CartDetail {
    @Id
    private String cartDetailId;
    private int quantity;

    @ManyToOne
    private Item item;

    @ManyToOne
    private Cart cart;

    @Transient
    private User user;

    public String getCartDetailId() {
        return cartDetailId;
    }

    public void setCartDetailId(String cartDetailId) {
        this.cartDetailId = cartDetailId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
