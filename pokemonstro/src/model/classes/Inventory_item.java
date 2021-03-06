package model.classes;

import java.io.Serializable;

import javax.persistence.*;

import model.classes.element.Item;

/**
 *
 * @author Danilo Charantola
 */
@Entity
/*classe que relaciona um item com o seu inventario*/
public class Inventory_item implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    /*quantidade desse item neste inventario*/
	@Column(nullable=false)
    private Integer qty;
    @ManyToOne(cascade=CascadeType.ALL)
    private Inventory inventory;
    @ManyToOne(cascade=CascadeType.ALL)
    private Item item;

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    
    public Integer getId() {
        return id;
    }
    
}
