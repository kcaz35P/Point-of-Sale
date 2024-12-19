package animeMerchandise;

import java.awt.*;

public class AnimeMerchandise{
	
	public String ItemName;
	public String animeTitle;
	public String itemCode;
	public int price;
	public int stocks;
	public Image imageItem;
	
	public void SetItemName(String ItemName) {
		this.ItemName = ItemName;
	}
	public void SetAnimeTitle(String animeTitle) {
		this.animeTitle = animeTitle;
	}
	public void SetItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public void SetPrice(int price) {
		this.price = price;
	}
	public void SetStocks(int stocks) {
		this.stocks = stocks;
	}
	public void SetImage(Image imageItem) {
		this.imageItem = imageItem;
	}
	//getters
	public String getItemName() {
		return ItemName;
	}
	public String getAnimeTitle() {
		return animeTitle;
	}
	public String getItemCode() {
		return itemCode;
	}
	public int getPrice() {
		return price;
	}
	public int getStocks() {
		return stocks;
	}
	public Image getImage() {
		return imageItem;
	}
	

	public void runProducts() {
		
		ProductsPlushies run = new ProductsPlushies();
		run.ItemPlushies();
		ProductsFigurine run1 = new ProductsFigurine();
		run1.ItemFigurine();
		ProductsPoster run2 = new ProductsPoster();
		run2.ItemPoster();
		ProductsManga run3 = new ProductsManga();
		run3.ItemManga();
		ProductsLightNovel run4 = new ProductsLightNovel();
		run4.ItemLightNovel();
		ProductsHeadgear run5 = new ProductsHeadgear();
		run5.ItemHeadgear();
		ProductsUpperBody run6 = new ProductsUpperBody();
		run6.ItemUpperBody();
		ProductsLowerBody run7 = new ProductsLowerBody();
		run7.ItemLowerBody();
		ProductsFootwear run8 = new ProductsFootwear();
		run8.ItemFootwear();
		
		ProductsPlushiesDecoration runx = new ProductsPlushiesDecoration();
		runx.ItemPlushiesDecoration();
		ProductsFigurineDecoration run1x = new ProductsFigurineDecoration();
		run1x.ItemFigurineDecoration();
		ProductsPosterDecoration run2x = new ProductsPosterDecoration();
		run2x.ItemPosterDecoration();
		ProductsMangaReading run3x = new ProductsMangaReading();
		run3x.ItemMangaReading();
		ProductsLightNovelReading run4x = new ProductsLightNovelReading();
		run4x.ItemLightNovelReading();
		ProductsHeadgearCosplay run5x = new ProductsHeadgearCosplay();
		run5x.ItemHeadgearCosplay();
		ProductsUpperBodyCosplay run6x = new ProductsUpperBodyCosplay();
		run6x.ItemUpperBodyCosplay();
		ProductsLowerBodyCosplay run7x = new ProductsLowerBodyCosplay();
		run7x.ItemLowerBodyCosplay();
		ProductsFootwearCosplay run8x = new ProductsFootwearCosplay();
		run8x.ItemFootwearCosplay();
		
	}
	
}


