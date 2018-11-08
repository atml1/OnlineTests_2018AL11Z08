package com.acquisio.basic.java.question05;

import static org.junit.Assert.*;

import org.junit.Test;

public class RefactoringTest {

    @Test
    public void testName() {
        Item[] items = new Item[]{new Item("foo", 0, 0)};
        Refactoring app = new Refactoring(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }
    
    @Test
    public void updateQuality() {
        int quality = 5;
        int sellIn = 5;
        Item[] items = new Item[]{new Item("foo", sellIn, quality)};
        Refactoring app = new Refactoring(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
        assertEquals(quality - 1, app.items[0].quality);
        assertEquals(sellIn - 1, app.items[0].sellIn);
    }
    
    @Test
    public void pastSellInDate() {
        int quality = 5;
        int sellIn = 0;
        Item[] items = new Item[]{new Item("foo", sellIn, quality)};
        Refactoring app = new Refactoring(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
        assertEquals(quality - 2, app.items[0].quality);
        assertEquals(sellIn - 1, app.items[0].sellIn);
    }
    
    @Test
    public void qualityLowerLimit() {
        int quality = 0;
        int sellIn = 5;
        Item[] items = new Item[]{new Item("foo", sellIn, quality)};
        Refactoring app = new Refactoring(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
        assertEquals(quality, app.items[0].quality);
        assertEquals(sellIn - 1, app.items[0].sellIn);
    }
    
    @Test
    public void agedBrie() {
        int quality = 5;
        int sellIn = 5;
        Item[] items = new Item[]{new Item("Aged Brie", sellIn, quality)};
        Refactoring app = new Refactoring(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(quality + 1, app.items[0].quality);
        assertEquals(sellIn - 1, app.items[0].sellIn);
    }
    
    @Test
    public void agedBriePastSellInDate() {
        int quality = 5;
        int sellIn = 0;
        Item[] items = new Item[]{new Item("Aged Brie", sellIn, quality)};
        Refactoring app = new Refactoring(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(quality + 2, app.items[0].quality);
        assertEquals(sellIn - 1, app.items[0].sellIn);
    }
    
    @Test
    public void qualityUpperLimit() {
        int quality = 50;
        int sellIn = 5;
        Item[] items = new Item[]{new Item("Aged Brie", sellIn, quality)};
        Refactoring app = new Refactoring(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(quality, app.items[0].quality);
        assertEquals(sellIn - 1, app.items[0].sellIn);
    }
    
    @Test
    public void sulfuras() {
        int quality = 80;
        int sellIn = 5;
        Item[] items = new Item[]{new Item("Sulfuras, Hand of Ragnaros", sellIn, quality)};
        Refactoring app = new Refactoring(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(quality, app.items[0].quality);
        assertEquals(sellIn, app.items[0].sellIn);
    }
    
    @Test
    public void backstagePasses15() {
        int quality = 5;
        int sellIn = 15;
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", sellIn, quality)};
        Refactoring app = new Refactoring(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(quality + 1, app.items[0].quality);
        assertEquals(sellIn - 1, app.items[0].sellIn);
    }
    
    @Test
    public void backstagePasses10() {
        int quality = 5;
        int sellIn = 10;
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", sellIn, quality)};
        Refactoring app = new Refactoring(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(quality + 2, app.items[0].quality);
        assertEquals(sellIn - 1, app.items[0].sellIn);
    }
    
    @Test
    public void backstagePasses5() {
        int quality = 5;
        int sellIn = 5;
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", sellIn, quality)};
        Refactoring app = new Refactoring(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(quality + 3, app.items[0].quality);
        assertEquals(sellIn - 1, app.items[0].sellIn);
    }
    
    @Test
    public void backstagePasses0() {
        int quality = 5;
        int sellIn = 0;
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", sellIn, quality)};
        Refactoring app = new Refactoring(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(0, app.items[0].quality);
        assertEquals(sellIn - 1, app.items[0].sellIn);
    }

}